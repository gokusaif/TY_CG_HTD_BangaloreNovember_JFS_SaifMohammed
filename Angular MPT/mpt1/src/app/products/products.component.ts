import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products: Products[];
  constructor(private http: HttpClient) {
    this.getProducts();
   }

  ngOnInit() {
  }

  getProducts(){
    this.http.get<Products[]>('../../assets/products.json').subscribe( data=> {
    this.products = data;      
    });
  }


}
