package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		
		//예상값
		//Song(파라미터5개)
		//Song(파라미터6개)
		
		System.out.println(s1.toString());
	}

}


