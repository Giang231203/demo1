package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import modul.sinhVien;

/**
 *
 * @author KenTiz
 */
public class sinhVienService {

    private ArrayList<sinhVien> danhSach = new ArrayList<sinhVien>();
    private File file = new File("danhsach.txt");
    private String name = "[[A-Z][a-z] ]+";
    private String id = "PH[\\d]{5}";

    public sinhVienService() {
        if (file.exists()) {
            danhSach = readFile();
        } else {
            sinhVien sv1 = new sinhVien("PH22974", "Hoang Van Hieu", 9, 7.5, 6.5);
            sinhVien sv2 = new sinhVien("PH23050", "Le Thi Dieu Thuy", 7, 7.5, 6);
            danhSach.add(sv1);
            danhSach.add(sv2);
        }
    }

    public ArrayList<sinhVien> getList() {
        return danhSach;
    }

    public void createFile(File f) {
        if (!f.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void writeFile() {
        createFile(file);
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (sinhVien vien : getList()) {
                oos.writeObject(vien);
                oos.flush();
            }
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<sinhVien> readFile() {
        ArrayList<sinhVien> list = new ArrayList<>();
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);
            while (true) {
                sinhVien sv = (sinhVien) ois.readObject();
                if (sv != null) {
                    list.add(sv);
                }
            }
        } catch (Exception e) {

        }
        return list;
    }

    public boolean checkFile() {
        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkMaSv(sinhVien sv) {
        if (sv.getMaSv().matches(id)) {
            for (sinhVien vien : danhSach) {
                if (sv.getMaSv().equalsIgnoreCase(vien.getMaSv())) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean checkTen(sinhVien sv) {
        if (sv.getName().matches(name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkDiem(sinhVien sv) {
        if (sv.getDiemAnh() >= 0 && sv.getDiemToan() <= 10
                && sv.getDiemAnh() <= 10 && sv.getDiemToan() >= 0
                && sv.getDiemVan() >= 0 && sv.getDiemVan() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addSinhVien(sinhVien sv) {
        if (checkMaSv(sv) && checkTen(sv) && checkDiem(sv)) {
            danhSach.add(sv);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateSinhVien(String maSvString, sinhVien sv) {
        if (checkTen(sv) && checkDiem(sv)) {
            for (int i = 0; i < danhSach.size(); i++) {
                if (danhSach.get(i).getMaSv().equals(maSvString)) {
                    danhSach.set(i, sv);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void deleteSinhVien(String maSv) {
        for (sinhVien vien : danhSach) {
            if (vien.getMaSv().equalsIgnoreCase(maSv)) {
                danhSach.remove(vien);
                break;
            }
        }
    }

    public sinhVien searchSinhVien(String maSv) {
        for (sinhVien vien : danhSach) {
            if (vien.getMaSv().equalsIgnoreCase(maSv)) {
                return vien;
            }
        }
        return null;
    }

    public String uperName(String ten) {
        char[] name = ten.toLowerCase().toCharArray();
        name[0] = Character.toUpperCase(name[0]);
        for (int i = 1; i < name.length; i++) {
            if (name[i] == ' ') {
                name[i + 1] = Character.toUpperCase(name[i + 1]);
            }
        }
        return String.valueOf(name);
    }
}
