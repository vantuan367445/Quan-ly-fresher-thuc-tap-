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


import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lophoc")

public class LopHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tenlop")
	private String tenlop;
	@Column(name = "soluongsinhvien")
	private int soluongsinhvien;
	@Column(name = "mota")
	private String mota;
	@Column(name = "lich")
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	private Date lich;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="khoahoc_id")
	private KhoaHoc khoaHoc;
	@OneToOne 
    @JoinColumn(name = "ngonngulaptrinh_id") 
    private NgonNguLapTrinh ngonNguLapTrinh; 
	@OneToOne 
    @JoinColumn(name = "nguoihuongdan_id") 
    private NguoiHuongDan nguoiHuongDan;
	public Long getId() {
		return id;
	}
	public String getTenlop() {
		return tenlop;
	}
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	public int getSoluongsinhvien() {
		return soluongsinhvien;
	}
	public void setSoluongsinhvien(int soluongsinhvien) {
		this.soluongsinhvien = soluongsinhvien;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public Date getLich() {
		return lich;
	}
	public void setLich(Date lich) {
		this.lich = lich;
	}
	public KhoaHoc getKhoaHoc() {
		return khoaHoc;
	}
	public void setKhoaHoc(KhoaHoc khoaHoc) {
		this.khoaHoc = khoaHoc;
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
	
	
	 
}
