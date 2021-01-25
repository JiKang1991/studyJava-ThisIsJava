package inheritance;
/**
 * 추상 메소드 선언 및 오버라이딩 예제 (실행 클래스)
 * @author jikang
 *
 */
public class AbstractMethodAndOverridingAnimalRuntime {
	// 메소드의 다형성 적용
	public static void animalSound(AbstractMethodAndOverridingAnimal animal) {	// 자동 타입 변환
		animal.sound();			// 재정의된 메소드 호출
	}
	
	public static void main(String[] args) {
		AbstractMethodAndOverridingDog dog = new AbstractMethodAndOverridingDog();
		AbstractMethodAndOverridingCat cat = new AbstractMethodAndOverridingCat();
		dog.sound();
		cat.sound();
		System.out.println("-----------------");
		
		// 변수의 자동 타입 변환
		AbstractMethodAndOverridingAnimal animal = null;
		animal = new AbstractMethodAndOverridingDog();			// 자동 타입 변환
		animal.sound(); 										// 재정의된 메소드 호출
		animal = new AbstractMethodAndOverridingCat();			// 자동 타입 변환
		animal.sound();											// 재정의된 메소드 호출
		System.out.println("-----------------");
		
		// 메소드의 다형성
		animalSound(new AbstractMethodAndOverridingDog());		// 자동 타입 변환
		animalSound(new AbstractMethodAndOverridingCat());		// 자동 타입 변환
	}
}
