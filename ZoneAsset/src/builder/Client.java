package builder;

import request.JDBCRequest;
import request.RestRequest;

public class Client {
	
	public static void main(String[] args) {
		
		
		RestRequest restRequest = RequestBuilder.of(RestRequest.class)
												.zone("myZone")
												.db("myDB")
												.asset("myAsset")
												.build();
		
		JDBCRequest jdbcRequest = RequestBuilder.of(JDBCRequest.class)
												.zone("myZone")
												.db("myDB")
												.asset("myAsset")
												.build();
		
	}

}