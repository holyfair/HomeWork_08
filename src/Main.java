
public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("Vasya", 2);
		Dog dog = new Dog("Reks", 3);
		SuperStack stack = new SuperStack();
		stack.push(cat);
		stack.push(dog);
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		Woman woman = new Woman("Masha",17);
		Mouse mouse = new Mouse("Lariska", 3);
		stack.addToBlackList(woman.getClass());
		stack.addToBlackList(mouse.getClass());
		stack.push(woman);
		stack.push(mouse);
	}

}
