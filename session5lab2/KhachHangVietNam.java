package session5lab2;

public class KhachHangVietNam extends KhachHang{

    double giaTien;
    String doituong;
    String[] danhsachdoituong = {"Sinh hoạt","Kinh doanh", "Sản xuất"};

    public String getDoituong() {
        return doituong;
    }
    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }
    public double getGiaTien() {
        return giaTien;
    }
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public double tinhTien(){

        if (soluong<dinhmuc[0]){
            giaTien = soluong*dinhmucgia[0];
        }
        else if (soluong<dinhmuc[1]){
            giaTien = (dinhmuc[0]-1)*dinhmucgia[0] + (soluong-dinhmuc[0])*dinhmucgia[1];
        }
        else if (soluong<dinhmuc[2]){
            giaTien = ((dinhmuc[0]-1)*dinhmucgia[0] + (dinhmuc[1] - dinhmuc[0]-1 )*dinhmucgia[1] + (soluong-dinhmuc[1])*dinhmucgia[2]);
        }
        else{
            giaTien = ((dinhmuc[0]-1)*dinhmucgia[0] + (dinhmuc[1] - dinhmuc[0]-1 )*dinhmucgia[1] + (dinhmuc[2]-dinhmuc[1]-1)*dinhmucgia[2]) + (soluong-dinhmuc[2])*dinhmucgia[3];
        }
        return giaTien;
    }

    public void hienThi(){
        super.hienThi();
        System.out.println("Đối tượng khách hàng "+doituong);
        System.out.println("Giá tiền là "+giaTien);
    }
}
