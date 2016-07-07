package Party;

/**
 * Created by vadimkuida on 07.07.16.
 */
public class ParseStr {
    public static int parseMass(int num, int intText){
        String numMass = "";
//		int numParse = 0;
        String strText = Integer.toString(intText);
        char[] charArray = strText.toCharArray();
        if (charArray.length > 1){

            for (int i=charArray.length-1; num > 0;i--){
                numMass = charArray[i]+numMass;
                num = num-1;
            }
        } else {
            numMass = charArray[0]+numMass;

        }



        int numMassInt = new Integer(numMass);
        return numMassInt;
    }
}
