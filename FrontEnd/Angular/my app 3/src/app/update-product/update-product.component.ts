import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { NgForm } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {


  id;
  productDetails;
  constructor(private productService: ProductService, private router: Router, private activatedRoute: ActivatedRoute) {
   activatedRoute.params.subscribe( data => {
     console.log(data.id);
     this.id = data.id;
   });
   activatedRoute.queryParams.subscribe( data => {
     console.log(data);
     this.productDetails = data;
   });
  }

  ngOnInit() {
  }


  updateProduct(form: NgForm) {
    this.productService.updateData(form.value).subscribe(response => {
      console.log(response);
      if (response.statusCode === 201) {
        form.reset();
        this.router.navigateByUrl('/products');
      }
    }, error => {
      console.log(error);
    });
  }

}
