package handlers;

import common.CategoryType;

/**
 * Used as a fallback in approval chain.
 * Should not contain any additional logic.
 * If abstract methods are changed, be free to edit signatures.
 */
public class ExecutiveMeeting extends Approver {
    private static final ExecutiveMeeting INSTANCE = new ExecutiveMeeting();

    public static ExecutiveMeeting getInstance() {
        return INSTANCE;
    }

    @Override
    public void approve(int id, double cost, CategoryType type) {

        System.out.println("Purchase with id " + id + " that costs " + cost + " requires an approval of executive meeting.");
    }
}