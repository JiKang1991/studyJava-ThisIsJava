package runtimeException;
/**
 * ClassCastException �߻� ����
 * @author jikang
 *
 */
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionExample {
	public static void changeDog(Animal animal) {
		// ClassCastException �߻� ����, instanceof �����ڸ� ����Ͽ� Ÿ���� üũ�Ѵ�.
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
