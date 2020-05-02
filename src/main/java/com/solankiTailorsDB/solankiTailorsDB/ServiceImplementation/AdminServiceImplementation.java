package com.solankiTailorsDB.solankiTailorsDB.ServiceImplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solankiTailorsDB.solankiTailorsDB.Model.AdminModel;
import com.solankiTailorsDB.solankiTailorsDB.Repository.AdminRepository;
import com.solankiTailorsDB.solankiTailorsDB.Service.AdminService;
@Service
public class AdminServiceImplementation implements AdminService {

	@Autowired
	AdminRepository adminrepository;
	
	@Override
	public AdminModel addAdmin(AdminModel admin) {
		// TODO Auto-generated method stub
		return adminrepository.save(admin);
	}

	@Override
	public List<AdminModel> getAllAdmin() {
		// TODO Auto-generated method stub
		return adminrepository.findAll();
	}

	@Override
	public AdminModel updateAdmin(AdminModel admin) {
		// TODO Auto-generated method stub
		return adminrepository.save(admin);
	}

	@Override
	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub
		adminrepository.deleteById(id);
	}

	@Override
	public AdminModel getAdminById(int id) {
		// TODO Auto-generated method stub
		 Optional<AdminModel> g=adminrepository.findById(id);
		 return g.get();
	}

	@Override
	public void deleteAllAdmin() {
		// TODO Auto-generated method stub
		adminrepository.deleteAll();
	}

}
