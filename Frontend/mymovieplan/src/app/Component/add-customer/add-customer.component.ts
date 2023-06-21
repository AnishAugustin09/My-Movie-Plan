import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/user';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent {

  user : User = new User();

  constructor(private service: ServiceService, private route: Router){}

  mainMenu(){
    this.route.navigate(['dashboard'])
  }

  onSubmit(){
    this.service.saveCustomer(this.user).subscribe();
    alert("Registered successfully")
    this.route.navigate(['login'])
  }

}
