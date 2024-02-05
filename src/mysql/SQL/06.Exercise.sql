1. 2009년도에 데뷔한 걸그룹의 히트송?
#  (걸그룹 이름, 데뷔일, 히트송)


# 2. 데뷔일자가 빠른 5개 그룹의 히트송?
# (걸그룹 이름, 데뷔일자, 히트송 제목)

SELECT l.name, l.debut, r.title FROM girl_group l
	JOIN song r ON l.hit_song_id=r.sid
	ORDER BY l.debut
	LIMIT 5;

# 3. 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP?

SELECT continent, COUNT(*) num, round(SUM(GNP)) sumGnp, round(AVG(GNP)) avgGnp
	FROM country
	GROUP BY continent;

# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 나타내기
    (대륙명, 국가명, 도시명, 인구수)

SELECT r.Continent, r.Name, l.Name, l.Population
	FROM city l
	JOIN country r ON l.CountryCode=r.Code
	WHERE r.Continent='Asia'
	ORDER BY l.Population DESC
	LIMIT 10;

# 5. 전 세계에서 GNP가 높은 10개 국가에서 사용하는 공식언어?
    (국가명, GNP, 언어명)

SELECT l.Name, l.GNP, r.`Language`
	FROM country l
	JOIN countrylanguage r
	ON l.code=r.CountryCode
	WHERE r.IsOfficial='T'
	ORDER BY l.GNP desc
	LIMIT 10;