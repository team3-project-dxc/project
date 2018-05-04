package com.dxc.msf.service;

import java.util.List;

import com.dxc.msf.model.UserDTO;

public interface UserService {

//	public boolean createUser(UserDTO user);
//	
//	public boolean updateUser(UserDTO user);
//	public boolean deleteUser(UserDTO user);
	
	public void saveOrUpdate(UserDTO user);

	public List<UserDTO> getListUser();
}
