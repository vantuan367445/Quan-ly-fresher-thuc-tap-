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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dangkythuctap")
public class DangKyThucTap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@DateTimeFormat(pattern = "dd/MM/YYYY")
	@Column(name = "ngaydanngky")
	private Date ngaydangky;

	@Column(name = "trangthaidangky")
	private String trangthaidangky;

	private String updateBy;

	@DateTimeFormat(pattern = "dd/MM/YYYY")
	private Date  createbytimeupdate;
	@OneToMany(mappedBy = "dangKyThucTap", cascade = CascadeType.ALL) 
    private List<HocVien> hocVien;
	@OneToMany(mappedBy = "dangKyThucTap", cascade = CascadeType.ALL) 
    private List<NgonNguLapTrinh> ngonNguLapTrinh;
	@OneToOne 
    @JoinColumn(name = "trungtam_id") 
    private TrungTam trungtam; 
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	@OneToOne 
    @JoinColumn(name = "khoahoc_id") 
    private KhoaHoc khoaHoc;
	public Long getId() {
		return id;
	}
	public Date getNgaydangky() {
		return ngaydangky;
	}
	public void setNgaydangky(Date ngaydangky) {
		this.ngaydangky = ngaydangky;
	}
	public String getTrangthaidangky() {
		return trangthaidangky;
	}
	public void setTrangthaidangky(String trangthaidangky) {
		this.trangthaidangky = trangthaidangky;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getCreatebytimeupdate() {
		return createbytimeupdate;
	}
	public void setCreatebytimeupdate(Date createbytimeupdate) {
		this.createbytimeupdate = createbytimeupdate;
	}
	public List<HocVien> getHocVien() {
		return hocVien;
	}
	public void setHocVien(List<HocVien> hocVien) {
		this.hocVien = hocVien;
	}
	public List<NgonNguLapTrinh> getNgonNguLapTrinh() {
		return ngonNguLapTrinh;
	}
	public void setNgonNguLapTrinh(List<NgonNguLapTrinh> ngonNguLapTrinh) {
		this.ngonNguLapTrinh = ngonNguLapTrinh;
	}
	public TrungTam getTrungtam() {
		return trungtam;
	}
	public void setTrungtam(TrungTam trungtam) {
		this.trungtam = trungtam;
	}
	public KhoaHoc getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(KhoaHoc khoaHoc) {
		this.khoaHoc = khoaHoc;
	} 
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
	
	
	
}
