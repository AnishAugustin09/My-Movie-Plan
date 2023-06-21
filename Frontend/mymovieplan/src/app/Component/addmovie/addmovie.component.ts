import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from 'src/app/Model/movie';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent {

  movie: Movie=new Movie();

  constructor(private service: ServiceService, private route:Router){}

  mainMenu(){
    this.route.navigate(['dashboard'])
  }

  onSubmit(){
    this.service.saveMovie(this.movie).subscribe();
    alert("Movie Added Successfully")
  }
}
