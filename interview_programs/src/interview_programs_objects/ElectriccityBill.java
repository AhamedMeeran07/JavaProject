package interview_programs_objects;

public class ElectriccityBill {

	private int meterNo;
	private String name;
	private String address;

	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}

	public int getMeterNo() {
		return meterNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return this.meterNo + " " + this.name + " " + this.address;
	}

//	@Override
//	public boolean equals(Object obj) {
//		ElectriccityBill meterNo = (ElectriccityBill) obj;
//		if (meterNo.getMeterNo() == this.meterNo) {
//			return true;
//		}
//		return false;
//	}

	@Override
	public int hashCode() {
		return meterNo;
	}
	@Override

	public boolean equals(Object obj) {

	if (this == obj)

	return true;

	if (obj == null)

	return false;

	if (getClass() != obj.getClass())

	return false;


	
	ElectriccityBill electricityBill =  (ElectriccityBill) obj;

	if (address == null) {

	if (electricityBill.address != null)

	return false;

	} else if (!address.equals(electricityBill.address))

	return false;

	if (meterNo != electricityBill.meterNo)

	return false;

	if (name == null) {

	if (electricityBill.name != null)

	return false;

	} else if (!name.equals(electricityBill.name))

	return false;

	return true;

	}

}
