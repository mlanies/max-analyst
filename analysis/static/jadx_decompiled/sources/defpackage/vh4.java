package defpackage;

/* loaded from: classes2.dex */
public final class vh4 implements efb {
    public final String a;
    public final jqe b;
    public final int c;

    public vh4(String str, eqe eqeVar, int i) {
        this.a = str;
        this.b = eqeVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh4)) {
            return false;
        }
        vh4 vh4Var = (vh4) obj;
        return tpa.f(this.a, vh4Var.a) && tpa.f(this.b, vh4Var.b) && this.c == vh4Var.c;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 4;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 4) == ol7Var.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c) + k7d.f((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return 4;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DescriptionItem(text=");
        sb.append(this.a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", limitCharacters=");
        return zr6.j(sb, this.c, ")");
    }
}
