package runtimeException;
/**
 * ClassCastException 발생 예외
 * @author jikang
 *
 */
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionExample {
	public static void changeDog(Animal animal) {
		// ClassCastException 발생 가능, instanceof 연산자를 사용하여 타입을 체크한다.
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;			
		}
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
	}
}
