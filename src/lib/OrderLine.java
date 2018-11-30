package lib;

public class OrderLine {
	//Fields
	private String id;
	private int unitPrice;
	private int quantity;
	
	//Constructors
	/** 
	 * Instantiates a new order line
	 * with an empty id, a default unit price and 
	 * a default quantity.
	 * 
	 */
	public OrderLine() {
		this.id = "";
		this.unitPrice = 0;
		this.quantity = 0;
		
	}
	/** 
	 * It instantiates a new order line with a given id, unit price
	 * and quantity.
	 * 
	 * @param id the id of the order line 
	 * @param unitPrice the price of the order line item
	 * @param quantity the quantity of the orderline item
	 */
	public OrderLine(String id, int unitPrice, int quantity) {
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	//Methods
	/** Returns the current Id
	 * 
	 * @return the current Id
	 */
	public String getId() {
		return id;
	}
	/** Returns the current unit price.
	 * 
	 * @return the current unit price
	 */
	public int getUnitPrice() {
		return unitPrice;
	}
	/** Returns the current quantity
	 * 
	 * @return the current quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/** Re assignes the id of the order line
	 * 
	 * @param id the Id to be assigned to this order line
	 */
	public void setId(String id) {
		this.id = id;
	}
	/** Re assignes the unit price of this order line
	 * 
	 * @param unitPrice the unit price to be assigned to this order line
	 */
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	/** Re assignes the quantity of this order line
	 * 
	 * @param quantity the quantity to be assigned to this order line
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/** Multiplies the current unit price and the
	 * current quantity ad returns the total price off this
	 * order line
	 * 
	 * @return the total price of this order line
	 */
	public int getCost() {
		return this.unitPrice * this.quantity;
	}
	/** displays the order line in a textual form
	 * 
	 * @return the textual representation of the orderline
	 */
	public String toString() {
		return "OrderLine:[id =" + id + 
				", unitPrice =" + unitPrice + 
				", quantity =" + quantity + "]";
	}
	
	/** Will determine whether the input object is equal to this object.
	 * It will be true if it exist, if the classes are the same and the 
	 * attributes match it will Return true, otherwise false will be returned
	 * 
	 * @param obj the object to be compared based on equality
	 * 
	 * @return whether or not obj is equal to this order line
	 * 
	 */
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		OrderLine other = (OrderLine) obj;
		
		return other.id == this.id && this.unitPrice == other.unitPrice && this.quantity == other.quantity;
	}

}
