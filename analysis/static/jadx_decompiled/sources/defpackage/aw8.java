package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class aw8 implements Serializable {
    public final String X;
    public final int a;
    public final long b;
    public final fs8 c;
    public final String o;

    public aw8(int i, long j, fs8 fs8Var, String str, String str2) {
        this.a = i;
        this.b = j;
        this.c = fs8Var;
        this.o = str;
        this.X = str2;
    }

    public final String toString() {
        return "{type=" + zr6.q(this.a) + "}";
    }
}
