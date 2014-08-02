package com.multi.languages.suppport.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * 
 * Base class for preference setting
 * @author dipenp
 *
 */
public class PreferenceSetting {

	private static final String PREFERENCES = "Preferences";

	static protected SharedPreferences getSharedPreferences(Context context) {

		return context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE);
	}

	public static String getString(String setting, String def, Context _context) {
		SharedPreferences settings = getSharedPreferences(_context);
		return settings.getString(setting, def);
	}

	public static void setString(String setting, String value, Context _context) {
		SharedPreferences settings = getSharedPreferences(_context);
		Editor edit = settings.edit();
		edit.putString(setting, value);
		edit.commit();
	}
}
