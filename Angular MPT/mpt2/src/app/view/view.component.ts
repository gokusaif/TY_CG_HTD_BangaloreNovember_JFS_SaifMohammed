import { Component, OnInit } from '@angular/core';
import { PostsService } from '../posts.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  posts: Post[];
  message;

  constructor(private service: PostsService, private route: Router) {
    this.posts = service.posts;
  }

  ngOnInit() {
  }

  delete(post) {
    this.posts.splice(this.posts.indexOf(post), 1);
    this.message = 'Post deleted';
    setInterval( ()=> {
      this.message = null;
    },3000);
  }

  update(post) {
    this.route.navigate([`update/${post.userId}`],
      { queryParams: { id: post.id, title: post.title, body: post.body } }
    );
  }

}
