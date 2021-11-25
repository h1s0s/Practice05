package com.javaex.ex04;

public class Base {
    
    public void service(String state) {
        if(state.equals("낮")) {
        	this.day();
        } else if(state.equals("밤")) {
        	this.night();
        } else {
        	this.afternoon();
        }
    }

    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

