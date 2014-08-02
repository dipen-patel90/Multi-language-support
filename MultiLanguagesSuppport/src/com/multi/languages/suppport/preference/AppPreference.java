package com.multi.languages.suppport.preference;

import com.multi.languages.suppport.activity.BaseActivity;

import android.content.Context;

/**
 * @author dipenp
 * 
 * Preference setting class, Here we will maitain all the preference values
 */
public class AppPreference extends PreferenceSetting {

	//Preference for app language
	private static final String APP_LANGUAGE = "APP_LANGUAGE";

	
	/**
	 * Set app language
	 * @param appLanguage
	 * @param _context
	 */
	public static void setAppLanguage(String appLanguage, Context _context) {
		setString(APP_LANGUAGE, appLanguage, _context);
	}

	
	/**
	 * @param _context
	 * @return return app language locale value, if we haven't set it yet, it will return default english(BaseActivity.ENGLISH_LOCALE) locale value  
	 */
	public static String getAppLanguage(Context _context) {
		return getString(APP_LANGUAGE, BaseActivity.ENGLISH_LOCALE, _context);
	}
}
