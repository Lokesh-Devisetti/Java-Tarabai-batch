package com.bitlabs.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitlabs.EmployeeDao.EmployeeDao;
import com.bitlabs.EmployeeModel.Employer;


@Controller
public class EmployeeController {


	@Autowired
	private EmployeeDao dao;

	@RequestMapping("/home")
	public String home() {

		return "index";
	}

	@RequestMapping("/addEmploye")
	public String AddEmploye(@ModelAttribute Employer employe, Model model) {
		this.dao.addEmploye(employe);
		return "success";
	}

	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Employer> list = this.dao.getAll();
		model.addAttribute("employes", list);
		return "allEmployes";

	}

	@RequestMapping("/delete/{id}")
	public String getAll(@PathVariable("id") int id) {
		this.dao.delete(id);
		return "success";
	}

	@RequestMapping("/update/{id}")
	public String getAll(@PathVariable("id") int id, Model model) {
		Employer employe = this.dao.getById(id);
		model.addAttribute("employes", employe);
		return "index1";
	}
}


