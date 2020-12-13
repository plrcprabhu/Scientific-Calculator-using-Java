import java.awt.*;
import java.awt.event.*;
class Calc implements ActionListener
{
	String s1,s2,s3,s4,s5;
	int n,c,fl=0;
	double d;
	Frame f = new Frame("CALCULATOR");
	TextField tf = new TextField();
	Button b0=new Button("0");
	Button b1=new Button("1");
	Button b2=new Button("2");
	Button b3=new Button("3");
	Button b4=new Button("4");
	Button b5=new Button("5");
	Button b6=new Button("6");
	Button b7=new Button("7");
	Button b8=new Button("8");
	Button b9=new Button("9");
	Button badd=new Button("+");
	Button bsub=new Button("-");
	Button bmul=new Button("*");
	Button bdiv=new Button("/");
	Button bclr=new Button("CLR");
	Button bdot=new Button(".");
	Button beq=new Button("=");
	Button bmod=new Button("%");
	Button bpi=new Button("pi");
	Button bsqrt=new Button("sqrt");
	Button bfah=new Button("F");
	Button bcel=new Button("C");
	Button blog=new Button("log");
	Button bln=new Button("ln");
	Button brad=new Button("rad");
	Button bdeg=new Button("deg");
	Button bdel=new Button("DEL");
	Button bxor=new Button("^");
	Button bor=new Button("|");
	Button band=new Button("&");
	Button brshift=new Button(">>");
	Button blshift=new Button("<<");
	Button bfact=new Button("fact");
	Button bpow=new Button("pow");
	Button be=new Button("e");
	Button barcsin=new Button("sin-1");
	Button barccos=new Button("cos-1");
	Button barctan=new Button("tan-1");
	Button bsin=new Button("sin");
	Button bcos=new Button("cos");
	Button btan=new Button("tan");
	Button bhex=new Button("hex");
	Button boct=new Button("oct");
	Button bbin=new Button("bin");
	Button bdec=new Button("dec");
	Calc()
	{
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bclr.addActionListener(this);
		bdot.addActionListener(this);
		bmod.addActionListener(this);
		beq.addActionListener(this);
		bpi.addActionListener(this);
		bsqrt.addActionListener(this);
		band.addActionListener(this);
		bor.addActionListener(this);
		bxor.addActionListener(this);
		blshift.addActionListener(this);
		brshift.addActionListener(this);
		be.addActionListener(this);
		bpow.addActionListener(this);
		bfact.addActionListener(this);
		bfah.addActionListener(this);
		bcel.addActionListener(this);
		barcsin.addActionListener(this);
		barccos.addActionListener(this);
		barctan.addActionListener(this);
		blog.addActionListener(this);
		bln.addActionListener(this);
		bsin.addActionListener(this);
		bcos.addActionListener(this);
		btan.addActionListener(this);
		brad.addActionListener(this);
		bdeg.addActionListener(this);
		bhex.addActionListener(this);
		boct.addActionListener(this);
		bbin.addActionListener(this);
		bdec.addActionListener(this);
		bdel.addActionListener(this);
		tf.setBounds(25,25,350,75);
		bhex.setBounds(0,150,80,50);
		bsin.setBounds(0,200,80,50);
		barcsin.setBounds(0,250,80,50);
		be.setBounds(0,300,80,50);
		band.setBounds(0,350,80,50);
		b7.setBounds(0,400,80,50);
		b4.setBounds(0,450,80,50);
		b1.setBounds(0,500,80,50);
		bclr.setBounds(0,550,80,50);
		boct.setBounds(80,150,80,50);
		bcos.setBounds(80,200,80,50);
		barccos.setBounds(80,250,80,50);
		bpow.setBounds(80,300,80,50);
		bor.setBounds(80,350,80,50);
		b8.setBounds(80,400,80,50);
		b5.setBounds(80,450,80,50);
		b2.setBounds(80,500,80,50);
		b0.setBounds(80,550,80,50);
		bbin.setBounds(160,150,80,50);
		btan.setBounds(160,200,80,50);
		barctan.setBounds(160,250,80,50);
		bfact.setBounds(160,300,80,50);
		bxor.setBounds(160,350,80,50);
		b9.setBounds(160,400,80,50);
		b6.setBounds(160,450,80,50);
		b3.setBounds(160,500,80,50);
		bdot.setBounds(160,550,80,50);
		bdec.setBounds(240,150,80,50);
		brad.setBounds(240,200,80,50);
		blog.setBounds(240,250,80,50);
		bfah.setBounds(240,300,80,50);
		blshift.setBounds(240,350,80,50);
		bdiv.setBounds(240,400,80,50);
		bmul.setBounds(240,450,80,50);
		bsub.setBounds(240,500,80,50);
		badd.setBounds(240,550,80,50);
		bdel.setBounds(320,150,80,50);
		bdeg.setBounds(320,200,80,50);
		bln.setBounds(320,250,80,50);
		bcel.setBounds(320,300,80,50);
		brshift.setBounds(320,350,80,50);
		bsqrt.setBounds(320,400,80,50);
		bpi.setBounds(320,450,80,50);
		bmod.setBounds(320,500,80,50);
		beq.setBounds(320,550,80,50);
		f.setSize(400,600);
		f.add(tf);
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(badd);
		f.add(bsub);
		f.add(bmul);
		f.add(bdiv);
		f.add(bdot);
		f.add(bclr);
		f.add(bmod);
		f.add(beq);
		f.add(bhex);
		f.add(boct);
		f.add(bbin);
		f.add(bdec);
		f.add(bdel);
		f.add(bsin);
		f.add(bcos);
		f.add(btan);
		f.add(brad);
		f.add(bdeg);
		f.add(barcsin);
		f.add(barccos);
		f.add(barctan);
		f.add(blog);
		f.add(bln);
		f.add(be);
		f.add(bpow);
		f.add(bfact);
		f.add(bfah);
		f.add(bcel);
		f.add(band);
		f.add(bor);
		f.add(bxor);
		f.add(blshift);
		f.add(brshift);
		f.add(bsqrt);
		f.add(bpi);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
	      	if(e.getSource()==b0)
		 {
		     s3 = tf.getText();
		     s4 = "0";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==b1)
		 {
		     s3 = tf.getText();
		     s4 = "1";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==b2)
		 {
		     s3 = tf.getText();
		     s4 = "2";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==b3)
		 {
		     s3 = tf.getText();
		     s4 = "3";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==b4)
		 {
		     s3 = tf.getText();
		     s4 = "4";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==b5)
		 {
		     s3 = tf.getText();
		     s4 = "5";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==b6)
		 {
		     s3 = tf.getText();
		     s4 = "6";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==b7)
		 {
		     s3 = tf.getText();
		     s4 = "7";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==b8)
		 {
		     s3 = tf.getText();
		     s4 = "8";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==b9)
		 {
		     s3 = tf.getText();
		     s4 = "9";
		     s5 = s3+s4;
		     tf.setText(s5);
		 }
		 if(e.getSource()==badd)
		 {
		     s1 = tf.getText();
		     tf.setText("");
		     c=1;
		 }
		 if(e.getSource()==bsub)
		 {
		     s1 = tf.getText();
		     tf.setText("");
		     c=2;
		 }
		 if(e.getSource()==bmul)
		 {
		     s1 = tf.getText();
		     tf.setText("");
		     c=3;
		 }
		 if(e.getSource()==bdiv)
		 {
		     s1 = tf.getText();
		     tf.setText("");
		     c=4;
		 }
		 if(e.getSource()==bmod)
		 {
		     s1 = tf.getText();
		     tf.setText("");
		     c=5;
		 }
		 if(e.getSource()==band)
		 {
		     s1 = tf.getText();
		     tf.setText("");
		     c=6;
		 }
		 if(e.getSource()==bor)
		 {
		 	s1=tf.getText();
		 	tf.setText("");
		 	c=7;
		 }
		 if(e.getSource()==bxor)
		 {
		 	s1=tf.getText();
		 	tf.setText("");
		 	c=8;
		 }
		 if(e.getSource()==blshift)
		 {
		 	s1=tf.getText();
		 	tf.setText("");
		 	c=9;
		 }
		 if(e.getSource()==brshift)
		 {
		 	s1=tf.getText();
		 	tf.setText("");
		 	c=10;
		 }
		 if(e.getSource()==bpow)
		 {
		 	s1=tf.getText();
		 	tf.setText("");
		 	c=11;
		 }
		 if(e.getSource()==bfah)
		 {
		 	s1=tf.getText();
		 	tf.setText(s1+"F");
		 	c=12;
		 }
		 if(e.getSource()==bcel)
		 {
		 	s1=tf.getText();
		 	tf.setText(s1+"C");
		 	c=13;
		 }
		 if(e.getSource()==bsqrt)
		 {
		 	tf.setText("sqrt of");
		 	c=14;
		 }
		 if(e.getSource()==bpi)
		 {
		 	s1=tf.getText();
		 	tf.setText(s1+Double.toString(Math.PI));
		 	fl=1;
		 }
		 if(e.getSource()==bfact)
		 {
		 	tf.setText(tf.getText()+"!");
		 }	
	 	if(e.getSource()==bdot)
		{
		    s3=tf.getText();
		    s4=".";
	 	   s5=s3+s4;
	 	   tf.setText(s5);
	 	   fl=1;
		}
		 if(e.getSource()==beq)
		 {
		     s2 = tf.getText();
		  	  if(c==1)
		     {
		         if(fl==0) {
		         	n = Integer.parseInt(s1)+Integer.parseInt(s2);
		         	tf.setText(Integer.toString(n));
		         }
		         else {
		         	d=Double.parseDouble(s1)+Double.parseDouble(s2);
		         	tf.setText(Double.toString(d));
		         	
		         }
		     }
		     if(c==2)
		     {
		         if(fl==0) {
		         	n = Integer.parseInt(s1)-Integer.parseInt(s2);
		         	tf.setText(Integer.toString(n));
		         }
		         else {
		         	d=Double.parseDouble(s1)-Double.parseDouble(s2);
		         	tf.setText(Double.toString(d));
		         	
		         }
		     }
		     if(c==3)
		     {
		         if(fl==0) {
		         	n = Integer.parseInt(s1)*Integer.parseInt(s2);
		         	tf.setText(Integer.toString(n));
		         }
		         else {
		         	d=Double.parseDouble(s1)*Double.parseDouble(s2);
		         	tf.setText(Double.toString(d));
		         
		         }		     
		     }
		     if(c==4)
		     {
		         try
		         {
		         	if(fl==0) {
				      int p=Integer.parseInt(s2);
				      if(p!=0)
				      {
				                          n = Integer.parseInt(s1)/Integer.parseInt(s2);
				      tf.setText(Integer.toString(n));
				       }
				       else
				          tf.setText("Infinite");
	 			}
	 			else {
				      double tmp=Double.parseDouble(s2);
				      if(tmp!=0.0)
				      {
				       	d = Double.parseDouble(s1)/Double.parseDouble(s2);
		      				tf.setText(Double.toString(d));
				       }
				       else
				          tf.setText("Infinite");
			      			
				} 			
		         }
		         catch(Exception i){}
	         	}
		     if(c==5)
		     {
		         if(fl==0) {
		         	n = Integer.parseInt(s1)%Integer.parseInt(s2);
		         	tf.setText(Integer.toString(n));
		         }
		         else {
		       	tf.setText("INVALID OPERATION");
		       	
		         }
		     }
		     if(c==6)
		     {
		     	if(fl==0)
		     	{
		     		int n1=Integer.parseInt(s1);
		     		int n2=Integer.parseInt(s2);
		     		tf.setText(Integer.toString(n1&n2));
		     	}
		     	else
		     	{
		     		tf.setText("INVALID OPERATION");
		     		
		     	}
		     }
		     if(c==7)
		     {
		     	if(fl==0)
		     	{
		     		int n1=Integer.parseInt(s1);
		     		int n2=Integer.parseInt(s2);
		     		tf.setText(Integer.toString(n1|n2));
		     	}
		     	else
		     	{
		     		tf.setText("INVALID OPERATION");
		     		
		     	}
		     }
		     if(c==8)
		     {
		     	if(fl==0)
		     	{
		     		int n1=Integer.parseInt(s1);
		     		int n2=Integer.parseInt(s2);
		     		tf.setText(Integer.toString(n1^n2));
		     	}
		     	else
		     	{
		     		tf.setText("INVALID OPERATION");
		     		
		     	}
		     }
		     if(c==9)
		     {
		     	if(fl==0)
		     	{
		     		int n1=Integer.parseInt(s1);
		     		int n2=Integer.parseInt(s2);
		     		tf.setText(Integer.toString(n1<<n2));
		     	}
		     	else
		     	{
		     		tf.setText("INVALID OPERATION");
		     		
		     	}
		     }
		     if(c==10)
		     {
		     	if(fl==0)
		     	{
		     		int n1=Integer.parseInt(s1);
		     		int n2=Integer.parseInt(s2);
		     		tf.setText(Integer.toString(n1>>n2));
		     	}
		     	else
		     	{
		     		tf.setText("INVALID OPERATION");
		     		
		     	}
		     }
		     if(c==11)
		     {
		     	if(fl==0)
		     	{
		     		int n1=Integer.parseInt(s1);
		     		int n2=Integer.parseInt(s2);
		     		tf.setText(Double.toString(Math.pow(n1,n2)));
		     	}
		     	else
		     	{
		     		tf.setText("INVALID OPERATION");
		     		
		     	}
		     }
		     if(c==12)
		     {
		     	int len=s2.length();
		     	s3=s2.substring(0,len-1);
		     	double fah=Double.parseDouble(s3);
		     	double cel=(5.0/9.0)*(fah-32);
		     	tf.setText(Double.toString(cel)+"C");
		     	fl=1;
		     }
		     if(c==13)
		     {
		     	int len=s2.length();
		     	s3=s2.substring(0,len-1);
		     	double cel=Double.parseDouble(s3);
		     	double fah=(9.0/5.0)*cel+32;
		     	tf.setText(Double.toString(fah)+"F");
		     	fl=1;
		     }
		     if(c==14)
		     {
				int len=s2.length();
				s3=s2.substring(7,len);
				double d=Double.parseDouble(s3);
				tf.setText(Double.toString(Math.sqrt(d)));
		     	fl=1;
		     }
		 }
		 if(e.getSource()==bclr)
		 {
		    int len=tf.getText().length();
		    if(len!=0)
		     tf.setText(tf.getText().substring(0,len-1));
		}
		if(e.getSource()==bdel)
		{
			tf.setText("");
			fl=0;
		}
	}
	public static void main(String[] args) {
		Calc obj = new Calc();
	}
}
