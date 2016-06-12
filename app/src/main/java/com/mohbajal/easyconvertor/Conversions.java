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
		if(kmph.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(kmph) * 0.621371);
		return df.format(f);
	}

	//
	public static String mpgToKmpl(String mpg) {
		if(mpg.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(mpg) * 0.425);
		return df.format(f);
	}

	public static String kmplToMpg(String kmpl) {
		if(kmpl.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(kmpl) * 2.352);
		return df.format(f);
	}

	//
	public static String milesToKm(String miles) {
		if(miles.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(miles) / 0.62137);
		return df.format(f);
	}

	public static String kmtoMiles(String km) {
		if(km.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(km) * 0.62137);
		return df.format(f);
	}

	//
	public static String poundsToKg(String pounds, String ounces) {
		if(pounds.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(pounds) * 0.453592);
        if(!"0".equalsIgnoreCase(ounces)) {
            f += Float.parseFloat(ounces)*0.0283495;
        }
		return df.format(f);
	}

	public static String kgToPounds(String kgs) {
		if(kgs.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(kgs) / 0.453592);
		return df.format(f);
	}

	//
	public static String literToGallon(String liter) {
		if(liter.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(liter) * 0.264172);
		return df.format(f);
	}

	public static String gallonToLiter(String gallon) {
		if(gallon.equalsIgnoreCase("")) return "";
		float f = (float) (Float.parseFloat(gallon) * 3.78541);
		return df.format(f);

	}
	// C x 9/5 + 32 = F
	public static String celsiusToFahrenheit(String celsius) {
		if(celsius.equalsIgnoreCase("")) return "";
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
