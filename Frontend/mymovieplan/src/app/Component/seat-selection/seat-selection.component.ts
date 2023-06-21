import { style } from '@angular/animations';
import { Component } from '@angular/core';
import {  ElementRef, Renderer2 } from '@angular/core';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-seat-selection',
  templateUrl: './seat-selection.component.html',
  styleUrls: ['./seat-selection.component.css']
})
export class SeatSelectionComponent {

  selectseatcolor="grey";
  
  totalseats:number=0;
  ticketprice:number=200;
  totalticketprice:number;
  myarray: any;
  seatNum:any=[];
  list: any=[];
  constructor(private elementRef: ElementRef, private renderer: Renderer2, private service :ServiceService) {}

  
  shouldShowBlue = false;
  shouldShowGreen = false;

  ngOnInit(){
    this.service.viewList().subscribe(x=>{
      this.list=x;
      console.log(this.list)

    })
  }

  selectSeat(){
    this.shouldShowGreen=true;
    console.log("seat selected")
    this.totalseats++
    this.totalticketprice= this.totalseats*this.ticketprice
  }
  
  iChoose(){
    const selectedseat="green";
  }


}
