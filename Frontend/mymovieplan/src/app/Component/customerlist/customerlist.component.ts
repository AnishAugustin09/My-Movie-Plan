import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/Model/user';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-customerlist',
  templateUrl: './customerlist.component.html',
  styleUrls: ['./customerlist.component.css']
})
export class CustomerlistComponent {

  users: User[];
  constructor(private service: ServiceService, private route:Router){}

  ngOnInit(){
    this.service.getCustomers().subscribe(x=>this.users=x)
  }

  mainMenu(){
    this.route.navigate(['dashboard'])
  }

  deleteProduct(email: string){
    
  }
}
