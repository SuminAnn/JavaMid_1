package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {

        for (String string : ZoneId.getAvailableZoneIds()) {
            System.out.println(string);
            ZoneId zoneId = ZoneId.of(string);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);
    }
}
