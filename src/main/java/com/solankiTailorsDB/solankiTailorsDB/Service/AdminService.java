package com.solankiTailorsDB.solankiTailorsDB.Service;

import java.util.List;

import com.solankiTailorsDB.solankiTailorsDB.Model.AdminModel;

public interface AdminService {
	AdminModel addAdmin(AdminModel admin);
	List<AdminModel> getAllAdmin();
	AdminModel updateAdmin(AdminModel admin);
	void deleteAdmin(int id);
	AdminModel getAdminById(int id);
}
