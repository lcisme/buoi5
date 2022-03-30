package session5lab2;

public class Main {
    public static void main(String[] args){
        KhachHangVietNam vn = new KhachHangVietNam();
        vn.setId("TH2108001");
        vn.setName("Lê Phú Cường");
        vn.setDate("Tháng 01 Năm 2019");
        vn.setDoituong(vn.danhsachdoituong[2]);
        vn.soluong =78;
        vn.tinhTien();
        vn.hienThi();

        KhachHangVietNam vn2 = new KhachHangVietNam();
        vn2.setId("TH2108012");
        vn2.setName("Lê Phú Cèng");
        vn2.setDate("Tháng 01 Năm 2019");
        vn2.setDoituong(vn.danhsachdoituong[2]);
        vn2.soluong =87;
        vn2.tinhTien();
        vn2.hienThi();

        KhachHangNuocNgoai nn = new KhachHangNuocNgoai();
        nn.setId("TH2108002");
        nn.setName("Cristiano Ronaldo");
        nn.setDate("Tháng 01 Năm 2019");
        nn.setQuocTich(nn.quoctichtuychon[0]);
        nn.soluong = 21;
        nn.tinhTien();
        nn.hienThi();

        KhachHangNuocNgoai nn1 = new KhachHangNuocNgoai();
        nn1.setId("TH210923");
        nn1.setName("Leo Messi");
        nn1.setDate("Tháng 01 Năm 2019");
        nn1.setQuocTich(nn.quoctichtuychon[1]);
        nn1.soluong = 172;
        nn1.tinhTien();
        nn1.hienThi();

        KhachHangNuocNgoai nn2 = new KhachHangNuocNgoai();
        nn2.setId("TH04800");
        nn2.setName("Harry Maguire");
        nn2.setDate("Tháng 01 Năm 2019");
        nn2.setQuocTich(nn.quoctichtuychon[3]);
        nn2.soluong = 80;
        nn2.tinhTien();
        nn2.hienThi();

        DSKNN knn = new DSKNN();
        knn.slKH(nn.giaTien);
        knn.slKH(nn1.giaTien);
        knn.slKH(nn2.giaTien);
        knn.giaTienTB();
        System.out.println("\nGiá tiền trung bình của khách nước ngoài là: "+knn.giaTienTB());

        System.out.println("Đếm số lượng khách VN");

// đếm lượng khách vn
        SoLuongKhachHang demKHVN = new SoLuongKhachHang();
        demKHVN.demKVN(vn.soluong);
        demKHVN.demKVN(vn2.soluong);
        demKHVN.demKhachVN();
        System.out.println(demKHVN.slKhachVN);
// đếm lượng khách nn
        System.out.println("Đếm số lượng khách NN");
        SoLuongKhachHang demKHNN = new SoLuongKhachHang();
        demKHNN.demKNN(nn.soluong);
        demKHNN.demKNN(nn1.soluong);
        demKHNN.demKNN(nn2.soluong);
        demKHNN.demKhachNN();
        System.out.println(demKHNN.slKhachNN);
    }
}
