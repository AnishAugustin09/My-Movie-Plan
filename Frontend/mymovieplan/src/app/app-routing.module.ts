import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './Component/home/home.component';
import { MovielistComponent } from './Component/movielist/movielist.component';
import { AddmovieComponent } from './Component/addmovie/addmovie.component';
import { TheaterlistComponent } from './Component/theaterlist/theaterlist.component';
import { AddTheaterComponent } from './Component/add-theater/add-theater.component';
import { CustomerlistComponent } from './Component/customerlist/customerlist.component';
import { AddCustomerComponent } from './Component/add-customer/add-customer.component';
import { CustomerLoginComponent } from './Login/customer-login/customer-login.component';
import { AdminLoginComponent } from './Login/admin-login/admin-login.component';
import { SeatSelectionComponent } from './Component/seat-selection/seat-selection.component';
import { PaymentComponent } from './Component/payment/payment.component';
import { DashboardComponent } from './Component/dashboard/dashboard.component';
import { TheaterSelectionComponent } from './Component/theater-selection/theater-selection.component';
import { BookingSuccessComponent } from './Component/booking-success/booking-success.component';
import { ProfileComponent } from './Component/profile/profile.component';

const routes: Routes = [
  {path:"Home", component:HomeComponent},
  {path:"Movies", component:MovielistComponent},
  {path:"addMovie", component:AddmovieComponent},
  {path:"theaterList", component:TheaterlistComponent},
  {path:"addTheater", component:AddTheaterComponent},
  {path:"customers", component:CustomerlistComponent},
  {path:"addCustomer", component:AddCustomerComponent},
  {path:"login", component:CustomerLoginComponent},
  {path:"adminlogin", component:AdminLoginComponent},
  {path:"seatselection", component:SeatSelectionComponent},
  {path:"payment", component:PaymentComponent},
  {path:"dashboard",component:DashboardComponent},
  {path:"theaterselection/:movieId",component:TheaterSelectionComponent},
  {path:"success",component:BookingSuccessComponent},
  {path:"profile",component:ProfileComponent},
  {path:"**",redirectTo:"login",pathMatch:"full"}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
