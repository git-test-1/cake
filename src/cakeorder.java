
public class cakeorder {
	
	private int quantity;
	private int cakeCode;
	private String cakeName;
	private String notes;
	
	/**
	 * 
	 * New Master and cake_release2 comments
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
	public void setCakeName(String s) {
	
		cakeName=s;
		
	}
	
	/**
	 * @param args
	 */
	public String getCakeName() {
	
		return cakeName;
		
	}	
	
	/**
	 * 
	 * @param args
	 */
	public void setNotes(String s) {
	
		notes=s;
		
	}
	
	/**
	 * @param args
	 */
	public String getNotes() {
	
		return notes;
		
	}	
}
