import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from 'src/app/Model/login';
import { User } from 'src/app/Model/user';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-customer-login',
  templateUrl: './customer-login.component.html',
  styleUrls: ['./customer-login.component.css']
})
export class CustomerLoginComponent {

  login : Login= new Login();

  constructor(private service : ServiceService, private route : Router){}

  onSubmit(){
    this.service.loginUser(this.login).subscribe(x=> {console.log(x)
    if(x==true){
      this.service.getCustomersById(this.login.customerEmail).subscribe(x=>{
        console.log(x)
        this.service.addProfile(x)
        this.route.navigate(['Home'])
      })
      
    }else if(x==null){
      alert("User Not Found")
    }else{
      alert("invalid password")
    }
    
    });
    
  }
}
