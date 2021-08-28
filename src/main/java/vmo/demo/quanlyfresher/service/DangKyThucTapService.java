package vmo.demo.quanlyfresher.service;

import java.util.List;

import org.springframework.stereotype.Service;



import vmo.demo.quanlyfresher.entity.DangKyThucTap;
import vmo.demo.quanlyfresher.entity.HocVien;
import vmo.demo.quanlyfresher.entity.NgonNguLapTrinh;
import vmo.demo.quanlyfresher.entity.TrungTam;
import vmo.demo.quanlyfresher.entity.User;

@Service
public interface DangKyThucTapService {

	void themDangKy(DangKyThucTap dangKyThucTap);
	
	void xoaDangKy(Long id);
	
	DangKyThucTap createDangKy(TrungTam trungTam,HocVien hocVien, NgonNguLapTrinh ngonNguLapTrinh,  User user);
	
	List<DangKyThucTap> layTatCa();
	
	List<DangKyThucTap> findByUser(User user);
	
	
}
