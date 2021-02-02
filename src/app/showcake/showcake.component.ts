import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { Product } from '../product';


@Component({
  selector: 'app-showcake',
  templateUrl: './showcake.component.html',
  styleUrls: ['./showcake.component.css']
})
export class ShowcakeComponent implements OnInit {
  _productlist:Product[];  
  msg='';
  cartArray:Product[]=[];
  productId:number;
  data:JSON;


  constructor(private _service:RegistrationService,private _router: Router) { }
  

  ngOnInit(): void {

 this.getselectedproduct();
}
 getselectedproduct()
 {

    this.cartArray=JSON.parse(sessionStorage.getItem('showcake'));
    console.log(JSON.parse(sessionStorage.getItem('showcake')));
    console.log(this.cartArray);
  }
  gotocart()
  {
    this._router.navigate(['./cart'])
  }
}

