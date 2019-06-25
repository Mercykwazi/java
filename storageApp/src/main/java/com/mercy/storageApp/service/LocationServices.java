package com.mercy.storageApp.service;
import com.mercy.storageApp.querries.Location;
import com.mercy.storageApp.repositary.LocationRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import java.util.List;

//@Repository
//public class LocationServices implements LocationService {
//
//
//}