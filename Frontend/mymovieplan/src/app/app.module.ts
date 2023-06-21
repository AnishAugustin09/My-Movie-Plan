import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovielistComponent } from './Component/movielist/movielist.component';
import { HeaderComponent } from './Component/header/header.component';
import { HomeComponent } from './Component/home/home.component';
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

@NgModule({
  declarations: [
    AppComponent,
    MovielistComponent,
    HeaderComponent,
    HomeComponent,
    AddmovieComponent,
    TheaterlistComponent,
    AddTheaterComponent,
    CustomerlistComponent,
    AddCustomerComponent,
    CustomerLoginComponent,
    AdminLoginComponent,
    SeatSelectionComponent,
    PaymentComponent,
    DashboardComponent,
    TheaterSelectionComponent,
    BookingSuccessComponent,
    ProfileComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
