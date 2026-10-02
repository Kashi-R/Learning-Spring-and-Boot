import java.sql.*;


public class DemoJdbc {
    static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*
        import package
        load register
        create connection
        create statement
        execute statement
        process the results
        close
         */


            int rollno = 6;
//            String name = "Hari";
//            int marks = 34;
            String url="jdbc:postgresql://localhost:5432/demo" ;
            String uname="postgres";
            String pass="Kashi@321";
        System.out.println("Connecting to database...");
            String sql="DELETE FROM student WHERE rollno = ?";
           // Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);

        PreparedStatement st=con.prepareStatement(sql);
        st.setInt(1,rollno);
//        st.setString(2,name);
//        st.setInt(3,marks);
        st.executeUpdate();
//     OR   st.executeUpdate();

        con.close();



    }
}
