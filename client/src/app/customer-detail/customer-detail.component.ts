import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiService } from '../api.service';
import { Customer } from '../model/customer';

@Component({
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.scss']
})
export class CustomerDetailComponent implements OnInit {

  customer: Customer = { id: 0, name: '', last: '', address: null};
  isLoadingResults = true;

  constructor(private route: ActivatedRoute, private api: ApiService, private router: Router) { }

  ngOnInit() {

    this.getCustomerDetails(this.route.snapshot.params['id']);
  }

  getCustomerDetails(id) {
    this.api.getCustomer(id)
      .subscribe(data => {
        this.customer = data;
        console.log(this.customer);
        this.isLoadingResults = false;
      });
  }

}
