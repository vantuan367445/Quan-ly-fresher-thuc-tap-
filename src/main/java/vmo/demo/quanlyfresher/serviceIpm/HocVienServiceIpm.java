package vmo.demo.quanlyfresher.serviceIpm;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import  vmo.demo.quanlyfresher.entity.HocVien;
import vmo.demo.quanlyfresher.entity.User;
import  vmo.demo.quanlyfresher.repository.HocVienRepository;
import  vmo.demo.quanlyfresher.service.HocVienService;
@Service
public class HocVienServiceIpm implements HocVienService {
	@Autowired
	private HocVienRepository hocVienRepository;

	@Override
	public void luuHocVien(HocVien hocVien) {
		hocVienRepository.save(hocVien);
		
	}

	@Override
	public void xoaHocVien(Long id) {
	hocVienRepository.deleteById(id);
		
	}

	@Override
	public void xoaTatCaHocVien() {
		hocVienRepository.deleteAll();
		
	}

	

	@Override
	public Optional<HocVien> timKiemTheoId(Long id) {
		Optional<HocVien> opt = hocVienRepository.findById(id);
		return opt;
	}

	@Override
	public List<HocVien> timKiemTheoEmail(String email) {
		List<HocVien> opt = hocVienRepository.findByEmail(email);
		return opt;
	}

	@Override
	public List<HocVien> timKiemTheoNgonNguLapTrinh(String ngonNguLapTrinh) {
		List<HocVien> list = hocVienRepository.findByProgarmingLeague(ngonNguLapTrinh);
		return list ;
	}

	@Override
	public List<HocVien> layTatCaHocVien() {
		List<HocVien> list = hocVienRepository.findAll();
		return list;
	}

	@Override
	public List<HocVien> timKiemTheoTen(String keyword) {
		List<HocVien> opt = hocVienRepository.findByName(keyword);
		return opt;
	}
	
	
}
