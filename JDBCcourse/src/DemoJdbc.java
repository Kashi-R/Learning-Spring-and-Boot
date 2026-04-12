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
            String sql="select * from student ";
            Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection Established");
        Statement st=con.createStatement();
        ResultSet rs =st.executeQuery(sql);
//        System.out.println(rs.next());//pointer comes to first.
//
//        String name = rs.getString("name");
//        System.out.println("Name of Students are : "+name);

//        while(rs.next()){
//            System.out.print(rs.getInt(1)+ "-");
//            System.out.print(rs.getString(2)+ "-");
//            System.out.println(rs.getInt(3));
//            }
            while(rs.next()){
            ResultSetMetaData meta = rs.getMetaData();
            int colCount = meta.getColumnCount();

            int colIndex = 1;
            while (colIndex <= colCount) {
                System.out.print( rs.getString(colIndex) + " | ");
                colIndex++;
            }
            System.out.println();
        }
        con.close();
        System.out.println("Connection closed");


    }
}
