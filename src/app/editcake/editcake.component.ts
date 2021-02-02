import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { Product } from '../product';

@Component({
  selector: 'app-editcake',
  templateUrl: './editcake.component.html',
  styleUrls: ['./editcake.component.css']
})
export class EditcakeComponent implements OnInit {

  product=new Product();
  constructor(private _service:RegistrationService,private _router: Router,private _activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
  }
  updateproductformsubmit()
  {
    
    this._service.updateproductFromRemote(this.product).subscribe(
     data =>{console.log("response received");
     this.product=data;/**to populate data  */
      this._router.navigate(['./list']);
     },
      error =>console.log("Exception Occured")        
    )
  }

  

  gotolist()
  {
    this._router.navigate(['./list'])
  }
}
