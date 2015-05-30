package com.nullcognition.sodiumfrpexamples;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.nullcognition.sodiumfrpexamples.databinding.ActivityMainBinding;
import com.nullcognition.sodiumfrpexamples.model.User;
//import com.nullcognition.sodiumfrpexamples.sodium.*;


public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
		User user = new User("Test", "User");
		binding.setUser(user);




	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		int id = item.getItemId();
		if(id == R.id.action_settings){
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
