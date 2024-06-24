class SwapNumber{
	public static void main(String[] swapnumber){
		//using third variable
	int a=25;
	int b=20;
	int c=0;
		System.out.println("value of a and b before swaping "+a+"  "+b);
	c=a;
	a=b;
	b=c;
	System.out.println("value of a and b before swaping "+a+"  "+b);
	
//without third variable

int x=10;
int y=20;

x=x+y;
System.out.println("value of x and y before swaping "+x+"  "+y);

//30-20=10
y=x-y;
x=x-y;
System.out.println("value of x and y before swaping "+x+"  "+y);
	}
}

