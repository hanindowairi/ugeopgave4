public class Product {
    String name;
    double price;
    String[] tags;

    Product(String name, double price, String[] tags){
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public void printInfo(){
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
        System.out.println("Tags: ");
        for (int i = 0; i < tags.length; i++){
            System.out.println(tags[1]);
            if(i < tags.length - 1){
                System.out.println("Error");
            }
        }
    }

    boolean hasTags (String tag) {
        for(String currentTag : tags){
            if (currentTag.equals(tag)){
                return true;
            }
        }
        return false;
    }



}
