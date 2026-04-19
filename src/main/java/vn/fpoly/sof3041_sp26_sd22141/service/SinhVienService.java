package vn.fpoly.sof3041_sp26_sd22141.service;

import vn.fpoly.sof3041_sp26_sd22141.emtity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> svEntity = new ArrayList<>();
    public void addSinhVien(SinhVien sv){
        if (sv==null){
            throw new IllegalArgumentException("sinh vien can be not null");
        }
        svEntity.add(sv);
    }

    public void updateSinhVien(SinhVien sv){
        if(sv == null){
            throw new IllegalArgumentException("sinh vien can be not null");
        }
        for (int i = 0; i<svEntity.size();++i){
            if (svEntity.get(i).getMaSV() == sv.getMaSV()){
                svEntity.set(i,sv);
                return;
            }
            else {
                throw new IllegalArgumentException("sinh vien with id" +sv.getMaSV() +"does not exist");
            }
        }
    }
}
