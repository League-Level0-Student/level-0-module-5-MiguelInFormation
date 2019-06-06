package _02_fibonacci;

public class Fibuhnachi {
public static void main(String[] args) {
	int low=0;
	int high=1;
	for (int i = 0; i < 99; i++) {
		int temp=low;
				low=high;
				high=temp+low;
				System.out.println(high);
	}
	
}
	
	
}
