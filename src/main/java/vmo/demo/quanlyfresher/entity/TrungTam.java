package vmo.demo.quanlyfresher.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vmo.demo.quanlyfresher.validate.Phone;


@Entity
@Table(name = "trungtam")
public class TrungTam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@NotNull
	@Column(name = "tentrungtam")
	private String tentrungtam;
	@Column(name = "diachitrungtam")
	private String diachitrungtam;
	@NotEmpty
	@Phone
	@Column(name = "sodienthoai")
	private String sodienthoai;
	@Email
	@Column(name = "email")
	private String email;
	
	@OneToMany(mappedBy = "trungTam", cascade = CascadeType.ALL) 
    private List<KhoaHoc> khoaHoc;
	@OneToMany(mappedBy = "trungTam", cascade = CascadeType.ALL)
	private List<HocVien> hocVien;
	public Long getId() {
		return id;
	}
	public String getTentrungtam() {
		return tentrungtam;
	}
	public void setTentrungtam(String tentrungtam) {
		this.tentrungtam = tentrungtam;
	}
	public String getDiachitrungtam() {
		return diachitrungtam;
	}
	public void setDiachitrungtam(String diachitrungtam) {
		this.diachitrungtam = diachitrungtam;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<KhoaHoc> getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(List<KhoaHoc> khoaHoc) {
		this.khoaHoc = khoaHoc;
	}
	public List<HocVien> getHocVien() {
		return hocVien;
	}
	public void setHocVien(List<HocVien> hocVien) {
		this.hocVien = hocVien;
	}
	
	
	

	
}
