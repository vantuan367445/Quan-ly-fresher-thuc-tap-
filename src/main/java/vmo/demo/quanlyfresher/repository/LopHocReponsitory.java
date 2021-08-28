package vmo.demo.quanlyfresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  vmo.demo.quanlyfresher.entity.LopHoc;



@Repository
public interface LopHocReponsitory extends JpaRepository<LopHoc, Long > {

}
