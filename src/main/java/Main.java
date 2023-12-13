public class Main {
    public static void main(String args[]){
        //Watch testWatch = new Watch(0,0,"Rolex", 1000.0);
//        WatchType testWatch = new Watch(0,0,"Rolex", 1000.0);
//        try {
//            testWatch.SetTime(new int[]{10, 20});
//            System.out.println(testWatch.toString());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        try {
//            testWatch.SetForward(new int[]{1, 30});
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(testWatch);
//        WatchType test2 = new Watch2(0,0, 0, "Apple", 700.0);
//        try {
//            test2.SetTime(new int[]{10, 20, 30});
//            System.out.println(test2.toString());
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//
//        try {
//            test2.SetForward(new int[]{0, 39, 30});
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(test2);
//        WatchFactory wf = null;
//        WatchType watch3 = wf.CreateWatch(WatchEnum.HourMinuteSecond);
        try {
            WatchType w1 = WatchFactory.CreateWatch(121, "", .0, WatchEnum.HourMinute);
            System.out.println(w1.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
            WatchType w2 = WatchFactory.CreateWatch(3661,"", .0, WatchEnum.HourMinuteSecond);
            System.out.println(w2.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
