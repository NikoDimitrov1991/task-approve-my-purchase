package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver {
    public VicePresident() {
        setPurchaseLimitsPerRole(Type.CONSUMABLES, 700);
        setPurchaseLimitsPerRole(Type.CLERICAL, 1500);
        setPurchaseLimitsPerRole(Type.GADGETS, 2000);
        setPurchaseLimitsPerRole(Type.GAMING, 4500);
        setPurchaseLimitsPerRole(Type.PC, 6500);
    }

    @Override
    public void approve(int id, double cost, Type type) {
        if (CANAPPROVE(cost, type)) {
            System.out.println("Vice President approved purchase with id " + id + " that costs " + cost);
            return;
        }
        System.out.println("Purchase with id " + id + " needs approval from higher position than Vice President.");
    }
}
