package parrot;

public class NorwegianBlue implements ParrotType{


	private double voltage;
	private boolean isNailed;
	private double baseSpeed;

	public double getSpeed(double voltage) {
		
		return Math.min(24.0, voltage*baseSpeed);
	}

	
	NorwegianBlue(boolean isNailed, double voltage,double baseSpeed) {
		this.voltage=voltage;
		this.isNailed=isNailed;
		this.baseSpeed=baseSpeed;
    	System.out.println(voltage);
    	System.out.println(isNailed);
    	System.out.println(baseSpeed);

	
	}
	
	

	@Override
	public double getTotalSpeed() {
		return (isNailed) ? 0 : getSpeed(voltage);
	}

}
