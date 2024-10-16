package student_management;

import java.sql.*;

public class StudentDAO {
    public int storeddb(int id,String name,String department) throws SQLException {

        Connection con = Dbconnection.getconnection();
        String query = "insert into students values(?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setString(3,department);
        int i = ps.executeUpdate();
        return i;
    }

    public void getdb() throws SQLException {
        Connection con = Dbconnection.getconnection();
        String query = "select * from students";
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);

        while (res.next()){
            System.out.println("id is "+res.getInt(1));
            System.out.println("name is "+res.getString(2));
            System.out.println("department is "+res.getString(3));
            System.out.println(" ");
        }
    }

}
