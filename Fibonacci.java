public class Fibonacci {
	public static void main(String[] args) {
	int a=1;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	int c; // 1 1 2 3 5 8 ...
	for(int i=0; i<10; i++) {
		c = a+b;
		System.out.println(c);
		a = 2;
		b = c;
	}
	}
}

/* 
8 = 5 + 3;

5 = 3 + 2;

3 = 2 + 1;

2 = 1 + 1;

1 = 1 + 0;

0 = 0 + 0;

*/

