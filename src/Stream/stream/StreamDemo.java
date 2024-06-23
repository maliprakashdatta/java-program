package Stream.stream;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        StreamDemo streamDemo = new StreamDemo();
        List<product> products = streamDemo.generateListData();

        //-----------------------------------------------------------
        // without streams
        List<Float> productPriceList = new ArrayList<Float>();
        for (Stream.stream.product product : products) {
            // filtering data of list
            if (product.price() > 30000) {
                productPriceList.add(product.price());    // adding price to a productPriceList
            }
        }
        System.out.println("Without streams: " + productPriceList);   // displaying data
        //-----------------------------------------------------------

        // using streams
        List<Float> productPriceList2 = products.stream()
                .parallel() // parallel processing
                .filter(product -> product.price() > 30000)// filtering data
                .map(product -> product.price())// fetching price
                .toList(); // collecting as list
        //.collect(Collectors.toList()); // collecting as list

        System.out.println("With streams: " + productPriceList2);

        //-----------------------------------------------------------
        Map<Integer, product> productMap = streamDemo.generateMapData();

        System.out.println("---------------------------------");
        System.out.println("Entry processing without stream:");
        // iterating over map using iterator
        Iterator<Entry<Integer, product>> iterator = productMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, product> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("---------------------------------");
        System.out.println("Entry processing with stream:");
        // parallel stream
        productMap.entrySet().parallelStream().forEach(entry -> {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        });

        System.out.println("Map processed with streams: " + productMap);
        System.out.println("---------------------------------");

        // set demonstration
        Set<product> newFilteredProductSet = productMap.entrySet().stream()
                .filter(entry -> entry.getKey() < 5)
                .map(Map.Entry::getValue)
                .limit(3) // limit demonstration
                .collect(Collectors.toSet());
        System.out.println("Set with streams: " + newFilteredProductSet);
    }

    // externalised data generation
    private List<product> generateListData() {
        List<product> products = new ArrayList<>();
        //Adding Products
        products.add(new product(1, "HP Laptop", 25000f));
        products.add(new product(2, "Dell Laptop", 30000f));
        products.add(new product(3, "Lenevo Laptop", 28000f));
        products.add(new product(4, "Sony Laptop", 28000f));
        products.add(new product(5, "Apple Laptop", 90000f));
        return products;
    }

    // externalised data generation
    private Map<Integer, product> generateMapData() {
        // collect() & Collectors.toMap() demonstration
        // Function.identity() usage
        return generateListData().stream()
                .collect(Collectors.toMap(product::id, Function.identity()));
    }
}
