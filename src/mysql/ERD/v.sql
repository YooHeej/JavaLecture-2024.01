SELECT r.*, u.uname FROM reply r
	JOIN users u ON r.uid=u.uid
	WHERE r.bid=12
	ORDER BY rid;