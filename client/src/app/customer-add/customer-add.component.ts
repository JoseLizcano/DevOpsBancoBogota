import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ApiService } from '../api.service';
import { FormControl, FormGroupDirective, FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';

@Component({
  selector: 'app-customer-add',
  templateUrl: './customer-add.component.html',
  styleUrls: ['./customer-add.component.scss']
})
export class CustomerAddComponent implements OnInit {

  customerForm: FormGroup;
  name:string='';
  last:string='';
  address:number=null;
  isLoadingResults = false;

  constructor(private router: Router, private api: ApiService, private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.customerForm = this.formBuilder.group({
      'name' : [null, Validators.required],
      'last' : [null, Validators.required],
      'address' : [null, Validators.required],
      
    });
  }

  onFormSubmit(form:NgForm) {
    this.isLoadingResults = true;
    this.api.addCustomer(form)
      .subscribe(res => {
          let id = res['id'];
          this.isLoadingResults = false;
          this.router.navigate(['/customer-details', id]);
        }, (err) => {
          console.log(err);
          this.isLoadingResults = false;
        });
  }

}
