package EnklaOvningarFranSlide;

public enum enumDirection { // Enum skapas som separata specialklasser (oftast i egna filer) med följande deklaration
    NORTH,               //Används när man har en lista av värden man vet aldrig kommer att ändras
    EAST,
    SOUTH,
    WEST;

    public static void main(String[] args) {
        enumDirection currentDirection = enumDirection.WEST; //De enda tillåtna värdena för currentDirection är de som ingår i enum Direction

        for (enumDirection d: enumDirection.values()) { //Enhanced ForLoop med enum är smidigt
            System.out.println(d);
        }
        switch(currentDirection) {
            case NORTH:
            System.out.println("Currently heading north!");
            break;

            case EAST:
            System.out.println("Currently heading east!");
            break;

            case SOUTH:
            System.out.println("Curently heading south!");
            break;

            case WEST:
            System.out.println("Currently heading west!");
            break;
        }
        
    }

    
}
