import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { Product } from '../product';

@Component({
  selector: 'app-addcake',
  templateUrl: './addcake.component.html',
  styleUrls: ['./addcake.component.css']
})
export class AddcakeComponent implements OnInit {

  product=new Product();

  constructor(private _service:RegistrationService,private _router: Router) { }

  ngOnInit(): void {}
  addproduct()
  {
    this._service.addproductFromRemote(this.product).subscribe(
      data =>{console.log("response received");
              this._router.navigate(['./list']);
             },
      error =>console.log("Exception Occured")        
      )
  }
  gotodeletecake()
  {
    this._router.navigate(['./deletecake'])
  }
  gotoeditcake()
  {
    this._router.navigate(['./editcake'])
  }
  gotolist()
  {
    this._router.navigate(['./list'])
  }

}
