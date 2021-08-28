package vmo.demo.quanlyfresher.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vmo.demo.quanlyfresher.validate.Phone;



@Table
@Entity(name = "hocvien")
public class HocVien {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Length(min = 3, max=20)
	@Column(name = "hoten")
	private String hoten;
	@Column(name = "mathehocvien")
	private String mathehocvien;
	@NotNull
	@NotBlank
	@Column(name = "trinhdo")
	private String trinhdo;
	@Past
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	@Column(name = "ngaysinh")
	private Date ngaysinh;
	@Column(name = "diachi")
	private String diachi;
	@NotNull
	@Phone
	@Column(name = "dienthoai")
	private String dienthoai;
	@Email
	@Column(name = "email")
	private String email;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ngonngulaptrinh_id")
	private NgonNguLapTrinh ngonNguLapTrinh;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="nguoihuongdan_id")
	private NguoiHuongDan nguoiHuongDan;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="trungtam_id")
	private TrungTam trungTam;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dangkythuctap_id")
	private DangKyThucTap dangKyThucTap;
	@OneToMany(mappedBy = "hocVien", cascade = CascadeType.ALL) 
    private List<DauDiem> daudiem;
	public Long getId() {
		return id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getMathehocvien() {
		return mathehocvien;
	}
	public void setMathehocvien(String mathehocvien) {
		this.mathehocvien = mathehocvien;
	}
	public String getTrinhdo() {
		return trinhdo;
	}
	public void setTrinhdo(String trinhdo) {
		this.trinhdo = trinhdo;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getDienthoai() {
		return dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public NgonNguLapTrinh getNgonNguLapTrinh() {
		return ngonNguLapTrinh;
	}
	public void setNgonNguLapTrinh(NgonNguLapTrinh ngonNguLapTrinh) {
		this.ngonNguLapTrinh = ngonNguLapTrinh;
	}
	public NguoiHuongDan getNguoiHuongDan() {
		return nguoiHuongDan;
	}
	public void setNguoiHuongDan(NguoiHuongDan nguoiHuongDan) {
		this.nguoiHuongDan = nguoiHuongDan;
	}
	public TrungTam getTrungTam() {
		return trungTam;
	}
	public void setTrungTam(TrungTam trungTam) {
		this.trungTam = trungTam;
	}
	public DangKyThucTap getDangKyThucTap() {
		return dangKyThucTap;
	}
	public void setDangKyThucTap(DangKyThucTap dangKyThucTap) {
		this.dangKyThucTap = dangKyThucTap;
	}
	public List<DauDiem> getDaudiem() {
		return daudiem;
	}
	public void setDaudiem(List<DauDiem> daudiem) {
		this.daudiem = daudiem;
	}
	
	
	
	

	
	 
	
	
	
	 	

}
