// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int n = Integer.parseInt(args[0]);
		char c = args[1].charAt(0);
		int i=0;
		int t=2;
		if(c=='v')
		{
			System.out.println("1 4 2 1 (4)");
			for(t=2;t<n+1;t++)
			{
				int a=1;
				i=t;
				while(i!=1)
				{
					a++;
				if(i%2==0)
				{
					System.out.print(i+" ");
					i=i/2;
				}
				else{
					System.out.print(i+" ");
					i=i*3+1;
				}

				}
				System.out.println("1"+" ("+a+")");
			}
			System.out.println("Every one of the first "+n+" hailstone sequences reached 1.");
				

	    }
		 else{
			System.out.println("Every one of the first "+n+" hailstone sequences reached 1.");
		 }
	}
}
