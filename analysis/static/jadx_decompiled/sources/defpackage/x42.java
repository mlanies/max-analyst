package defpackage;

/* loaded from: classes.dex */
public final class x42 {
    public final String a;
    public final x42 b;
    public final int c;

    public x42(String str, x42 x42Var) {
        this.a = str;
        this.b = x42Var;
        this.c = x42Var != null ? 1 + x42Var.c : 1;
    }
}
