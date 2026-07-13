public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
public int expectedMinutesInOven(){
 int expectedMinutesInOven= 40;
    return expectedMinutesInOven;
}
    // TODO: define the 'remainingMinutesInOven()' method
public int remainingMinutesInOven(int MinutosReales){
    int minutosFaltantes = expectedMinutesInOven()-MinutosReales;
    return minutosFaltantes;

}
    // TODO: define the 'preparationTimeInMinutes()' method
public int preparationTimeInMinutes(int capas){
    int TiempoPreparacion = capas * 2;
    return TiempoPreparacion;
}

    // TODO: define the 'totalTimeInMinutes()' method
  public int   totalTimeInMinutes(int capas, int MinutosReales){
  int Total = capas * 2 + MinutosReales;
      return Total;
      
  }
    
}
