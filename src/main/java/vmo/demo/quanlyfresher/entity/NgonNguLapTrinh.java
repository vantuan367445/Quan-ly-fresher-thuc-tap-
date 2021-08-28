package vmo.demo.quanlyfresher.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "ngonngulaptrinh")
public class NgonNguLapTrinh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Length(min = 3, max=20)
	@Column(name = "tenngonngulaptrinh")
	private String tenngonngulaptrinh;
	@NotBlank
	@Column(name = "sothoigianhoc")
	private int sothoigianhoc;
	@NotNull
	@Column(name = "soluongthuctapsinh")
	private int soluongthuctapsinh;
	@Column(name = "mota")
	private String mota;
	@OneToMany(mappedBy = "ngonNguLapTrinh", cascade = CascadeType.ALL) 
    private List<DauDiem> daudiem;
	@OneToMany(mappedBy = "ngonNguLapTrinh", cascade = CascadeType.ALL) 
    private List<HocVien> hocvien ;
	@OneToOne 
    @JoinColumn(name = "nguoihuongdan_id") 
    private NguoiHuongDan nguoiHuongDan;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="khoahoc_id")
	private KhoaHoc khoaHoc;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dangkythuctap_id")
	private DangKyThucTap dangKyThucTap;
	public Long getId() {
		return id;
	}
	public String getTenngonngulaptrinh() {
		return tenngonngulaptrinh;
	}
	public void setTenngonngulaptrinh(String tenngonngulaptrinh) {
		this.tenngonngulaptrinh = tenngonngulaptrinh;
	}
	public int getSothoigianhoc() {
		return sothoigianhoc;
	}
	public void setSothoigianhoc(int sothoigianhoc) {
		this.sothoigianhoc = sothoigianhoc;
	}
	public int getSoluongthuctapsinh() {
		return soluongthuctapsinh;
	}
	public void setSoluongthuctapsinh(int soluongthuctapsinh) {
		this.soluongthuctapsinh = soluongthuctapsinh;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public List<DauDiem> getDaudiem() {
		return daudiem;
	}
	public void setDaudiem(List<DauDiem> daudiem) {
		this.daudiem = daudiem;
	}
	public List<HocVien> getHocvien() {
		return hocvien;
	}
	public void setHocvien(List<HocVien> hocvien) {
		this.hocvien = hocvien;
	}
	public NguoiHuongDan getNguoiHuongDan() {
		return nguoiHuongDan;
	}
	public void setNguoiHuongDan(NguoiHuongDan nguoiHuongDan) {
		this.nguoiHuongDan = nguoiHuongDan;
	}
	public KhoaHoc getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(KhoaHoc khoaHoc) {
		this.khoaHoc = khoaHoc;
	}
	public DangKyThucTap getDangKyThucTap() {
		return dangKyThucTap;
	}
	public void setDangKyThucTap(DangKyThucTap dangKyThucTap) {
		this.dangKyThucTap = dangKyThucTap;
	}
	
	
	

}
