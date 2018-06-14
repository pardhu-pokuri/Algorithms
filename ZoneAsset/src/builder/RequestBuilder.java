package builder;

import request.Request;

public class RequestBuilder<T extends Request> {
	
	private T request;
	
	public RequestBuilder(Class<T> classObj) {
		try {
			request = classObj.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public static <T extends Request> RequestBuilder<T> of(Class<T> classObj){
		return new RequestBuilder<>(classObj);
	}
	
	public RequestBuilder<T> zone(String zone){
		request.setZone(zone);
		return this;
	}
	
	public RequestBuilder<T> db(String db){
		request.setDB(db);
		return this;
	}
	
	public RequestBuilder<T> asset(String asset){
		request.setAsset(asset);
		return this;
	}
	
	public T build(){
		return request;
	}
}
