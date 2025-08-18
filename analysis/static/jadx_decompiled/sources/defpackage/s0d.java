package defpackage;

/* loaded from: classes2.dex */
public final class s0d implements efb {
    public final int X;
    public final jqe a;
    public final m56 b;
    public final kqe c;
    public final int o;

    public s0d(jqe jqeVar, kqe kqeVar, int i, int i2) {
        w8c w8cVar = new w8c(3);
        kqeVar = (i2 & 4) != 0 ? i4f.u : kqeVar;
        i = (i2 & 8) != 0 ? 2048 : i;
        this.a = jqeVar;
        this.b = w8cVar;
        this.c = kqeVar;
        this.o = i;
        this.X = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0d)) {
            return false;
        }
        s0d s0dVar = (s0d) obj;
        return tpa.f(this.a, s0dVar.a) && tpa.f(this.b, s0dVar.b) && tpa.f(this.c, s0dVar.c) && dy7.o(this.o, s0dVar.o);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.X;
    }

    public final String toString() {
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ", itemViewType=" + dy7.J(this.o) + ")";
    }
}
