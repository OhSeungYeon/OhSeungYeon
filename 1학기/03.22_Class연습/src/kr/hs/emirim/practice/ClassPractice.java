package kr.hs.emirim.practice;

public class ClassPractice {

	public static void main(String args[]) {
		
		연예인 박나래 = new 연예인();
		박나래.name = "박나래";
		박나래.women = true;
		박나래.play();
		박나래.interview();
		
		영화배우 변요한 = new 영화배우();
		변요한.name = "변요한";
		변요한.movie = "하루";
		변요한.play();
		변요한.interview();
		변요한.cry();
		변요한.skill();
		
		연예인 연예인A씨 = 변요한;
		연예인A씨.play();
		연예인A씨.interview();
		((영화배우)연예인A씨).cry();
		
		가수 김영철 = new 가수();
		김영철.name = "김영철";
		김영철.women = false;
		김영철.song = "널 사랑하지 않아";
		김영철.show();
		김영철.skill();
		
	}
	
}
