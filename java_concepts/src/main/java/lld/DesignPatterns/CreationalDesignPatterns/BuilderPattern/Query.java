package lld.DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class Query {

    // You can "final" to these attributes if we want to create a immutable object
    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;

    // We dont want anyone to directly this
    // Query object is to be build with using the Builder class
    // If it were public; anyone can put any random builder object which would
    // bypass the validations
    private Query(Builder builder) {
        this.select = builder.select;
        this.from = builder.from;
        this.where = builder.where;
        this.join = builder.join;
        this.orderBy = builder.orderBy;
        this.groupBy = builder.groupBy;
    }

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }

    public String getWhere() {
        return where;
    }

    public String getJoin() {
        return join;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public String getGroupBy() {
        return groupBy;
    }

    // this has to be static since you wont be able to build an object of Builder
    // if its not static before building the object of Query class
    public static class Builder {
        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public Builder() {
        }

        public Query build() {
            // you can validations here before creating the main Query object
            return new Query(this);
        }

        public Builder setSelect(String select) {
            this.select = select;
            return this;
        }

        public Builder setFrom(String from) {
            this.from = from;
            return this;
        }

        public Builder setWhere(String where) {
            this.where = where;
            return this;
        }

        public Builder setJoin(String join) {
            this.join = join;
            return this;
        }

        public Builder setOrderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }

        public Builder setGroupBy(String groupBy) {
            this.groupBy = groupBy;
            return this;
        }
    }

}
