
package service;

import java.util.ArrayList;
import model.Hoc_ky;
import repository.HocKyRepository;


public class Hoc_KyService {
    private HocKyRepository hocKyRepository;
    
    public Hoc_KyService() {
        hocKyRepository = new HocKyRepository();
    }
    
    public ArrayList<Hoc_ky> getList() throws Exception {
        return hocKyRepository.getAll();
    }
}
