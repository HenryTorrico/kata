package parrot;

public class Parrot {

    private ParrotTypeEnum type;
    private int numberOfCoconuts = 0;
    private double voltage;	
    private boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
    	ParrotType parrotType=null;
        switch(type) {
            case EUROPEAN:
            	parrotType= new European();
            	break;
            case AFRICAN:
            	parrotType= new African(getBaseSpeed(),getLoadFactor(),numberOfCoconuts);
            	break;
            case NORWEGIAN_BLUE:
            	parrotType= new NorwegianBlue(isNailed,voltage,getBaseSpeed());
            	break;
        }
		return parrotType.getTotalSpeed();
    }

	private double isNorwegianBlue() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}

	private double isAfrican() {
		return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
	}

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

    private double getLoadFactor() {
        return 9.0;
    }

    private double getBaseSpeed() {
        return 12.0;
    }


}
