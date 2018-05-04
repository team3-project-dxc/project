package com.dxc.msf.dao;

import java.util.List;

import com.dxc.msf.model.UserDTO;

public interface UserDAO {
//	public boolean createUser(UserDTO user);
//	
//	public boolean updateUser(UserDTO user);
//	public boolean deleteUser(UserDTO user);
	
	public void saveOrUpdate(UserDTO user);
	public List<UserDTO> getListUser();
}
