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

    ArrayList<Product> listPd;

    public ProductService() {
        listPd = new ArrayList<>();
    }

    public ArrayList<Product> getList() {
        return listPd;
    }

    public void them(Product p) {
        listPd.add(p);
    }

    public void sua(int id, Product prd) {
        for (int i = 0; i < listPd.size(); i++) {
            Product p = listPd.get(i);
            if (p.getId() == id) {
                listPd.set(i, prd);
            }
        }
    }

    public void xoa(int id) {
        for (int i = 0; i < listPd.size(); i++) {
            Product p = listPd.get(i);
            if (p.getId() == id) {
                listPd.remove(i);
            }
        }
    }

}
