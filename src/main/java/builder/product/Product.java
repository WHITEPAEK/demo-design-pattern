package builder.product;

public class Product {

    private final String property1;
    private final String property2;

    private Product(Builder builder) {
        this.property1 = builder.property1;
        this.property2 = builder.property2;
    }

    public static class Builder {
        private final String property1;
        private String property2;

        public Builder(String property1) {
            this.property1 = property1;
        }

        public Builder property2(String property2) {
            this.property2 = property2;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
