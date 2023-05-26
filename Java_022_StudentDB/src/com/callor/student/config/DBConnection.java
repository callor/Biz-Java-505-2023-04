package com.callor.student.config;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class DBConnection {
	
	private static SqlSessionFactory sqlSesiFactory;
	static {
		
		DataSource dataSource
			= new PooledDataSource(
					DBContract.JDBC_DRIVER,
					DBContract.DB_URL,
					DBContract.USER_NAME,
					DBContract.PASSWORD
		);
		
		TransactionFactory transactionFactory
			= new JdbcTransactionFactory();
		
		Environment environment 
		= new Environment("dev", transactionFactory,dataSource);
		Configuration configuration = new Configuration(environment);

		configuration.addMappers("com.callor.student.mapper");
		
		sqlSesiFactory 
			= new SqlSessionFactoryBuilder().build(configuration);
		
	}
	
	public static SqlSessionFactory getFactory() {
		return sqlSesiFactory;
	}

}
