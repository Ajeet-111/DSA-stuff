import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return intervals;
        }
        intervals.sort(Comparator.comparing(a -> a.start));
        List<Interval> result = new LinkedList<>();
        Interval curr = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);

            if (curr.end >= next.start) { 
                curr.end = Math.max(curr.end, next.end);
            } else {
                result.add(curr);
                curr = next;
            }
        }
        result.add(curr);

        return result;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));

        MergeIntervals mi = new MergeIntervals();
        List<Interval> merged = mi.merge(intervals);

        for(Interval interval : merged){
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}