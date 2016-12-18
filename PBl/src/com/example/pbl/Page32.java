package com.example.pbl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Page32 extends Activity {

	Button bt;
	CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18;
	int c,m,n,o,p,q,r;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page32);
		Intent i =getIntent();
		Bundle b=i.getExtras();
		c=b.getInt("accept");
		bt=(Button) findViewById(R.id.button1);
		cb1=(CheckBox) findViewById(R.id.checkBox1);
		cb2=(CheckBox) findViewById(R.id.checkBox2);
		cb3=(CheckBox) findViewById(R.id.checkBox13);
		cb4=(CheckBox) findViewById(R.id.checkBox3);
		cb5=(CheckBox) findViewById(R.id.checkBox14);
		cb6=(CheckBox) findViewById(R.id.checkBox4);
		cb7=(CheckBox) findViewById(R.id.checkBox5);
		cb8=(CheckBox) findViewById(R.id.checkBox15);
		cb9=(CheckBox) findViewById(R.id.checkBox6);
		cb10=(CheckBox) findViewById(R.id.checkBox7);
		cb11=(CheckBox) findViewById(R.id.checkBox16);
		cb12=(CheckBox) findViewById(R.id.checkBox8);
		cb13=(CheckBox) findViewById(R.id.checkBox9);
		cb14=(CheckBox) findViewById(R.id.checkBox17);
		cb15=(CheckBox) findViewById(R.id.checkBox11);
		cb16=(CheckBox) findViewById(R.id.checkBox10);
		cb17=(CheckBox) findViewById(R.id.checkBox18);
		cb18=(CheckBox) findViewById(R.id.checkBox12);
		bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(cb1.isChecked() || cb2.isChecked() || cb3.isChecked())
				{
					if(cb1.isChecked() && !cb2.isChecked() && !cb3.isChecked())
					{
						m=101;
					}
					else if(!cb1.isChecked() && cb2.isChecked() && !cb3.isChecked())
					{
						m=102;
					}
					else if(!cb1.isChecked() && !cb2.isChecked() && cb3.isChecked())
					{
						m=103;
					}
					else if(cb1.isChecked() && cb2.isChecked() && !cb3.isChecked())
					{
						m=1012;
					}
					else if(cb1.isChecked() && !cb2.isChecked() && cb3.isChecked())
					{
						m=1013;
					}
					else if(!cb1.isChecked() && cb2.isChecked() && cb3.isChecked())
					{
						m=1023;
					}
					else if(cb1.isChecked() && cb2.isChecked() && cb3.isChecked())
					{
						m=10123;
					}
		
				}
				if(cb4.isChecked() || cb5.isChecked() || cb6.isChecked())
				{
					if(cb4.isChecked() && !cb5.isChecked() && !cb6.isChecked())
					{
						n=111;
					}
					else if(!cb4.isChecked() && cb5.isChecked() && !cb6.isChecked())
					{
						n=112;
					}
					else if(!cb4.isChecked() && !cb5.isChecked() && cb6.isChecked())
					{
						n=113;
					}
					else if(cb4.isChecked() && cb5.isChecked() && !cb6.isChecked())
					{
						n=1112;
					}
					else if(cb4.isChecked() && !cb5.isChecked() && cb6.isChecked())
					{
						n=1113;
					}
					else if(!cb4.isChecked() && cb5.isChecked() && cb6.isChecked())
					{
						n=1123;
					}
					else if(cb4.isChecked() && cb5.isChecked() && cb6.isChecked())
					{
						n=11123;
					}
		
				}
				if(cb7.isChecked() || cb8.isChecked() || cb9.isChecked())
				{
					if(cb7.isChecked() && !cb8.isChecked() && !cb9.isChecked())
					{
						o=201;
					}
					else if(!cb7.isChecked() && cb8.isChecked() && !cb9.isChecked())
					{
						o=202;
					}
					else if(!cb7.isChecked() && !cb8.isChecked() && cb9.isChecked())
					{
						o=203;
					}
					else if(cb7.isChecked() && cb8.isChecked() && !cb9.isChecked())
					{
						o=2012;
					}
					else if(cb7.isChecked() && !cb8.isChecked() && cb9.isChecked())
					{
						o=2013;
					}
					else if(!cb7.isChecked() && cb8.isChecked() && cb9.isChecked())
					{
						o=2023;
					}
					else if(cb7.isChecked() && cb8.isChecked() && cb9.isChecked())
					{
						o=20123;
					}
		
				}
				if(cb10.isChecked() || cb11.isChecked() || cb12.isChecked())
				{
					if(cb10.isChecked() && !cb11.isChecked() && !cb12.isChecked())
					{
						p=211;
					}
					else if(!cb10.isChecked() && cb11.isChecked() && !cb12.isChecked())
					{
						p=212;
					}
					else if(!cb10.isChecked() && !cb11.isChecked() && cb12.isChecked())
					{
						p=213;
					}
					else if(cb10.isChecked() && cb11.isChecked() && !cb12.isChecked())
					{
						p=2112;
					}
					else if(cb10.isChecked() && !cb11.isChecked() && cb12.isChecked())
					{
						p=2113;
					}
					else if(!cb10.isChecked() && cb11.isChecked() && cb12.isChecked())
					{
						p=2123;
					}
					else if(cb10.isChecked() && cb11.isChecked() && cb12.isChecked())
					{
						p=21123;
					}
		
				}
				if(cb13.isChecked() || cb14.isChecked() || cb15.isChecked())
				{
					if(cb13.isChecked() && !cb14.isChecked() && !cb15.isChecked())
					{
						q=301;
					}
					else if(!cb13.isChecked() && cb14.isChecked() && !cb15.isChecked())
					{
						q=302;
					}
					else if(!cb13.isChecked() && !cb14.isChecked() && cb15.isChecked())
					{
						q=303;
					}
					else if(cb13.isChecked() && cb14.isChecked() && !cb15.isChecked())
					{
						q=3012;
					}
					else if(cb13.isChecked() && !cb14.isChecked() && cb15.isChecked())
					{
						q=3013;
					}
					else if(!cb13.isChecked() && cb14.isChecked() && cb15.isChecked())
					{
						q=3023;
					}
					else if(cb13.isChecked() && cb14.isChecked() && cb15.isChecked())
					{
						q=30123;
					}
		
				}
				if(cb16.isChecked() || cb17.isChecked() || cb18.isChecked())
				{
					if(cb16.isChecked() && !cb17.isChecked() && !cb18.isChecked())
					{
						r=311;
					}
					else if(!cb16.isChecked() && cb17.isChecked() && !cb18.isChecked())
					{
						r=312;
					}
					else if(!cb16.isChecked() && !cb17.isChecked() && cb18.isChecked())
					{
						r=313;
					}
					else if(cb16.isChecked() && cb17.isChecked() && !cb18.isChecked())
					{
						r=3112;
					}
					else if(cb16.isChecked() && !cb17.isChecked() && cb18.isChecked())
					{
						r=3113;
					}
					else if(!cb16.isChecked() && cb17.isChecked() && cb18.isChecked())
					{
						r=3123;
					}
					else if(cb16.isChecked() && cb17.isChecked() && cb18.isChecked())
					{
						r=31123;
					}
		
				}
				Bundle bb=new Bundle();
				bb.putInt("S10",m);
				bb.putInt("S11",n);
				bb.putInt("S20",o);
				bb.putInt("S21",p);
				bb.putInt("S30",q);
				bb.putInt("S31",r);
				bb.putInt("accept",c);
				Intent ii=new Intent(Page32.this,Page3.class);
				ii.putExtras(bb);
				startActivity(ii);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page32, menu);
		return true;
	}

}
