package swingJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
public class RowMap implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user= new User();
		user.setFirstname(rs.getString(1));
		user.setLastname(rs.getString(2));
		user.setUsername(rs.getString(3));
		user.setPassword(rs.getString(4));
		user.setEmail(rs.getString(5));
		user.setPhone(rs.getString(6));
		return user;
	}

}