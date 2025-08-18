package defpackage;

/* loaded from: classes.dex */
public enum cb7 implements s77 {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_JAVA_COMMENTS(ya7.ALLOW_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_YAML_COMMENTS(ya7.ALLOW_YAML_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_SINGLE_QUOTES(ya7.ALLOW_SINGLE_QUOTES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNQUOTED_FIELD_NAMES(ya7.ALLOW_UNQUOTED_FIELD_NAMES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNESCAPED_CONTROL_CHARS(ya7.ALLOW_UNQUOTED_CONTROL_CHARS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(ya7.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(ya7.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(ya7.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_NON_NUMERIC_NUMBERS(ya7.ALLOW_NON_NUMERIC_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_MISSING_VALUES(ya7.ALLOW_MISSING_VALUES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_TRAILING_COMMA(ya7.ALLOW_TRAILING_COMMA);

    public final int a = 1 << ordinal();
    public final ya7 b;

    cb7(ya7 ya7Var) {
        this.b = ya7Var;
    }

    @Override // defpackage.s77
    public final boolean a() {
        return false;
    }

    @Override // defpackage.s77
    public final int b() {
        return this.a;
    }
}
