package com.wavelab.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wavelab.demo.dao.EmployRepo;

@RestController
public class EmpController {
	@Autowired
	private EmployRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("addEmploy")
	public String addemploy(Employ employ) {
		repo.save(employ);
		return "home.jsp";
	}

	/*
	 * @RequestMapping("/getDetails") public ModelAndView getDetails(@RequestParam
	 * int eid) { ModelAndView mv = new ModelAndView("showDetails.jsp"); Employ
	 * employ = repo.findById(eid).orElse(new Employ());
	 * 
	 * /* System.out.println(repo.findByTech("java"));
	 * System.out.println(repo.findByIdGreaterThan(eid));
	 * System.out.println(repo.findByTechSorted("java"));
	 */

	/*
	 * mv.addObject(employ); return mv; }
	 */

	/*
	 * @RequestMapping("/getDetailsbyTech") public ModelAndView
	 * getDetails(@RequestParam String tech) { ModelAndView mv = new
	 * ModelAndView("showDetails.jsp"); // Employ employ = repo.findByTech(tech); //
	 * mv.addObject(employ); return mv; }
	 */

	@RequestMapping(path = "/Employees", produces = { "application/xml" })
	@ResponseBody
	public String getEmployees() {
		return repo.findAll().toString();
	}

	@RequestMapping("/Employees/{eid}")
	@ResponseBody
	public String getEmployees(@PathVariable("eid") int eid) {
		return repo.findById(eid).toString();
	}

	/*
	 * @RequestMapping("/Employees/{eid}")
	 * 
	 * @ResponseBody public Optional<Employ> getEmployees(@PathVariable("eid") int
	 * eid) { return repo.findById(eid); }
	 */
}
