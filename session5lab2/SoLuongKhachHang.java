package session5lab2;

import java.util.ArrayList;

public class SoLuongKhachHang {
    ArrayList<Integer> slkvn = new ArrayList<>();
    ArrayList<Integer> slknn = new ArrayList<>();
    int slKhachVN;
    int slKhachNN;

    public int getSlKhachNN() {
        return slKhachNN;
    }
    public void setSlKhachNN(int slKhachNN) {
        this.slKhachNN = slKhachNN;
    }
    public int getSlKhach() {
        return slKhachVN;
    }
    public void setSlKhach(int slKhach) {
        this.slKhachVN = slKhachVN;
    }

    public void demKVN(int soluong){slkvn.add(soluong);}

    public void demKNN(int soluong){
        slknn.add(soluong);
    }

    public int demKhachVN(){
        int dem = 0;
        if (slkvn.size()==0){
            dem =0;
        }
        else {
            for(int check:slkvn){
                dem=dem+check;
            }
        }
        return slKhachVN = dem;
    }

    public int demKhachNN(){
        int dem = 0;
        if (slknn.size()==0){
            dem =0;
        }
        else {
            for(int check:slknn){
                dem=dem+check;
            }
        }
        return slKhachNN = dem;
    }

}
