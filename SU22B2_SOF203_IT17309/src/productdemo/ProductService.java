/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productdemo;

import java.util.ArrayList;

/**
 *
 * @author homna
 */
public class ProductService {

    ProductRepository prR;

    public ProductService() {
        prR = new ProductRepository();
    }

    public ArrayList<Product> getList() {
        return prR.all();
    }

    public void them(Product p) {
        prR.them(p);
    }

    public void sua(int id, Product prd) {
        prR.sua(id, prd);
    }

    public void xoa(int id) {
        prR.xoa(id);
    }

}
