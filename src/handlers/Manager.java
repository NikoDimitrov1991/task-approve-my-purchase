package handlers;

import common.Type;


public class Manager extends Approver {
    public Manager() {
        setPurchaseLimitsPerRole(Type.CONSUMABLES, 300);
        setPurchaseLimitsPerRole(Type.CLERICAL, 500);
        setPurchaseLimitsPerRole(Type.GADGETS, 1000);
        setPurchaseLimitsPerRole(Type.GAMING, 3000);
        setPurchaseLimitsPerRole(Type.PC, 5000);
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