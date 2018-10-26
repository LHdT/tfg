package es.upo.lhidde.tfg.services.impl;

import org.springframework.stereotype.Service;

import es.upo.lhidde.tfg.services.MainMenuService;

@Service("MainMenuService")
public class MainMenuServiceImpl implements MainMenuService {

	@Override
	public String getMenuItems() {
		return "{ \"menuItems\" : [{"+
	                "\"title\": \"Home\","+
	                "\"url\": \"landing\","+
	                "\"children\": null"+
                "},"+
	            "{"+
	                "\"title\": \"Shortcuts\","+
	                "\"url\": \"\","+
	                "\"children\": null"+
	            "},"+
	            "{"+
	                "\"title\": \"Overview\","+
	                "\"url\": \"\","+
	                "\"children\": null"+
	            "},"+
	            "{"+
	                "\"title\": \"Events\","+
	                "\"url\": \"\","+
	                "\"children\": null"+
	            "},"+
	            "{"+
	                "\"title\": \"About\","+
	                "\"url\": \"\","+
	                "\"children\": null"+
	            "},"+
	            "{"+
	                "\"title\": \"Services\","+
	                "\"url\": \"\","+
	                "\"children\": ["+
	                    "{"+
	                       "\"title\": \"services child\","+
	                       "\"url\": \"\","+
	                       "\"children\": null"+
	                    "}"+
	                "]"+
	            "},"+
	            "{"+
	                "\"title\": \"Contact\","+
	                "\"url\": \"\","+
	                "\"children\": null"+
	            "}]"+
    	"}";
	}

}
