package handlers;

import common.CategoryType;

public class President extends Approver {
    public President() {
        setPurchaseLimitsPerRole(CategoryType.CONSUMABLES, 1000);
        setPurchaseLimitsPerRole(CategoryType.CLERICAL, 2000);
        setPurchaseLimitsPerRole(CategoryType.GADGETS, 3000);
        setPurchaseLimitsPerRole(CategoryType.GAMING, 5000);
        setPurchaseLimitsPerRole(CategoryType.PC, 8000);
    }

    @Override
    public void approve(int id, double cost, CategoryType type) {
        if (CANAPPROVE(cost, type)) {
            System.out.println("President approved purchase with id " + id + " that costs " + cost);
            return;
        }
        System.out.println("Purchase with id " + id + " needs approval from higher position than President.");
    }
}
