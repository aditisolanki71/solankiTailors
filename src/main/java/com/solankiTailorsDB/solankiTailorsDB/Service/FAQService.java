package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.solankiTailorsDB.solankiTailorsDB.Model.FAQModel;

public interface FAQService {
	FAQModel addFAQ(FAQModel faq);
	List<FAQModel> getAllFAQ();
}
