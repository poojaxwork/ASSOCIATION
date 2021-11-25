package com.xwork.DAO;

import com.xwork.DTO.BusRouteDTO;

public interface BusRouteDAO {
	void dispaly();

	boolean delete(int index);

	int update(int index, BusRouteDTO name);

	void save(BusRouteDTO bus);
}
