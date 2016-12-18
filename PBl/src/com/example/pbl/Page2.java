package com.example.pbl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Page2 extends Activity {
	EditText et1;
	Button b1;
	Button b2;
	TextView tv1;
	CheckBox cb1;
	RadioButton rb1,rb2;
	String s,s1;
	int a,m,p,q,r,n,c;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page2);
		Intent i=getIntent();
		Bundle b=new Bundle();
		b=i.getExtras();
		n=b.getInt("accept");
		m=b.getInt("S10");
		p=b.getInt("S11");
		q=b.getInt("S20");
		r=b.getInt("S21");
		c=b.getInt("accept");
		tv1=(TextView)findViewById(R.id.textView1);
		cb1=(CheckBox) findViewById(R.id.checkBox1);
		et1=(EditText)findViewById(R.id.editText1);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		rb1=(RadioButton)findViewById(R.id.radioButton1);
		rb2=(RadioButton)findViewById(R.id.radioButton2);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				s=et1.getText().toString();
				if(s.equalsIgnoreCase("1"))
				{
					if(rb1.isChecked())
					{
						if(p==111)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(p==112)
						{
							rb2.setChecked(true);
							rb1.setChecked(false);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(p==1112)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
					}
					else if(rb2.isChecked())
					{
						if(r==211)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(r==212)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(r==2112)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
					}
				}
				else if(s.equalsIgnoreCase("0"))
				{
					if(rb1.isChecked())
					{
						if(m==101)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						
						else if(m==102)
						{
							rb2.setChecked(true);
							rb1.setChecked(false);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(m==1012)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
					}
					else if(rb2.isChecked())
					{
						if(r==201)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(r==202)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(r==2012)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
					}
				}
				
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii=new Intent(Page2.this,Finalpage.class);
				startActivity(ii);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page2, menu);
		return true;
	}

}
