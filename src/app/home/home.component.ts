import { Route } from '@angular/compiler/src/core';
import { NgForm } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  user=new User();
  msg='';

  constructor(private _service:RegistrationService,private _router: Router) { }

  ngOnInit(): void {
  }
 

  gotologin()
  {
    this._router.navigate(['./login'])
  }
  gotoaboutus()
  {
    this._router.navigate(['./aboutus'])
  }
  gotoregistration()
  {
    this._router.navigate(['./registration'])
  }
}
