

import java.util.Date;



public class CTRLContentStatisticQueryResultBean  {
	
	private String flightNo;
	private Date operationDateDate;
	private Integer repeatCount;
	private String aord;
	private Object operationDate;
	private Object aircraftTypeIata;
	private Object atd;
	private Object std;
	private Object previousFlight;
	private Object preOperationDate;
	private Object preRepeatCount;
	private Object preAta;
	private Object preSta;
	private Date TOBT;
	private Date COBT;
	private String detailNo;
	private String airline;
	private Integer timeDistance;
	
	
	public Object[] toObjects() {
		// TODO Auto-generated method stub
		Object[] obj = new Object[18];
		obj[0] = flightNo;
		obj[1] = operationDateDate;
		obj[2] = repeatCount;
		obj[3] = aord;
		obj[4] = operationDate;
		obj[5] = aircraftTypeIata;
		obj[6] = atd;
		obj[7] = std;
		obj[8] = previousFlight;
		obj[9] = preOperationDate;
		obj[10] = preRepeatCount;
		obj[11] = preAta;
		obj[12] = preSta;
		obj[13] = TOBT;
		obj[14] = COBT;
		obj[15] = detailNo;
		obj[16] = airline;
		obj[17] = timeDistance;
		return obj;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public Date getOperationDateDate() {
		return operationDateDate;
	}

	public void setOperationDateDate(Date operationDateDate) {
		this.operationDateDate = operationDateDate;
	}

	public Integer getRepeatCount() {
		return repeatCount;
	}

	public void setRepeatCount(Integer repeatCount) {
		this.repeatCount = repeatCount;
	}

	public String getAord() {
		return aord;
	}

	public void setAord(String aord) {
		this.aord = aord;
	}

	public Object getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Object operationDate) {
		this.operationDate = operationDate;
	}

	public Object getAircraftTypeIata() {
		return aircraftTypeIata;
	}

	public void setAircraftTypeIata(Object aircraftTypeIata) {
		this.aircraftTypeIata = aircraftTypeIata;
	}

	public Object getAtd() {
		return atd;
	}

	public void setAtd(Object atd) {
		this.atd = atd;
	}

	public Object getStd() {
		return std;
	}

	public void setStd(Object std) {
		this.std = std;
	}

	public Object getPreviousFlight() {
		return previousFlight;
	}

	public void setPreviousFlight(Object previousFlight) {
		this.previousFlight = previousFlight;
	}

	public Object getPreOperationDate() {
		return preOperationDate;
	}

	public void setPreOperationDate(Object preOperationDate) {
		this.preOperationDate = preOperationDate;
	}

	public Object getPreRepeatCount() {
		return preRepeatCount;
	}

	public void setPreRepeatCount(Object preRepeatCount) {
		this.preRepeatCount = preRepeatCount;
	}

	public Object getPreAta() {
		return preAta;
	}

	public void setPreAta(Object preAta) {
		this.preAta = preAta;
	}

	public Object getPreSta() {
		return preSta;
	}

	public void setPreSta(Object preSta) {
		this.preSta = preSta;
	}

	public Date getTOBT() {
		return TOBT;
	}

	public void setTOBT(Date tOBT) {
		TOBT = tOBT;
	}

	public Date getCOBT() {
		return COBT;
	}

	public void setCOBT(Date cOBT) {
		COBT = cOBT;
	}

	public String getDetailNo() {
		return detailNo;
	}

	public void setDetailNo(String detailNo) {
		this.detailNo = detailNo;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public Integer getTimeDistance() {
		return timeDistance;
	}

	public void setTimeDistance(Integer timeDistance) {
		this.timeDistance = timeDistance;
	}

	@Override
	public String toString() {
		return "CTRLContentStatisticQueryResultBean [flightNo=" + flightNo + ", operationDateDate=" + operationDateDate + ", repeatCount=" + repeatCount
				+ ", aord=" + aord + ", operationDate=" + operationDate + ", aircraftTypeIata=" + aircraftTypeIata + ", atd=" + atd + ", std=" + std
				+ ", previousFlight=" + previousFlight + ", preOperationDate=" + preOperationDate + ", preRepeatCount=" + preRepeatCount + ", preAta=" + preAta
				+ ", preSta=" + preSta + ", TOBT=" + TOBT + ", COBT=" + COBT + ", detailNo=" + detailNo + ", airline=" + airline + ", timeDistance="
				+ timeDistance + "]";
	}
	
	
}
