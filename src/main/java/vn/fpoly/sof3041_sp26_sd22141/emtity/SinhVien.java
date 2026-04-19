package vn.fpoly.sof3041_sp26_sd22141.emtity;

public class SinhVien {
    String maSV;
    String ten;
    int tuoi;
    float diemTrungBinh;
    int kyHoc;
    String chuyenNganh;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        if (maSV == null || maSV.isEmpty()){
            throw new IllegalArgumentException("ma sinh vien khong duoc de trong");
        }

        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten==null||ten.isEmpty()){
            throw  new IllegalArgumentException("ten khong duoc de trong");
        }
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        if(tuoi==0){
    throw new IllegalArgumentException("tuoi khong duoc de trong");
        }if (tuoi < 16 || tuoi >30){
            throw new IllegalArgumentException("tuoi khong hop le, 16 den 30");
        }
        this.tuoi = tuoi;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        if (diemTrungBinh<=0 || diemTrungBinh>10) {
            throw new IllegalArgumentException("diem trung binh khong hop le");
        }

        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVienService{" +
                "maSV='" + maSV + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diemTrungBinh=" + diemTrungBinh +
                ", kyHoc=" + kyHoc +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        if(kyHoc<=0){
            throw new IllegalArgumentException("ky hoc khong duoc de trong");
        }
        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        if (chuyenNganh==null||chuyenNganh.isEmpty()){
            throw new IllegalArgumentException("chuyen nganh khong duoc de trong");
        }
        this.chuyenNganh = chuyenNganh;
    }
}
