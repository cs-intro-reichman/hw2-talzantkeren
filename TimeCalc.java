public class TimeCalc {
    public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
       int addminutes = Integer.parseInt("" + args[1]);
        int Totalminutes = (hours*60)+ minutes + addminutes;
        int Totalhours = Totalminutes/60;
        int newHour= Totalhours%24;
        int newminutes=Totalminutes-(Totalhours*60);
        String minu="";
        String hou="";
        if (newminutes<10)
        {
             minu="0"+newminutes+"";

        }
        else{
            minu=newminutes+"";

        }
        if (newHour<10)
        {
             hou="0"+newHour+"";

        }
        else{
            hou=newHour+"";

        }
        

        System.out.println(hou+":"+minu);


    }
}
