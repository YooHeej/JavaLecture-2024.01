package extra_crawling.sec03_melon;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		ChartService chartService = new ChartService();
		List<MelonChart> list = chartService.getTop100();
		list.forEach(x -> System.out.println(x));
		
	}

}
