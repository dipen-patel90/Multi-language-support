package com.multi.languages.suppport.activity;

import java.util.Locale;

import com.multi.languages.suppport.preference.AppPreference;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * @author dipenp
 *
 */
public class BaseActivity extends Activity {

	//Locale constants
	public static final String ENGLISH_LOCALE = "en";
	public static final String HINDI_LOCALE = "hi";
	public static final String MARATHI_LOCALE = "ma";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*
		 * Setting locale on launch of activity, Setting it on BaseActivity so that if we dont have to set on every single activity.
		 * We can extend any activity with BaseActivity activity and this method will be called for that activity.
		 *  
		 * */
		setLocale(BaseActivity.this, AppPreference.getAppLanguage(BaseActivity.this));
	}

	
	/**
	 * Set application locale
	 * @param context
	 * @param locale
	 */
	public static void setLocale(Context context, String locale) {
		Locale myLocale = new Locale(locale);
		Resources res = context.getResources();
		DisplayMetrics dm = res.getDisplayMetrics();
		Configuration conf = res.getConfiguration();
		conf.locale = myLocale;
		res.updateConfiguration(conf, dm);
	}
}
