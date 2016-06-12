package com.mohbajal.easyconvertor;

import java.text.DecimalFormat;

public class Conversions {

	private static final DecimalFormat df = new DecimalFormat("#.###");

	public static String mphToKmph(String mph) {
		if(mph.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(mph) * 1.60934);
		return df.format(f);
	}

	public static String kmphToMph(String kmph) {
		float f = (float) (Float.parseFloat(kmph) * 0.621371);
		return df.format(f);
	}

	//
	public static String mpgToKmpl(String mpg) {
		float f = (float) (Float.parseFloat(mpg) * 0.425);
		return df.format(f);
	}

	public static String kmplToMpg(String kmpl) {
		float f = (float) (Float.parseFloat(kmpl) * 2.352);
		return df.format(f);
	}

	//
	public static String milesToKm(String miles) {
		float f = (float) (Float.parseFloat(miles) / 0.62137);
		return df.format(f);
	}

	public static String kmtoMiles(String km) {
		float f = (float) (Float.parseFloat(km) * 0.62137);
		return df.format(f);
	}

	//
	public static String poundsToKg(String pounds) {
		float f = (float) (Float.parseFloat(pounds) * 0.453592);
		return df.format(f);
	}

	public static String kgToPounds(String kgs) {
		float f = (float) (Float.parseFloat(kgs) / 0.453592);
		return df.format(f);
	}

	//
	public static String literToGallon(String liter) {
		float f = (float) (Float.parseFloat(liter) * 0.264172);
		return df.format(f);
	}

	public static String gallonToLiter(String gallon) {		
		float f = (float) (Float.parseFloat(gallon) * 3.78541);
		return df.format(f);

	}

	// C x 9/5 + 32 = F
	public static String celsiusToFahrenheit(String celsius) {
		float f = (Float.parseFloat(celsius) * 9 / 5 + 32);
		return df.format(f);
	}

	// (F-32) x 5/9
	public static String fahrenheitToCelsius(String fahrenheit) {
		if(fahrenheit.equalsIgnoreCase(""))	return "";
		float f = (Float.parseFloat(fahrenheit) - 32) * 5 / 9;
		return df.format(f);
	}
}
