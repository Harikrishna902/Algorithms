package oops;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
public class Json 
{
public static <JSONArray> void main(String[] args) 
{
	Json Rice = new Json();
	Rice.put("name", "sharma Rice");
	Rice.put("weight", "30");
	Rice.put("price","1110");
	
	Json rice1= new Json();
	rice1.put("inventory", Rice);
	
	Json Pulses = new Json();
	Pulses.put("name", "red gram");
	Pulses.put("weight", "5");
	Pulses.put("price", "300");
	
	Json pulses1= new Json();
	pulses1.put("inventory", Pulses);
	
	Json Wheat = new Json();
	Wheat.put("name", "ATTA");
	Wheat.put("weight", "25");
	Wheat.put("price", "5000");
	
	Json wheat1 = new Json();
	wheat1.put("inventory", Wheat);
	
	JSONArray jArray = new JSONArray();
	jArray.add(rice1);
	jArray.add(pulses1);
	jArray.add(wheat1);
	
	try (FileWriter fWriter = new FileWriter("Inventory.json"))
	{
		fWriter.write(jArray.toString());
		fWriter.flush();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	JSONParser jsonParser = new JSONParser();
	
	
	
	try (FileReader fr = new FileReader("Inventory.json"))
	{
		Object object = jsonParser.parse(fr);	
		JSONArray  invntry = (JSONArray)object;
		System.out.println(invntry);
	
		invntry.forEach( emp -> parseData( (JSONObject) emp ) );
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
    }
	
}

private void put(String string, String string2) {
	// TODO Auto-generated method stub
	
}

private void put(String string, Json pulses) {
	// TODO Auto-generated method stub
}	


public static void parseData(Json inv) {
	Json inven = (Json)inv.get("inventory");
	String name = (String)inven.get("name");
	System.out.println(name);
	String weight = (String)inven.get("weight");
	System.out.println(weight);
	String price = (String)inven.get("price");
System.out.println(price);