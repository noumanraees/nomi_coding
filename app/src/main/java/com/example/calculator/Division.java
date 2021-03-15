package com.example.calculator;

public class Division extends MainActivity{


  public int d;
  public int r;
    public String msg;
    public String div(int a,int b){
        d=a/b;
        r=a%b;
        msg="Quotient is"+d+"remainder is"+r;
        return msg;


    }
}
