package vmo.demo.quanlyfresher.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="diemtb")
public class DiemTB {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "diemtb")
	private Double diemtb;
	@OneToOne 
    @JoinColumn(name = "hocvien_id") 
    private HocVien hocVien;
	public int getId() {
		return id;
	}
	
	public Double getDiemtb() {
		return diemtb;
	}
	public void setDiemtb(Double diemtb) {
		Double tongDiem = 0.0;
		List<DauDiem> list = hocVien.getDaudiem();
		for (int i = 0; i < list.size(); i++) {
			
			tongDiem += list.get(i).getSodiem();			
			
		}
		this.diemtb = tongDiem/(list.size());
	
	}
	public HocVien getHocVien() {
		return hocVien;
	}
	public void setHocVien(HocVien hocVien) {
		this.hocVien = hocVien;
	}
	
	
	
	

}
