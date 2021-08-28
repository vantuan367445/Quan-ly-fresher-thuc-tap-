package vmo.demo.quanlyfresher.serviceIpm;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import  vmo.demo.quanlyfresher.entity.DangKyThucTap;
import vmo.demo.quanlyfresher.entity.HocVien;
import vmo.demo.quanlyfresher.entity.NgonNguLapTrinh;
import vmo.demo.quanlyfresher.entity.TrungTam;
import vmo.demo.quanlyfresher.entity.User;
import  vmo.demo.quanlyfresher.repository.DangKyThucTapRepository;
import  vmo.demo.quanlyfresher.service.DangKyThucTapService;

@Service
public class DangKyThucTapServiceIpm implements DangKyThucTapService {
	@Autowired
	private DangKyThucTapRepository dangKyThucTapRepository;
	
	@Override
	public void themDangKy(DangKyThucTap dangKyThucTap) {
		dangKyThucTapRepository.save(dangKyThucTap);
		
	}

	@Override
	public void xoaDangKy(Long id) {
		dangKyThucTapRepository.deleteById(id);
		
		
	}

	@Override
	public List<DangKyThucTap> layTatCa() {
		List<DangKyThucTap> list = dangKyThucTapRepository.findAll();
		return list;
	}
	@Override
	@Transactional
	@CacheEvict(value = "itemcount", allEntries = true)
	public synchronized DangKyThucTap createDangKy(TrungTam trungTam,HocVien hocVien, NgonNguLapTrinh ngonNguLapTrinh,  User user) {
		DangKyThucTap dangKyThucTap = new DangKyThucTap();
		dangKyThucTap.setUser(user);
			
		LocalDate today = LocalDate.now();
		LocalDate estimatedDeliveryDate = today.plusDays(5);				
		dangKyThucTap.setCreatebytimeupdate(Date.from(today.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		dangKyThucTap.setNgaydangky(Date.from(estimatedDeliveryDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
		dangKyThucTap.setTrangthaidangky("In Progress");
		
		dangKyThucTap = dangKyThucTapRepository.save(dangKyThucTap);
		
		
		return dangKyThucTap;	
	}

	@Override
	public List<DangKyThucTap> findByUser(User user) {
		List<DangKyThucTap> ds = dangKyThucTapRepository.findByUser(user);
		return ds;
	}

}
