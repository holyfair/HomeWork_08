
public class SuperStack extends Stack{

	private BlackList blackList = new BlackList();
	@Override
	public void push(Object obj) {
		if(!blackList.isClassExist(obj.getClass())) {
			super.push(obj);
		}else {
			System.out.println("Class is in the BlackList!");
		}
	}

	@Override
	public Object peek() {
		return super.peek();
	}

	@Override
	public Object pop() {
		return super.pop();
	}

	public void addToBlackList(Class someClass) {
		blackList.add(someClass);
	}
}
