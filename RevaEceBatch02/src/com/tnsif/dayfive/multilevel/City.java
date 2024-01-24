package com.tnsif.dayfive.multilevel;

public class City extends State {
	private String cityName;
	private float area;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", StateName=" + getStateName() + ", Language= "
				+ getLanguage() + ", CountryName=" + getCountryName() + ", Capital=" + getCapital() + "]";
	}

}