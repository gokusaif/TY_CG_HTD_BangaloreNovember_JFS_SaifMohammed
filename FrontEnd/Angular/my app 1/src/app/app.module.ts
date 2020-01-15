import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SectionComponent } from './section/section.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactusComponent } from './contactus/contactus.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { SaifComponent } from './saif/saif.component';
import { SurajComponent } from './suraj/suraj.component';
import { OmkarComponent } from './omkar/omkar.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SectionComponent,
    HomeComponent,
    AboutComponent,
    ContactusComponent,
    RegisterComponent,
    LoginComponent,
    PageNotFoundComponent,
    SaifComponent,
    SurajComponent,
    OmkarComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      { path: '', component: HomeComponent },
      { path: 'register', component: RegisterComponent },
      { path: 'login', component: LoginComponent },
      {
        path: 'about', component: AboutComponent, children: [
          { path: 'saif', component: SaifComponent },
          { path: 'suraj', component: SurajComponent },
          { path: 'omkar', component: OmkarComponent }
        ]
      },
      { path: 'contact-us', component: ContactusComponent },
      { path: '**', component: PageNotFoundComponent }
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
