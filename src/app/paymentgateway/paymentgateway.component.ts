import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-paymentgateway',
  templateUrl: './paymentgateway.component.html',
  styleUrls: ['./paymentgateway.component.css']
})
export class PaymentgatewayComponent implements OnInit {

  constructor(private _service:RegistrationService,private _router: Router) { }

  ngOnInit(): void {
  }
  gotopaymentsuccess()
  {
    this._router.navigate(['./paymentsuccess'])
  }
}
