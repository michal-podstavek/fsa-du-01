package sk.posam.fsa.du.jdbc;

public class JdbcApplication {

    private static final String url = "jdbc:postgresql://localhost:5432/dvdrental";
    private static final String user = "postgres";
    private static final String password = "a";

    public static void main(String[] args) {
        pocetHercov();
        zoznamHercov();
        najdiHercaPodlaId(123);
        vlozHerca("Jan", "Hrach");
    }

    /**
     * Metoda vypise pocet hercov v DB
     */
    private static void pocetHercov() {
//        Connection connection = DriverManager.getConnection(url, user, password);
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT count(*) FROM actor");
//        resultSet.next();
//        int count = resultSet.getInt(1);
    }

    /**
     * Metoda vypise meno a priezvisko kazdeho herca ulozeneho v DB
     */
    private static void zoznamHercov() {
//        ResultSet resultSet = statement.executeQuery("SELECT actor_id, first_name, last_name FROM actor");
//        while (resultSet.next()) {
//        long id = resultSet.getLong("actor_id");
//        String krstneMeno = resultSet.getString("first_name");
    }

    /**
     * Metoda najde v DB herca so zadanym ID a vrati ho ako navratovu hodnotu
     */
    private static Actor najdiHercaPodlaId(int actorId) {
//        String sql = "SELECT actor_id,first_name,last_name FROM actor WHERE actor_id = ?";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setInt(1, actorId);
//        ResultSet resultSet = statement.executeQuery();
        return null;
    }

    /**
     * Metoda vytvori v DB noveho herca a vrati true, ak sa ho podarilo vlozit
     */
    private static boolean vlozHerca(String meno, String priezvisko) {
//        String SQL = "INSERT INTO actor(first_name,last_name) VALUES(?,?)";
//        PreparedStatement pstmt = conn.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS)
//        pstmt.setString(1, meno);
//        pstmt.setString(2, priezvisko);
//        int affectedRows = pstmt.executeUpdate();
//        return: check the affected rows
        return false;
    }

}
