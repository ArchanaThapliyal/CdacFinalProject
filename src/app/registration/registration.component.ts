import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user=new User();
  msg='';
  constructor(private _service:RegistrationService,private _router: Router) { }

  ngOnInit(): void {
  }

  registerUser()
  {
    console.count(""+this.user.emailId)
    this._service.RegisterUserFromRemote(this.user).subscribe(
    data =>console.log("response received"),
    error =>console.log("Exception")
    )
  }
  gotohome()
  {
    this._router.navigate(['./login'])
  }
  
}
