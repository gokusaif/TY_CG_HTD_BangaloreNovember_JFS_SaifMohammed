import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-json-data',
  templateUrl: './json-data.component.html',
  styleUrls: ['./json-data.component.css']
})
export class JsonDataComponent implements OnInit {

products: Products[];

  constructor(private http: HttpClient) {
    this.jsonData();
  }

  jsonData() {
    this.http.get<Products[]>('../../assets/products.json').subscribe(response => {
      console.log(response);
      this.products = response;
    });
  }

  ngOnInit() {
  }

}

interface Products {
  name: string;
  image: string;
  price: number;
}
