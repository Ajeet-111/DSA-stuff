import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Interval {
    int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class InsertInterval {
    public List<Interval> merge(List<Interval> intervals, Interval newInterval) {
        if (intervals == null || intervals.isEmpty()) {
            return intervals;
        }
        List<Interval> result = new LinkedList<>();

        int i = 0;
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i));
            i++;
        }
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            Interval curr = intervals.get(i);
            newInterval.start = Math.min(curr.start, newInterval.start);
            newInterval.end = Math.max(curr.end, newInterval.end);
            i++;
        }
        result.add(newInterval);
        while (i < intervals.size()) {
            result.add(intervals.get(i));
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));

        InsertInterval ii = new InsertInterval();
        List<Interval> merged = ii.merge(intervals, new Interval(7, 10));

        for(Interval interval : merged){
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
