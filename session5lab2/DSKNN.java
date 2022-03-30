package session5lab2;

import java.util.ArrayList;

public class DSKNN {
    ArrayList<Double> dsknn = new ArrayList<>();
    double tienTB;

    public double getTienTB() {
        return tienTB;
    }
    public void setTienTB(double tienTB) {
        this.tienTB = tienTB;
    }

    public void slKH(double giaTien){
        dsknn.add(giaTien);
    }

    public double giaTienTB(){
      double  tong = 0;
        if (dsknn.size()==0){
            tong = 0;
        }
        else {
            for (double dem:dsknn) {
                tong = tong + dem;
            }
        }
        return tienTB = tong/dsknn.size();
    }
}
