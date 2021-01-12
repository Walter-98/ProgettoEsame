package com.esame.Nuvolosita.Model;

public class Record {

	protected float coordLat;
	protected float coordLon;
	protected int weatherID;
	protected String weatherMain;
	protected String weatherDescription;
	protected String weatherIcon;
	protected String base;
	protected float mainTemp;
	protected float mainFeels_like;
	protected float mainPressure;
	protected float mainHumidity;
	protected float mainTempMax;
	protected float mainTempMin;
	protected float mainSeaLevel;
	protected float maingrdLevel;
	protected float windSpeed;
	protected float windDeg;
	protected float windGust;
	protected float cloudsAll;
	protected float rain1H;
	protected float rain3H;
	protected float snow1H;
	protected float snow3H;
	protected float sysType;
	protected float systID;
	protected float sysMessage;
	protected float sysSunrise;
	protected float sysSunset;
	protected String sysCountry;
	protected float timezone;
	protected float ID;
	protected String name;
	protected float cod;
	public Record(float coordLat, float coordLon, int weatherID, String weatherMain, String weatherDescription,
			String weatherIcon, String base, float mainTemp, float mainFeels_like, float mainPressure,
			float mainHumidity, float mainTempMax, float mainTempMin, float mainSeaLevel, float maingrdLevel,
			float windSpeed, float windDeg, float windGust, float cloudsAll, float rain1h, float rain3h, float snow1h,
			float snow3h, float sysType, float systID, float sysMessage, float sysSunrise, float sysSunset,
			String sysCountry, float timezone, float iD, String name, float cod) {
		this.coordLat = coordLat;
		this.coordLon = coordLon;
		this.weatherID = weatherID;
		this.weatherMain = weatherMain;
		this.weatherDescription = weatherDescription;
		this.weatherIcon = weatherIcon;
		this.base = base;
		this.mainTemp = mainTemp;
		this.mainFeels_like = mainFeels_like;
		this.mainPressure = mainPressure;
		this.mainHumidity = mainHumidity;
		this.mainTempMax = mainTempMax;
		this.mainTempMin = mainTempMin;
		this.mainSeaLevel = mainSeaLevel;
		this.maingrdLevel = maingrdLevel;
		this.windSpeed = windSpeed;
		this.windDeg = windDeg;
		this.windGust = windGust;
		this.cloudsAll = cloudsAll;
		rain1H = rain1h;
		rain3H = rain3h;
		snow1H = snow1h;
		snow3H = snow3h;
		this.sysType = sysType;
		this.systID = systID;
		this.sysMessage = sysMessage;
		this.sysSunrise = sysSunrise;
		this.sysSunset = sysSunset;
		this.sysCountry = sysCountry;
		this.timezone = timezone;
		ID = iD;
		this.name = name;
		this.cod = cod;
	}
	public float getTimezone() {
		return timezone;
	}
	public void setTimezone(float timezone) {
		this.timezone = timezone;
	}
	public float getID() {
		return ID;
	}
	public void setID(float iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCod() {
		return cod;
	}
	public void setCod(float cod) {
		this.cod = cod;
	}

	public float getCoordLat() {
		return coordLat;
	}
	public void setCoordLat(float coordLat) {
		this.coordLat = coordLat;
	}
	public float getCoordLon() {
		return coordLon;
	}
	public void setCoordLon(float coordLon) {
		this.coordLon = coordLon;
	}
	public int getWeatherID() {
		return weatherID;
	}
	public void setWeatherID(int weatherID) {
		this.weatherID = weatherID;
	}
	public String getWeatherMain() {
		return weatherMain;
	}
	public void setWeatherMain(String weatherMain) {
		this.weatherMain = weatherMain;
	}
	public String getWeatherDescription() {
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}
	public String getWeatherIcon() {
		return weatherIcon;
	}
	public void setWeatherIcon(String weatherIcon) {
		this.weatherIcon = weatherIcon;
	}
	public float getMainTemp() {
		return mainTemp;
	}
	public void setMainTemp(float mainTemp) {
		this.mainTemp = mainTemp;
	}
	public float getMainFeels_like() {
		return mainFeels_like;
	}
	public void setMainFeels_like(float mainFeels_like) {
		this.mainFeels_like = mainFeels_like;
	}
	public float getMainPressure() {
		return mainPressure;
	}
	public void setMainPressure(float mainPressure) {
		this.mainPressure = mainPressure;
	}
	public float getMainHumidity() {
		return mainHumidity;
	}
	public void setMainHumidity(float mainHumidity) {
		this.mainHumidity = mainHumidity;
	}
	public float getMainTempMax() {
		return mainTempMax;
	}
	public void setMainTempMax(float mainTempMax) {
		this.mainTempMax = mainTempMax;
	}
	public float getMainTempMin() {
		return mainTempMin;
	}
	public void setMainTempMin(float mainTempMin) {
		this.mainTempMin = mainTempMin;
	}
	public float getMainSeaLevel() {
		return mainSeaLevel;
	}
	public void setMainSeaLevel(float mainSeaLevel) {
		this.mainSeaLevel = mainSeaLevel;
	}
	public float getMaingrdLevel() {
		return maingrdLevel;
	}
	public void setMaingrdLevel(float maingrdLevel) {
		this.maingrdLevel = maingrdLevel;
	}
	public float getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}
	public float getWindDeg() {
		return windDeg;
	}
	public void setWindDeg(float windDeg) {
		this.windDeg = windDeg;
	}
	public float getWindGust() {
		return windGust;
	}
	public void setWindGust(float windGust) {
		this.windGust = windGust;
	}
	public float getCloudsAll() {
		return cloudsAll;
	}
	public void setCloudsAll(float cloudsAll) {
		this.cloudsAll = cloudsAll;
	}
	public float getRain1H() {
		return rain1H;
	}
	public void setRain1H(float rain1h) {
		rain1H = rain1h;
	}
	public float getRain3H() {
		return rain3H;
	}
	public void setRain3H(float rain3h) {
		rain3H = rain3h;
	}
	public float getSnow1H() {
		return snow1H;
	}
	public void setSnow1H(float snow1h) {
		snow1H = snow1h;
	}
	public float getSnow3H() {
		return snow3H;
	}
	public void setSnow3H(float snow3h) {
		snow3H = snow3h;
	}
	public float getSysType() {
		return sysType;
	}
	public void setSysType(float sysType) {
		this.sysType = sysType;
	}
	public float getSystID() {
		return systID;
	}
	public void setSystID(float systID) {
		this.systID = systID;
	}
	public float getSysMessage() {
		return sysMessage;
	}
	public void setSysMessage(float sysMessage) {
		this.sysMessage = sysMessage;
	}
	public float getSysSunrise() {
		return sysSunrise;
	}
	public void setSysSunrise(float sysSunrise) {
		this.sysSunrise = sysSunrise;
	}
	public float getSysSunset() {
		return sysSunset;
	}
	public void setSysSunset(float sysSunset) {
		this.sysSunset = sysSunset;
	}
	public String getSysCountry() {
		return sysCountry;
	}
	public void setSysCountry(String sysCountry) {
		this.sysCountry = sysCountry;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	@Override
	public String toString() {
		return "Record [coordLat=" + coordLat + ", coordLon=" + coordLon + ", weatherID=" + weatherID + ", weatherMain="
				+ weatherMain + ", weatherDescription=" + weatherDescription + ", weatherIcon=" + weatherIcon
				+ ", base=" + base + ", mainTemp=" + mainTemp + ", mainFeels_like=" + mainFeels_like + ", mainPressure="
				+ mainPressure + ", mainHumidity=" + mainHumidity + ", mainTempMax=" + mainTempMax + ", mainTempMin="
				+ mainTempMin + ", mainSeaLevel=" + mainSeaLevel + ", maingrdLevel=" + maingrdLevel + ", windSpeed="
				+ windSpeed + ", windDeg=" + windDeg + ", windGust=" + windGust + ", cloudsAll=" + cloudsAll
				+ ", rain1H=" + rain1H + ", rain3H=" + rain3H + ", snow1H=" + snow1H + ", snow3H=" + snow3H
				+ ", sysType=" + sysType + ", systID=" + systID + ", sysMessage=" + sysMessage + ", sysSunrise="
				+ sysSunrise + ", sysSunset=" + sysSunset + ", sysCountry=" + sysCountry + ", timezone=" + timezone
				+ ", ID=" + ID + ", name=" + name + ", cod=" + cod + "]";
	}
	
}
