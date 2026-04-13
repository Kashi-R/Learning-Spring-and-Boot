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
            String url="jdbc:postgresql://localhost:5432/demo" ;
            String uname="postgres";
            String pass="Kashi@321";
            String sql="update student set name = 'Max' where sid =5";
            Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st=con.createStatement();
        boolean status =st.execute(sql);
        System.out.println(status);// This gives false if the query
        //is updation type insert, updt, dlt, AND true for rs type from table show etc

//
        con.close();
        System.out.println("Connection closed");


    }
}
