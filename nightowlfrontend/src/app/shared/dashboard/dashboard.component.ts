import { Component, OnInit } from '@angular/core';
import { BackendService } from 'src/app/services/backend.service';
import { ThemeService } from 'src/app/theme.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {
  
  isloading:boolean=false
  books_by_rating:any=[]
  topratedbooks=[]
  books_by_category:any=[]
  constructor(private service:BackendService,private themeService:ThemeService) {
    this.themeColor=this.themeService.get_header_theme()
  }
 themeColor='primary'

  ngOnInit(): void {
    this.isloading=true;
    this.books_by_rating=[]
    this.topratedbooks=[]
    this.books_by_category=[]
    this.service.get_dashboard_details().subscribe(
      (result:any)=>{
        this.topratedbooks=result
        // this.books_by_rating=result
        // this.books_by_rating=object.books_by_rating
        // this.topratedbooks=object.top_ten_rated_books
        // this.books_by_category=object.books_by_category
        this.isloading=false
      }
    )
    this.service.get_group_by_rating_details().subscribe(
      (result:any)=>{
        this.books_by_rating=result
        this.isloading=false
      }
    )

    this.service.get_group_by_category_details().subscribe(
      (result:any)=>{
        this.books_by_category=result
        this.isloading=false
      }
    )
  }

}
