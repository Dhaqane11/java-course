package com.vehicle;
public class car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public void setSpeed(double speed){
        this.speedKph = speed;
    }
    public void setFuelLevel(float fuel){
        this.fuelLevel=fuel;
    }
    public void drive(int distance){
        this.distanceTraveled =distance;
    }

    public  double getSpeedMph(){
        return speedKph/1.60934;
    }

    public int getDistanceKm(){
        return distanceTraveled/100;
    }

    public int calcRemainingFuel(double distance){
        double fuelUsed = distance*0.5;
        this.fuelLevel -= fuelUsed;
        return (int) this.fuelLevel;
    }
    public void display(){
        System.out.println("car speed in Mph: " + getSpeedMph());
        System.out.println("car distance travelled in Km :" + getDistanceKm());
        System.out.println("car remaining fuel: " + calcRemainingFuel(7));
    }


}
