package com.esame.Nuvolosita.Database;
/*
 * import java.io.BufferedReader; import java.io.IOException; import
 * java.io.InputStream; import java.io.InputStreamReader; import java.net.URI;
 * import java.net.URL; import java.net.URLConnection; import
 * java.nio.file.Files; import java.nio.file.Paths; import
 * java.nio.file.StandardCopyOption; import java.util.ArrayList;
 * 
 * import org.json.simple.JSONArray; import org.json.simple.JSONObject; import
 * org.json.simple.JSONValue; import org.json.simple.parser.ParseException;
 * 
 * import com.esame.Nuvolosita.Model.Metadata; import
 * com.esame.Nuvolosita.Model.Record; //import com.esame.service.csvParser;
 * 
 * public class DatabaseClass { private static ArrayList<Record> records = new
 * ArrayList<Record>(); private static ArrayList<Metadata> metadata = new
 * ArrayList<Metadata>();
 * 
 * public static ArrayList<Metadata> getMetadata(){ return metadata; }
 * 
 * 
 * 
 * public static ArrayList<Record> getRecord(){ records.add(new
 * Record("coordLan","Coordinate Latitudine","Float")); records.add(new
 * Metadata("coordLon","Coordinate Longitudine","Float")); records.add(new
 * Metadata("weatherID","Weather ID","Integer")); metadata.add(new
 * Metadata("weatherMain","Weather Main","String")); metadata.add(new
 * Metadata("weatherDescription","Weather Description","String"));
 * metadata.add(new Metadata("weatherIcon","Weather Icon","String"));
 * metadata.add(new Metadata("base","Base","String")); metadata.add(new
 * Metadata("mainTemp","Main Temperature","Integer")); metadata.add(new
 * Metadata("mainFeels_like","Main Feels Like","Float")); metadata.add(new
 * Metadata("mainPressure","Main Pressure","Float")); metadata.add(new
 * Metadata("mainHumidity","Main Humidity","Float")); metadata.add(new
 * Metadata("mainTempMax","Main Temperature Max","Float")); metadata.add(new
 * Metadata("mainTempMin","Main Temperature Min","Float")); metadata.add(new
 * Metadata("mainSeaLevel","Main Sea Level","Float")); metadata.add(new
 * Metadata("mainGrdLevel","Main Ground Level","Float")); metadata.add(new
 * Metadata("windSpeed","Wind Speed","Float")); metadata.add(new
 * Metadata("windDeg","Wind direction, degrees","Float")); metadata.add(new
 * Metadata("windGust","Wind gust.","Float")); metadata.add(new
 * Metadata("cloudsAll","","Float")); metadata.add(new
 * Metadata("rain1H","Rain volume for the last 1 hour, mm","Float"));
 * metadata.add(new
 * Metadata("rain3H","Rain volume for the last 3 hour, mm","Float"));
 * metadata.add(new
 * Metadata("snow1H","Snow volume for the last 1 hour, mm","Float"));
 * metadata.add(new
 * Metadata("snow3H","Snow volume for the last 3 hour, mm","Float"));
 * metadata.add(new Metadata("sysType","Internal parameter","Float"));
 * metadata.add(new Metadata("sysID","Internal parameter","Float"));
 * metadata.add(new Metadata("sysMessage","Internal parameter","Float"));
 * metadata.add(new Metadata("sysCountry","Country code ","String"));
 * metadata.add(new Metadata("sysSunrise","Sunrise time,","Float"));
 * metadata.add(new Metadata("sysSunset","Sunset time,","Float"));
 * metadata.add(new Metadata("timezone","Shift in seconds from UTC","Float"));
 * metadata.add(new Metadata("ID","City ID","Float")); metadata.add(new
 * Metadata("name","City name","String")); metadata.add(new
 * Metadata("cod","Internal parameter","Float")); return metadata;
 * 
 * } public static void downloadCsv(String url) {
 * 
 * try {
 * 
 * URLConnection openConnection = new URL(url).openConnection();
 * openConnection.addRequestProperty("User-Agent",
 * "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
 * InputStream in = openConnection.getInputStream();
 * 
 * String data = ""; String line = ""; try { InputStreamReader inR = new
 * InputStreamReader( in ); BufferedReader buf = new BufferedReader( inR );
 * 
 * while ( ( line = buf.readLine() ) != null ) { data+= line; } } catch
 * (IOException e) { System.out.println(e.getClass().getCanonicalName()
 * +"Errore in com.example.demo.service.DatabaseClass.java: Operazione di I/O interrotte"
 * ); } finally { in.close(); }
 * 
 * JSONObject obj = (JSONObject) JSONValue.parseWithException(data); JSONObject
 * objI = (JSONObject) (obj.get("result")); JSONArray objA = (JSONArray)
 * (objI.get("resources"));
 * 
 * for(Object o: objA){ if ( o instanceof JSONObject ) { JSONObject o1 =
 * (JSONObject)o; String name = (String)o1.get("name"); String urlD =
 * (String)o1.get("url"); if(name.equals("Dati anno 2016")) { convert(urlD,
 * "configFile/datacenter.csv"); } } }
 * 
 * } catch(ParseException e) {
 * System.out.println(e.getClass().getCanonicalName()
 * +": Errore in in com.example.demo.service.DatabaseClass.java: " +
 * "Errore nel parsing String - JsonObject"); } catch (IOException e) {
 * System.out.println(e.getClass().getCanonicalName()
 * +": Errore in in com.example.demo.service.DatabaseClass.java: " +
 * "Controlla la validitÃ  dell URL o Verifica la tua connessione internet"); }
 * }
 * 
 * public static void convert(String url,String fileName) throws IOException {
 * InputStream in = URI.create(url).toURL().openStream(); { Files.copy(in,
 * Paths.get(fileName), StandardCopyOption.REPLACE_EXISTING); records =
 * csvParser.create("configFile/datacenter.csv"); } } }
 */
