public enum Reactions {

    IGNORE("не замечает"),
    CRY("вопит"),
    FEAR("вне себя от ужаса");

    private String condition;
    Reactions(String condition) { this.condition = condition; }
    public String getCondition() { return condition; }

}
