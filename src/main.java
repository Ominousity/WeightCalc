import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException {
        GennemsnitligVægtTab gennemsnitligVægtTab = new GennemsnitligVægtTab();
        gennemsnitligVægtTab.CalculateAverageWeightLoss(gennemsnitligVægtTab.CreateListOfNumbers());
    }

}
