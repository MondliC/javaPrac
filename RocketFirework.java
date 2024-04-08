
package acsse.csc2a.fmb.model;
/**
 * @author MC Nkosi 220033089
 * Class that extends the firework class 
 * @see FireWork
 */
public class RocketFirework extends FireWork {
	private E_COLOUR RocBlackPowderColour ;
	private int intRocStarCount;
	private double RocStarRad;
	
	public RocketFirework(String fireworkID,String fireworkName,int intFuseLength,E_COLOUR fireColour , E_COLOUR RocBlackPowderColour,int intRocStarCount,int RocStarRad)
	{
		super(fireworkID, fireworkName, intFuseLength, fireColour);
		this.setRocBlackPowderColour(RocBlackPowderColour);
		this.setIntRocStarCount(intRocStarCount);
		this.setRocStarRad(RocStarRad); 
	
	}

	/**
	 * @return the rocBlackPowderColour
	 */
	public E_COLOUR getRocBlackPowderColour() {
		return RocBlackPowderColour;
	}

	/**
	 * @param rocBlackPowderColour the rocBlackPowderColour to set
	 */
	public void setRocBlackPowderColour(E_COLOUR rocBlackPowderColour) {
		RocBlackPowderColour = rocBlackPowderColour;
	}

	/**
	 * @return the intRocStarCount
	 */
	public int getIntRocStarCount() {
		return intRocStarCount;
	}

	/**
	 * @param intRocStarCount the intRocStarCount to set
	 */
	public void setIntRocStarCount(int intRocStarCount) {
		this.intRocStarCount = intRocStarCount;
	}

	/**
	 * @return the rocStarRad
	 */
	public double getRocStarRad() {
		return RocStarRad;
	}

	/**
	 * @param rocStarRad the rocStarRad to set
	 */
	public void setRocStarRad(double rocStarRad) {
		RocStarRad = rocStarRad;
	}
	public String display()
	{
		return String.format(super.getFireworkID(),super.getFireworkName(),super.getIntFuseLength(),super.getFireworkColour(),RocBlackPowderColour,intRocStarCount,RocStarRad);
		
	}

}
