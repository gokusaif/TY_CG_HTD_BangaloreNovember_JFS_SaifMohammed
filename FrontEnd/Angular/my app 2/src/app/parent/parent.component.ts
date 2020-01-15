import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  student = {
    name: 'saif',
    age: 23
  };

  constructor() { }

  ngOnInit() {
  }

}
