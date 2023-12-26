public class Main {
    public static void main(String args[]) throws Exception {
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
        WatchType w1 = null;
        try {
            w1 = WatchFactory.CreateWatch(121, "Rolex", 2000.0, WatchEnum.HourMinute);
            System.out.println(w1.toString());
            //System.out.println(w1.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WatchType w2 = null;
        try {
            w2 = WatchFactory.CreateWatch(3661, "Apple", 1000.0, WatchEnum.HourMinuteSecond);
            System.out.println(w2.toString());
            //System.out.println(w2.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WatchType w3 = null;
        try {
            w3 = WatchFactory.CreateWatch(3661, "Apple", 3000.0, WatchEnum.HourMinuteSecond);
            System.out.println(w3.toString());
            //System.out.println(w2.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WatchType w4 = null;
        try {
            w4 = WatchFactory.CreateWatch(121, "Omega", 1500.0, WatchEnum.HourMinute);
            System.out.println(w4.toString());
            //System.out.println(w1.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WatchType w5 = null;
        try {
            w5 = WatchFactory.CreateWatch(3661, "Omega", 1100.0, WatchEnum.HourMinuteSecond);
            System.out.println(w5.toString());
            //System.out.println(w2.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WatchType w6 = null;
        try {
            w6 = WatchFactory.CreateWatch(3661, "Omega", 900.0, WatchEnum.HourMinuteSecond);
            System.out.println(w6.toString());
            //System.out.println(w2.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WatchStore Store = new WatchStore();
        Store.add(w1);
        Store.add(w2);
        Store.add(w3);
        Store.add(w4);
        Store.add(w5);
        Store.add(w6);
        System.out.println("Самые дорогие: "+Store.GetMostExpensive());
        int[] time = {10,10};
        Store.SetTimeOnAll(time);
        for (WatchType w: Store){
            System.out.println(w.toString());
        }
        //Store.get(0).SetTime(new int[]{0, 0});
        //System.out.println(Store.get(0).toString());
        System.out.println("Наиболее встречающиеся: "+Store.MostCommon());
        Store.PrintBrands();
    }
}
