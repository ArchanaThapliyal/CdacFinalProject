import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, RouterLinkActive } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { Admin } from '../admin';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  admin=new Admin();
  msg='';
  constructor(private _service:RegistrationService,private _router: Router) { }

  ngOnInit(){
  }
 
 
   adminUser()
  {
    console.count(""+this.admin.emailId)
    this._service.adminUserFromRemote(this.admin).subscribe(
      data=>{
        console.log("response received"),
      this._router.navigate(["/list"]);
    },
      error=>console.log("Exception")
    )
  }
}
