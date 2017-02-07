package swiping;

import java.util.Date;

public class Entry {

private Date timeStamp;
private String type;
private long delta;

public Entry(Date timeStamp, String type) {
	this.timeStamp = timeStamp;
	this.type = type;
}

public long getDelta() {
	return delta;
}
public void setDelta(long delta) {
	this.delta = delta;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Date getTimeStamp() {
	return timeStamp;
}
public void setTimeStamp(Date timeStamp) {
	this.timeStamp = timeStamp;
}

}
