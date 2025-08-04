package EvozonJavaBasics.DistributionWarehouse;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class WareHouseGenerator {
    private String filePath;
    private List<String> categories;
    private List<Product> products;

    public WareHouseGenerator(String filePath) {
        this.filePath = filePath;
        this.categories = Arrays.asList("Fruits", "Vegetables", "Other");
        Product apples = new Product("Fruits", "Apples", "Kg", 1, 6);
        Product potatoes = new Product("Vegetables", "Potatoes", "Bag", 10, 15);
        Product onions = new Product("Vegetables", "Onions", "Bag", 4, (float) 2.5);
        Product peaches = new Product("Fruits", "Peaches", "Box", 6, 30);
        Product oranges = new Product("Fruits", "Oranges", "Bag", (float) 2.5, 13);
        Product crackers = new Product("Other", "Crackers", "Pack", 0, 2);
        this.products = Arrays.asList(apples, potatoes, onions, peaches, oranges, crackers);
    }

    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void generatePackages() {
        // Product apples = new Product("Fruits", "Apples", "Kg", 1, 6);
        // Product potatoes = new Product("Vegetables", "Potatoes", "Bag", 10, 15);
        // Product onions = new Product("Vegetables", "Onions", "Bag", 4, (float) 2.5);
        // Product peaches = new Product("Fruits", "Peaches", "Box", 6, 30);
        // Product oranges = new Product("Fruits", "Oranges", "Bag", (float) 2.5, 13);
        // Product crackers = new Product("Other", "Crackers", "Pack", 0, 2);
        // this.products = Arrays.asList(apples, potatoes, onions, peaches, oranges, crackers);

        Random random = new Random();

        // Interval for expiration dates
        LocalDate startDate = LocalDate.of(2025, 6, 1);
        long startEpoch = startDate.toEpochDay();
        LocalDate endDate = LocalDate.of(2025, 12, 1);
        long endEopch = endDate.toEpochDay();

        try {
            CSVWriter writer = new CSVWriter(new FileWriter(filePath), CSVWriter.DEFAULT_SEPARATOR, CSVWriter.DEFAULT_QUOTE_CHARACTER, 
                                    CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
                 
            String[] header = {"Category", "Product", "Unit", "Kg Per Unit", "Price Per Unit", "No. of Units", "Entry Date", "Expiration Date"};
            writer.writeNext(header);

            for (int i = 1; i <= 200; i++) {
                int index = random.nextInt(6 - 0) + 0;
                Product currentProduct = this.products.get(index);
                int noOfUnits = 0;
                if (currentProduct.getUnit().equals("Kg"))
                    noOfUnits = random.nextInt(251 - 50) + 50;
                else if (currentProduct.getUnit().equals("Bag"))
                    noOfUnits = random.nextInt(26 - 15) + 15;
                else if (currentProduct.getUnit().equals("Box"))
                    noOfUnits = random.nextInt(61 - 30) + 30;
                else if (currentProduct.getUnit().equals("Pack"))
                    noOfUnits = random.nextInt(501 - 100) + 100;
                
                long randomEpoch = ThreadLocalRandom.current().nextLong(startEpoch, endEopch);
                LocalDate randomExpirationDate = LocalDate.ofEpochDay(randomEpoch);

                // randomizing a no. of weeks with which the entry date precedes the expiration date
                int noOfWeeks = random.nextInt(11 - 1) + 1;
                LocalDate randomEntryDate = randomExpirationDate.minusWeeks(noOfWeeks);

                String[] packageInfo = {currentProduct.getCategory(), currentProduct.getName(), currentProduct.getUnit(), 
                    String.valueOf(currentProduct.getKgPerUnit()), String.valueOf(currentProduct.getPricePerUnit()), 
                    String.valueOf(noOfUnits), randomEntryDate.toString(), randomExpirationDate.toString()};
                writer.writeNext(packageInfo);
            }
            writer.close();
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }  
    
    public void displaySummary(LocalDate currentDate) {
        // double fruitsTotalKg = 0;
        // double fruitsTotalPrice = 0;
        // double vegetablesTotalKg = 0;
        // double vegetablesTotalPrice = 0;
        // int otherTotalPacks = 0;
        // double otherTotalPrice = 0;

        // Mapping each category to their summary details
        Map <String, CategoryDisplay> categoriesMap = new HashMap<>();
        for (String category : this.categories) {
            categoriesMap.put(category, new CategoryDisplay());
        }

        // Mapping each product (eg. Apples) to their summary details
        Map <String, ProductDisplay> productsMap = new HashMap<>();
        for (Product prod : this.products) {
            String key = prod.getCategory() + " " + prod.getName(); // key format: Fruits Apples
            ProductDisplay newProdDisplay = new ProductDisplay();
            newProdDisplay.setPricePerUnit(prod.getPricePerUnit());
            productsMap.put(key, newProdDisplay);
        }

        try {
            CSVReader reader = new CSVReader(new FileReader(filePath));
            String[] nextRecord;
            reader.readNext(); // to pass over the header

            while ((nextRecord = reader.readNext()) != null) {
                LocalDate expirationDate = LocalDate.parse(nextRecord[7]);
                if (expirationDate.isAfter(currentDate)) { // we only take into consideration products that didn't expire
                    Product currentProduct = new Product(nextRecord[0], nextRecord[1], nextRecord[2], Float.parseFloat(nextRecord[3]), 
                        Float.parseFloat(nextRecord[4]));
                    Package currentPackage = new Package(currentProduct, Integer.parseInt(nextRecord[5]), 
                        LocalDate.parse(nextRecord[6]), expirationDate);

                    
                    // Adding the info to their category statistics  
                    CategoryDisplay currentCategory = categoriesMap.get(currentProduct.getCategory());
                    // The products from the "Other" section aren't measured in Kg, so we will just compute the sum of the number of packs from each package
                    // (for example a package of Crackers contains 20 packs)
                    if (currentProduct.getCategory().equals("Other")) 
                         currentCategory.setTotalBaseUnits(currentCategory.getTotalBaseUnits() + currentPackage.getNumberOfUnits()); 
                    else 
                        currentCategory.setTotalBaseUnits(currentCategory.getTotalBaseUnits() + currentPackage.unitsInKg()); 
                    
                    currentCategory.setTotalPrice(currentCategory.getTotalPrice() + currentPackage.totalPrice(currentDate));   


                    // Adding the info to the product statistics
                    ProductDisplay productInfo = productsMap.get(currentProduct.getCategory() + " " + currentProduct.getName());
                    productInfo.setNoOfPackages(productInfo.getNoOfPackages() + 1);
                    if (currentProduct.getCategory().equals("Other")) 
                        productInfo.setNoOfBaseUnits(productInfo.getNoOfBaseUnits() + currentPackage.getNumberOfUnits());
                    else
                        productInfo.setNoOfBaseUnits(productInfo.getNoOfBaseUnits() + currentPackage.unitsInKg());

                    productInfo.setTotalPrice(productInfo.getTotalPrice() + currentPackage.totalPrice(currentDate));
                    productInfo.setAverageDiscount(productInfo.getAverageDiscount() + currentPackage.computeDiscountPercentage(currentDate)); // momentarily we just add the discounts
                }
            }
            reader.close();
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Warehouse Summary:");
        for (String category : this.categories) {
            // Displaying the statistics for the category
            CategoryDisplay currentCategory = categoriesMap.get(category);
            String categorySummary = category + ": Total: " + currentCategory.getTotalBaseUnits();
            if (category.equals("Fruits") || category.equals("Vegetables"))
                categorySummary += " kg";
            else if (category.equals("Other"))
                categorySummary += " packs";
            
            categorySummary += ", Total Price: " + currentCategory.getTotalPrice();
            System.out.println(categorySummary);

            // Displaying the statistics for each of the products from the current category
            Map<String, ProductDisplay> categoryProducts = productsMap.entrySet().stream()
                .filter(p -> p.getKey().contains(category)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            
            for (Map.Entry<String, ProductDisplay> currentProduct : categoryProducts.entrySet()) {
                String productSummary = "";
                ProductDisplay currentProductInfo = currentProduct.getValue();
                String productName = currentProduct.getKey().split(" ")[1]; // Fruits Apples
                productSummary += productName + ": " + currentProductInfo.getNoOfPackages() + " packages (" + 
                    currentProductInfo.getNoOfBaseUnits();
                if (category.equals("Fruits") || category.equals("Vegetables"))
                    productSummary += " kg";
                else if (category.equals("Other"))
                    productSummary += " packs";
                
                productSummary += "), Unit Price: " + currentProductInfo.getPricePerUnit() + 
                    ", Total Price: " + String.format("%.2f", currentProductInfo.getTotalPrice()) + ", Discount: " + String.format("%.2f", currentProductInfo.getAverageDiscount() / currentProductInfo.getNoOfPackages()) + "%";
                
                System.out.println(productSummary);
            }
        }
    }
}
