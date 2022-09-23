import { Injectable, OnInit } from '@angular/core';
import {HttpClient,HttpParams} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class BackendService implements OnInit {
  private backendserviceurl="http://localhost:8080/"
  
  constructor(private httpclient:HttpClient) { }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  get_books(bookid='')
  {
    if(bookid=='')
    {
    let url=this.backendserviceurl+'books/'
    return this.httpclient.get(url)
    }
    else{
      let url=this.backendserviceurl+'books/'+bookid+'/'
    return this.httpclient.get(url)
    }
  }
  get_dashboard_details()
  {
    let url=this.backendserviceurl+'dashboard/'
    return this.httpclient.get(url)
  }
  get_group_by_rating_details()
  {
    let url=this.backendserviceurl+'rating'
    return this.httpclient.get(url)

  }

  get_group_by_category_details(){
    let url=this.backendserviceurl+'groupbytype'
    return this.httpclient.get(url)
  }
}
