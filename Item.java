import java.util.*;
import java.util.regex.*;

public class Item {

	private String name;
	private int quantity;
	private double price;
	private double salesTax;

	public void setName(String n) {
		Pattern itemNamePattern = Pattern.compile("\\D*(?=at)");
	    Matcher itemNameMatcher = itemNamePattern.matcher(n);
	    if (itemNameMatcher.find()) {
			name = itemNameMatcher.group(0);
		}
	}

	public String getName() {
		return name;
	}

	public void setQuantity(int q) {
		quantity = q;
	}

	public int getQuantity() {
		return quantity;
	}

	public void updatePrice(double p) {
		price += p;
	}

	public Double getPrice() {
		return price;
	}

	public void updateSalesTax(double s) {
		salesTax += s;
	}

	public Double getSalesTax() {
		return salesTax;
	}

	public void setInitialValues(String string) {
  		setName(string);

		String[] splitLine = string.split("\\s+");
	    setQuantity(Integer.parseInt(splitLine[0]));
	    updatePrice(Double.parseDouble(splitLine[splitLine.length-1]));
  	}

	public void calculateSalesTax() {
  		checkForExemptions();
		checkForImports();
		updatePrice(getSalesTax());
		System.out.println(getQuantity() + getName() + ": " + round(getPrice()));
  	}

	private void checkForExemptions() {

    	if (name.contains("book")) {}
		else if (name.contains("chocolate")) {}
		else if (name.contains("pills")) {}
		else {
			updateSalesTax(Math.ceil((price * 0.10) * 20) / 20);
		}

    }

    private void checkForImports() {

    	if (name.contains("imported")) {
		    updateSalesTax(Math.ceil((price * 0.05) * 20) / 20);
		}

    }

	private String round(double doubleValue) {
		return String.format("%.02f", doubleValue);
	}

}