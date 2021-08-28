package vmo.demo.quanlyfresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vmo.demo.quanlyfresher.entity.DiemTB;
@Repository
public interface DiemTBRepository extends JpaRepository<DiemTB, Long>{

}
