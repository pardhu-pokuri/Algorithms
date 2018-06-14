package genericfactory;

public class ClientFactory<U,V> {
	
	public Client<U,V> getClient(U input){
		
		if(input instanceof JSONRequest){
			return new RestClient<U,V>();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		ClientFactory<JSONRequest, JSONResponse> clientFactory = new ClientFactory<>();
		Client<JSONRequest, JSONResponse> client = clientFactory.getClient(new JSONRequest());
		
	}
}
