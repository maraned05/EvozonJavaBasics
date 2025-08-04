package EvozonJavaBasics.DistributionWarehouse;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        WareHouseGenerator generator = new WareHouseGenerator("EvozonJavaBasics/DistributionWarehouse/warehouse.csv");
        //generator.generatePackages(); 
        generator.displaySummary(LocalDate.now());
    }
}
