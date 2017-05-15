
public class Painting {
String url,nameOfpainting,aristName,size,price,views,favorites,medium,paintingSurface,artistCountry,shipmentMode,artistRecognition,keywords,date,subject;

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getNameOfpainting() {
	return nameOfpainting;
}

public void setNameOfpainting(String nameOfpainting) {
	this.nameOfpainting = nameOfpainting;
}

public String getAristName() {
	return aristName;
}

public void setAristName(String aristName) {
	this.aristName = aristName;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getViews() {
	return views;
}

public void setViews(String views) {
	this.views = views;
}

public String getFavorites() {
	return favorites;
}

public void setFavorites(String favorites) {
	this.favorites = favorites;
}

public String getMedium() {
	return medium;
}

public void setMedium(String medium) {
	this.medium = medium;
}

public String getPaintingSurface() {
	return paintingSurface;
}

public void setPaintingSurface(String paintingSurface) {
	this.paintingSurface = paintingSurface;
}

public String getArtistCountry() {
	return artistCountry;
}

public void setArtistCountry(String artistCountry) {
	this.artistCountry = artistCountry;
}

public String getShipmentMode() {
	return shipmentMode;
}

public void setShipmentMode(String shipmentMode) {
	this.shipmentMode = shipmentMode;
}

public String getArtistRecognition() {
	return artistRecognition;
}

public void setArtistRecognition(String artistRecognition) {
	this.artistRecognition = artistRecognition;
}

public String getKeywords() {
	return keywords;
}

public void setKeywords(String keywords) {
	this.keywords = keywords;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

@Override
public String toString() {
	return "Painting [url=" + url + ", nameOfpainting=" + nameOfpainting + ", aristName=" + aristName + ", size=" + size
			+ ", price=" + price + ", views=" + views + ", favorites=" + favorites + ", medium=" + medium
			+ ", paintingSurface=" + paintingSurface + ", artistCountry=" + artistCountry + ", shipmentMode="
			+ shipmentMode + ", artistRecognition=" + artistRecognition + ", keywords=" + keywords + ", date=" + date
			+ ", subject=" + subject + "]";
}

}
