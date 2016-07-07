package Party;

/**
 * Created by vadimkuida on 07.07.16.
 */
public class Music {
    public void song(int beer) {
        SpeakDisplay speakeOut = new  SpeakDisplay();
        while (beer >= 0) {
            if (beer != 0) {
                speakeOut.screen(beer + " " + Iskl.isklWord(beer) +  " пива на стене");
                speakeOut.screen(beer + " "+ Iskl.isklWord(beer) + "  пива");
                speakeOut.screen("Возьми одну пусти по кругу");
                //speakeOut.screen();
                beer = beer - 1;
            } else {
                speakeOut.screen("Нет бутылок пива на стене");
                speakeOut.screen("Нет бутылок пива");
                speakeOut.screen("Пойду в магазин и куплю еще");
                beer = beer - 1;
            }
        }
    }
}
