public class WatchFactory {
    static public WatchType CreateWatch(int time, String brand, double price, WatchEnum type){
        WatchType watch = null;

        switch (type){
            case HourMinute:
                watch = new Watch(time);
                break;
            case HourMinuteSecond:
                watch = new Watch2(time);
                break;
        }
        return watch;
    }
}
