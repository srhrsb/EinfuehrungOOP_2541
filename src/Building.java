public class Building {

     //Felder / Eigenschaften / Attribute der Klasse
    //bestimmen die Daten der Klasse
    //Zugriffsmodifizierer - Datentyp - Bezeichner
    private String name;
    private int floors;
    private int rooms;

    //Konstruktoren -> spezielle Methoden zum Instanziieren
    //d.h. um ein Objekt der Klasse zu erzeugen
    public Building( String name ){
        //this verweist auf das Objekt, d.h. this.name ist das Feld name
        //dieser Klasse, name dagegen ist die Parametervariable des Konstruktors
       this.name = name;
       this.floors = 1;
       this.rooms = 1;
    }

    //Konstruktoren können Überladen werden, dazu kann der gleiche Konstruktorname
    //nochmal verwendet werden, Bedingung ist nur, dass der Konstruktor
    //unterschiedliche Parameter hat
    public Building( String name, int rooms){
        this.name = name;
        this.rooms = rooms;
        this.floors = 1;
    }

    //Aufgabe: 3. Überladung des Konstruktors, der alle Daten annimmt
    public Building(String name, int floors, int rooms) {
        this.name = name;
        this.floors = floors;
        this.rooms = rooms;
    }


    //Methoden -> Funktionalität der Klasse bzw. des Objekts



    //GETTER & SETTER--------------------------------------------------
    //Getter und Setter dienen dem kontrolliertem Zugriff auf Eigenschaften einer Klasse
    public void setFloors( int floors ){
        int value = Math.clamp(floors, 1, 20);
        this.floors = value;
    }

    public int getFloors(){
        return floors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
