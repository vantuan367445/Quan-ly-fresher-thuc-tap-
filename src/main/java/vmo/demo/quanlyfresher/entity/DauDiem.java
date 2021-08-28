package vmo.demo.quanlyfresher.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "daudiem")
public class DauDiem {
	@Id                                                                                                                                                                                                                                                                                  
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Column(name = "tendaudiem")
	private String tendaudiem;
	@Column(name = "heso")
	private Double heso;
	@NotNull
	@Column(name = "sodiem")
	private Double sodiem;
	@Column(name = "mota")
	private String mota;
	@ManyToOne 
    @JoinColumn(name = "ngonngulaptrinh_id") 
    private NgonNguLapTrinh ngonNguLapTrinh;
	@ManyToOne 
    @JoinColumn(name = "hocvien_id") 
    private HocVien hocVien;
	public Long getId() {
		return id;
	}
	
	public String getTendaudiem() {
		return tendaudiem;
	}
	public void setTendaudiem(String tendaudiem) {
		this.tendaudiem = tendaudiem;
	}
	public Double getHeso() {
		return heso;
	}
	public void setHeso(Double heso) {
		this.heso = heso;
	}
	public Double getSodiem() {
		return sodiem;
	}
	public void setSodiem(Double sodiem) {
		this.sodiem = sodiem;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public NgonNguLapTrinh getNgonNguLapTrinh() {
		return ngonNguLapTrinh;
	}
	public void setNgonNguLapTrinh(NgonNguLapTrinh ngonNguLapTrinh) {
		this.ngonNguLapTrinh = ngonNguLapTrinh;
	}
	public HocVien getHocVien() {
		return hocVien;
	}
	public void setHocVien(HocVien hocVien) {
		this.hocVien = hocVien;
	}
 

	
	
	
}
