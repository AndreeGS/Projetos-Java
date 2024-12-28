package entities;

public class OutsourcedEmploee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourcedEmploee() {
		super();
	}

	public OutsourcedEmploee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
