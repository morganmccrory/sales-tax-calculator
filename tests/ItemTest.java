import static org.junit.Assert.*;
import org.junit.Test;

public class ItemTest {

    @Test
    public void testName() {

      Item table = new Item();
      table.setName("1 antique white coffee table at 49.99");
      String name = table.getName();
      String testName = " antique white coffee table ";

      assertEquals(name, testName);
    }

    @Test
    public void testQuantity() {

      Item table = new Item();
      table.setQuantity(1);
      int quantity = table.getQuantity();
      int testQuant = 1;

      assertEquals(quantity, testQuant);
    }

    @Test
    public void testPrice() {

      Item table = new Item();
      table.updatePrice(49.99);
      double price = table.getPrice();
      double testPrice = 49.99;

      assertEquals(Double.doubleToLongBits(price), Double.doubleToLongBits(testPrice));
    }

    @Test
    public void testSetInitialValuesName() {

      Item book = new Item();
      Item newBook = new Item();

      book.setName("1 Harry Potter book at 18.00");
      newBook.setInitialValues("1 Harry Potter book at 18.00");

      assertEquals(book.getName(), newBook.getName());
    }

    @Test
    public void testSetInitialValuesQuantity() {

      Item book = new Item();
      Item newBook = new Item();

      book.setQuantity(1);
      newBook.setInitialValues("1 Harry Potter book at 18.00");

      assertEquals(book.getQuantity(), newBook.getQuantity());
    }

    @Test
    public void testSetInitialValuesPrice() {

      Item book = new Item();
      Item newBook = new Item();

      book.updatePrice(18.00);
      newBook.setInitialValues("1 Harry Potter book at 18.00");

      assertEquals(book.getPrice(), newBook.getPrice());
    }

    @Test
    public void testSalesTax() {

      Item table = new Item();
      table.setInitialValues("1 antique white coffee table at 49.99");
      table.updateSalesTax(4.99);
      double testSalesTax = 4.99;

      assertEquals(Double.doubleToLongBits(table.getSalesTax()), Double.doubleToLongBits(testSalesTax));
    }

    @Test
    public void testCalculateSalesTax() {

      Item book = new Item();
      book.setInitialValues("1 Harry Potter book at 18.00");
      book.calculateSalesTax();
      double testTax = 0;

      assertEquals(Double.doubleToLongBits(book.getSalesTax()), Double.doubleToLongBits(testTax));
    }

    @Test
    public void testCalculateSalesTaxForImports() {

      Item box = new Item();
      box.setInitialValues("1 imported box of chocolates at 20.00");
      box.calculateSalesTax();
      double testTax = 1;

      assertEquals(Double.doubleToLongBits(box.getSalesTax()), Double.doubleToLongBits(testTax));
    }
}
