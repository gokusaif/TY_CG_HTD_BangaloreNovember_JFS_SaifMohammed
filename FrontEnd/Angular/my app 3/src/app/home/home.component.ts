import { Component, OnInit, OnDestroy } from '@angular/core';
import { interval, Subscription } from 'rxjs';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy {

 subscription: Subscription;

  constructor(private router: Router) {
    this.subscription = interval(1000).subscribe(data => {
      console.log(data);
    });
  }

  ngOnInit() {
  }

  ngOnDestroy() {
    this.subscription.unsubscribe();
  }

  goToId(id, name, url) {
    // this.router.navigateByUrl(`/user/${id}`);
    this.router.navigate([`/user/${id}`], {
      queryParams: {userName: name, userUrl: url}
    });
  }

}
