package defpackage;

/* loaded from: classes.dex */
public final class i42 {
    public static final h42 b = new h42();
    public final Object a;

    public /* synthetic */ i42(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        g42 g42Var = obj instanceof g42 ? (g42) obj : null;
        if (g42Var != null) {
            return g42Var.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i42) {
            return tpa.f(this.a, ((i42) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof g42) {
            return ((g42) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
