import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-booking-success',
  templateUrl: './booking-success.component.html',
  styleUrls: ['./booking-success.component.css']
})
export class BookingSuccessComponent {

   profile: any=[];
   booking: any=[];

  constructor(private service:ServiceService, private route: Router){}

  ngOnInit(){
    this.service.viewList().subscribe(x=>{
      this.profile=x
      console.log(x)
    })
    this.service.getProfile().subscribe(y=>{
      this.booking=y
      console.log(y)
    })
  }

  checkout(){}
}
