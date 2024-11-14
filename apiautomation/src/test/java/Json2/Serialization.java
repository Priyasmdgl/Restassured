package Json2;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {

    public static void main(String[] args) throws JsonProcessingException {
        // Create Json object
        Json json = new Json();
        
        // Create menu items
        menuitem one = new menuitem();
        one.setValue("New");
        one.setOnclick("CreateDoc()");

        menuitem two = new menuitem();
        two.setValue("Open");
        two.setOnclick("OpenDoc()");

        menuitem three = new menuitem();
        three.setValue("Save");
        three.setOnclick("SaveDoc()");

        // Add menu items to a list
        List<menuitem> menuitems = new ArrayList<>();
        menuitems.add(one);
        menuitems.add(two);
        menuitems.add(three);

        // Create popup and set menu items (directly set menuitems)
        popup popup = new popup();
        popup.setMenuitem(menuitems); // Directly set menuitems here

        // Create the menu object and set its values
        menu Menu = new menu();
        Menu.setId("file");
        Menu.setValue("File");

        // Add popup to the menu (popup is not a list, just a single object)
        List<popup> popups = new ArrayList<>();
        popups.add(popup);
        Menu.setPopup(popups); // Set the popup to contain the list of menuitems

        // Add the menu to the Json object
        List<menu> menus = new ArrayList<>();
        menus.add(Menu);
        json.setMenu(menus);

        // Serialize to JSON
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(json);

        // Print the serialized JSON string
        System.out.println(jsonString);
    }
}

