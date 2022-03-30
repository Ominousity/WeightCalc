import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GennemsnitligVægtTab {

    public List<Double> CreateListOfNumbers() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Vægt.txt"));
        ArrayList<Double> listOfLines = new ArrayList<>();
        String line = bufferedReader.readLine();
        String temp;
        String bannedSign = ",";

        while (line != null) {
            if (line.contains(",")){
                temp = line.replace(bannedSign, ".");
                listOfLines.add(Double.parseDouble(temp));
            }else{
                listOfLines.add(Double.parseDouble(line));
            }
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return listOfLines;
    }

    public void CalculateAverageWeightLoss(List<Double> listOfNumbers){
        Double temp = null;
        Double calculatedWeightLoss = 0.0;

        for (Double number : listOfNumbers) {
            if (temp != null){
                calculatedWeightLoss = calculatedWeightLoss + (temp - number);
                temp = number;
            }else{
                temp = number;
            }
        }
        calculatedWeightLoss = calculatedWeightLoss / listOfNumbers.size();
        System.out.println(calculatedWeightLoss);
    }

}
