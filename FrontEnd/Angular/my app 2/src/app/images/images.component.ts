import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-images',
  templateUrl: './images.component.html',
  styleUrls: ['./images.component.css']
})
export class ImagesComponent implements OnInit {
  msg;
  products = this.data.products;
  constructor(private data: DataService) {
  }

  ngOnInit() {
  }

  deleteImg(product) {
    this.products.splice(this.products.indexOf(product), 1);
    this.msg = `${product.name} is deleted`;
  }

  click() {
    this.msg = null;
  }
}
