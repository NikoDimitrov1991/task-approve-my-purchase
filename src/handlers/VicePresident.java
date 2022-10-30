package handlers;

import common.CategoryType;


public class VicePresident extends Approver {
    public VicePresident() {
        setPurchaseLimitsPerRole(CategoryType.CONSUMABLES, 700);
        setPurchaseLimitsPerRole(CategoryType.CLERICAL, 1500);
        setPurchaseLimitsPerRole(CategoryType.GADGETS, 2000);
        setPurchaseLimitsPerRole(CategoryType.GAMING, 4500);
        setPurchaseLimitsPerRole(CategoryType.PC, 6500);
    }

    @Override
    public void approve(int id, double cost, CategoryType type) {
        if (CANAPPROVE(cost, type)) {
            System.out.println("Vice President approved purchase with id " + id + " that costs " + cost);
            return;
        }
        System.out.println("Purchase with id " + id + " needs approval from higher position than Vice President.");
    }
}
