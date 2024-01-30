package extra_crawling.sec03_melon;

import java.util.List;

import extra_crawling.csv.CsvUtilImpl;

public class CsvReaderMain {

	public static void main(String[] args) {
		CsvUtilImpl csvUtil = new CsvUtilImpl();
		List<List<String>> csvList = csvUtil.readCsv("c:/Temp/melonn.tsv", "\t");
		
		for (List<String> line: csvList) {
			MelonChart mel = new MelonChart(
					Integer.parseInt(line.get(0)),
					line.get(1), line.get(2), line.get(3),(line.get(4)));
			System.out.println(mel);
		}
	}

}
