package handlers;

import common.CategoryType;

public class Director extends Approver {

    public Director() {
        setPurchaseLimitsPerRole(CategoryType.CONSUMABLES, 500);
        setPurchaseLimitsPerRole(CategoryType.CLERICAL, 1000);
        setPurchaseLimitsPerRole(CategoryType.GADGETS, 1500);
        setPurchaseLimitsPerRole(CategoryType.GAMING, 3500);
        setPurchaseLimitsPerRole(CategoryType.PC, 6000);
    }

    @Override
    public void approve(int id, double cost, CategoryType type) {
        if (CANAPPROVE(cost, type)) {
            System.out.println("Director approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
    }
}
