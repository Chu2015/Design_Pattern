package behavior.iterator;

public class MyCollection implements Collection{
	
	public String string[] = {"a","b","c","d","e"};
	
	public Iterator iterator() {
		return new MyIterator(this);
	}

	public Object get(int i) {
		return string[i];
	}

	public int size() {
		return string.length;
	}

}
