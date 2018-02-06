package com.internousdev.knit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.knit.dto.CartDTO;
import com.internousdev.knit.util.DBConnector;

public class SettlementCompleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con =db.getConnection();

	

