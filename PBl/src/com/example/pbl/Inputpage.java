package com.example.pbl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Inputpage extends Activity {

	EditText et1;
	Button bt2;
	String s;
	int n;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inputpage);
		Intent i=getIntent();
		et1=(EditText) findViewById(R.id.et1);
		bt2= (Button) findViewById(R.id.bt2);
		bt2.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				
				s=et1.getText().toString();		
				
				if(s.equalsIgnoreCase("2"))
				{
				Intent c=new Intent(Inputpage.this,Page21.class);
				startActivity(c);
				}
				else if(s.equalsIgnoreCase("3"))
				{
					Intent c=new Intent(Inputpage.this,Page31.class);
					startActivity(c);
				}
				else 
				{
					onDestroy();
				}
				
			}

			
		});
	}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inputpage, menu);
		return true;
	}

}
