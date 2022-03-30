import java.io.IOException;

public class main {

    private static AverageWeightLoss averageWeightLoss;

    public static void main(String[] args) throws IOException {
        averageWeightLoss = new AverageWeightLoss();
        averageWeightLoss.CalculateAverageWeightLoss(averageWeightLoss.CreateListOfNumbers());
    }

}
