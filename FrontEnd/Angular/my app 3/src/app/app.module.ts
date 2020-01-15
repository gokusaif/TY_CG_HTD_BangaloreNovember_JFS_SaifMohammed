import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AddProductComponent } from './add-product/add-product.component';
import { JsonDataComponent } from './json-data/json-data.component';
import { ProductsComponent } from './products/products.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { UserComponent } from './user/user.component';
import { AuthGuard } from './auth.guard';
import { FilterProductsPipe } from './filter-products.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AddProductComponent,
    JsonDataComponent,
    ProductsComponent,
    UpdateProductComponent,
    UserComponent,
    FilterProductsPipe
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'add-product', component: AddProductComponent, canActivate: [AuthGuard],
      data: { name: 'saif'}},
      { path: 'json-data', component: JsonDataComponent},
      { path: 'products', component: ProductsComponent},
      { path: 'update-product/:id', component: UpdateProductComponent},
      { path: 'user/:id', component: UserComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
