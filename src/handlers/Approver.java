package handlers;
import common.Type;
import java.util.Hashtable;

public abstract class Approver {

 protected Hashtable <Type, Integer> purchaseLimitsPerRole = new Hashtable<>();


   protected Approver next;

    /**
     * If needed, be free to change signature of abstract methods.
     */
    public abstract void approve(int id, double cost, Type type);
    protected final boolean CANAPPROVE (double cost, Type categoryType) {
        boolean result = false;

        switch (categoryType) {
            case CONSUMABLES:
                if (cost <= this.purchaseLimitsPerRole.get(Type.CONSUMABLES)) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case CLERICAL:
                if (cost <= this.purchaseLimitsPerRole.get(Type.CLERICAL)) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case GADGETS:
                if (cost <= this.purchaseLimitsPerRole.get(Type.GADGETS)) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case GAMING:
                if (cost <= this.purchaseLimitsPerRole.get(Type.GAMING)) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            case PC:
                if (cost <= this.purchaseLimitsPerRole.get(Type.PC)) {
                    result = true;
                    return result;
                } else {
                    break;
                }
            default:
                result = false;
                return result;
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
