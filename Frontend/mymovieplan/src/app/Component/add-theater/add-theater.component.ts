import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Theater } from 'src/app/Model/theater';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-add-theater',
  templateUrl: './add-theater.component.html',
  styleUrls: ['./add-theater.component.css']
})
export class AddTheaterComponent {

  theater : Theater= new Theater();

  constructor(private service :ServiceService, private route: Router){}

  mainMenu(){
    this.route.navigate(['dashboard'])
  }

  onSubmit(){
    this.service.saveTheater(this.theater).subscribe();
    alert("Added Successfully")
  }
}
