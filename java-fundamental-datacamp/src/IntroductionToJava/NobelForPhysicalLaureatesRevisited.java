package IntroductionToJava;

public class NobelForPhysicalLaureatesRevisited {
    public static void main(String[] args) {

        String[] nobelLaureates = {"Curie", "Einstein", "Fermi"};
        int[] years = {1903, 1921, 1938};

        nobelLaureates[2] = "Heisenberg";
        years[2] = 1932;

        System.out.println(nobelLaureates[0] + " won in " + years[0]);
        System.out.println(nobelLaureates[1] + " won in " + years[1]);
        System.out.println(nobelLaureates[2] + " won in " + years[2]);
    }
}
