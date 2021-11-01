package com.xwork.dp;

import com.xwork.dp.constants.Genre;
import com.xwork.dp.dao.WebSeriesDAO;
import com.xwork.dp.dto.WebSeriesDTO;

public class WebSeriesStarter {

	public static void main(String[] args) {
		WebSeriesDTO dto=new WebSeriesDTO("GOT", "Emily", 1000, 7, 7, Genre.ACTION, 7.8f);
		WebSeriesDTO dto1=new WebSeriesDTO("Money Heist", "Emily", 1000, 7, 7, Genre.ACTION, 7.8f);
		WebSeriesDTO dto2=new WebSeriesDTO("Vamper diaries", "Emily", 1000, 7, 7, Genre.ACTION, 7.8f);
		WebSeriesDTO dto3=new WebSeriesDTO("Dark", "Emily", 1000, 7, 7, Genre.ACTION, 7.8f);
		WebSeriesDAO dao=new WebSeriesDAO();
		dao.save(dto);

	}

}
