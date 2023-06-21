import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BehaviorSubject } from 'rxjs';
import { Movie } from 'src/app/Model/movie';
import { Theater } from 'src/app/Model/theater';
import { ServiceService } from 'src/app/Services/service.service';

@Component({
  selector: 'app-theater-selection',
  templateUrl: './theater-selection.component.html',
  styleUrls: ['./theater-selection.component.css']
})
export class TheaterSelectionComponent {

  public theaters: any=[];
  public selectTheaters = new BehaviorSubject<any>([]);
  movies: Movie[]
   constructor( private service: ServiceService, private route: Router,private activateRoute: ActivatedRoute){}

   ngOnInit(){
    const id= this.activateRoute.snapshot.paramMap.get("movieId")!
    console.log(id)
    this.service.selectTheater(Number(id)).subscribe(x=>{this.theaters=x
    })
   }

   updatelist(tm: any){
    this.service.addtolist(tm);
    this.route.navigate(["seatselection"])
   }
}
