package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver {
    public President() {
        purchaseLimitsPerRole.put(Type.CONSUMABLES, 1000);
        purchaseLimitsPerRole.put(Type.CLERICAL, 2000);
        purchaseLimitsPerRole.put(Type.GADGETS, 3000);
        purchaseLimitsPerRole.put(Type.GAMING, 5000);
        purchaseLimitsPerRole.put(Type.PC, 8000);
    }

    @Override
    public void approve(int id, double cost, Type type) {
        if (CANAPPROVE(cost, type)) {
            System.out.println("President approved purchase with id " + id + " that costs " + cost);
            return;
        }
        System.out.println("Purchase with id " + id + " needs approval from higher position than President.");
    }
}
