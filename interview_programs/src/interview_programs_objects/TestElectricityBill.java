package interview_programs_objects;

public class TestElectricityBill {

	public static void main(String[] args) {

		ElectriccityBill bill1 = new ElectriccityBill();
		bill1.setMeterNo(12345);
		bill1.setName("Ahamed");
		bill1.setAddress("Rajaji street");

		ElectriccityBill bill2 = new ElectriccityBill();

		bill2.setMeterNo(456789);
		bill2.setName("Meeran");
		bill2.setAddress("Gandhi street");

		ElectriccityBill bill3 = new ElectriccityBill();

		bill3.setMeterNo(12345);
		bill3.setName("Devaraj");
		bill3.setAddress("bell street");

		System.out.println(bill1);
		System.out.println(bill2);
		System.out.println(bill3);

		System.out.println(bill1.equals(bill3));
		System.out.println(bill1.equals(bill2));

		System.out.println(bill1.hashCode());
	}

}
