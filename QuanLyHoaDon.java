
import java.util.ArrayList;
import java.util.List;

class QuanLyHoaDon {
    private List<HoaDon> danhSachHoaDon;

    public QuanLyHoaDon() {
        danhSachHoaDon = new ArrayList<>();
    }

    public void themHoaDon(HoaDon hoaDon) {
        danhSachHoaDon.add(hoaDon);
    }

    public void xuatDanhSachHoaDon() {
        for (HoaDon hoaDon : danhSachHoaDon) {
            hoaDon.xuatThongTin();
        }
    }

    public int demSoLuongKhachHangVietNam() {
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangVietNam) {
                count++;
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienKhachHangNuocNgoai() {
        double tongThanhTien = 0;
        int count = 0;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon instanceof KhachHangNuocNgoai) {
                tongThanhTien += hoaDon.tinhThanhTien();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return tongThanhTien / count;
    }

    public void xuatHoaDonThang9Nam2013() {
        System.out.println("Hoa don trong thang 09 nam 2013:");
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.ngayRaHoaDon.contains("09/2013")) {
                hoaDon.xuatThongTin();
            }
        }
    }

 public static void main(String[] args) {
        QuanLyHoaDon qlhd = new QuanLyHoaDon();

        KhachHangVietNam khachHang1 = new KhachHangVietNam("KHVN011", "Hoang Van Ngoc", "06/09/2013", "sinh hoạt",
                100, 4000, 50);
        KhachHangVietNam khachHang2 = new KhachHangVietNam("KHVN202", "Ngoc Hoàng Van", "09/09/2013", "kinh doanh",
                150, 9000, 80);
        KhachHangNuocNgoai khachHang3 = new KhachHangNuocNgoai("KHNN003", "Ruby", "10/09/2013", "Brazil",
                200, 8000);

        qlhd.themHoaDon(khachHang1);
        qlhd.themHoaDon(khachHang2);
        qlhd.themHoaDon(khachHang3);

        qlhd.xuatDanhSachHoaDon();

        int soLuongKhachHangVietNam = qlhd.demSoLuongKhachHangVietNam();
        System.out.println("Tong so luong khach hang Viet Nam: " + soLuongKhachHangVietNam);

        double trungBinhThanhTienKhachHangNuocNgoai = qlhd.tinhTrungBinhThanhTienKhachHangNuocNgoai();
        System.out.println("Trung binh thanh tien khach hang nuoc ngoai: " + trungBinhThanhTienKhachHangNuocNgoai);

        qlhd.xuatHoaDonThang9Nam2013();
    }
}


