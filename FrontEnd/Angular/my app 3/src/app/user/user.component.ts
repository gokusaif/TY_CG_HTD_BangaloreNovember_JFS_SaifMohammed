import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  id;
  userDetails;

  constructor(private router: ActivatedRoute) {
    this.router.params.subscribe( data => {
      console.log(data);
      this.id = data.id;
    });
    this.router.queryParams.subscribe( data => {
      console.log(data);
      this.userDetails = data;
    });
  }

  ngOnInit() {
  }

}
