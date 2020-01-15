import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  imgUrl = 'https://cdn.pixabay.com/photo/2016/09/04/20/09/mountains-1645078_1280.jpg';
  flag = true;
  twoWayData;
  constructor() {
    // setInterval(()=>{
    //   this.flag=!this.flag;
    // },1000);
  }

  click(input) {
    console.log(input.value);
    //  console.log('clicked');
  }

  printData() {
    console.log(this.twoWayData);
  }

  ngOnInit() {
  }

}
