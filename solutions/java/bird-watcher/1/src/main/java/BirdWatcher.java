
class BirdWatcher {
    private final int[] birdsPerDay;
    

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
      int[] pajararosSemanaPasada = {0,2,5,3,7,8,4};
        return pajararosSemanaPasada;
        
    }

    public int getToday() {
        int ultimo = birdsPerDay.length;
       return birdsPerDay[ultimo-1];
    }

    public void incrementTodaysCount() {
       int ultimo = birdsPerDay.length;
        birdsPerDay[ultimo-1] = birdsPerDay[ultimo-1]+1;
    }

    public boolean hasDayWithoutBirds() {
      for (int i = 0; i <birdsPerDay.length;i++){
        if (birdsPerDay[i]==0){
            return true;
            
        } }
            return false;
          
      
      
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays>birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }
        int total = 0;
     for (int i = 0; i <numberOfDays;i++){
         total = total + birdsPerDay[i];
     }
        return total;
    }

    public int getBusyDays() {
        int ajetreado=0;
         for (int i = 0; i <birdsPerDay.length;i++){
        if (birdsPerDay[i]>=5){
            ajetreado++;
        } }
        return ajetreado;
    }
}
