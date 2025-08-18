package defpackage;

/* loaded from: classes.dex */
public enum sa7 {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_UNKNOWN(false);

    public final boolean a;
    public final int b = 1 << ordinal();

    sa7(boolean z) {
        this.a = z;
    }

    public final boolean a(int i) {
        return (this.b & i) != 0;
    }
}
