package vmo.demo.quanlyfresher.controller;



import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.thymeleaf.util.StringUtils;



import vmo.demo.quanlyfresher.entity.HocVien;
import vmo.demo.quanlyfresher.entity.User;
import vmo.demo.quanlyfresher.serviceIpm.HocVienServiceIpm;
@Controller
public class HocVienController {
	@Autowired
	private HocVienServiceIpm hocVienServiceIpm;
	
	@GetMapping("/hocvien")
    public String danhsach(Model model) {
	
        model.addAttribute("hocvien", hocVienServiceIpm.layTatCaHocVien());
        return "list";
    }
	@GetMapping("/hocvien/timkiem")
	public String timKiemTheoTen(@RequestParam("keyword") String keyword, Model model) {
		 if (StringUtils.isEmpty(keyword)) {
		        return "redirect:/contact";
		    }
	   

	    model.addAttribute("hocvien", hocVienServiceIpm.timKiemTheoTen(keyword));
	    return "list";
	}
	@GetMapping("/hocvien/timkiememail")
	public String timKiemEmail(@RequestParam("keyword") String keyword, Model model) {
	   

	    model.addAttribute("hocvien", hocVienServiceIpm.timKiemTheoEmail(keyword));
	    return "list";
	}
	@GetMapping("/hocvien/timkiemngonngulaptrinh")
	public String timKiemNgonNguLapTrinh(@RequestParam("keyword") String keyword, Model model) {
	   

	    model.addAttribute("hocvien", hocVienServiceIpm.timKiemTheoNgonNguLapTrinh(keyword));
	    return "list";
	}
	@GetMapping("/hocvien/them")
	public String add(Model model) {
	    model.addAttribute("hocvien", new HocVien());
	    return "form";
	}
	@PostMapping("/hocvien/luu")
	public String save( HocVien hocvien, BindingResult result, RedirectAttributes redirect) {
		 
	    hocVienServiceIpm.luuHocVien(hocvien);
	    return "redirect:/hocvien";
	}
	@GetMapping("/hocvien/{id}/sua")
	public String edit(@PathVariable("id") Long id, Model model) {
	    model.addAttribute("hocvien", hocVienServiceIpm.timKiemTheoId(id));
	    return "form";
	}
	@GetMapping("/hocvien/{id}/xoa")
	public String delete(@PathVariable Long id, RedirectAttributes redirect) {
	    hocVienServiceIpm.xoaHocVien(id);
	    redirect.addFlashAttribute("successMessage", "Xoa thanh cong!");
	    return "redirect:/hocvien";
	}
	
}
