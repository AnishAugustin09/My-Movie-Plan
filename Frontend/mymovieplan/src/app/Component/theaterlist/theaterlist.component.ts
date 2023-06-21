import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from 'src/app/Model/movie';
import { Theater } from 'src/app/Model/theater';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-theaterlist',
  templateUrl: './theaterlist.component.html',
  styleUrls: ['./theaterlist.component.css']
})
export class TheaterlistComponent {
deleteProduct(arg0: any) {
throw new Error('Method not implemented.');
}
mainMenu() {
this.route.navigate(['dashboard'])
}

  theaters: Theater[];
  constructor(private service : ServiceService, private route : Router){}

  ngOnInit(){
    this.service.getTheaters().subscribe(x=> {this.theaters=x} )
  }
}
