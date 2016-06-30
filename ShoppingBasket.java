import java.util.*;

public class ShoppingBasket {

	private double totalPrice;
	private double totalSalesTax;

	public void updateTotalPrice(double p) {
		totalPrice += p;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void updateTotalSalesTax(double s) {
		totalSalesTax += s;
	}

	public Double getTotalSalesTax() {
		return totalSalesTax;
	}

}