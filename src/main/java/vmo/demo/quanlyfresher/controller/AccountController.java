package vmo.demo.quanlyfresher.controller;


import java.security.Principal;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vmo.demo.quanlyfresher.config.SecurityUtility;
import vmo.demo.quanlyfresher.entity.DangKyThucTap;
import vmo.demo.quanlyfresher.entity.HocVien;
import vmo.demo.quanlyfresher.entity.TrungTam;
import vmo.demo.quanlyfresher.entity.User;
import vmo.demo.quanlyfresher.service.UserService;
import vmo.demo.quanlyfresher.serviceIpm.DangKyThucTapServiceIpm;
import vmo.demo.quanlyfresher.serviceIpm.TrungTamServiceIpm;
import vmo.demo.quanlyfresher.serviceIpm.UserSecurityService;






@Controller
public class AccountController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserSecurityService userSecurityService;
	@Autowired
	private DangKyThucTapServiceIpm dangKyThucTapServiceIpm;
	@Autowired
	private TrungTamServiceIpm trungTamServiceIpm;
	

	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("usernameExists", model.asMap().get("usernameExists"));
		model.addAttribute("emailExists", model.asMap().get("emailExists"));
		return "dangnhap";
	}
	@RequestMapping("/")
	public String index(Model model) {		
		List<TrungTam> trungtam = trungTamServiceIpm.danhSachTatCaTrungTam();
		model.addAttribute("trungtam", trungtam);
		return "listtrungtam";
	}
	
	@RequestMapping("/trangcanhan")
	public String trangCaNhan(Model model, Authentication authentication) {				
		User user = (User) authentication.getPrincipal();
		model.addAttribute("user", user);
		return "trangcanhan";
	}
	
	@RequestMapping("/dangkythuctap")
	public String myDangKyThucTap(Model model, Authentication authentication) {
		User user = (User) authentication.getPrincipal();
		model.addAttribute("user", user);
		List<DangKyThucTap> dangKyThucTaps = dangKyThucTapServiceIpm.findByUser(user);
		model.addAttribute("dangkythuctaps",dangKyThucTaps);
		return "trangcanhan";
	}
	
	
	
	@PostMapping(value="/taotaikhoan")
	public String taoUser( @ModelAttribute("user") User user, BindingResult bindingResults,
							  @ModelAttribute("new-password") String password, 
							  RedirectAttributes redirectAttributes, Model model) {
		model.addAttribute("email", user.getEmail());
		model.addAttribute("username", user.getUsername());	
		boolean invalidFields = false;
		if (bindingResults.hasErrors()) {
			return "redirect:/login";
		}		
		if (userService.findByUsername(user.getUsername()) != null) {
			redirectAttributes.addFlashAttribute("usernameExists", true);
			invalidFields = true;
		}
		if (userService.findByEmail(user.getEmail()) != null) {
			redirectAttributes.addFlashAttribute("emailExists", true);
			invalidFields = true;
		}	
		if (invalidFields) {
			return "redirect:/login";
		}		
		user = userService.createUser(user.getUsername(), password,  user.getEmail(), Arrays.asList("ROLE_USER"));	
		userSecurityService.authenticateUser(user.getUsername());
		return "redirect:/trangcanhan";  
	}
		
	
	
	
	
}
