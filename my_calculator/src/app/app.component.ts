import { Component } from '@angular/core';
import {HttpClient, HttpErrorResponse} from '@angular/common/http';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my_calculator';
  result = "";
  constructor(private http: HttpClient){

  }
  display(t : string){
    if(this.result==""){
      this.result = t;
    }
    else{
      this.result += t;
    }
  }
  Clear(){
    this.result = "";
  }
  Delete(){
    this.result = this.result.slice(0,-1);
  }
  solut(t : string){
    this.http.get("http://localhost:8080/" + this.result, {responseType: 'text'}).subscribe(op => {
      this.result = op.toString();
    });
  }
  display1(t : string){
    if(this.result==""&&t=="-"){
      this.result = "-";
    }
    else if(this.result!="" && this.result!="-"){
    if(this.result.charAt(this.result.length-1)>='0'&&this.result.charAt(this.result.length-1)<='9'){
      this.result +=t;
    }
    else{
      this.Delete();
      this.result +=t;
    }
    this.solut(this.result);
  }
  }
  display2(t : string){
    if(this.result!=""&& this.result!="-"){
      if(this.result.charAt(this.result.length-1)>='0'&&this.result.charAt(this.result.length-1)<='9'){
        this.result +=t;
      }
      else{
        this.Delete();
        this.result +=t;
      }
      this.solut(this.result);
    }
    
  }

  display3(t : string){
    let xx = 0;
    for(let i=0 ; i<this.result.length ; i++){
      if(this.result.charAt(i)=='.'){
        xx=1;
      }
      else if(this.result.charAt(i)>'9'||this.result.charAt(i)<'0'){
        xx=0;
      }
    }
    if(xx==0){
      this.result += t;
    }

  }

  display4(t : string){
    if(this.result!=""&& this.result!="-"){
    if(this.result.charAt(this.result.length-1)>='0'&&this.result.charAt(this.result.length-1)<='9'){
      this.result += t;
    }
    else{
      this.Delete();
      this.result +=t;
    }
    this.solut(this.result);
  }
  }

}
