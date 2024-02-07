# 1. 2009년도에 데뷔한 걸그룹의 히트송?
#  (걸그룹 이름, 데뷔일, 히트송)


추가

INSERT INTO song VALUES (120, 'Bang', '가슴 뛰는 이 밤을 내 맘은 oh-oh-oh');
INSERT INTO song VALUES (121, '핫 이슈', '머리부터 발끝까지 hot issue');


# 2009년도 데뷔 명단
SELECT r.name `걸그룹 이름`, r.debut `데뷔 일`, l.title `히트 송`
	FROM song l
	INNER JOIN girl_group r                             
	ON l.sid=r.hit_song_id
	WHERE debut LIKE '2009%'
	ORDER BY debut;





# 2. 데뷔일자가 빠른 5개 그룹의 히트송?
# (걸그룹 이름, 데뷔일자, 히트송 제목)


SELECT r.name `걸그룹 이름`, r.debut `데뷔일자`, l.title `히트송 제목`
	From song l
	INNER JOIN girl_group r
	ON l.sid=r.hit_song_id
	ORDER BY debut
	LIMIT 5;


# 3. 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP?

SELECT continent, COUNT(*) countries, SUM(GNP) total_gnp, ROUND(AVG(GNP)) averege_gnp
	FROM country
	GROUP BY continent
	ORDER BY countries DESC;

# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 나타내기
    (대륙명, 국가명, 도시명, 인구수)
SELECT continent 대륙명, r.Name 국가명, l.Name 도시명, l.Population 인구수
	FROM city l
	JOIN country r
	ON l.countryCode=r.Code
	WHERE continent='Asia'
	ORDER BY l.Population DESC
	LIMIT 10;

# 5. 전 세계에서 GNP가 높은 10개 국가에서 사용하는 공식언어?
    (국가명, GNP, 언어명)
SELECT l.NAME 국가명,l.gnp GNP, r.`Language` 언어명
	FROM country l
	JOIN countrylanguage r
	ON l.Code=r.CountryCode
	WHERE r.IsOfficial='T'
	ORDER BY gnp DESC
	LIMIT 11;           
    /*  
    -> 캐나다 모국어 중복으로 인해 2개 표시로 국가 9개
       'limit 11'로 다음 순위 스페인을 올림 .
       
       1.미국 2.일본 3.독일 4.프랑스 5.영국 
       6.이탈리아 7.중국 8.브라질 9.캐나다(=10.캐나다) 11.스페인
         = 10개 */