import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
  person = 'saif';
  msg;
  names = [
    'saif',
    'omkar',
    'suraj',
    'sunil'
  ];

  deleteName(name) {
    this.names.splice(this.names.indexOf(name), 1);
    this.msg = `${name} deleted`;
    setTimeout(() => {
      this.msg = null;
    }, 2000);
  }
  constructor(data: DataService) {
    console.log(data.x);
  }
  ngOnInit() {
  }

}
