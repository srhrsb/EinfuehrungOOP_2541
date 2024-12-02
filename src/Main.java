public class Main {
    public static void main(String[] args) {

       Building bs6 = new Building("BS 6");
       Building cube = new Building("Cube", 12);
       Building bs11 = new Building("BS 11", 150, 5);

        bs6.setName("BS6");
        bs6.setFloors(4); //Setter werden genutzt um über geregelte/vorgeschriebene
                          //Wege Daten in anderen Klassen zu ändern
    }
}