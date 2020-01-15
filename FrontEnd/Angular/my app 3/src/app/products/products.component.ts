import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products: Product[];
  message: string;

  constructor(private productService: ProductService, private router: Router) {
    this.getProducts();
   }

  ngOnInit() {
  }

  getProducts() {
    this.productService.getData().subscribe( data => {
      console.log(data.product);
      this.products = data.product;
    }, error => {
      console.log(error);
    });
  }

  deleteProduct(product: Product) {
    this.productService.deleteData(product).subscribe( response => {
      console.log(response);
      this.message = response.message;
      if (response.statusCode === 201) {
        this.products.splice(this.products.indexOf(product), 1);
      }
    });
  }

  deleteMessage() {
    this.message = null;
  }

  selectProduct(product) {
    // this.productService.selectedProduct = product;
    this.router.navigate([`update-product/${product.id}`], {
      queryParams: {name: product.name, url: product.url, cost: product.cost }
    });
  }

}
