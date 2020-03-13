package jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


public class EmployeeDAO {

	
	private JdbcTemplate jdbcTemplate; 
    
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    { 
        this.jdbcTemplate = jdbcTemplate; 
    } 
   
    /*public List<Employee> getEmployee() {
         String sql="select * from empl";
         List<Employee> list=jdbcTemplate.query(sql, new RowMapper<Employee>(){

             public Employee mapRow(ResultSet rs, int rowNum) throws SQLException
             {
        
                  Employee e=new Employee(rowNum, sql, sql);
                  e.setId(rs.getInt("id"));
                  e.setFirstname(rs.getString("firstname"));
                  e.setLastname(rs.getString("lastname"));
                  return e;
                 
             }
         });
         return list;
    }*/
    
    public boolean searchEmployee(int id) {
    	String sql="select * from Empl where id="+id;
    	return jdbcTemplate.query(sql, new ResultSetExtractor<Boolean>() {

    	@Override
    	public Boolean extractData(ResultSet rs) throws SQLException, DataAccessException {
    	if(rs.next()) {
    	return true;
    	}
    	else {
    	return false;
    	}

    	}

    	});
    	}

    	public int addRecord(Employee st) {
    	boolean search_res=searchEmployee(st.getId());
    	if(search_res)
    	{
    	return 0;
    	}
    	else
    	{
    	String sql="insert into empl values (?,?,?)";
    	return jdbcTemplate.update(sql,st.getId(),st.getFirstname(),st.getLastname());
    	}
    	}
    }


