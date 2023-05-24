package com.callor.bank.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.callor.bank.config.DBConnection;
import com.callor.bank.config.DBContract;
import com.callor.bank.models.AccDto;
import com.callor.bank.service.AccService;

public class AccServiceV1 implements AccService{
	
	// DB 에 연결 session 구축하는 도구
	protected final Connection dbConn;
	
	public AccServiceV1() {
		// dbConn 도구를 이미 만들어둔 DBConnection 클래스 코드를
		// 사용하여 초기화 한다
		dbConn = DBConnection.getDBConn();
	}
	
	
	@Override
	public List<AccDto> selectAll() {

		String sql = " SELECT acNum, acDiv,acBuId,acBalance "
				+ " FROM tbl_acc "
				+ " ORDER BY acNum ";
		
		try {
			
			PreparedStatement pStr = dbConn.prepareStatement(sql);
			ResultSet result = pStr.executeQuery();
			
			List<AccDto> accList = new ArrayList<>();
			while(result.next()) {
				AccDto accDto = new AccDto();
				accDto.acNum = result.getString(DBContract.ACC.ACC_NUM);
				accDto.acDiv = result.getString(DBContract.ACC.ACC_DIV);
				accDto.acBuId = result.getString(DBContract.ACC.ACC_BUID);
				// accDto.acBalance = result.getString(DBContract.ACC.ACC_BALANCE);
				
				// SELECT 된 데이터의 type 이 확실하게 숫자형(특히 정수형)인 경우
				// getInt() method 를 사용하여 직접 정수형으로 변환 후 받을 수 있ㄷ
				accDto.acBalance = result.getInt(DBContract.ACC.ACC_BALANCE);
				accList.add(accDto);
			}
			pStr.close();
			result.close();
			return accList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public AccDto findById(String acNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(AccDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AccDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deletet(String acNum) {
		// TODO Auto-generated method stub
		return 0;
	}

}
