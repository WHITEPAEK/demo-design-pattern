package builder.pizza;

public class Calzone extends Pizza {

    private final boolean sauceInside;

    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public static class Builder extends Pizza.Builder {
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        public Calzone build() {
            return new Calzone(this);
        }

        protected Builder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return toppings.toString() + " sauceInside: " + sauceInside;
    }
}
