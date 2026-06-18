class Solution {
    public double angleClock(int hour, int minutes) {
        hour%=12;
        double m= Math.abs(30*hour-5.5*minutes);
        return Math.min(m,360-m);
    }
}