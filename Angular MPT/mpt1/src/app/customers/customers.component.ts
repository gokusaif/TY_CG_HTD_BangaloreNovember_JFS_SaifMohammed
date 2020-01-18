import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  customers: Customers[];
  constructor(private http: HttpClient) {
    this.customersJSON();
   }

  ngOnInit() {
  }

  customersJSON() {
    this.http.get<Customers[]>('../../assets/customers.json').subscribe( data => {
      this.customers = data;
    });
  }

}
