package iterator;

public class MyIterator implements Iterator{

	private Collection collection;
	private int position=-1;
	
	public MyIterator(Collection collection){
		this.collection = collection;
	}
	public Object previous() {
		if(position>0){
			position--;
		}
		return collection.get(position);
	}

	public Object next() {
		if(position<collection.size()-1){
			position++;
		}
		return collection.get(position);
	}

	public boolean hasNext() {
		if(position<collection.size()-1){
			return true;
		}else{
			return false;
		}
	}

	public Object first() {
		position=0;
		return collection.get(position);
	}

}
