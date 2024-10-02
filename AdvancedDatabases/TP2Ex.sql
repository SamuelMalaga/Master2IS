--EX1 A
SELECT CinemaName,Address FROM CINEMA;
--EX1 B;
SELECT Title FROM ACTOR WHERE ActName = 'Chalamet';
--EX1 C;
SELECT m.title, m.director FROM MOVIE m, ACTOR a WHERE m.title=a.title AND a.actname='Chalamet';
--EX1 D;
SELECT m.title, m.director FROM MOVIE m, ACTOR a WHERE m.title=a.title AND a.actname in ('Chalamet','Emily Blunt') ORDER BY a.title;
--EX1 E;
SELECT DISTINCT a.actname FROM MOVIE m, ACTOR a where m.director = 'King' and a.title = m.title ORDER BY a.actname DESC;
--EX1 F;
SELECT 
s.screennb, to_char(s.showtime,'hh24:mi') 
FROM 
SCREEN sc,
SHOW s
WHERE
sc.title='Dune 2'
AND
sc.cinemaname='Pathe Wilson'
AND
sc.cinemaname = s.cinemaname
AND
sc.screennb = s.screennb
;
--, to_char(s.showtime,'hh24:mi')
--EX 3
SELECT max(to_char(s.showtime,'hh24:mi')) FROM SHOW s WHERE s.cinemaname = 'ABC';
--EX 4
SELECT ((max(s.showtime) - min(s.showtime))*24) as diff_between_screenings from SHOW s WHERE s.cinemaname='UGC';
--EX 5
SELECT count(s.cinemaname) from SCREEN s where s.price < 8;
--EX 6
SELECT count(DISTINCT s.cinemaname) from SCREEN s where s.price < 8;
--EX 7
SELECT round(avg(s.price),2) from SCREEN s WHERE s.cinemaname = 'Pathe Wilson';
--EX 8
SELECT sum(s.price) from SCREEN s WHERE s.cinemaname = 'Utopia';
--EX 8
SELECT DISTINCT a.actname FROM ACTOR a, MOVIE m where a.actname = m.director;
--EX 9
SELECT DISTINCT a.actname FROM ACTOR a, MOVIE m WHERE a.title=m.title and m.title LIKE '%2%';
--EX 10
SELECT DISTINCT s.cinemaname from SCREEN s where s.price > 7 and s.price < 9;