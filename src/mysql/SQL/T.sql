# 1. 2009년도에 데뷔한 걸그룹의 히트송?
#  (걸그룹 이름, 데뷔일, 히트송)

애프터 스쿨 -> 120 bang -> 가슴 뛰는 이 밤을 내 맘은 oh-oh-oh
포미닛 -> 핫 이슈 -> 머리부터 발끝까지, hot issue
추가

INSERT INTO song VALUES (120, 'Bang', '가슴 뛰는 이 밤을 내 맘은 oh-oh-oh');
INSERT INTO song VALUES (121, '핫 이슈', '머리부터 발끝까지 hot issue');


# 2009년도 데뷔 명단
SELECT r.name, r.debut, l.title
	FROM song l
	INNER JOIN girl_group r                             
	ON l.sid=r.hit_song_id
	WHERE debut LIKE '2009%'
	ORDER BY debut;




# 2. 데뷔일자가 빠른 5개 그룹의 히트송?
# (걸그룹 이름, 데뷔일자, 히트송 제목)


SELECT r.name, r.debut, l.title
	From song l
	INNER JOIN girl_group r
	ON l.sid=r.hit_song_id
	ORDER BY debut
	LIMIT 5;


# 3. 
1 - 대륙별로 국가숫자, 
SELECT COUNT(*) FROM country WHERE continent='Asia'; = 52
SELECT COUNT(*) FROM country WHERE continent='Europe' = 47
SELECT COUNT(*) FROM country WHERE continent='North America' = 38
SELECT COUNT(*) FROM country WHERE continent='Africa' = 52
SELECT COUNT(*) FROM country WHERE continent='Oceania' = 29
SELECT COUNT(*) FROM country WHERE continent='Antarctica' = 6 
SELECT COUNT(*) FROM country WHERE continent='South America' = 15




2 - GNP의 합




3 - 평균 국가별 GNP
SELECT AVG(GNP) FROM country WHERE continent='Asia';
SELECT AVG(GNP) FROM country WHERE continent='Europe';
SELECT AVG(GNP) FROM country WHERE continent='North America';
SELECT AVG(GNP) FROM country WHERE continent='Africa';
SELECT AVG(GNP) FROM country WHERE continent='Oceania';
SELECT AVG(GNP) FROM country WHERE continent='Antarctica';
SELECT AVG(GNP) FROM country WHERE continent='South America';