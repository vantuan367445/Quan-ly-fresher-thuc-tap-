package vmo.demo.quanlyfresher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  vmo.demo.quanlyfresher.entity.DauDiem;


@Repository
public interface DauDiemRepository extends JpaRepository<DauDiem, Integer> {

}
