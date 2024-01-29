package grep;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class GrepExample {
	    public static void main(String[] args) {
	        // 검색할 파일 경로 및 정규 표현식 패턴
	        String filePath = "파일의_경로";
	        String patternString = "검색할_패턴";

	        // 정규 표현식 패턴 컴파일
	        Pattern pattern = Pattern.compile(patternString);

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            int lineNumber = 0;

	            // 파일의 각 라인에 대해 검색
	            while ((line = br.readLine()) != null) {
	                lineNumber++;

	                // 현재 라인에서 패턴 매칭 확인
	                Matcher matcher = pattern.matcher(line);
	                if (matcher.find()) {
	                    System.out.println("패턴 발견 - 파일: " + filePath + ", 라인: " + lineNumber + ", 내용: " + line);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
}
