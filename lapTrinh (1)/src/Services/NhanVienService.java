
package Services;

import Model.NhanVien;
import java.util.ArrayList;

public class NhanVienService {
    
    private ArrayList<NhanVien> listNv;
    
    public NhanVienService() {
        this.listNv = new ArrayList<>();
    }
    
    public ArrayList<NhanVien> getlist(){
        return listNv;
    }
    
    public void insert(NhanVien nv){
        this.listNv.add(nv);
    }
    
    public void update(String ma,NhanVien nv){
        for (int i = 0; i < this.listNv.size(); i++) {
            if (this.listNv.get(i).getMaNv().contains(ma)) {
                this.listNv.set(i, nv);
            }
        }
    }
    
    public void delete(String ma){
        for (int i = 0; i < this.listNv.size(); i++) {
            if (this.listNv.get(i).getMaNv().contains(ma)) {
                this.listNv.remove(i);
            }
        }
    }
    
    public ArrayList<NhanVien> search(ArrayList<NhanVien> listIN,String ma){
        ArrayList<NhanVien> listNvS = new ArrayList<>();
        for (NhanVien nhanVien : listIN) {
            if (nhanVien.getMaNv().equals(ma)) {
                listNvS.add(nhanVien);
            }
        }
        return listNvS;
    }
    
     public double tinhLuong(int sogio, double luong) {
         
         return sogio*luong;
     }
}
