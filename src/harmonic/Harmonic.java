package harmonic;

public class Harmonic {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSeries = 0.0;


        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries += (1.0 / numbers.length);
        }

        double sum = 0;
        for (int number : numbers) {
            sum += 1.0 / number;
        }

        double harmonicAverage = numbers.length / sum;

        System.out.println("Harmonik Ortalama: " + harmonicAverage);
    }
}
