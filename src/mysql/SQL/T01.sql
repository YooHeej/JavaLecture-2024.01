1) 국내 광역시도별 도시의 개수가 많은 5개 광역시도를 조회하는 SQL.

SELECT district, count(*) numCity FROM city
    WHERE countrycode='KOR'
    GROUP BY district
	ORDER BY numCity desc
	LIMIT 5;


2) 인구수가 800만 보다 큰 도시의 국가명, 도시명, 인구수를 조회하는 SQL.

SELECT r.Name countryName, l.Name cityName, l.population FROM city l
	INNER JOIN country r
	ON l.countrycode=r.Code
	WHERE l.Population > 8000000
	ORDER BY l.population DESC;

3) 아시아 대륙에서 인구수가 가장 많은 도시 Top 10을 조회하는 SQL [10]
(국가명, 도시명, 인구수)

SELECT continent, r.Name 국가명, l.Name 도시명, l.Population 인구수
	FROM city l
	JOIN country r
	ON l.Countrycode=r.Code
	WHERE continent='Asia'
	ORDER BY l.population desc
	LIMIT 10;


4) 강원도(Kang-won)에 인구가 120000인 태백시를 삽입하는 SQL. [10]

INSERT INTO city(NAME, countrycode, district, population)
	VALUES('태백시', 'KOR', 'Kang-won', 120000);

5) Chunchon 시의 이름과 인구수를 춘천과 30만으로 변경하는 SQL. [10]

UPDATE city SET NAME='춘천', population=300000 WHERE id=2365;

