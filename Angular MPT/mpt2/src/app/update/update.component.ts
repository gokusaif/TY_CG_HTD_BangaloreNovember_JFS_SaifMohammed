import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { PostsService } from '../posts.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  userId1;
  id1;
  title1;
  body1;
  constructor(private activatedRoute: ActivatedRoute, private service: PostsService, private router: Router) {
    activatedRoute.params.subscribe(data => {
      this.userId1 = data.id;
    });
    activatedRoute.queryParams.subscribe(data => {
      console.log(data);
      this.id1 = data.id;
      this.title1 = data.title;
      this.body1 = data.body;
    });
  }

  ngOnInit() {
  }


  update(form: NgForm) {
    console.log(form.value);
    console.log(this.service.posts.indexOf(form.value));

    this.service.posts.splice(this.service.posts.indexOf(form.value), 1, form.value);
    this.router.navigateByUrl('/view');
  }

}
