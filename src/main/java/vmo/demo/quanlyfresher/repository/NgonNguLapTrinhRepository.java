package vmo.demo.quanlyfresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  vmo.demo.quanlyfresher.entity.NgonNguLapTrinh;


@Repository
public interface NgonNguLapTrinhRepository extends JpaRepository<NgonNguLapTrinh, Long>{
//	@Query( "SELECT h  FROM ngonngulaptrinh h WHERE h.tenngonngulaptrinh LIKE %?1% ")
//	List<HocVien> findByName(String keyword);
}
