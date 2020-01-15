import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  apiUrl = 'http://localhost:8080';
  constructor(private http: HttpClient) { }

  register(register): Observable<any> {
   return this.http.post<any>(`${this.apiUrl}/register`, register);
  }

  login(credentials): Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/login`, credentials);
   }


}
