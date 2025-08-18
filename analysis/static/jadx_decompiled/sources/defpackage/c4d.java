package defpackage;

/* loaded from: classes2.dex */
public final class c4d implements efb {
    public final int X;
    public final int a;
    public final boolean b;
    public final jqe c;
    public final jqe o;

    public c4d(int i, boolean z, eqe eqeVar, eqe eqeVar2, int i2) {
        this.a = i;
        this.b = z;
        this.c = eqeVar;
        this.o = eqeVar2;
        this.X = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4d)) {
            return false;
        }
        c4d c4dVar = (c4d) obj;
        return this.a == c4dVar.a && this.b == c4dVar.b && tpa.f(this.c, c4dVar.c) && tpa.f(this.o, c4dVar.o) && this.X == c4dVar.X;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 8192;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return ((long) 8192) == ol7Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(this.X) + k7d.f(k7d.f(ms2.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.X;
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableItem(valueId=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.o);
        sb.append(", viewType=");
        return zr6.j(sb, this.X, ")");
    }
}
