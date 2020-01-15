import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
 
import { AppComponent } from './app.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { ProductsComponent } from './products/products.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ImagesComponent } from './images/images.component';
import { ColorDirective } from './color.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikeComponent } from './bike/bike.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { CarsComponent } from './cars/cars.component';
import { CarDetailsComponent } from './car-details/car-details.component';

@NgModule({
  declarations: [
    AppComponent,
    DataBindingComponent,
    DirectivesComponent,
    ProductsComponent,
    NavbarComponent,
    ImagesComponent,
    ColorDirective,
    ParentComponent,
    ChildComponent,
    BikeComponent,
    BikeDetailsComponent,
    CarsComponent,
    CarDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
      { path: 'product-table', component: ProductsComponent },
      { path: 'product-images', component: ImagesComponent },
      { path: 'names' , component: DirectivesComponent },
      { path: 'parent' , component: ParentComponent },
      { path: 'bikes' , component: BikeComponent},
      { path: 'cars' , component: CarsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
