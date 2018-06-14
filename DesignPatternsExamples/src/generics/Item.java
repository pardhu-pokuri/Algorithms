package generics;

public class Item<T> {
	
	private T item;
	
	public T getItem(){
		return item;
	}
	
	public void setItem(T item){
		this.item = item;
	}

}
