import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product("Sting",3,8000);
        Product product1 = new Product("Number one",3,8000);
        Product product2 = new Product("Ô long",3,8000);
        Product product3 = new Product("Bò húc",3,8000);
        productManager.add(product);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.display();
        productManager.delate("Sting");
        productManager.display();
        productManager.Sort();
        productManager.display();
        productManager.fix(1,new Product("Trà chanh",6,7000));
        productManager.display();
        System.out.println("Linked List:");
        ProductManagerLinkedList productManagerLinkedList = new ProductManagerLinkedList();
        productManagerLinkedList.add(product);
        productManagerLinkedList.add(product1);
        productManagerLinkedList.add(product2);
        productManagerLinkedList.add(product3);
        productManagerLinkedList.display();

    }
}