package composite.product;

import org.junit.jupiter.api.Test;

class ProductTests {

    @Test
    void product_tests() {
        ProductComponent manCategory = new Category(1, "Man", 0);
        ProductComponent clothesM = new Category(11, "Clothes", 0);
        ProductComponent shoesM = new Category(12, "Shoes", 0);

        manCategory.addProduct(clothesM);
        manCategory.addProduct(shoesM);

        ProductComponent womanCategory = new Category(2, "woman", 0);
        ProductComponent clothesW = new Category(21, "Clothes", 0);
        ProductComponent shoesW = new Category(22, "Shoes", 0);

        womanCategory.addProduct(clothesW);
        womanCategory.addProduct(shoesW);

        ProductComponent nikeShoes = new Product(200, "Nike", 1000);
        ProductComponent adidasShoes = new Product(210, "Adidas", 1000);
        ProductComponent gucciCloth = new Product(100, "Gucci", 1000);
        ProductComponent balenciagaCloth = new Product(110, "Balenciaga", 1000);

        shoesM.addProduct(nikeShoes);
        shoesM.addProduct(adidasShoes);

        clothesW.addProduct(gucciCloth);
        clothesW.addProduct(balenciagaCloth);

        manCategory.display();
        System.out.println("-------------");
        womanCategory.display();
    }

}
