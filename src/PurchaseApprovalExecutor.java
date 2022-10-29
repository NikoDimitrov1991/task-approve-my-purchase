import common.Type;
import handlers.Approver;
import handlers.Director;
import handlers.Manager;
import handlers.President;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line
        Approver director = new Director();
        ApprovalChainGenerator.generate(director);
        Approver president = new President();
        ApprovalChainGenerator.generate(president);

        director.approve(1,400,Type.CONSUMABLES);
        director.approve(2,500,Type.CONSUMABLES);
        director.approve(3,600,Type.CONSUMABLES);
        System.out.println(" ");
        manager.approve(4, 15000, Type.CONSUMABLES);
        manager.approve(5, 5000, Type.PC);
        manager.approve(6, 5000, Type.PC);
        manager.approve(7, 3000, Type.CLERICAL);
        System.out.println(" ");
        president.approve(8,6000,Type.GADGETS);
        president.approve(9,1000,Type.GAMING);
        president.approve(10,2000,Type.CLERICAL);
        president.approve(11,4000,Type.GAMING);
    }
}
