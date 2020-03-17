package parrot;

public class European implements ParrotType {

	@Override
	public double getSpeed(double voltage) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSpeed() {
		return 0;
	}
	
	@Override
	public double getSpeed(int numberOfCoconuts) {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);

	}
	
	private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }

	@Override
	public double getSpeed(boolean isNailed, double voltage) {
		// TODO Auto-generated method stub
		return 0;
	}
}
