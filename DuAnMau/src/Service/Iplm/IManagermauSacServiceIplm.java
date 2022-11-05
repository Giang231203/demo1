/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Iplm;

import DomainModel.MauSac;
import Service.IManagerMauSacService;
import java.util.List;
import Respository.Iplm.mauSacRespository;
import ViewModel.QuanLyMauSac;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class IManagermauSacServiceIplm implements IManagerMauSacService {

    mauSacRespository msr = new mauSacRespository();
    List<QuanLyMauSac> listQLMauSac = new ArrayList<>();

    @Override
    public List<QuanLyMauSac> getAll() {
        var MauSac = msr.getAll();
        for (MauSac ms : MauSac) {
            listQLMauSac.add(new QuanLyMauSac(ms.getId(), ms.getMaMauSac(), ms.getTenMauSac()));
        }
        return listQLMauSac;
    }

    @Override
    public QuanLyMauSac add(QuanLyMauSac ms) {
        ms.setId(null);
        var x = msr.add(new MauSac(ms.getMaMauSac(), ms.getTenMauSac()));
        return new QuanLyMauSac(x.getMaMauSac(), x.getTenMauSac());
    }

    @Override
    public String delete(String ma) {
        boolean delete = msr.delete(ma);
        if (delete == true) {
            return "xóa thành công";
        } else {
            return "Xóa thất bại ";
        }
    }

    @Override
    public QuanLyMauSac update(QuanLyMauSac qlMauSac, String ma) {
        var x = msr.update(new MauSac(qlMauSac.getMaMauSac(), qlMauSac.getTenMauSac()), ma);
        return new QuanLyMauSac(x.getMaMauSac(), x.getTenMauSac());
    }

    /**
     *
     * @return
     */
}
