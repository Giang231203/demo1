
package Services;

import Model.NhanVien;
import Repositories.NhanVienRepository;
import java.util.ArrayList;

public class NhanVienService {
    
    private NhanVienRepository nhanVienRepository;

    
    public NhanVienService() {
        this.nhanVienRepository = new NhanVienRepository();
    }
    
    public ArrayList<NhanVien> getlist(){
        return nhanVienRepository.getAll();
    }
    
    public void insert(NhanVien nv){
        this.nhanVienRepository.insert(nv);
    }
    
    public void update(String ma,NhanVien nv){
        this.nhanVienRepository.update(ma, nv);
    }
    
    public void delete(String ma){
        this.nhanVienRepository.delete(ma);
    }
    
    public ArrayList<NhanVien> search(String ma){
        
        return this.nhanVienRepository.getSearch(ma);
    }
    
     public double tinhLuong(int sogio, double luong) {
         
         return sogio*luong;
     }
}
