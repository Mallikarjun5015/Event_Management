package com.mallu.serviceInterface;

import java.util.List;

import com.mallu.entity.EventsEntity;
import com.mallu.entity.Form;

public interface EventServiceInterface {

	// public String loadEvent(String eventCategory);
	public EventsEntity loadEventData(String eventCategory);

	public List<Form> getUserEvents(String email);

	public void deleteUserBooking(Integer id);

}
