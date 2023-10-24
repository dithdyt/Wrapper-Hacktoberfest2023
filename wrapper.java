import java.io.*;

class GFG {

  public static void main(String[] args)
	{

    Float floatWrap = Float.valueOf(45.158f);

    int floatToInt = floatWrap.intValue();

    System.out.println(floatToInt);

    Integer five = Integer.valueOf("101", 2);

    System.out.println(five);
	}
}
