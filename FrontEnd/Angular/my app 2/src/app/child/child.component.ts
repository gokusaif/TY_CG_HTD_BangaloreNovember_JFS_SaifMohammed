import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
  @Input()
  dataFromParent;
  constructor() {
    setTimeout(() => {
      console.log(this.dataFromParent);
    }, 1000);
   }

  ngOnInit() {
  }

}
