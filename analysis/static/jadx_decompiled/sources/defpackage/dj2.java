package defpackage;

/* loaded from: classes.dex */
public final class dj2 {
    public final jqe a;

    public dj2(jqe jqeVar) {
        this.a = jqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj2) && tpa.f(this.a, ((dj2) obj).a);
    }

    public final int hashCode() {
        jqe jqeVar = this.a;
        if (jqeVar == null) {
            return 0;
        }
        return jqeVar.hashCode();
    }

    public final String toString() {
        return rh4.l(new StringBuilder("ToolbarState(title="), this.a, ")");
    }
}
