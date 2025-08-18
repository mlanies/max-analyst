package defpackage;

/* loaded from: classes.dex */
public final class w9f implements ol7 {
    public final long X;
    public final at5 a;
    public final v9f b;
    public final jqe c;
    public final int o;

    public w9f(at5 at5Var, v9f v9fVar, jqe jqeVar) {
        String str;
        this.a = at5Var;
        this.b = v9fVar;
        this.c = jqeVar;
        this.o = v9fVar.ordinal();
        this.X = (v9fVar.hashCode() * 33) + ((at5Var == null || (str = at5Var.a) == null) ? 0 : str.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9f)) {
            return false;
        }
        w9f w9fVar = (w9f) obj;
        return tpa.f(this.a, w9fVar.a) && this.b == w9fVar.b && tpa.f(this.c, w9fVar.c);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.X;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        if (!(ol7Var instanceof w9f)) {
            return false;
        }
        at5 at5Var = this.a;
        String str = at5Var != null ? at5Var.a : null;
        at5 at5Var2 = ((w9f) ol7Var).a;
        return tpa.f(str, at5Var2 != null ? at5Var2.a : null);
    }

    public final int hashCode() {
        at5 at5Var = this.a;
        int iHashCode = at5Var == null ? 0 : at5Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // defpackage.ol7
    public final int l() {
        return this.o;
    }

    public final String toString() {
        return "UserFolderListItem(folder=" + this.a + ", type=" + this.b + ", processedTitle=" + this.c + ")";
    }
}
