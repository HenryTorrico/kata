package parrot;

public class NorwegianBlue implements ParrotType{

	@Override
	public double getSpeed(double voltage) {
		Math.min(24.0, voltage*getSpeed());
		return 0;
	}

	@Override
	public double getSpeed(boolean isNailed, double voltage) {
		return (isNailed) ? 0 : getSpeed(voltage);
	}

	@Override
	public double getSpeed(int numberOfCoconuts) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSpeed() {
		return 12.0;
	}

}
