import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, RouterLinkActive } from '@angular/router';
import { Product } from '../product';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  _productlist:Product[];
  constructor(private _service:RegistrationService,private _router: Router) {

  }

  ngOnInit(): void 
  { 
    this._service.fetchlistFromRemote().subscribe(
    data =>{console.log("response received")
            this._productlist=data;
    },
    error =>console.log("Exception Occured")        
    )
  }

 
  gotoeditcake(cakeId:number)
  {
    this._router.navigate(['./editcake',cakeId]);
  }
  gotoaddcake()
  {
    this._router.navigate(['./addcake'])
  }

  deletecake(cakeId:number)
  {
    this._service.deleteproductFromRemote(cakeId).subscribe(
      data=>{
            console.log("Deleted Successfully");
            this._router.navigate(['/list'])
            },
      error=>console.log("Exception")
    )
  }
}
