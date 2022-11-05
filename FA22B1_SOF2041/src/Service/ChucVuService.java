package Service;

import DomainModel.ChucVu;
import Repository.ChucVuRepository;
import ViewModel.QLChucVu;
import java.util.ArrayList;
import java.util.List;

public class ChucVuService {
    private ChucVuRepository cvRepo;
    
    public ChucVuService()
    {
        this.cvRepo = new ChucVuRepository();
    }
    
    public List<QLChucVu> findAll()
    {
        List<QLChucVu> ds = new ArrayList<>();
        List<ChucVu> list = this.cvRepo.findAll();
        
        for (ChucVu cv: list) {
            QLChucVu vModel = new QLChucVu(
                cv.getId(), cv.getMa(), cv.getTen());
            ds.add(vModel);
        }
        
        return ds;
    }
    
    public void insert(QLChucVu vModel)
    {
        ChucVu cvDomainModel = new ChucVu("", vModel.getMa(), vModel.getTen());
         this.cvRepo.insert(cvDomainModel);
    }
}
