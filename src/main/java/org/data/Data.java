package org.data;

public class Data {
    public static String getUrl(String dataBaseName) {
        return "jdbc:mysql://localhost:3306/" + dataBaseName + "?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    }
    public static final String USER = "root";
    public static final String PASS = "(5bS=Jb5";
}
