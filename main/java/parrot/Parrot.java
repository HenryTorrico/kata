package parrot;

public class Parrot {
	
	double LOAD_FACTOR=9.0;
	double BASE_SPEED=12.0;

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
            	parrotType= new African(BASE_SPEED,LOAD_FACTOR,numberOfCoconuts);
            	break;
            case NORWEGIAN_BLUE:
            	parrotType= new NorwegianBlue(isNailed,voltage,BASE_SPEED);
            	break;
        }
		return parrotType.getTotalSpeed();
    }

    


}
