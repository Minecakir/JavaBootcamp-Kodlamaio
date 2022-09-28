package ClassesWithAttributes;

public class Main {
    public static void main(String[] args){
            Product product = new Product();
            product.name ="Telephone";
            product.description="Iphone 14";
            product.id=1;
            product.price=50.000;
            product.stockAmount=128;

            System.out.println("Product name "+product.name);

            ProductManager productManager = new ProductManager();
            productManager.Add(product);
    }
}
