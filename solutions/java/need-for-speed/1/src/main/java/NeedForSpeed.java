class NeedForSpeed {
    int speed;
    int batteryDrain;
        int distancia;
    int battery;
    RaceTrack race = new RaceTrack(distancia);
    NeedForSpeed(int speed, int batteryDrain) {
     this.speed = speed;
        this.batteryDrain= batteryDrain;
        this.distancia = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
     if (battery <= 0 || battery-batteryDrain<0) {return true;}
        return false;
    }

    public int distanceDriven() {
      return distancia;
    }

    public void drive() {
        if(batteryDrained()){
          speed = 0;
       }
       distancia += speed;
        battery -= batteryDrain;
       
    }

     public static NeedForSpeed nitro() {
      NeedForSpeed nitro = new NeedForSpeed(50, 4);
       return nitro;
    }
}


class RaceTrack {
    int distance;
    RaceTrack(int distance) {
     this.distance = distance;
    }

   
      public boolean canFinishRace(NeedForSpeed car) {
       int maxDistance = (100 / car.batteryDrain) * car.speed;
    return maxDistance >= distance;
}
    }


