public class Test {
    public static void main(String[] args) {
        MobileOS mobileOS = new MobileOS();

        int currentHour;

        currentHour = 10;
        setBehavior(currentHour, mobileOS);
        mobileOS.performRingtone();
        mobileOS.performNotification();
        mobileOS.performBrightness();

        currentHour = 15;
        setBehavior(currentHour, mobileOS);
        mobileOS.performRingtone();
        mobileOS.performNotification();
        mobileOS.performBrightness();

        currentHour = 22;
        setBehavior(currentHour, mobileOS);
        mobileOS.performRingtone();
        mobileOS.performNotification();
        mobileOS.performBrightness();
    }

    private static void setBehavior(int currentHour, MobileOS mobileOS) {
        if (currentHour >= 5 && currentHour <= 11){
            mobileOS.setRingtoneBehavior(new MorningRingtone());
            mobileOS.setNotificationBehavior(new MorningNotification());
            mobileOS.setBrightnessBehavior(new MorningBrightness());
        }
        else if (currentHour >= 12 && currentHour <= 20){
            mobileOS.setRingtoneBehavior(new EveningRingtone());
            mobileOS.setNotificationBehavior(new EveningNotification());
            mobileOS.setBrightnessBehavior(new EveningBrightness());
        }
        else{
            mobileOS.setRingtoneBehavior(new NightRingtone());
            mobileOS.setNotificationBehavior(new NightNotification());
            mobileOS.setBrightnessBehavior(new NightBrightness());
        }
    }
}
