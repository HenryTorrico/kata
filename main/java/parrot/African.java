package parrot;

public class African implements ParrotType{


	public int numberOfCoconuts=0;
	private double baseSpeed;
	private double loadFactor;
	@Override
	public double getTotalSpeed() {
		System.out.println("aiuda");
        return Math.max(0, getBaseSpeed() - getLoadFactor() * getNumberOfCoconuts());
    }

	private int getNumberOfCoconuts() {
		return numberOfCoconuts;
	}

	private double getLoadFactor() {
		return loadFactor;
	}

	private double getBaseSpeed() {
		return baseSpeed;
	}

	
	African(double getBaseSpeed,double getLoadFactor,int numberCoconuts){
		this.numberOfCoconuts=numberCoconuts;
		this.baseSpeed=getBaseSpeed;
		this.loadFactor=getLoadFactor;
		
	}

}
