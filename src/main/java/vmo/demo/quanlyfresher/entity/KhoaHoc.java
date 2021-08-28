package vmo.demo.quanlyfresher.entity;

import java.sql.Date;
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
import javax.persistence.Table;
import javax.validation.constraints.Past;


import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "khoahoc")
public class KhoaHoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "tenkhoahoc")
	private String tenkhoahoc;
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	@Column(name = "ngaymo")
	private Date ngaymo;
	@Past
	@Column(name ="ngayketthuc" )
	private Date ngayketthuc;
	@Column(name = "soluonghocvien")
	private int soluonghocvien;
	@OneToMany(mappedBy = "khoaHoc", cascade = CascadeType.ALL) 
    private List<LopHoc> lopHoc;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="trungtam_id")
	private TrungTam trungTam;
	@OneToMany(mappedBy = "khoaHoc", cascade = CascadeType.ALL) 
    private List<NgonNguLapTrinh> ngonNguLapTrinh;
	@OneToMany(mappedBy = "khoaHoc", cascade = CascadeType.ALL) 
    private List<NguoiHuongDan> nguoiHuongDan ;

}
