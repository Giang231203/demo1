package lesson5;

import java.util.ArrayList;

public class ProductService {
    
    ProductRepository pr;
  
    public ProductService() {
       this.pr  = new ProductRepository();
    }
        
    public void insert(Product p) {
        this.pr.insert(p);
    }
    
    public void update(int id, Product p) {
        pr.update(id, p);
    } 
    
    public void delete(int id) {
        pr.delete(id);
    }
    
    public ArrayList<Product> getList() {      
        return pr.all();
    }
   
}
