import java.util.StringTokenizer;

public class stringtokenpractice {
    public  static  void  main (String args[]){
        String s1 = "Hello world, my name is kaumil";

        StringTokenizer st1 = new StringTokenizer(s1);

        while(st1.hasMoreTokens()){
            System.out.print(st1.nextToken());
        }
        System.out.println();
        StringTokenizer st2 = new StringTokenizer(s1," ");
        while(st2.hasMoreTokens()){
            System.out.print(st2.nextToken());
        }
        System.out.println();
        StringTokenizer st3 = new StringTokenizer(s1," " , true);
        while(st3.hasMoreTokens()){
            System.out.print(st3.nextToken());
        }

        System.out.println();
        StringTokenizer st4 = new StringTokenizer(s1," " , false);
        while(st4.hasMoreTokens()){
            System.out.print(st4.nextToken());
        }


    }
}
