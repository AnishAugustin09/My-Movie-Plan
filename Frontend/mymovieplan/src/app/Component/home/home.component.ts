import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Movie } from 'src/app/Model/movie';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

  movies: Movie[]
  constructor(private service: ServiceService,private route : Router, private activateRoute: ActivatedRoute){}

  ngOnInit(){
    this.service.getLatestMovies("latest").subscribe(x=>this.movies=x)
  }

  
}
