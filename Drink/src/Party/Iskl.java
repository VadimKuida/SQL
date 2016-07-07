package Party;

import java.util.ArrayList;

/**
 * Created by vadimkuida on 07.07.16.
 */
public class Iskl {
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static boolean flag;
    static boolean flag1;
    static boolean flag2;
    public static int [] array234;
    public static int [] array121314;
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
        array234 = new int[3]; //массив для проверки 234
        int a=0;
        for (int i=2; i<5; i++){
            array234[a] = i;
            a=a+1;
        }
        int a1=0;
        array121314 = new int[3]; //массив для проверки 121314
        for (int i=12; i<15; i++){
            array121314[a1] = i;
            a1=a1+1;
        }
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

                while (u < array234.length){
                    if (array234[u] == parse.parseMass(1, beer)) {
                        flag1 = true;
                    }
                    u=u+1;
                }

                while (y < array121314.length){
                    if(array121314[y] == parse.parseMass(2, beer)){
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
