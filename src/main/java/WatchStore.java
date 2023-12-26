import java.util.*;
public class WatchStore extends ArrayList<WatchType>{
    public WatchStore(){
        super();
    }
    String GetMostExpensive(){
        ArrayList<Double> priceList = new ArrayList<Double>();
        for (WatchType w: this){
            priceList.add(w.getPrice());
        }
        for (WatchType w: this){
            if (w.getPrice()==Collections.max(priceList))
                return w.toString();
        }
        return null;
    }
    void SetTimeOnAll(int[] data) throws Exception {
        for (WatchType w: this){
            w.SetTime(data);
        }
    }
    String MostCommon(){
        ArrayList<String> strings = new ArrayList<String>();
        for (WatchType w: this){
            strings.add(w.getBrand());
        }
        HashSet<String> set = new HashSet<String>(strings);
        ArrayList<String> strings_ = new ArrayList<String>(set);
        int[] count = new int[strings_.size()];
        for (int i = 0; i<strings_.size();i++){
            for (WatchType w: this){
                if (w.getBrand()==strings_.get(i)) count[i]++;
            }
        }
        ArrayList<Integer> count_ = new ArrayList<Integer>();
        for (int i = 0; i<strings_.size();i++){
            count_.add(count[i]);
        }
        return strings_.get(count_.indexOf(Collections.max(count_)));
    }
    void PrintBrands(){
        TreeSet<String> set = new TreeSet<String>();
        for (WatchType w: this){
            set.add(w.getBrand());
        }
        for (String s: set){
            if(s!=set.last())
                System.out.print(s+", ");
            else
                System.out.print(s);
        }
    }

}
