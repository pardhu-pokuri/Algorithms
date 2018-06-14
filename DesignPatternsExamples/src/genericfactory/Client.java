package genericfactory;

public interface Client<U,V> {
	
	public V sendRequest(U request);
}
