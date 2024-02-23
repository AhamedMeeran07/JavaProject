package com.springdependencyinjection.object;

public class Student {

	// MathCheat mathCheat=new MathCheat(); we dont want tight coupling
	private int id;
	private MathCheat mathCheat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.mathCheat();
		System.out.println("Student id is: "+id);
	}
}
