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

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "nguoihuongdan")
public class NguoiHuongDan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@NotNull
	@Column(name = "hoten")
	private String hoten;
	@NotNull
	@Column(name = "chucvu")
	private String chucvu;
	@NotBlank
	@Column(name = "sonamkinhnghiem")
	private int sonamkinhnghiem;
	@Column(name = "monhuongdan")
	private String monhuongdan;
	@OneToMany(mappedBy = "nguoiHuongDan", cascade = CascadeType.ALL) 
    private List<HocVien> hocVien;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="khoahoc_id")
	private KhoaHoc khoaHoc;
	public Long getId() {
		return id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public int getSonamkinhnghiem() {
		return sonamkinhnghiem;
	}
	public void setSonamkinhnghiem(int sonamkinhnghiem) {
		this.sonamkinhnghiem = sonamkinhnghiem;
	}
	public String getMonhuongdan() {
		return monhuongdan;
	}
	public void setMonhuongdan(String monhuongdan) {
		this.monhuongdan = monhuongdan;
	}
	public List<HocVien> getHocVien() {
		return hocVien;
	}
	public void setHocVien(List<HocVien> hocVien) {
		this.hocVien = hocVien;
	}
	public KhoaHoc getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(KhoaHoc khoaHoc) {
		this.khoaHoc = khoaHoc;
	}
	
	
	
}
