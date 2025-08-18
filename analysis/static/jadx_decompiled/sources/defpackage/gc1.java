package defpackage;

/* loaded from: classes.dex */
public final class gc1 implements jc1 {
    public final jqe a;
    public final bfd b;
    public final Integer c = Integer.valueOf(q7a.h);
    public final long o = r7a.b;
    public final eqe X = new eqe(t7a.f);

    public gc1(jqe jqeVar, afd afdVar) {
        this.a = jqeVar;
        this.b = afdVar;
    }

    @Override // defpackage.jc1, defpackage.kfd
    public final jqe b() {
        return this.a;
    }

    @Override // defpackage.jc1, defpackage.kfd
    public final bfd c() {
        return this.b;
    }

    @Override // defpackage.jc1, defpackage.kfd
    public final hfd e() {
        return cfd.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc1)) {
            return false;
        }
        gc1 gc1Var = (gc1) obj;
        return tpa.f(this.a, gc1Var.a) && tpa.f(this.b, gc1Var.b);
    }

    @Override // defpackage.kfd
    public final Integer f() {
        return this.c;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.o;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return this.X;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bfd bfdVar = this.b;
        return iHashCode + (bfdVar == null ? 0 : bfdVar.hashCode());
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return r7a.m;
    }

    public final String toString() {
        return "OpenCallChat(descriptionRes=" + this.a + ", counterType=" + this.b + ")";
    }

    @Override // defpackage.kfd
    public final int u() {
        return 0;
    }
}
