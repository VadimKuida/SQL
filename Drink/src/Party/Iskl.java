package Party;

import java.util.ArrayList;

import static Party.ArrayLim.arrayIskl;

/**
 * Created by vadimkuida on 07.07.16.
 */
public class Iskl {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayLim array = new ArrayLim();
    static boolean flag;
    static boolean flag1;
    static boolean flag2;

    public void isklMass(int beer) {
        for (int i=1; i < beer; i=i+10){
            if (i != 11) {
                list.add(i);
            }
        }
    }
    public static String isklWord(int beer) {
        ParseStr parse = new ParseStr();
        flag = false;
        flag1 = false;
        flag2 = false;
        //System.out.println(array234[1]);
        String work=" ";
        int i=0;
        int u=0;
        int y=0;
        //System.out.println(list.get(3));
        if (beer > 0) {
            while (i < list.size()){
                if (beer == list.get(i)) {
                    flag = true;
                }
                    ArrayLim.arrayLim(2,4);
                while (u < arrayIskl.length){
                    if (arrayIskl[u] == parse.parseMass(1, beer)) {
                        flag1 = true;
                    }
                    u=u+1;
                }
                ArrayLim.arrayLim(12,25);
                while (y < arrayIskl.length){
                    if(arrayIskl[y] == parse.parseMass(2, beer)){
                        flag2 = true;
                    }
                    y=y+1;
                }
                i=i+1;
            }

            if (flag) {
                work = "бутылка";
            } else {
                if (flag2){
                    work = "бутылок";
                }else{

                    if (flag1)  {
                        work = "бутылки";
                    } else {
                        work = "бутылок";

                    }
                }
            }
        }
        return work;
    }
}
