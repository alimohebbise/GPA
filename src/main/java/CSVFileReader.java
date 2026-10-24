import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

    public List<String> readFile(String fileName)
            throws IOException {

        InputStream input = CSVFileReader.class
                .getResourceAsStream("/" + fileName);

        if (input == null) {
            throw new IOException("CSV file not found!");
        }

        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {

            String line;

            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }

        return lines;
    }
}
