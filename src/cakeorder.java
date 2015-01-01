
public class cakeorder {
	
	private int quantity;
	private int cakeCode;
	private int tasteScore;
	
	/**
	 * 
	 * New comments cake_fix
	 */
	public void setQuantity(Integer i) {
	
		quantity=i;
		
	}
	
	/**
	 * @param args
	 */
	public Integer getQuantity() {
	
		return quantity*10;
		
	}		
	/**
	 * 
	 * @param args
	 */
	public void setCakeCode(Integer i) {
	
		cakeCode=i;
		
	}
	
	/**
	 * @param args
	 */
	public Integer getCakeCode() {
	
		return cakeCode;
		
	}	
	/**
	 * 
	 * @param args
	 */
	public void setTasteScore(Integer i) {
	
		tasteScore=i;
		
	}
	
	/**
	 * @param args
	 */
	public Integer getTasteScore() {
	
		return tasteScore;
		
	}	
}
