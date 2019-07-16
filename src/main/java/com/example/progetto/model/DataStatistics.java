package com.example.progetto.model;

//this class encapsulates stats variables returned by routes "stats" and
//"/filter/stats/" (first one is get request, second one is post request
//through the filter"


public class DataStatistics {
    private double avg;
    private int min;
    private int max;
    private double std;
    private long sum;

    /*constructor*/

    public DataStatistics(double avg, int min, int max, double std, long sum) {
        this.avg = avg;
        this.min = min;
        this.max = max;
        this.std = std;
        this.sum = sum;
    }

    /*getter and setter*/

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getStd() {
        return std;
    }

    public void setStd(double std) {
        this.std = std;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(long sum) {

        this.sum = sum;
    }

}