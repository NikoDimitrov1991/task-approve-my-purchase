package handlers;

import common.CategoryType;

import java.util.Hashtable;

public abstract class Approver {

    protected Approver next;
    private Hashtable<CategoryType, Integer> purchaseLimitsPerRole = new Hashtable<>();

    public void setPurchaseLimitsPerRole(CategoryType consumableRole, Integer priceLimit) {
        this.purchaseLimitsPerRole.put(consumableRole, priceLimit);
    }

    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract void approve(int id, double cost, CategoryType type);

    protected final boolean CANAPPROVE(double cost, CategoryType categoryType) {
        boolean result = false;

        switch (categoryType) {
            case CONSUMABLES:
                if (cost <= this.purchaseLimitsPerRole.get(CategoryType.CONSUMABLES)) {
                    result = true;
                }
                break;
            case CLERICAL:
                if (cost <= this.purchaseLimitsPerRole.get(CategoryType.CLERICAL)) {
                    result = true;
                }
                break;
            case GADGETS:
                if (cost <= this.purchaseLimitsPerRole.get(CategoryType.GADGETS)) {
                    result = true;
                }
                break;
            case GAMING:
                if (cost <= this.purchaseLimitsPerRole.get(CategoryType.GAMING)) {
                    result = true;
                }
                break;
            case PC:
                if (cost <= this.purchaseLimitsPerRole.get(CategoryType.PC)) {
                    result = true;
                }
                break;
            default:
                result = false;
        }
        return result;
    }

    /**
     * Method used for registering next approver level.
     * DO NOT CHANGE IT.
     */
    public Approver registerNext(Approver next) {
        this.next = next;
        return next;
    }
}
