import { Component, OnInit } from '@angular/core';
import { Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  constructor(private _service:RegistrationService,private _router: Router) {

  }

  ngOnInit(): void {
  }
  gotocheckout()
  {
    this._router.navigate(['./checkout'])
  }
}
