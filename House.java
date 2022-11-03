import java.util.ArrayList;

public class House extends Building {
  ArrayList<String> residents;
  boolean hasDiningRoom;
  int nResidents;
  
  public House(String name, String address, int nFloors, boolean hasDR) {
    super(name, address, nFloors);
    this.hasDiningRoom=hasDR;
    this.residents=new ArrayList<String>();
  }
  
    
  public int nResidents(){
    return this.nResidents;
  }
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }
    
  public void moveIn(String name){
    this.residents.add(name);
    this.nResidents += 1;
  }
    
  public String moveOut(String name){
    this.residents.remove(name);
    this.nResidents -= 1;
    return name;
  }
  
  public boolean isResident(String person){
    return this.residents.contains(person);
    
  }

  
  public static void main(String[] args) {
    new House("Park Annex", "117 Elm St, Northampton, MA 01063", 3, true);
  }

}