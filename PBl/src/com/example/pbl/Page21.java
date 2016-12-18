package com.example.pbl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class Page21 extends Activity {

	CheckBox cb1;
	CheckBox cb2;
	Button bt3;
	int c,n;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page21);
		Intent i=getIntent();
		cb1=(CheckBox) findViewById(R.id.checkBox1);
		cb2=(CheckBox) findViewById(R.id.checkBox2);
		bt3=(Button) findViewById(R.id.button1);
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Bundle bb=new Bundle();
				if(cb1.isChecked())
				{
					c=1;
				}
				else if(cb2.isChecked())
				{
					c=2;
				}
				bb.putInt("accept",c);
				Intent ii=new Intent(Page21.this,Page22.class);
				ii.putExtras(bb);
				startActivity(ii);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page21, menu);
		return true;
	}

}
