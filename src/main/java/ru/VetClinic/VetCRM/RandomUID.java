package ru.VetClinic.VetCRM;

/**
 * Created by lstday
 * 05.11.15.
 */
public class RandomUID {

    private String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public String uidRandomizer() {
        StringBuffer stringBuffer = new StringBuffer();
        String randString;
        for (int i = 0; i < 4; i++) {
            double index = Math.random() * chars.length();
            stringBuffer.append(chars.charAt((int) index));
        }
        randString=stringBuffer.toString();
        return randString;
    }

    private static RandomUID instance;

    private RandomUID(){
    }

    public static RandomUID getInstance() {
        if (instance == null) {
            instance = new RandomUID();
        }
        return instance;
    }


}