import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Movie } from 'src/app/Model/movie';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-movielist',
  templateUrl: './movielist.component.html',
  styleUrls: ['./movielist.component.css']
})
export class MovielistComponent {

  movies: Movie[];
  constructor(private service: ServiceService,private route:Router){}

  ngOnInit(){
    this.service.getAllMovies().subscribe(x=>this.movies=x)
  }

  mainMenu(){
    this.route.navigate(['dashboard'])
  }

  deleteProduct(id: number){}
}
