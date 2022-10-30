package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code
 */
public class Manager extends Approver {
    public Manager() {
        purchaseLimitsPerRole.put(Type.CONSUMABLES, 300);
        purchaseLimitsPerRole.put(Type.CLERICAL, 500);
        purchaseLimitsPerRole.put(Type.GADGETS, 1000);
        purchaseLimitsPerRole.put(Type.GAMING, 3000);
        purchaseLimitsPerRole.put(Type.PC, 5000);
    }

    @Override
    public void approve(int id, double cost, Type type) {
        if (CANAPPROVE(cost, type)) {
            System.out.println("Manager approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Manager.");
    }
}