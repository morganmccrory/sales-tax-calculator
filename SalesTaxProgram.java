import java.io.*;


class SalesTaxProgram {

	private static ShoppingBasket basket = new ShoppingBasket();
	private static String line;

  private static void parseTextFile() {
	try {

		File file = new File("baskets/BasketOne.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);

	  while ((line = reader.readLine()) != null) {

	    Item item = new Item();

	    item.setInitialValues(line.toString());
	    item.calculateSalesTax();

		  basket.updateTotalSalesTax(item.getSalesTax());
		  basket.updateTotalPrice(item.getPrice());

	  }

	  reader.close();

	  }  catch (IOException e) {

	   System.out.println("There was an error reading your .txt file.");
	    e.printStackTrace();

    }
  }

  private static String round(double doubleValue) {
  	return String.format("%.02f", doubleValue);
  }

  public static void main(String[] args) {

  	parseTextFile();

  	System.out.println("Sales Taxes: " + round(basket.getTotalSalesTax()));
  	System.out.println("Total: " + round(basket.getTotalPrice()));

  }
}