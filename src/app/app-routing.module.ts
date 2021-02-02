import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';

import { RegistrationComponent } from './registration/registration.component';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ShowcakeComponent } from './showcake/showcake.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { PaymentgatewayComponent } from './paymentgateway/paymentgateway.component';
import { AddcakeComponent} from './addcake/addcake.component';
import { EditcakeComponent } from './editcake/editcake.component';

import { AdminComponent } from './admin/admin.component';
import { ListComponent } from './list/list.component';
import { PaymentsuccessComponent } from './paymentsuccess/paymentsuccess.component';
import { CartComponent } from './cart/cart.component';
import { ContactusComponent } from './contactus/contactus.component';

const routes: Routes = [
  { path:'',component:HomeComponent },
  { path:'login',component:LoginComponent },
  { path:'showcake',component:ShowcakeComponent},
  { path:'aboutus',component:AboutusComponent},
  { path:'checkout',component:CheckoutComponent},
  { path:'paymentgateway',component:PaymentgatewayComponent},
  { path:'registration',component:RegistrationComponent},
  { path:'addcake',component:AddcakeComponent},
  { path:'cart',component:CartComponent},
  { path:'editcake',component:EditcakeComponent},
  { path:'editcake/:id',component:EditcakeComponent},
 
  { path:'list',component:ListComponent },
  { path:'admin',component:AdminComponent},
  { path:'paymentsuccess',component:PaymentsuccessComponent},
  { path:'cart',component:CartComponent},
  { path:'contactus',component:ContactusComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
