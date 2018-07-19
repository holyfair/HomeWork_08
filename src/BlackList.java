
public class BlackList extends Stack{

	public void add(Class someClass) {
		super.push(someClass);
	}

	public boolean isClassExist(Class someClass) {
		if(super.search(someClass)) {
			return true;
		}
		return false;
	}
	
}
