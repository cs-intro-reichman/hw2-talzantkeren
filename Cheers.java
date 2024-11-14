// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
		int lengthP = Integer.parseInt( args[1]);
                int i = 0;
                int lengthS = args[0].length();
                char [] let= new char[lengthS];
                String a = args[0].toUpperCase();
                String s ="";

                for(i=0;i<lengthS;i++)
                {
                        let[i]=a.charAt(i);
                        s=s+let[i];

                }
                String s1 = "AEFHILMNORSX";
                int state=0;
                for(i=0;i<lengthS;i++)
                {
                        state=s1.indexOf(let[i]);
                        if(state==-1)
                        {
                             System.out.println("Give me a  "+let[i]+": "+let[i]+"!");
                        }
                        else{
                                System.out.println("Give me an "+let[i]+": "+let[i]+"!");

                        }
                }
                System.out.println("What does that spell?");


                for(i=0;i<lengthP;i++)
                {
                        System.out.println(s+"!!!");
                }


        }
}
