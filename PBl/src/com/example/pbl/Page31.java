package com.example.pbl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class Page31 extends Activity {
    Button bt1;
    CheckBox cb1,cb2,cb3;
    int c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page31);
		Intent i=getIntent();
		bt1=(Button) findViewById(R.id.button1);
		cb1=(CheckBox) findViewById(R.id.checkBox1);
		cb2=(CheckBox) findViewById(R.id.checkBox2);
		cb3=(CheckBox) findViewById(R.id.checkBox3);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(cb1.isChecked())
				{
					c=1;
				}
				else if(cb2.isChecked())
				{
					c=2;
				}
				else if(cb3.isChecked())
				{
					c=3;
				}
				Bundle b=new Bundle();
				b.putInt("accept",c);
				Intent ii=new Intent(Page31.this,Page32.class);
				ii.putExtras(b);
				startActivity(ii);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page31, menu);
		return true;
	}

}
