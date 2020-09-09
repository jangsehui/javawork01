public class FormattedOutput
{
	public static void main(String args[]){
		String msg="Hello World";
		int integral=12345;
		double floating=123.4567;
		System.out.printf("%s\n",msg);
		System.out.printf("%d\n%10d\n",integral,integral);
		System.out.printf("%f\n%.3f\n%1$e",floating,floating);
}
}