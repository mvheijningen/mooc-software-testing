package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void applyDiscount() {
        Product homeProduct = new Product("homeProduct", 10, "HOME");
        Product businessProduct = new Product("businessProduct", 10, "BUSINESS");
        ProductDao dao = Mockito.mock(ProductDao.class);
        List<Product> allProducts = Arrays.asList(homeProduct, businessProduct);
        Mockito.when(dao.all()).thenReturn(allProducts);
        DiscountApplier discounter = new DiscountApplier(dao);
        discounter.setNewPrices();
        Assertions.assertEquals(9, allProducts.get(0).getPrice());
        Assertions.assertEquals(11, allProducts.get(1).getPrice());
    }

}
