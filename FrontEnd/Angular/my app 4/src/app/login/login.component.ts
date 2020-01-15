import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  failure: string;
  exception: string;

  constructor(private authService: AuthenticationService, private router: Router) { }

  ngOnInit() {
  }

  login(form: NgForm) {
    this.authService.login(form.value).subscribe( data => {
      console.log(data);
      if ( data.statusCode === 201) {
        console.log(data.message);
        localStorage.setItem('userDetails', JSON.stringify(data));
        console.log('user details stored in local storage');
        this.router.navigateByUrl('/');
      } else if ( data.statusCode === 405 ) {
        this.failure = data.message;
        setInterval(() => {
          this.failure = null;
          }, 5000);
      } else  {
        this.exception = data.message;
        setInterval(() => {
          this.exception = null;
          }, 5000);
      }
    });
  }

}
