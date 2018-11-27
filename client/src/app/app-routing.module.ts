import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CutomersComponent } from './cutomers/cutomers.component';
import { CustomerAddComponent } from './customer-add/customer-add.component';
import { CustomerDetailComponent } from './customer-detail/customer-detail.component';

const routes: Routes = [
  {
    path: 'customers',
    component: CutomersComponent,
    data: { title: 'List of customers' }
  },
  
  {
    path: 'customer-add',
    component: CustomerAddComponent,
    data: { title: 'Add Customer' }
  },
  
  { path: '',
    redirectTo: '/customers',
    pathMatch: 'full'
  },
  {
    path: 'customer-details/:id',
    component: CustomerDetailComponent,
    data: { title: 'Customer Details' }
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
