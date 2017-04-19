import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by deepali on 26-05-2016.
 */
public class useless {



        public static void main(String args[]) throws NumberFormatException, IOException {
            Scanner sc=new Scanner(System.in);
            int a=Integer.parseInt(sc.nextLine());
            ArrayList<Integer> c=new ArrayList<Integer>();
            while(a>0){
                int x=Integer.parseInt(sc.nextLine());
                String str=sc.nextLine();
                int cnt=0,chk=0,rep=0;
                for(int i=0;i<str.length();i=i+2){
                    if(str.subSequence(i, i+2).equals("BG")){
                        cnt++;
                    }
                    else if(str.subSequence(i, i+2).equals("GB")){
                        chk++;
                    }
                    else if(str.subSequence(i, i+2).equals("BB")){
                        rep++;
                    }
                    else if(str.subSequence(i, i+2).equals("GG")){
                        rep++;
                    }
                }
                if(cnt>=chk){
                    if(chk!=0)
                        cnt=rep/2+(chk);
                    else
                        cnt=rep/2;

                }
                else{
                    if(cnt!=0)
                        cnt=rep/2+(cnt);
                    else
                        cnt=rep/2;
                }
                c.add(cnt);
                a--;
            }
            for(int i=0;i<c.size();i++){
                System.out.println(c.get(i));
            }
        }

}
