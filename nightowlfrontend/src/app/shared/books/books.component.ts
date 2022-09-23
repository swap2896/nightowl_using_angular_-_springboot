import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BackendService } from 'src/app/services/backend.service';
import { ThemeService } from 'src/app/theme.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.scss']
})
export class BooksComponent implements OnInit {

  constructor(private service:BackendService,private themeService: ThemeService) {
    this.themecolor=this.themeService.get_header_theme()
   }
  books:any;
  isloading:boolean=false;
  themecolor='primary';
  ngOnInit(): void {
    this.isloading=true;
    this.books=[]
    this.service.get_books().subscribe(
      (result:any)=>{
        console.log(result)
        this.books=result;
        this.isloading=false
      }
    )
  }

}
