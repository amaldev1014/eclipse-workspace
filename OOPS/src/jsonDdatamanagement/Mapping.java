package jsonDdatamanagement;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Mapping {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Inventory pulse = new Inventory();
		pulse.name = "pulse";
		pulse.price = 42.60;
		pulse.weight = 65;
		File file = new File("inventoryDetails.json");
		file.createNewFile();
		if(file.exists()) 
		{
			System.out.println("file  created");
		}
		else 
		{
			System.out.println("not created");
		}

		ObjectMapper map = new ObjectMapper();
		Inventory invent = null;
		
		try {
			invent =  map.readValue(new File("/home/admin1/eclipse-workspace/O/inventoryDetails.json"), Inventory.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(invent.getName());
		
		String me = map.writeValueAsString("inventoryDetails.json");
	}

}
