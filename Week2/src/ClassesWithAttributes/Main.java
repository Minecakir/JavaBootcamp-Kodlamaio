package ClassesWithAttributes;

public class Main {
    public static void main(String[] args){
            Product product = new Product();
            product.setName("Telephone");
            product.setDescription("Iphone 14");
            product.setId(1);
            product.setPrice(50.000);
            product.setStockAmount(129);

            System.out.println("Product name "+product.getName());

            ProductManager productManager = new ProductManager();
            productManager.Add(product);
    }
}
