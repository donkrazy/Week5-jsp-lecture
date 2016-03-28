package com.estsoft.emaillist.dao.test;

import com.estsoft.db.MySQLWebDBConnection;
import com.estsoft.emaillist.dao.EmailListDao;

public class EmailListDaoTest {

	public static void main(String[] args) {
		EmailListDao dao = new EmailListDao( new MySQLWebDBConnection() );
		dao.getList();

	}

}
