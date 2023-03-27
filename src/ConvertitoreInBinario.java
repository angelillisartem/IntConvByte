import java.io.FileWriter;
import java.io.IOException;

public class ConvertitoreInBinario {
    private String inputString;

    public ConvertitoreInBinario(String inputString) {
        this.inputString = inputString;
    }


    public String getConvertToBinary(String inputString) {
        byte[] bytes = inputString.getBytes();
        StringBuilder binary = new StringBuilder();

        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
        }
        binary.append(" ");
        return binary.toString();
    }

    public void getWriteToFile(String binaryString) {
        try {
            FileWriter fileWriter = new FileWriter("src/CodificaBinario.txt");
            fileWriter.write(binaryString);
            fileWriter.close();
        } catch (IOException e) {
            System.out.print("\nErrore: file non scrivibile!");
            throw new RuntimeException(e);
        }
    }
}
