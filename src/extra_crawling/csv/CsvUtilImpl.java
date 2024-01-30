package extra_crawling.csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvUtilImpl implements CsvUtil {

	@Override
	public List<List<String>> readCsv(String filename) {
		return readCsv(filename, ",", 0);
	}

	@Override
	public List<List<String>> readCsv(String filename, String separator) {
		return readCsv(filename, separator, 0);
	}

	@Override
	public List<List<String>> readCsv(String filename, int skipLine) {
		return readCsv(filename, ",", skipLine);
	}

	@Override
	public List<List<String>> readCsv(String filename, String separator, int skipLine) {
		return null;
	}

	@Override
	public void writeCsv(String filename, List<List<String>> dataList) {
		writeCsv(filename, dataList, ",");
	}

	@Override
	public void writeCsv(String filename, List<List<String>> dataList, String separator) {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(filename));
			for (List<String> data:dataList) {
				String line = "";
				for (int i = 0; i < data.size(); i++) {
					line += data.get(i);
					if (i < data.size() - 1)
						line += separator;
				}
				bw.write(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.flush();
			} catch (Exception e) {
				e.printStackTrace();
			} try {
				bw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
