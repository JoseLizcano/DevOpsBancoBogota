import { Injectable } from '@angular/core';
import { Observable, of, throwError } from 'rxjs';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { catchError, tap, map } from 'rxjs/operators';
import {Customer} from './model/customer';

const httpOptions = {
  headers: new HttpHeaders({'Content-Type': 'application/json'})
};
const apiUrl = "http://localhost:8080/customers/";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) {

   }

   private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {  
      
      console.error(error); // log to console      
      return of(result as T);
    };
  }

  getCustomers (): Observable<Customer[]> {
    return this.http.get<Customer[]>(apiUrl)
      .pipe(
        tap(cus => console.log('fetched customers')),
        catchError(this.handleError('getCustomers', []))
      );
  }

  addCustomer (customer): Observable<Customer> {
    return this.http.post<Customer>(apiUrl, customer, httpOptions).pipe(
      tap((product: Customer) => console.log(`added customer  id=${customer.id}`)),
      catchError(this.handleError<Customer>('addCustomer'))
    );
  }

  getCustomer(id: number): Observable<Customer> {
    const url = `${apiUrl}${id}`;
    return this.http.get<Customer>(url).pipe(
      tap(_ => console.log(`fetched customers id=${id}`)),
      catchError(this.handleError<Customer>(`getCustomer id=${id}`))
    );
  }
}
