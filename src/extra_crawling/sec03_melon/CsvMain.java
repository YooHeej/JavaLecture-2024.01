package extra_crawling.sec03_melon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import extra_crawling.csv.CsvUtil;
import extra_crawling.csv.CsvUtilImpl;

public class CsvMain {

	public static void main(String[] args) throws IOException {
		 ChartService chartService = new ChartService();
		 CsvUtil csvUtil = new CsvUtilImpl();
		 
		 List<MelonChart> list = chartService.getTop100();
		 List<List<String>> csvList = new ArrayList<List<String>>();
		 for (MelonChart mel : list) {
				List<String> line = new ArrayList<String>();
				line.add(mel.getRank() + "");
				line.add(mel.getTitle()); line.add(mel.getArtist()); line.add(mel.getAlbum());
				line.add(mel.getImgSrc() + "");
				csvList.add(line);
		 }
		 csvUtil.writeCsv("c:/Temp/melonn.tsv", csvList, "\t");

  }
	
}
