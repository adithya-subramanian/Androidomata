package com.example.pbl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class Page22 extends Activity {

	int n,m,p,q,r;
	CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;
	Button but;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page22);
		Intent a=getIntent();
		Bundle b=a.getExtras();
		n=b.getInt("accept");
		cb1=(CheckBox) findViewById(R.id.checkBox1);
		cb2=(CheckBox) findViewById(R.id.checkBox2);
		cb3=(CheckBox) findViewById(R.id.checkBox3);
		cb4=(CheckBox) findViewById(R.id.checkBox4);
		cb5=(CheckBox) findViewById(R.id.checkBox5);
		cb6=(CheckBox) findViewById(R.id.checkBox6);
		cb7=(CheckBox) findViewById(R.id.checkBox7);
		cb8=(CheckBox) findViewById(R.id.checkBox8);
		but=(Button) findViewById(R.id.button1);
		but.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(cb1.isChecked()|| cb2.isChecked())
				{
					if(cb1.isChecked() && !cb2.isChecked())
					{
						m=101;	
					}
					if(cb1.isChecked() && cb2.isChecked())
					{
						m=1012;
					}
					if(cb2.isChecked() && !cb1.isChecked())
					{
						m=102;
					}
				}
		        if(cb3.isChecked() || cb4.isChecked())
		        {
		        	if(cb3.isChecked() && !cb4.isChecked())
					{
						p=111;	
					}
					if(cb3.isChecked() && cb4.isChecked())
					{
						p=1112;
					}
					if(cb4.isChecked() && !cb3.isChecked())
					{
						p=112;
					}
		        	
		        }
		        if(cb5.isChecked() || cb6.isChecked())
		        {
		        	if(cb5.isChecked() && !cb6.isChecked())
					{
						q=201;	
					}
					if(cb5.isChecked() && cb6.isChecked())
					{
						q=2012;
					}
					if(cb6.isChecked() && !cb5.isChecked())
					{
						q=202;
					}
		        	
		        }
		        if(cb7.isChecked() || cb8.isChecked())
		        {
		        	if(cb7.isChecked() && !cb8.isChecked())
					{
						r=211;	
					}
					if(cb7.isChecked() && cb8.isChecked())
					{
						r=2112;
					}
					if(cb8.isChecked() && !cb7.isChecked())
					{
						r=212;
					}
		        }
		        Bundle b2=new Bundle();
		        b2.putInt("S10",m);
		        b2.putInt("S11",p);
		        b2.putInt("S20",q);
		        b2.putInt("S21",r);
		        b2.putInt("accept",n);
		        Intent i1=new Intent(Page22.this,Page2.class);
		        i1.putExtras(b2);
		        startActivity(i1);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page22, menu);
		return true;
	}

}
