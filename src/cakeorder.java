
public class cakeorder {
	
	private int quantity;
	private int cakeCode;
	
	/**
	 * 
	 * Master Comments
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
}
