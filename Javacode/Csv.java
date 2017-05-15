import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.opencsv.CSVReader;

public class Csv {
	public static void main(String[] args) {
		try{

			String location="C:/UNC Charlotte/KBS/Project/backup/newdataset.csv";
			CSVReader reader = null;
			reader = new CSVReader(new FileReader(location));
            String[] line;
            ArrayList<Painting> paintingsList=new ArrayList<Painting>();
            Painting painting;
            SimpleDateFormat format=new SimpleDateFormat("yyyy.MM.dd");
            int count=0;
            
            while ((line = reader.readNext()) != null) {
            	count++;
                //System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
                painting=new Painting();
                painting.setUrl(line[0]);
                painting.setNameOfpainting(line[1]);
                painting.setAristName(line[2]);
                painting.setSize(line[3]);
                painting.setPrice(line[4]);
                painting.setViews(line[5]);
                painting.setFavorites(line[6]);
                painting.setMedium(line[7]);
                painting.setPaintingSurface(line[8]);
                painting.setArtistCountry(line[9]);
                painting.setShipmentMode(line[10]);
                painting.setArtistRecognition(line[11]);
                painting.setKeywords(line[12]);
                paintingsList.add(painting);
                }
            paintingsList.remove(0);
            
         for(Painting p:paintingsList){
            Document document=Jsoup.connect(p.getUrl().trim()).get();
            Elements eMETAs = document.select("META");
            for(Element temp:eMETAs){
               if(temp.attr("property").contains("pubDate")){
            	   p.setDate(temp.attr("content"));
               }
               if(temp.attr("property").contains("subject")){
            	   p.setSubject(temp.attr("content"));
               }
               if(temp.attr("property").contains("mediums")){
            	   p.setMedium(temp.attr("content"));
               }
               if(temp.attr("property").contains("materials")){
            	   p.setPaintingSurface(temp.attr("content"));
               }
               if(temp.attr("property").contains("artistCounrty")){
            	   p.setArtistCountry(temp.attr("content"));
               }
               if(temp.attr("property").contains("keywords")){
            	   p.setKeywords(temp.attr("content"));
               }
               
            }
           System.out.println("pub date ");
         }
         
            reader.close();
            String csvFile = "C:/UNC Charlotte/KBS/Project/backup/Koumudi.csv";
            FileWriter writer = new FileWriter(csvFile);
            CSVUtils.writeLine(writer, Arrays.asList("Url", "NameOfPainting", "ArtistName","Size","Price","Views","Favorites","Medium","PaintingSurface","ArtistCountry","ShipmentMode","ArtistRecognition","Keywords","Date","Subject"));
            
            	//System.out.println("size"+paintingsList.size());
            	
            for (Painting d : paintingsList) {
        

                List<String> list = new ArrayList<>();
                list.add("\""+d.getUrl().trim()+"\"");
                list.add("\""+d.getNameOfpainting().trim()+"\"");
                list.add("\""+d.getAristName().trim()+"\"");
                list.add("\""+d.getSize().trim()+"\"");
                list.add("\""+d.getPrice().trim()+"\"");
                list.add("\""+d.getViews().trim()+"\"");
                list.add("\""+d.getFavorites().trim()+"\"");
                list.add("\""+d.getMedium().trim()+"\"");
                list.add("\""+d.getPaintingSurface().trim()+"\"");
                list.add("\""+d.getArtistCountry().trim()+"\"");
                list.add("\""+d.getShipmentMode().trim()+"\"");
                list.add("\""+d.getArtistRecognition().trim()+"\"");
                list.add("\""+d.getKeywords().trim()+"\"");
                list.add("\""+format.format(new Date(Long.parseLong(d.getDate().trim())))+"\"");
                list.add("\""+d.getSubject().trim()+"\"");
                
           
                CSVUtils.writeLine(writer, list);
                
                

            }
            

            writer.flush();
            writer.close();
          
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage());
		}
		
	}
}
