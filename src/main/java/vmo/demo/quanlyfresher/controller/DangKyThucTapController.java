package vmo.demo.quanlyfresher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vmo.demo.quanlyfresher.entity.DangKyThucTap;
import vmo.demo.quanlyfresher.entity.HocVien;
import vmo.demo.quanlyfresher.serviceIpm.DangKyThucTapServiceIpm;

@Controller
public class DangKyThucTapController {
//	//them hocvienvao trung tam
//	
//	@Autowired
//	private DangKyThucTapServiceIpm dangKyThucTapServiceIpm;
//	@GetMapping("/dangkythuctap")
//    public String danhsach(Model model) {
//        model.addAttribute("hocvien",dangKyThucTapServiceIpm.layTatCa());
//        return "list";
//    }
//	@GetMapping("/dangkythuctap/them")
//	public String add(Model model) {
//	    model.addAttribute("dang", new DangKyThucTap());
//	    return "formdangky";
//	}
//	@PostMapping("/dangkythuctap/luu")
//	public String save( DangKyThucTap dangKyThucTap, BindingResult result, RedirectAttributes redirect) {
//		 
//	    dangKyThucTapServiceIpm.themDangKy(dangKyThucTap);
//	    return "redirect:/dangkythuctap";
//	}

}
