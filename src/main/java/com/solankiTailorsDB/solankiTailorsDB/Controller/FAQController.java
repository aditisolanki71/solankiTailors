package com.solankiTailorsDB.solankiTailorsDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solankiTailorsDB.solankiTailorsDB.Model.FAQModel;
import com.solankiTailorsDB.solankiTailorsDB.Service.FAQService;

@RestController
@RequestMapping("faq")
public class FAQController {

	@Autowired
	FAQService faqService;
	
	@PostMapping
	public FAQModel addFAQ(@RequestBody FAQModel faq) {
		return faqService.addFAQ(faq);
	}
	
	@GetMapping
	public List<FAQModel> getAllFAQ() {
		return faqService.getAllFAQ();
	}
	
	@PutMapping("/{id}")
	public FAQModel updateById(@PathVariable int id,@RequestBody FAQModel faq) {
		return faqService.updateById(id,faq);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		faqService.deleteById(id);
	}
	
	@GetMapping("/{id}")
	public FAQModel getFAQById(@PathVariable int id) {
		return faqService.getFAQById(id);
	}
}
