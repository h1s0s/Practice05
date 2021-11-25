package com.javaex.ex05;

public class PrintApp {

    public static void main(String[] args) {
    	//건들이지 않고 오류 안나게.
        Print print = new Print();
        
        print.printer(10);
        print.printer(true);
        print.printer(5.7);
        print.printer("홍길동");
        
    }

}
