package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	public void create();
	public ArrayList<AdminBean> findAll();
	public ArrayList<AdminBean> findBy();
	public AdminService findByname();
	public int count();
	public boolean exist();
	public void update();
	public void delete();

}
