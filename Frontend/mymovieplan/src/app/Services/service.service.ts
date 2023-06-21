import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Movie } from '../Model/movie';
import { Theater } from '../Model/theater';
import { User } from '../Model/user';
import { Login } from '../Model/login';
import { Admin } from '../Model/admin';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  public profile: any=[];
  public profileview= new BehaviorSubject<any>([]);

  public booking: any=[];
  public bookinglist= new BehaviorSubject<any>([]);

  baseUrl: string="http://localhost:8080/"
  constructor(private http: HttpClient) { }

  getAllMovies():Observable<Movie[]>{
    return this.http.get<Movie[]>(this.baseUrl);
  }

  getLatestMovies(latest: string):Observable<Movie[]>{
    return this.http.get<Movie[]>(this.baseUrl+"movie/"+latest)
  }

  getTheaters():Observable<Theater[]>{
    return this.http.get<Theater[]>(this.baseUrl+"theaters")
  }
  
  saveMovie(movie: Movie){
    return this.http.post(this.baseUrl+"addmovie",movie)
  }

  saveTheater(theater: Theater){
    return this.http.post(this.baseUrl+"addTheater",theater)
  }
  
  getCustomers():Observable<User[]>{
    return this.http.get<User[]>(this.baseUrl+"Customers")
  }

  getCustomersById(email:string):Observable<User>{
    return this.http.get<User>(this.baseUrl+"/Customer/"+email)
  }

  saveCustomer(user:User){
    return this.http.post(this.baseUrl+"addCustomer",user)
  }

  loginUser(login: Login){
    return this.http.post(this.baseUrl+"login",login)
  }

  loginAdmin(login: Login){
    return this.http.post(this.baseUrl+"admin",login)
  }

  getAdminById(email: string):Observable<Admin>{
    return this.http.get<Admin>(this.baseUrl+"/Admin/"+email)

  }

  getProfile(){
    return this.profileview.asObservable();
  }

  addProfile(user:any){
    this.profile.push(user);
    this.profileview.next(this.profile)
    console.log(this.profile)
  }

  emptyProfile(){
    this.profile=[]
    this.profileview.next(this.profile)
  }

  selectTheater(id:number):Observable<any>{
    return this.http.get<any>(this.baseUrl+"/theaterMovie/"+id)
  }

  addtolist(book:any){
    this.booking.push(book)
    this.bookinglist.next(this.booking)
    console.log(this.booking)
  }

  viewList(){
  return this.bookinglist.asObservable();
  }

  emptyList(){
    this.booking=[]
    this.bookinglist.next(this.booking)
  }
  
}
