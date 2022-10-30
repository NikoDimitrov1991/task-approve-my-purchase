package handlers;

import common.CategoryType;


public class Manager extends Approver {
    public Manager() {
        setPurchaseLimitsPerRole(CategoryType.CONSUMABLES, 300);
        setPurchaseLimitsPerRole(CategoryType.CLERICAL, 500);
        setPurchaseLimitsPerRole(CategoryType.GADGETS, 1000);
        setPurchaseLimitsPerRole(CategoryType.GAMING, 3000);
        setPurchaseLimitsPerRole(CategoryType.PC, 5000);
    }

    @Override
    public void approve(int id, double cost, CategoryType type) {
        if (CANAPPROVE(cost, type)) {
            System.out.println("Manager approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Manager.");
    }
}