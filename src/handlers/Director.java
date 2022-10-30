package handlers;

import common.Type;


/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {

    public Director() {
        purchaseLimitsPerRole.put(Type.CONSUMABLES, 500);
        purchaseLimitsPerRole.put(Type.CLERICAL, 1000);
        purchaseLimitsPerRole.put(Type.GADGETS, 1500);
        purchaseLimitsPerRole.put(Type.GAMING, 3500);
        purchaseLimitsPerRole.put(Type.PC, 6000);
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
