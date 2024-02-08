SELECT b.*, u.uname FROM board b
	JOIN users u ON b.uid=u.uid
	WHERE isDeleted=0 AND title LIKE '%'