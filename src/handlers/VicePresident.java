package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver {
    public VicePresident() {
        purchaseLimitsPerRole.put(Type.CONSUMABLES, 700);
        purchaseLimitsPerRole.put(Type.CLERICAL, 1500);
        purchaseLimitsPerRole.put(Type.GADGETS, 2000);
        purchaseLimitsPerRole.put(Type.GAMING, 4500);
        purchaseLimitsPerRole.put(Type.PC, 6500);
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
