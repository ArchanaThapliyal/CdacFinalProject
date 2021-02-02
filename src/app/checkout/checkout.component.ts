import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';


@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

  user=new User();
  msg='';
  constructor(private _service:RegistrationService,private _router: Router) { }
  

  ngOnInit(): void {
  } 

  checkoutUser()
  {
    this._service.checkoutUserFromRemote().subscribe(
    data =>console.log("response received"),
    error =>console.log("Exception") 
    )
  }
  gotopaymentgateway()
  {
    this._router.navigate(['./paymentgateway'])
  }
}
