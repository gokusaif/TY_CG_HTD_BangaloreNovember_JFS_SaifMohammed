import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  posts: Post[];

  constructor(private http: HttpClient) {
    this.viewPosts();
  }

  viewPosts() {
    this.http.get<any>('https://jsonplaceholder.typicode.com/posts').subscribe(data => {
      this.posts = data;
    });
  }

}
