public class MobileOS {
    private RingtoneBehavior ringtoneBehavior;
    private NotificationBehavior notificationBehavior;
    private BrightnessBehavior brightnessBehavior;

    public void setRingtoneBehavior(RingtoneBehavior ringtoneBehavior) {
        this.ringtoneBehavior = ringtoneBehavior;
    }

    public void setNotificationBehavior(NotificationBehavior notificationBehavior) {
        this.notificationBehavior = notificationBehavior;
    }

    public void setBrightnessBehavior(BrightnessBehavior brightnessBehavior) {
        this.brightnessBehavior = brightnessBehavior;
    }

    public void performRingtone(){
        ringtoneBehavior.ring();
    }

    public void performNotification(){
        notificationBehavior.notification();
    }

    public void performBrightness(){
        brightnessBehavior.brightness();
    }
}
