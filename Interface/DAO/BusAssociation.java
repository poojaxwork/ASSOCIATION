package com.xwork.DAO;

import com.xwork.DTO.BusRouteDTO;

public class BusAssociation {

	BusRouteDAO busdao;

	BusAssociation() {

	}

	public BusAssociation(BusRouteDAO busdao) {

		this.busdao = busdao;

	}

	public void dispaly() {

		busdao.dispaly();

	}

	public void save(BusRouteDTO dto) {

		busdao.save(dto);
	}

	public boolean delete(int index) {

		if (index >= 0) {
			busdao.delete(index);
			return true;
		}
		return false;
	}

	public void update(int index, BusRouteDTO name) {

		busdao.update(index, name);

	}

}
