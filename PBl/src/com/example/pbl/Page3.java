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

public class Page3 extends Activity {

    EditText et1;
    Button bt1,bt2;
    TextView tv1;
    RadioButton rb1,rb2,rb3;
    CheckBox cb1;
    String s;
    int k,l,m,n,o,p,q,r,c,z;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page3);
		Intent i=getIntent();
		Bundle b=i.getExtras();
		m=b.getInt("S10");
		n=b.getInt("S11");
		o=b.getInt("S20");
		p=b.getInt("S21");
		q=b.getInt("S30");
		r=b.getInt("S31");
		c=b.getInt("accept");
		et1=(EditText) findViewById(R.id.editText1);
		bt1=(Button) findViewById(R.id.button1);
		bt2=(Button) findViewById(R.id.button2);
		tv1=(TextView) findViewById(R.id.textView1);
		rb1=(RadioButton) findViewById(R.id.radioButton1);
		rb2=(RadioButton) findViewById(R.id.radioButton2);
		rb3=(RadioButton) findViewById(R.id.radioButton3);
		cb1=(CheckBox) findViewById(R.id.checkBox1);
		s=et1.getText().toString();
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(s.equals("1"))
				{
					if(rb1.isChecked())
					{
						if(n==111)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(n==112)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(false);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(n==113)
						{
							rb1.setChecked(false);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(n==1112)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(false);
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
						else if(n==1113)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(n==1123)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(n==11123)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
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
						if(p==211)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(p==212)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(false);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(p==213)
						{
							rb1.setChecked(false);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(p==2112)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(false);
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
						else if(p==2113)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(p==2123)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(p==21123)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						
					}
					if(rb3.isChecked())
					{
						if(r==311)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(r==312)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(false);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(r==313)
						{
							rb1.setChecked(false);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(r==3112)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(false);
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
						else if(r==3113)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(r==3123)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(r==31123)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}if(c==2)
							{
								cb1.setChecked(true);
							}if(c==3)
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
				if(s.equals("0"))
				{
					if(rb1.isChecked())
					{
						if(m==101)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(false);
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
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(false);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(m==103)
						{
							rb1.setChecked(false);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==3)
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
							rb3.setChecked(false);
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
						else if(m==1013)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(m==1023)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(m==10123)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
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
					else if(rb2.isChecked())
					{
						if(o==201)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(o==202)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(false);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(o==203)
						{
							rb1.setChecked(false);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(o==2012)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(false);
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
						else if(o==2013)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(o==2023)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(o==20123)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						}
					if(rb3.isChecked())
					{
						if(q==301)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(false);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(q==302)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(false);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(q==303)
						{
							rb1.setChecked(false);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(q==3012)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(false);
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
						else if(q==3013)
						{
							rb1.setChecked(true);
							rb2.setChecked(false);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(q==3023)
						{
							rb1.setChecked(false);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==2)
							{
								cb1.setChecked(true);
							}
							if(c==3)
							{
								cb1.setChecked(true);
							}
							else
							{
								cb1.setChecked(false);
							}
						}
						else if(q==30123)
						{
							rb1.setChecked(true);
							rb2.setChecked(true);
							rb3.setChecked(true);
							if(c==1)
							{
								cb1.setChecked(true);
							}if(c==2)
							{
								cb1.setChecked(true);
							}if(c==3)
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
		});
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ii =new Intent(Page3.this,Finalpage.class);
				startActivity(ii);
				
			}
		});
		
			
}
				

		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page3, menu);
		return true;
	}

}
