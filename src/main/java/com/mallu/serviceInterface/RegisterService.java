package com.mallu.serviceInterface;

import java.util.List;

import com.mallu.entity.Form;
import com.mallu.entity.RegisterEntity;

import jakarta.servlet.http.HttpSession;

public interface RegisterService {

	Integer saveUser(RegisterEntity entity);

	String loginUser(String email, String password, HttpSession session);

	boolean isCodeAvailable(String useremail);

	boolean checkUser(String email);

	String forgotPassword(String userEmail, String userPassword);

	List<RegisterEntity> data();

	void deleteUser(Integer id);

	List<Form> getAllBookings();

	void deleteUserBookingByAdmin(Integer id);

}
