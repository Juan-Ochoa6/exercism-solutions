public class JedliksToyCar {
    private int distanceDriven = 0;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar(); 
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
         if ( battery==-1){
         return  "Battery empty";
        }
       return "Battery at "+battery+"%";
    }

    public  void drive() {
      distanceDriven =  distanceDriven+ 20;
     battery = battery -1 ;
       if ( battery==-1){
            distanceDriven = distanceDriven;
             battery = battery;
        }
        if (distanceDriven==2020){
              distanceDriven = 2000;
        }}
    }

