package defpackage;

/* loaded from: classes.dex */
public final class st5 implements ol7 {
    public final jqe a;
    public final boolean b;
    public final int c;

    public /* synthetic */ st5(iqe iqeVar, boolean z) {
        this(iqeVar, z, 20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st5)) {
            return false;
        }
        st5 st5Var = (st5) obj;
        return tpa.f(this.a, st5Var.a) && this.b == st5Var.b && this.c == st5Var.c;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return Long.MAX_VALUE;
    }

    public final int hashCode() {
        jqe jqeVar = this.a;
        return Integer.hashCode(this.c) + ms2.d((jqeVar == null ? 0 : jqeVar.hashCode()) * 31, 31, this.b);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderEditNameInputItem(defaultValue=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.b);
        sb.append(", nameLengthLimit=");
        return zr6.j(sb, this.c, ")");
    }

    public st5(jqe jqeVar, boolean z, int i) {
        this.a = jqeVar;
        this.b = z;
        this.c = i;
    }
}
