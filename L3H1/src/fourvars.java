
public class fourvars {

	public static void main(String[] args) {
		int var1=10, var2=9, var3=7, var4=0;
		if ((var1 >= var2) && (var1 >= var3) && (var1 >= var4)) {
			System.out.println("Var1 is the largest, at " + var1);
		} else if ((var2 >= var1) && (var2 >= var3) && (var2 >= var4)) {
			System.out.println("Var2 is the largest, at " + var2);
		} else if ((var3 >= var1) && (var3 >= var2) && (var3 >= var4)) {
			System.out.println("Var3 is the largest, at " + var3);
		} else if ((var4 >= var1) && (var4 >= var2) && (var4 >= var3)) {
			System.out.println("Var4 is the largest, at " + var4);
		}
	}

}
