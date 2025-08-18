package defpackage;

/* loaded from: classes.dex */
public final class c14 {
    public final lqb a;
    public final boolean b;

    public c14(lqb lqbVar, boolean z) {
        this.a = lqbVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c14)) {
            return false;
        }
        c14 c14Var = (c14) obj;
        return c14Var.a.equals(this.a) && c14Var.b == this.b;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
