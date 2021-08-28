package vmo.demo.quanlyfresher.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vmo.demo.quanlyfresher.entity.TrungTam;
import vmo.demo.quanlyfresher.serviceIpm.TrungTamServiceIpm;
@Controller
public class TrungTamController {
	@Autowired
	private TrungTamServiceIpm trungTamServiceIpm;
	
	@GetMapping("/trungtam")
    public String danhsach(Model model) {
        model.addAttribute("trungtam", trungTamServiceIpm.danhSachTatCaTrungTam());
        return "listtrungtam";
    }
	@GetMapping("/trungtam/them")
	public String add(Model model) {
	    model.addAttribute("trungtam", new TrungTam());
	    return "trungtam";
	}
	@PostMapping("/trungtam/luu")
	public String save( TrungTam trungTam, BindingResult result, RedirectAttributes redirect) {
	  
	  trungTamServiceIpm.luuTrungTam(trungTam);
	    return "redirect:/trungtam";
	}
	
	
	@GetMapping("/trungtam/{id}/xoa")
	public String delete(@PathVariable Long id, RedirectAttributes redirect) {
	    trungTamServiceIpm.xoaTrungTam(id);
	    redirect.addFlashAttribute("successMessage", "Xoa thanh cong!");
	    return "redirect:/trungtam";
	}
	
	@GetMapping("/trungtam/thongkehocvien")
	public String ThognKeHocVien(TrungTam trungTam, BindingResult result, RedirectAttributes redirect) {
	  
	  trungTamServiceIpm.thongKeSoFresher();
	    return "redirect:/trungtam";
	}
	@GetMapping("/trungtam/thongkefresher")
	public String ThongKeFresher(TrungTam trungTam, BindingResult result, RedirectAttributes redirect) {
	  
	 
	    return "redirect:/trungtam";
	}
	
	
}
