package vmo.demo.quanlyfresher.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import  vmo.demo.quanlyfresher.entity.HocVien;



@Repository
public interface HocVienRepository extends JpaRepository<HocVien, Long> {
	
	@Query( "SELECT h  FROM hocvien h WHERE h.hoten LIKE %?1%  ")
	List<HocVien> findByName(String keyword);
	@Query("SELECT h  FROM hocvien h WHERE h.email LIKE %?1% ")
	List<HocVien> findByEmail(String keyword);
	@Query(value = "SELECT * FROM quanlythuctap.hocvien  WHERE quanlythuctap.hocvien.ngonngulaptrinh_id = ANY (SELECT id FROM quanlythuctap.ngonngulaptrinh  WHERE quanlythuctap.ngonngulaptrinh.tenngonngulaptrinh like %?1%)", nativeQuery = true)
	List<HocVien> findByProgarmingLeague(String keyword);
	
	
	

}