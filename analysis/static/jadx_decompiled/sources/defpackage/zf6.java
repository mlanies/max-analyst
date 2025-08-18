package defpackage;

/* loaded from: classes.dex */
public final class zf6 {
    public final dg6 a;
    public final fg6 b;
    public boolean c = true;

    public zf6(dg6 dg6Var, fg6 fg6Var) {
        this.a = dg6Var;
        this.b = fg6Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(!this.c ? "+>" : "->");
        sb.append(" ");
        sb.append(this.b);
        return sb.toString();
    }
}
