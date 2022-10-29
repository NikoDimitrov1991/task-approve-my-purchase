package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {

        next.approve(id, cost, type);
    }
}
