package vmo.demo.quanlyfresher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import  vmo.demo.quanlyfresher.entity.DangKyThucTap;
import vmo.demo.quanlyfresher.entity.User;

@Repository
public interface DangKyThucTapRepository extends JpaRepository<DangKyThucTap, Long> {
	List<DangKyThucTap> findByUser(User user); 
}
