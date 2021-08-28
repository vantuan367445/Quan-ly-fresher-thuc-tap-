package vmo.demo.quanlyfresher.service;

import java.util.List;

import org.springframework.stereotype.Service;

import  vmo.demo.quanlyfresher.entity.TrungTam;

@Service
public interface TrungTamService {
	List<TrungTam> danhSachTatCaTrungTam();
	void luuTrungTam(TrungTam trungTam);
	void xoaTrungTam(Long id);
	int thongKeSoFresher();
	int thongKeFresherByDiemSo();
	
	
}
