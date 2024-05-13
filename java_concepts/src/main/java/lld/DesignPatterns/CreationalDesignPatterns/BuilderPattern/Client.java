package lld.DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Query q = new Query.Builder()
                .setSelect("col1, col2")
                .setFrom("table1")
                .setOrderBy("id ASC")
                .build();

        System.out.println(q);
    }
}
