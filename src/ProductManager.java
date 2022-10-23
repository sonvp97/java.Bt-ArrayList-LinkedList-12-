import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    List<Product> lists = new ArrayList<>();
    public void add(Product product){
        if (product != null){
            lists.add(product);
        }
    }
    public void fix(int index,Product product){
        lists.add(index,product);
    }
    public void delate(String name){
        lists.remove(search(name));
    }
    public Product search(String name){
       for (Product product : lists){
           if (product.getName() == name){
               return product;
           }
       }
       return null;
    }
    public void display(){
        for (Product product : lists){
            System.out.println(product);
        }
    }
    public void Sort(){
        Collections.sort(lists);
    }

}
