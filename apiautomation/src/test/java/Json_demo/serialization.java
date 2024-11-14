package Json_demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class serialization {

	public static void main(String[] args) throws IOException {
		parent json = new parent();
		json.setId(0001);
		json.setType("donut");
		json.setName("Cake");
		json.setPpu(0.55);
		
		batter first = new batter();
		first.setId(1001);
		first.setType("Regular");
		
		batter second = new batter();
		second.setId(1002);
		second.setType("Chocolate");
		
		
		List<batter> batter = new ArrayList<batter>();
		batter.add(first);
		batter.add(second);
		
		batters allbatter = new batters();
		allbatter.setBatter(batter);
		json.setbatters(allbatter);
		
		topping one = new topping();
		one.setId(5001);
		one.setType("Sugar");
		
		topping two = new topping();
		two.setId(5002);
		two.setType("Maple");
		
		List<topping> toppings = new ArrayList<topping>();
		toppings.add(one);
		toppings.add(two);
		json.setToppings(toppings);
		
		ObjectMapper mapper = new ObjectMapper();
		String Json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
		System.out.println(Json);
		
		File json2 = new File("JSON2");
		mapper.writerWithDefaultPrettyPrinter().writeValue(json2,json);
	}

}
