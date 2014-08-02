package com.multi.languages.suppport.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.multi.languages.suppport.R;
import com.multi.languages.suppport.preference.AppPreference;

/**
 * @author dipenp
 *
 */
public class LauncherActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_launcher);

		Toast.makeText(LauncherActivity.this, getString(R.string.dafault_language_message), Toast.LENGTH_LONG).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launcher, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		int id = item.getItemId();
		
		switch (id) {
		case R.id.english_menu:
			
			AppPreference.setAppLanguage(ENGLISH_LOCALE, LauncherActivity.this);
			launchActicity();
			break;
			
		case R.id.hindi_menu:
			
			AppPreference.setAppLanguage(HINDI_LOCALE, LauncherActivity.this);
			launchActicity();
			break;
			
		case R.id.marathi_menu:
			
			AppPreference.setAppLanguage(MARATHI_LOCALE, LauncherActivity.this);
			launchActicity();
			break;
		
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	/**
	 * Launching same activity
	 */
	void launchActicity(){
		Intent intent = new Intent(LauncherActivity.this, LauncherActivity.class);
		//Clearing previous activity
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
	}
	
	
}
