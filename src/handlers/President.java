package handlers;

import common.Type;

public class President extends Approver {
    public President() {
        setPurchaseLimitsPerRole(Type.CONSUMABLES, 1000);
        setPurchaseLimitsPerRole(Type.CLERICAL, 2000);
        setPurchaseLimitsPerRole(Type.GADGETS, 3000);
        setPurchaseLimitsPerRole(Type.GAMING, 5000);
        setPurchaseLimitsPerRole(Type.PC, 8000);
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
