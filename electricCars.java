import com.vehicle.car;
public  class electricCars extends car {
    private double bateryLevel;
    public void setBatteryLevel(double battery){
        this.bateryLevel=battery;
    }

    public double getBateryLevel(){
        return this.bateryLevel;
    }

    public void drive(int distance){
       super.drive(distance);

       int distancekm=distance/1000;
       this.bateryLevel -=(distancekm *1.0);
    }


    public void display() {
        System.out.println("electric car speed in mph: " + getSpeedMph());
        System.out.println("electric car distacne traverled km: " + getDistanceKm());
        System.out.println("electric car remaining battery:" + getBateryLevel());


    }
}

