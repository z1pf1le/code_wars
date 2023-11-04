public class Boening737{

    private int manufactureYear;
    private static int maxPassengersCount = 300;

    public void Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Drawing { //статический вложенный класс

        public static int getMaxPassengersCount() {

            return maxPassengersCount;
        }
    }
}
