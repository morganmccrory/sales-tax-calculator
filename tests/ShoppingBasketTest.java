import static org.junit.Assert.*;
import org.junit.Test;

public class ShoppingBasketTest {

  ShoppingBasket basket = new ShoppingBasket();

    @Test
    public void testTotalPrice() {

      basket.updateTotalPrice(30.00);
      double testTotalPrice = 30.00;

      assertEquals(Double.doubleToLongBits(basket.getTotalPrice()), Double.doubleToLongBits(testTotalPrice));
    }

    @Test
    public void testTotalSalesTax() {

      basket.updateTotalSalesTax(2.00);
      double testTotalSalesTax = 2.00;

      assertEquals(Double.doubleToLongBits(basket.getTotalSalesTax()), Double.doubleToLongBits(testTotalSalesTax));
    }

}
