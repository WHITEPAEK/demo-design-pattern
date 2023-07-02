package facade;

// Facade
public class OrderProcessingFacade {

    private InventorySystem inventorySystem;
    private PaymentSystem paymentSystem;
    private ShippingSystem shippingSystem;

    public OrderProcessingFacade() {
        inventorySystem = new InventorySystem();
        paymentSystem = new PaymentSystem();
        shippingSystem = new ShippingSystem();
    }

    public void processOrder(String productId, double amount, String shippingAddress) {
        boolean isAvailable = inventorySystem.isProductAvailable(productId);
        if (isAvailable) {
            paymentSystem.processPayment(productId, amount);
            shippingSystem.shipProduct(productId, shippingAddress);
            System.out.println("주문 처리가 완료되었습니다.");
        } else {
            System.out.println("상품 재고가 없습니다.");
        }
    }

}
