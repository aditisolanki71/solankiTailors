package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;
import java.util.Optional;

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

	@Override
	public FAQModel updateById(int id,FAQModel faq) {
		// TODO Auto-generated method stub
		faq.setId(id);
		Optional<FAQModel> oldFaq = faqRepository.findById(id);
		FAQModel temp = oldFaq.get();
		temp.setDate(faq.getDate() == null ? temp.getDate() : faq.getDate());
		temp.setAnswer(faq.getAnswer() == null ? temp.getAnswer() : faq.getAnswer());
		temp.setQuestion(faq.getAnswer() == null ? temp.getQuestion() : faq.getQuestion());
		return faqRepository.save(temp);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		faqRepository.deleteById(id);
	}

	@Override
	public FAQModel getFAQById(int id) {
		// TODO Auto-generated method stub
		Optional<FAQModel> g = faqRepository.findById(id);
		return g.get();
	}

}
