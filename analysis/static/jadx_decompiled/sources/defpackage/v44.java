package defpackage;

/* loaded from: classes2.dex */
public enum v44 {
    DISABLED(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOGS(1),
    FILE_LOGS(2),
    DEV_OPTIONS_MENU(3);

    public static final v44[] X = values();
    public final int a;

    v44(int i) {
        this.a = i;
    }

    public static v44 a(int i) {
        for (v44 v44Var : X) {
            if (v44Var.a == i) {
                return v44Var;
            }
        }
        return DISABLED;
    }
}
