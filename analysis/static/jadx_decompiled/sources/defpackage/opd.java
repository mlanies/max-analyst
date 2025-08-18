package defpackage;

/* loaded from: classes.dex */
public final class opd implements ol7 {
    public final jqe a;
    public final jqe b;
    public final long c;
    public final int o = f4a.a;

    public opd(int i, eqe eqeVar, iqe iqeVar) {
        this.a = eqeVar;
        this.b = iqeVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opd)) {
            return false;
        }
        opd opdVar = (opd) obj;
        opdVar.getClass();
        int i = f4a.a;
        return tpa.f(this.a, opdVar.a) && tpa.f(this.b, opdVar.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + k7d.f(Integer.hashCode(f4a.b) * 31, 31, this.a);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.o;
    }

    public final String toString() {
        return "SimpleActionItem(id=" + f4a.b + ", title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
