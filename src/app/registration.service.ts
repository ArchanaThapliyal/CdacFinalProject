import { Injectable } from '@angular/core';
import { User } from './user';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Product } from './product';
import { Admin } from './admin';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private _http:HttpClient) { }

  public loginUserFromRemote(user : User):Observable<any>{
 return this._http.post<any>("http://localhost:8080/login",user)
  }

  public RegisterUserFromRemote(user : User):Observable<any>{
    return this._http.post<any>("http://localhost:8080/register",user)
}
  public AboutUsFromRemote(user : User):Observable<any>{
  return this._http.post<any>("http://localhost:8080/aboutus",user)
}

public showcakeUserFromRemote():Observable<any>{
  return this._http.get<any>("http://localhost:8080/admin/list")
}

public checkoutUserFromRemote():Observable<any>{
  return this._http.get<any>("http://localhost:8080/checkout")
}

public adminUserFromRemote(admin : Admin):Observable<any>{
  return this._http.post<any>("http://localhost:8080/admin/login",admin)
}
public fetchlistFromRemote():Observable<any>{
  return this._http.get<any>("http://localhost:8080/admin/list");
}
public addproductFromRemote(product:Product):Observable<any>{
  return this._http.post<any>("http://localhost:8080/admin/addcake",product);
}
public updateproductFromRemote(product:Product):Observable<any>{
  return this._http.put<any>("http://localhost:8080/admin/editcake",product);
}
public deleteproductFromRemote(cakeId:number):Observable<any>{
  return this._http.delete<any>("http://localhost:8080/admin/deletecake/"+cakeId);
}

}