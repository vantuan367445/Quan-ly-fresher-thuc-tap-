package vmo.demo.quanlyfresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  vmo.demo.quanlyfresher.entity.KhoaHoc;



@Repository
public interface KhoaHocRepository extends JpaRepository<KhoaHoc, Integer> {

}
