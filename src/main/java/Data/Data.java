/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author user
 */
public enum Data {
    APi_KEY("eca89efb62bb921e07dded9f30beb107"),
    URLSTRING("http://api.openweathermap.org/data/2.5/weather?"),
    MODE("json"),
    UNITS("metric"),
    CNT("7");
    private String value;


    Data(String value) {
        this.value=value;
    }

    public static String getKey(Data APi_KEY) {
        return APi_KEY.value;
    }

    public static String getUrl(Data URLSTRING) {
        return URLSTRING.value;
    }
    public static String getMode(Data MODE) {
        return MODE.value;
    }
    public static String getUnits(Data UNITS) {
        return UNITS.value;
    }
    public static String getCnts(Data CNT) {
        return CNT.value;
    }

}
