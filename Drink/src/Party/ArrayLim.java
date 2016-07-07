package Party;

/**
 * Created by vadimkuida on 07.07.16.
 */
public class ArrayLim {
    public static int[] arrayIskl;
    static int[] arrayLim(int startNum, int endNum){
        int countArray = endNum+1-startNum;

        arrayIskl = new int[countArray];
        for (int i=0; i<countArray;i++){
            arrayIskl[i]= startNum;
            startNum=startNum+1;
        }



     return arrayIskl;
    }
}
