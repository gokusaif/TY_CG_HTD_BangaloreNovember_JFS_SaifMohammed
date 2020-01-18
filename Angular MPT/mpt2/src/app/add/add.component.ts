import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PostsService } from '../posts.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent implements OnInit {


  constructor(private services: PostsService, private router: Router) {
  }

  ngOnInit() {
  }


  add(form: NgForm) {
    this.services.posts.push(form.value);
    this.router.navigateByUrl('/view');
  }

}
