package defpackage;

/* loaded from: classes2.dex */
public final class mib extends cjb {
    public final int a;
    public final m56 b;
    public final kqe c;
    public final int o;

    public mib(int i, kqe kqeVar, int i2) {
        ww9 ww9Var = new ww9(21);
        kqeVar = (i2 & 4) != 0 ? i4f.u : kqeVar;
        this.a = i;
        this.b = ww9Var;
        this.c = kqeVar;
        this.o = 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mib)) {
            return false;
        }
        mib mibVar = (mib) obj;
        return this.a == mibVar.a && tpa.f(this.b, mibVar.b) && tpa.f(this.c, mibVar.c);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 4;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.o;
    }

    public final String toString() {
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ")";
    }
}
