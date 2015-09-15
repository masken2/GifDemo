package com.ty.gifdemo;

import com.ant.liao.GifView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		GifView mGifView = (GifView) findViewById(R.id.gif);
		mGifView.setGifImage(R.drawable.movie);
	}



}
