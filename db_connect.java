
/**
 * connects to the "marklist" db
 * created a "marklist" db if it doesnt extist
 */
import java.sql.*;

public class db_connect {
    static Connection con = null;
    Statement st = null;

    public db_connect() {

        try { // connects to db database
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/marklist", "root", "");

            st = con.createStatement();

            try { // creates the table "marklist" if it doesnt exist
                st.executeUpdate(
                        "Create table marklist(regno int primary key,name varchar(50),password varchar(50),mark1 int,mark2 int,mark3 int,mark4 int,mark5 int)");
                System.out.print("Connected");
            } catch (Exception e) {
                System.out.println(e.getMessage() + "\n Continuing operation");

            }
        } catch (Exception e) {

            System.out.print(e.getMessage());
        }

    }

    public Boolean addMarks(String regno, String name1, String mark1, String mark2, String mark3,
            String mark4,
            String mark5) {

        Statement st = null;
        try {
            st = con.createStatement();
        } catch (SQLException e1) {

            e1.printStackTrace();
        }

        try {
            st.executeUpdate(

                    "UPDATE marklist SET mark1 = " + mark1 + ", mark2 = " + mark2 + ", mark3 = " + mark3 + ", mark4 = "
                            + mark4 + ",mark5 = " + mark5 + " WHERE regno = " + regno + ";");

            System.out.print("Table updated");
            return true;
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return false;
        }

    }

    public int[] searchTable(String regno) {

        ResultSet rs = null;
        int[] marks;
        marks = new int[5];

        try {
            rs = st.executeQuery("SELECT mark1,mark2,mark3,mark4,mark5 FROM marklist WHERE regno = " + regno + ";");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        try {
            while (rs.next()) {
                marks[0] = Integer.parseInt(rs.getString("mark1"));
                marks[1] = Integer.parseInt(rs.getString("mark2"));
                marks[2] = Integer.parseInt(rs.getString("mark3"));
                marks[3] = Integer.parseInt(rs.getString("mark4"));
                marks[4] = Integer.parseInt(rs.getString("mark5"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return marks;
    }
}