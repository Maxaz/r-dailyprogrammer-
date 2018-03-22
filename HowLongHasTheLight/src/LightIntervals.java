import java.util.ArrayList;

public class LightIntervals {
    private ArrayList<Interval> intervals;

    public LightIntervals() {
        this.intervals = new ArrayList<>();
    }

    public boolean addItem(Interval n) {
        if (intervals.isEmpty()) {
            intervals.add(n);
            return true;
        }
        for (Interval o : intervals) {
            switch (o.compareTo(n)) {
                case -1:
                    o.setLowerBound(n.getLowerBound());
                    if (n.getUpperBound() > o.getUpperBound()) {
                        o.setUpperBound(n.getUpperBound());
                    }
                    return true;
                case 0:
                    o.setUpperBound(n.getUpperBound());
                    if (n.getLowerBound() < o.getLowerBound()) {
                        o.setLowerBound(n.getLowerBound());
                    }
                    return true;
                case 1:
                    o.setLowerBound(n.getLowerBound());
                    o.setUpperBound(n.getUpperBound());
                    return true;
                case 2:
                    return false;
                case 3:
                case 4:
                    break;
            }
        }
        intervals.add(n);
        return true;
    }

    public int getBigestInterval() {
        int bigestInterval = 0;
        for (Interval i : intervals) {
            bigestInterval += i.getTime();
        }
        return bigestInterval;
    }

    static class Interval {
        private int lowerBound;
        private int upperBound;
        private int time;

        public Interval(int lowerBound, int upperBound) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            this.time = (upperBound - lowerBound);
        }

        public int getLowerBound() {
            return lowerBound;
        }

        public void setLowerBound(int lowerBound) {
            this.lowerBound = lowerBound;
        }

        public int getUpperBound() {
            return upperBound;
        }

        public void setUpperBound(int upperBound) {
            this.upperBound = upperBound;
        }

        public int getTime() {
            setTime(this.getUpperBound() - this.getLowerBound());
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int compareTo(Interval o) {
            if ((o.lowerBound < lowerBound) && (o.upperBound >= lowerBound)) {
                return -1;
            } else if ((o.upperBound > upperBound) && (o.lowerBound <= upperBound)) {
                return 0;
            } else if ((o.upperBound > upperBound) && (o.lowerBound < lowerBound)) {
                return 1;
            } else if ((o.upperBound <= upperBound) && (o.lowerBound >= lowerBound)) {
                return 2;
            } else if (((o.upperBound < lowerBound) && (o.lowerBound < lowerBound)) || ((o.lowerBound > upperBound) && (o.upperBound > upperBound))) {
                return 3;
            } else {
                return 4;
            }
        }
    }
}

