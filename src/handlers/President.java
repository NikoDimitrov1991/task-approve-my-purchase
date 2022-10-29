package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {

        next.approve(id, cost, type);
    }
}
