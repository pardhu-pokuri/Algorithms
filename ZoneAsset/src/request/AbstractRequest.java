package request;

public abstract class AbstractRequest implements Request{
	
	private String zone;
	
	private String db;
	
	private String asset;
	
	@Override
	public void setZone(String zone) {
		this.zone = zone;
		
	}

	@Override
	public void setDB(String db) {
		this.db = db;
		
	}
	
	@Override
	public void setAsset(String asset) {
		this.asset = asset;
		
	}
	
	

}
