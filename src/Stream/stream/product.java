package Stream.stream;

//class Product {
//    int id;
//    String name;
//    float price;
//
//    public Product(int id, String name, float price) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//}
record product(int id, String name, float price) {
    // No need for an explicit constructor or other methods
}
