package vmo.demo.quanlyfresher.serviceIpm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vmo.demo.quanlyfresher.entity.TrungTam;
import vmo.demo.quanlyfresher.repository.TrungTamRepository;
import  vmo.demo.quanlyfresher.service.TrungTamService;

@Service
public class TrungTamServiceIpm implements TrungTamService {
	@Autowired
	private TrungTamRepository trungTamRepository;

	@Override
	public List<TrungTam> danhSachTatCaTrungTam() {
		List<TrungTam> list = trungTamRepository.findAll();
		return list;
	}

	@Override
	public void luuTrungTam(TrungTam trungTam) {
		trungTamRepository.save(trungTam);
		
	}

	@Override
	public void xoaTrungTam(Long id) {
	trungTamRepository.deleteById(id);
		
	}

	@Override
	public int thongKeSoFresher() {
		int sohocvien = trungTamRepository.ThongKeHocVien();
		return sohocvien;
	}

	@Override
	public int thongKeFresherByDiemSo() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}
