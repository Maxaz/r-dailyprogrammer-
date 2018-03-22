public class Main {

    public static void main(String[] args) {
        LightIntervals intervals = new LightIntervals();

        LightIntervals.Interval i1 = new LightIntervals.Interval(1, 3);
        LightIntervals.Interval i2 = new LightIntervals.Interval(2, 3);
        LightIntervals.Interval i3 = new LightIntervals.Interval(4, 5);
        LightIntervals.Interval i4;
        LightIntervals.Interval i5;
        LightIntervals.Interval i6;
        LightIntervals.Interval i7;
        LightIntervals.Interval i8;
        LightIntervals.Interval i9;
        LightIntervals.Interval i10;
        LightIntervals.Interval i11;
        LightIntervals.Interval i12;
        LightIntervals.Interval i13;
        LightIntervals.Interval i14;
        LightIntervals.Interval i15;

        intervals.addItem(i1);
        intervals.addItem(i2);
        intervals.addItem(i3);
        System.out.println(intervals.getBigestInterval());
        System.out.println("******************************");
        intervals = new LightIntervals();

        i1 = new LightIntervals.Interval(2,4);
        i2 = new LightIntervals.Interval(3,6);
        i3 = new LightIntervals.Interval(1,3);
        i4 = new LightIntervals.Interval(6,8);
        intervals.addItem(i1);
        intervals.addItem(i2);
        intervals.addItem(i3);
        intervals.addItem(i4);
        System.out.println(intervals.getBigestInterval());
        System.out.println("******************************");
        intervals = new LightIntervals();

        i1 = new LightIntervals.Interval(6,8);
        i2 = new LightIntervals.Interval(5,8);
        i3 = new LightIntervals.Interval(8,9);
        i4 = new LightIntervals.Interval(5,7);
        i5 = new LightIntervals.Interval(4,7);

        intervals.addItem(i1);
        intervals.addItem(i2);
        intervals.addItem(i3);
        intervals.addItem(i4);
        intervals.addItem(i5);

        System.out.println(intervals.getBigestInterval());
        System.out.println("******************************");
        intervals = new LightIntervals();

        i1 = new LightIntervals.Interval(15, 18);
        i2 = new LightIntervals.Interval(13, 16);
        i3 = new LightIntervals.Interval(9, 12);
        i4 = new LightIntervals.Interval(3, 4);
        i5 = new LightIntervals.Interval(17, 20);
        i6 = new LightIntervals.Interval(9, 11);
        i7 = new LightIntervals.Interval(17, 18);
        i8 = new LightIntervals.Interval(4, 5);
        i9 = new LightIntervals.Interval(5, 6);
        i10 = new LightIntervals.Interval(4, 5);
        i11 = new LightIntervals.Interval(5, 6);
        i12 = new LightIntervals.Interval(13, 16);
        i13 = new LightIntervals.Interval(2, 3);
        i14 = new LightIntervals.Interval(15, 17);
        i15 = new LightIntervals.Interval(13, 14);

        intervals.addItem(i1);
        intervals.addItem(i2);
        intervals.addItem(i3);
        intervals.addItem(i4);
        intervals.addItem(i5);
        intervals.addItem(i6);
        intervals.addItem(i7);
        intervals.addItem(i8);
        intervals.addItem(i9);
        intervals.addItem(i10);
        intervals.addItem(i11);
        intervals.addItem(i12);
        intervals.addItem(i13);
        intervals.addItem(i14);
        intervals.addItem(i15);

        System.out.println(intervals.getBigestInterval());
    }
}
