package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.FAQModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.FAQRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.FAQService;

@Service
public class FAQServiceImplementation implements FAQService{

	@Autowired
	FAQRepository faqRepository;
	
	@Override
	public FAQModel addFAQ(FAQModel faq) {
		// TODO Auto-generated method stub
		return faqRepository.save(faq);
	}

	@Override
	public List<FAQModel> getAllFAQ() {
		// TODO Auto-generated method stub
		return faqRepository.findAll();
	}

}
