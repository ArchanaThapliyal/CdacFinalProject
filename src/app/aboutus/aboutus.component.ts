import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent implements OnInit {

  user=new User();
  msg='';
  constructor(private _service:RegistrationService,private _router: Router) { }

  ngOnInit(): void {
  }

  aboutUs()
  {
    this._service.AboutUsFromRemote(this.user).subscribe(
    data =>{
    console.log("response received");
    this._router.navigate(['/aboutus'])},

    error =>{ console.log("Exception");
    this.msg="wrong";}
    )
  }
  gotologin()
  {
    this._router.navigate(['./login'])
  }

}
