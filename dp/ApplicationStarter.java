package com.xwork.dp;

import com.xwork.dp.dao.ApplicationDAO;
import com.xwork.dp.dto.ApplicationDTO;
import com.xwork.dp.dto.FacebookApplicationDTO;
import com.xwork.dp.dto.InstagramApplicationDTO;

public class ApplicationStarter {
public static void main(String[] monday) {
	ApplicationDTO dtos=new ApplicationDTO("Watsapp", "2.19.134", "Watsapp.Inc", "Jan Koum");
	ApplicationDTO dtos1=new ApplicationDTO("SnapChat", "2.19.134", "SnapChat.Inc", "Evan Spiegel");
	
	ApplicationDAO daos=new ApplicationDAO();
			daos.add(dtos);
			daos.display();
			daos.getAppDTOByName("Watsapp");
			
			FacebookApplicationDTO fbdtos=new FacebookApplicationDTO("Mark.z berg", "California");
		InstagramApplicationDTO instadtos=new InstagramApplicationDTO(856956L, "London");
		
		ApplicationDAO daos1=new ApplicationDAO();
		daos1.saveFb(fbdtos);//for
		daos1.displayFb();
		
		ApplicationDAO daos2=new ApplicationDAO();	
		daos2.saveInsta(instadtos);	
		daos2.displayInsta();
			
			
			
			
			
			
}
}
