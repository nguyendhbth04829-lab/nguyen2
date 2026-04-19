package vn.fpoly.sof3041_sp26_sd22141.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vn.fpoly.sof3041_sp26_sd22141.emtity.SinhVien;

public class SinhVienServiceTest {
    private SinhVien sinhvienService;
    @BeforeEach
    void setUp(){
        sinhvienService=new SinhVien();
    }

    //addSinhVien
    @Test
    @DisplayName("Them sinh vien thanh cong")
    void addSinhVienWithValidSinhVien(){
SinhVien sv = new SinhVien(1,"Nguyen",17,9.9,2,"CNTT");
sinhvienService.add(sv);
    }

}
