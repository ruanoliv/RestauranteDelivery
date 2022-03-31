package br.edu.ifce.service;

import java.util.List;

import br.edu.ifce.dao.AdminDAO;
import br.edu.ifce.model.Admin;

public class AdminService {
	private static AdminDAO adminDAO = new AdminDAO();
	public void addAdmin(Admin admin) {
		adminDAO.adicionar(admin);
	}
	public static Admin buscarAdminPorLogin(String login) {
		return adminDAO.buscarPorLogin(login);
	}
}
