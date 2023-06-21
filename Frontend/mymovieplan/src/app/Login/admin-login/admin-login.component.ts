import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Login } from 'src/app/Model/login';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent {

  login : Login= new Login();

  constructor(private service: ServiceService, private route:Router){}

onSubmit() {

  this.service.loginAdmin(this.login).subscribe(x=>{ console.log(x)
    if(x==true){
      this.service.getAdminById(this.login.adminEmail).subscribe(x=>{
        console.log(x)
        this.route.navigate(['dashboard'])
      })
    }
    
  })
}

}
