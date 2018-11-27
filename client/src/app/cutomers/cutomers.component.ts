import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';
import { Customer } from '../model/customer';


@Component({
  selector: 'app-cutomers',
  templateUrl: './cutomers.component.html',
  styleUrls: ['./cutomers.component.scss']
})
export class CutomersComponent implements OnInit {

  displayedColumns: string[] = ['name', 'last'];
  data: Customer[] = [];
  isLoadingResults = true;

  constructor(private api: ApiService) { }

  ngOnInit() {
    this.api.getCustomers()
    .subscribe(res => {
      this.data = res;
      console.log(this.data);
      this.isLoadingResults = false;
    }, err => {
      console.log(err);
      this.isLoadingResults = false;
    });
  }

}
