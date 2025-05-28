package DataTypeAndException;

import java.math.BigDecimal;

public class Rocket {

	private String name;
	private BigDecimal thrust;
	private Boolean manned;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getThrust() {
		return thrust;
	}
	public void setThrust(BigDecimal thrust) {
		this.thrust = thrust;
	}
	public Boolean isManned() {
		return manned;
	}
	public void setManned(Boolean manned) {
		this.manned = manned;
	}
}