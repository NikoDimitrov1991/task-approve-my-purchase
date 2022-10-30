import common.CategoryType;
import handlers.*;

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
        Approver vicePresident = new VicePresident();
        ApprovalChainGenerator.generate(vicePresident);
        System.out.println(" ");
        System.out.println("Requests for Director:");
        director.approve(1, 400, CategoryType.CONSUMABLES);
        director.approve(2, 500, CategoryType.CONSUMABLES);
        director.approve(3, 600, CategoryType.CONSUMABLES);
        System.out.println(" ");
        System.out.println("Requests for Manager:");
        manager.approve(4, 15000, CategoryType.CONSUMABLES);
        manager.approve(5, 5000, CategoryType.PC);
        manager.approve(6, 5000, CategoryType.PC);
        manager.approve(7, 3000, CategoryType.CLERICAL);
        System.out.println(" ");
        System.out.println("Requests for President:");
        president.approve(8, 6000, CategoryType.GADGETS);
        president.approve(9, 1000, CategoryType.GAMING);
        president.approve(10, 2000, CategoryType.CLERICAL);
        president.approve(11, 4000, CategoryType.GAMING);
        System.out.println(" ");
        System.out.println("Requests for Vice President:");
        vicePresident.approve(12, 6500, CategoryType.PC);
        vicePresident.approve(13, 4400, CategoryType.GAMING);
        vicePresident.approve(14, 701, CategoryType.CONSUMABLES);
        vicePresident.approve(15, 3900, CategoryType.GADGETS);
    }
}
