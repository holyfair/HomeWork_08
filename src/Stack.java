import java.util.Arrays;

public abstract class Stack {

	private Object[] stack= new Object[0];
	private int index = -1;
	
	public void push(Object obj) {
		stack = Arrays.copyOf(stack, stack.length + 1);
		index++;
		stack[index] = obj;
	}
	
	public Object peek() {
		Object object = null;
		try {
		object = stack[index];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack is empty!");
		}
		return object;
	}
	
	public Object pop() {
		Object object = null;
		try {
		object = stack[index];
		stack = Arrays.copyOf(stack, stack.length - 1);
		index--;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stack is empty!");
		}
		return object;
	}
	public boolean search(Object object) {
		for(Object obj : stack) {
			if(obj.equals(object)) {
				return true;
			}
		}
		return false;
	}
}
