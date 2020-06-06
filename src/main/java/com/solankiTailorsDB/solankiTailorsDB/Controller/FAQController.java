package com.solankiTailorsDB.solankiTailorsDB.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
}
