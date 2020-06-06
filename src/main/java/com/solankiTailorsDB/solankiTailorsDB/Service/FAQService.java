package com.solankiTailorsDB.solankiTailorsDB.Service;

import org.springframework.web.bind.annotation.RequestBody;

import com.solankiTailorsDB.solankiTailorsDB.Model.FAQModel;

public interface FAQService {
	FAQModel addFAQ(FAQModel faq);
}
