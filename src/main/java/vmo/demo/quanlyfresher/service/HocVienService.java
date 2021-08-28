package vmo.demo.quanlyfresher.service;


import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import  vmo.demo.quanlyfresher.entity.HocVien;


@Service
public interface HocVienService {
	
	void luuHocVien(HocVien hocVien);
	
	void xoaHocVien(Long id);
	
	void xoaTatCaHocVien();
	 
	
	List<HocVien> layTatCaHocVien( );
	
	List<HocVien> timKiemTheoTen(String keyword);
	
	Optional<HocVien> timKiemTheoId(Long id);
	
	List<HocVien> timKiemTheoEmail(String email);
	
	List<HocVien> timKiemTheoNgonNguLapTrinh(String ngonNguLapTrinh);
	
}
