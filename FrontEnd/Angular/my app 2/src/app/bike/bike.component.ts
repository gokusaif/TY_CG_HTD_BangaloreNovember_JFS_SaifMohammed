import { Component, OnInit, DoCheck, OnDestroy, AfterContentInit, AfterContentChecked } from '@angular/core';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit, DoCheck, OnDestroy, AfterContentInit, AfterContentChecked{

  selectedBike;
  bikes = [

    {
      name: 'Kawasaki Ninja',
      img: 'https://cdn.pixabay.com/photo/2016/03/27/17/59/vintage-1283299__340.jpg',
      details: 'The 2018 Kawasaki Ninja 300 ABS comes from the same 296 cc parallel-twin cylinder, 8 Valve, DOHC engine tuned for 38 bhp at 11,000 rpm and 27 Nm '
    },
    {
      name: 'BMW',
      img: 'https://cdn.pixabay.com/photo/2015/09/08/21/02/superbike-930715__340.jpg',
      details: 'BMW G 310 R Specifications. Engine CC 313 cc. No Of Cylinder 1. Max Power 34 bhp @ 9500 rpm. Max Torque 28 Nm @ 7500 rpm. Valves Per Cylinder 4. Fuel Delivery Electronic Fuel Injection, BMS-E2. Cooling System Water-cooled. Starting Mechanism Self Start'
    },
    {
      name: 'Bullet',
      img: 'https://cdn.pixabay.com/photo/2015/08/27/09/06/bike-909690__340.jpg',
      details: 'Bullet uses a 4-stroke, 346cc UCE engine. This air-cooled engine is capable of producing a power output of 19.8 bhp at 5250 rpm. The single cylinder of this engine musters up a torque output of 28 Nm which is available at 4000 rpm.'
    },
    {
      name: 'Honda CBR',
      img: 'https://cdn.pixabay.com/photo/2017/07/01/03/47/bike-2460493__340.jpg',
      details: 'Honda CBR 1000RR Specifications. Engine CC 999 cc. No Of Cylinder 4. Max Power 189 bhp @ 13000 rpm. Max Torque 114 Nm @ 11000 rpm. Valves Per Cylinder 4. Fuel Delivery PGM-DSFI electronic fuel injection. Cooling System Liquid-Cooled. Starting Mechanism Self Start.'
    }
  ];
  constructor() {
    console.log('constructor called');
   }

  selectBike(bike) {
    this.selectedBike = bike;
  }

  ngOnInit() {
    console.log('on init called');
  }

  ngDoCheck() {
    console.log('do check called');
  }

  ngOnDestroy() {
    console.log('on destroy called');
  }
 
  ngAfterContentInit() {
    console.log('aftercontentinit');
  }

  ngAfterContentChecked(){
    console.log('after content checked');
    
  }
  

}
