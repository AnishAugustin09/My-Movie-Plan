import { Component } from '@angular/core';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent {

  paymentType:number;
  grandTotal !: number;

  constructor(private service: ServiceService){}

  ngOnInit(){
    
  }

  debitcardpayment(){
    this.paymentType=1;
  }
  netBanking(){
    this.paymentType=2;
  }
  upiPayment(){
    this.paymentType=3;
  }

  codPayment(){
    this.paymentType=4;
  }

  payLater(){this.paymentType=5;
  }
}
