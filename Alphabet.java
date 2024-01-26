class Alphabet{
	public static void main(String[] args) {
		a();
		b();
		c();
		d();
		e();
		f();
		g();
		h();
		i();
		j();
		k();
		l();
		m();
		n();
		o();
		p();
		q();
		r();
		s();
		t();
		u();
		v();
		w();
		x();
		y();
		z();	

	}

	public static void a(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((col==1||col==2||col==3)&&(row==0))
				{
					System.out.print("* ");
				}
				else if(row==3)
				{
					System.out.print("* ");
				}
				else if((col==0||col==4)&&(row==1||row==2||row==4||row==5||row==6))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void b(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==3||row==6)&&(col==1||col==2||col==3))
				{
					System.out.print("* ");
				}
				else if(col==0)
				{
					System.out.print("* ");
				}
				else if((row==1||row==2||row==4||row==5)&&(col==4))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void c(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==6)&&(col==1||col==2||col==3))
				{
					System.out.print("* ");
				}
				else if((row==1||row==5)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==2||row==4||row==3)&&(col==0))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void d(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==6)&&(col==1||col==2||col==0||col==3))
				{
					System.out.print("* ");
				}
				else if((row==2||row==4||row==3||row==1||row==5)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void e(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==6)&&(col==0||col==1||col==2||col==3||col==4))
				{
					System.out.print("* ");
				}
				else if(col==0)
				{
					System.out.print("* ");
				}
				else if((col==0||col==1||col==2||col==3)&&(row==3))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void f(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0)&&(col==0||col==1||col==2||col==3||col==4))
				{
					System.out.print("* ");
				}
				else if(col==0)
				{
					System.out.print("* ");
				}
				else if((col==0||col==1||col==2||col==3)&&(row==3))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void g(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==6)&&(col==1||col==2||col==3))
				{
					System.out.print("* ");
				}
				else if((row==1||row==5)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==4)&&(col==2||col==3||col==4))
				{
					System.out.print("* ");
				}
				else if((col==0)&&(row==2||row==3||row==4))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void h(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((col==0||col==4))
				{
					System.out.print("* ");
				}
				else if(row==3)
				{
					System.out.print("* ");
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void i(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==6))
				{
					System.out.print("* ");
				}
				else if(col==2)
				{
					System.out.print("* ");
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void j(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0))
				{
					System.out.print("* ");
				}
				else if((row==4||row==5)&&(col==2||col==0))
				{
					System.out.print("* ");
				}
				else if((row==1||row==2||row==3)&&(col==2))
				{
					System.out.print("* ");
				}
				else if((row==6)&&(col==1))
				{
					System.out.print("* ");
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void k(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==6)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==1||row==5)&&(col==0||col==3))
				{
					System.out.print("* ");
				}
				else if((row==2||row==4)&&(col==0||col==2))
				{
					System.out.print("* ");
				}
				else if((row==3)&&(col==0||col==1))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void l(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==6))
				{
					System.out.print("* ");
				}
				else if(col==0)
				{
					System.out.print("* ");
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void m(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==1)&&(col==0||col==1||col==3||col==4))
				{
					System.out.print("* ");
				}
				else if((row==2)&&(col==0||col==2||col==4))
				{
					System.out.print("* ");
				}
				else if((row==3||row==4||row==5||row==6)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void n(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==1||row==5||row==6)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==2)&&(col==0||col==1||col==4))
				{
					System.out.print("* ");
				}
				else if((row==3)&&(col==0||col==2||col==4))
				{
					System.out.print("* ");
				}
				else if((row==4)&&(col==0||col==3||col==4))
				{
					System.out.print("* ");
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void o(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==6)&&(col==1||col==2||col==3))
				{
					System.out.print("* ");
				}
				else if((row==1||row==2||row==3||row==4||row==5)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void p(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==3)&&(col==0||col==1||col==2||col==3))
				{
					System.out.print("* ");
				}
				else if((row==1||row==2)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if(col==0)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void q(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==6)&&(col==1||col==2||col==3))
				{
					System.out.print("* ");
				}
				if((row==6)&&(col==4))
				{
					System.out.print("* ");
				}
				if((row==5)&&(col==3))
				{
					System.out.print("* ");
				}
				else if((row==1||row==2||row==3||row==4||row==5)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void r(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==3)&&(col==0||col==1||col==2||col==3))
				{
					System.out.print("* ");
				}
				else if((row==1||row==2)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==4)&&(col==0||col==2))
				{
					System.out.print("* ");
				}
				else if((row==5)&&(col==3))
				{
					System.out.print("* ");
				}
				else if((row==6)&&(col==4))
				{
					System.out.print("* ");
				}
				else if((col==0))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void s(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==3||row==6)&&(col==1||col==2||col==3))
				{
					System.out.print("* ");
				}
				else if((row==1||row==5)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==4)&&(col==4))
				{
					System.out.print("* ");
				}
				else if((row==2)&&(col==0))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void t(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0))
				{
					System.out.print("* ");
				}
				else if(col==2)
				{
					System.out.print("* ");
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void u(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==6)&&(col==1||col==2||col==3))
				{
					System.out.print("* ");
				}
				else if((row==1||row==2||row==3||row==4||row==5)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void v(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==1||row==2||row==3||row==4||row==0)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==5)&&(col==1||col==3))
				{
					System.out.print("* ");
				}
				else if((row==6)&&(col==2))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void w(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==5)&&(col==1||col==3))
				{
					System.out.print("* ");
				}
				else if((row==4)&&(col==2))
				{
					System.out.print("* ");
				}
				
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void x(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==1||row==5||row==6)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==2||row==4)&&(col==1||col==3))
				{
					System.out.print("* ");
				}
				else if((row==3)&&(col==2))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void y(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==1)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==2)&&(col==1||col==3))
				{
					System.out.print("* ");
				}
				else if((row==3||row==4||row==5||row==6)&&(col==2))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

	public static void z(){
		for(int row=0;row<7;row++)
		{
			for(int col=0;col<5;col++)
			{
				if((row==0||row==6)&&(col==0||col==1||col==2||col==3||col==4))
				{
					System.out.print("* ");
				}
				else if((row==1||row==5)&&(col==0||col==4))
				{
					System.out.print("* ");
				}
				else if((row==2)&&(col==3))
				{
					System.out.print("* ");
				}
				else if((row==3)&&(col==2))
				{
					System.out.print("* ");
				}
				else if((row==4)&&(col==1))
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}}

}