import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent {

  pro:any=[]

  constructor(private service: ServiceService, private route: Router){}

  ngOnInit(){
    this.service.getProfile().subscribe(x=>{
      this.pro=x
      console.log(x)
      console.log(this.pro)
    })
  }

  logout(){
    this.service.emptyProfile()
    alert("Successfully logout")
    this.route.navigate(['login'])
  }
}
