import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

  constructor(private service: ServiceService, private route: Router){}

  ngOnInit(){

  }

  logout(){
    alert("Logout Success")
    this.route.navigate(['login'])
  }
}
