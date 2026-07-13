public class Lasagna {
   
public int expectedMinutesInOven(){
 int expectedMinutesInOven= 40;
    return expectedMinutesInOven;
}
   
public int remainingMinutesInOven(int MinutosReales){
    int minutosFaltantes = expectedMinutesInOven()-MinutosReales;
    return minutosFaltantes;

}
    
public int preparationTimeInMinutes(int capas){
    int TiempoPreparacion = capas * 2;
    return TiempoPreparacion;
}

    
  public int   totalTimeInMinutes(int capas, int MinutosReales){
  int Total = preparationTimeInMinutes(capas) + MinutosReales;
      return Total;
      
  }
    
}
