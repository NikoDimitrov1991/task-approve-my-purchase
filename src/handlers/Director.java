package handlers;

import common.Type;

public class Director extends Approver {

    public Director() {
        setPurchaseLimitsPerRole(Type.CONSUMABLES, 500);
        setPurchaseLimitsPerRole(Type.CLERICAL, 1000);
        setPurchaseLimitsPerRole(Type.GADGETS, 1500);
        setPurchaseLimitsPerRole(Type.GAMING, 3500);
        setPurchaseLimitsPerRole(Type.PC, 6000);
    }

    @Override
    public void approve(int id, double cost, Type type) {
        if (CANAPPROVE(cost, type)) {
            System.out.println("Director approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
    }
}
