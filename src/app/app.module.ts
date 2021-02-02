import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { HttpClientModule } from '@angular/common/http';
import { User } from './user';

import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ShowcakeComponent } from './showcake/showcake.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { PaymentgatewayComponent } from './paymentgateway/paymentgateway.component';
import { AddcakeComponent } from './addcake/addcake.component';
import { EditcakeComponent } from './editcake/editcake.component';

import { AdminComponent } from './admin/admin.component';
import { ListComponent } from './list/list.component';
import { PaymentsuccessComponent } from './paymentsuccess/paymentsuccess.component';
import { ContactusComponent } from './contactus/contactus.component';
import { CartComponent } from './cart/cart.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    AboutusComponent,
    HomeComponent,
    ShowcakeComponent,
    CheckoutComponent,
    PaymentgatewayComponent,
    AddcakeComponent,
    EditcakeComponent,
    
    AdminComponent,
    ListComponent,
    PaymentsuccessComponent,
    ContactusComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
