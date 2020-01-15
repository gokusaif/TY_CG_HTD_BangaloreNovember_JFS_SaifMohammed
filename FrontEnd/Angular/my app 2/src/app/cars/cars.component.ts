import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  selectedCar;
  childData;
  cars = [

    {
      name: 'BMW',
      img: 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg',
      details: 'The 2018 Kawasaki Ninja 300 ABS comes from the same 296 cc parallel-twin cylinder, 8 Valve, DOHC engine tuned for 38 bhp at 11,000 rpm and 27 Nm '
    },
    {
      name: 'Suzuki',
      img: 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg',
      details: 'BMW G 310 R Specifications. Engine CC 313 cc. No Of Cylinder 1. Max Power 34 bhp @ 9500 rpm. Max Torque 28 Nm @ 7500 rpm. Valves Per Cylinder 4. Fuel Delivery Electronic Fuel Injection, BMS-E2. Cooling System Water-cooled. Starting Mechanism Self Start'
    },
    {
      name: 'Lamborgini',
      img: 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png',
      details: 'Bullet uses a 4-stroke, 346cc UCE engine. This air-cooled engine is capable of producing a power output of 19.8 bhp at 5250 rpm. The single cylinder of this engine musters up a torque output of 28 Nm which is available at 4000 rpm.'
    },
    {
      name: 'Honda ',
      img: 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      details: 'Honda CBR 1000RR Specifications. Engine CC 999 cc. No Of Cylinder 4. Max Power 189 bhp @ 13000 rpm. Max Torque 114 Nm @ 11000 rpm. Valves Per Cylinder 4. Fuel Delivery PGM-DSFI electronic fuel injection. Cooling System Liquid-Cooled. Starting Mechanism Self Start.'
    }
  ];
  constructor() { }

  selectCar(car) {
    this.selectedCar = car;
  }

  getData(data){
    this.childData=data;
  }
  ngOnInit() {
  }

}
