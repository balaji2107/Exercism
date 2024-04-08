public class ElonsToyCar {
    private int distance;
    private int battery=100;
    public static ElonsToyCar buy() {
       ElonsToyCar car=new ElonsToyCar();
       return car;
    }

    public String distanceDisplay() {
         return String.format("Driven %d meters", distance);        
    }

    public String batteryDisplay() {
       if (battery == 0) {
    		return "Battery empty";
    	}
    	return String.format("Battery at %d%%", battery);
    }

    public void drive() {
        if(battery!=0){
            distance+=20;
            battery-=1;
        }
    }
}
