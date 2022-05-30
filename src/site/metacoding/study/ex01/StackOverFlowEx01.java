package site.metacoding.study.ex01;

//heap 1990년도~ 죽을 때까지 
//stack 행위가 시작될 때! 메모리에 뜨는거 -ex) 주원이가 민혁이 공격할 때! 
//static 클래스 종속 키워드 클래스가 없으면 못 쓴다. 0년~끝까지 . 메모리를 가장 많이 잡아 먹는다. 

class Lion{ //클래스는 상태와 행위를 가진다. 
	private int 위상태 = 0; 
	
	public int get위상태() {
		return 위상태;
	}
	public void eat() {
		
		int happy = 0; //메소드 안에서 선언됏으니 지역변수다. (호출될 때만 잠깐 뜰거니까) 상태가 아니다. 
		위상태++;
		happy=happy+10;
		if(위상태>=100) {
			
		}else {
			eat(); //재귀메소드 (본인이 본인을 호출하는) //스택이 종료되지 않고 계속 실행되면 stackoverflow터진다. 스택이 닫히지 않았다는 뜻이다. 
		}
	}
}

public class StackOverFlowEx01 {

	public static void main(String[] args) {

		//사자라는 애를 메모리에 띄워야할 책임이 있는애가 없으면 main에서 띄우는거다. 메인은 context를 가진다. 아무리 거대해도 main이 정보를 다 들고 있다.
		Lion lion = new Lion(); //heap공간에 떴다!! 위상태가 떴다.  만약 위상태가 static이면 아무것도 안뜬다. 
		lion.eat();
		System.out.println("아 배부르다 : "+ lion.get위상태());
	}
}
