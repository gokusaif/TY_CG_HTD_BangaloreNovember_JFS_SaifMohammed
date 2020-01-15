import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-car-details',
  templateUrl: './car-details.component.html',
  styleUrls: ['./car-details.component.css']
})
export class CarDetailsComponent implements OnInit {
  @Input() carDetails;

  @Output() childEvent = new EventEmitter();

  constructor() { }

  ngOnInit() {
  }

  sendData(data) {
    this.childEvent.emit(data);
  }

}
