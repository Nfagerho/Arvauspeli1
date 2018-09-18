package fi.academy;

import java.util.ArrayList;
import java.util.List;

public class PKysymys {
    String kysymysteksti;
    List<String> vastaukset = new ArrayList<>();
    String oikeaVastaus;

    public PKysymys(String kysymysteksti) {
        this.kysymysteksti = kysymysteksti;
        List<String> vastaukset;
    }

    public String getKysymysteksti() {
        return kysymysteksti;
    }

    public void setKysymysteksti(String kysymysteksti) {
        this.kysymysteksti = kysymysteksti;
    }

    public List<String> getVastaukset() {
        return vastaukset;
    }

    public void setVastaukset(List<String> vastaukset) {
        this.vastaukset = vastaukset;
    }
    public void setOikeaVastaus (String oikeaVastaus) {
        this.oikeaVastaus = oikeaVastaus;
    }
    public String getOikeaVastaus() {
        return oikeaVastaus;
    }

    public void lisaaVastaus(String vastaus) {
        vastaukset.add(vastaus);
    }

    @Override
    public String toString() {
        return
                kysymysteksti + '\n' +
                 vastaukset.get(0)+ '\n'
                + vastaukset.get(1)+'\n'
                + vastaukset.get(2) +'\n';
        //huom, tällä hetkellä ei näytä kuin kolme baihtoehtoa! Saako returniin jotenkin loopin?
    }
}

