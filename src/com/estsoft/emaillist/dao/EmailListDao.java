package com.estsoft.emaillist.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.estsoft.db.DBConnection;
import com.estsoft.emaillist.vo.EmailListVo;

public class EmailListDao {
	
	private DBConnection dbConnection;
	
	public EmailListDao( DBConnection dbConnection ) {
		this.dbConnection = dbConnection;
	}
	
	public List<EmailListVo> getList() {
		Connection conn = null;
		try {
			conn = dbConnection.getConnection();
			
		} catch( SQLException ex ) {
			System.out.println( "error: " + ex);
		}
			
		return null;
	}

}
