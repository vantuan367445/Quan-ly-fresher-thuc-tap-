package vmo.demo.quanlyfresher.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import  vmo.demo.quanlyfresher.entity.HocVien;
import  vmo.demo.quanlyfresher.entity.TrungTam;



@Repository
public interface TrungTamRepository extends JpaRepository<TrungTam, Long> {
	@Query(value = "SELECT count(id) FROM quanlythuctap.hocvien where quanlythuctap.hocvien.id =  any( select id from quanlythuctap.trungtam where quanlythuctap.trungtam.tentrungtam = ?1",nativeQuery = true)
	int ThongKeHocVien();
//	@Query(value = "",nativeQuery = true)
//	List<HocVien> findByPoint(String keyword);
}
