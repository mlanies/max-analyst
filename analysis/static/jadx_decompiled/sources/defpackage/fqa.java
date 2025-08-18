package defpackage;

/* loaded from: classes.dex */
public final class fqa implements ig1, bo1 {
    public static final fqa c = new fqa(mqa.a(), new baf(0, "", "", true, null));
    public final ig1 a;
    public final bo1 b;

    public fqa(ig1 ig1Var, bo1 bo1Var) {
        this.a = ig1Var;
        this.b = bo1Var;
    }

    @Override // defpackage.ig1
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.ig1
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.bo1
    public final boolean c() {
        return this.b.c();
    }

    @Override // defpackage.bo1
    public final long d() {
        return this.b.d();
    }

    @Override // defpackage.ig1
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqa)) {
            return false;
        }
        fqa fqaVar = (fqa) obj;
        return tpa.f(this.a, fqaVar.a) && tpa.f(this.b, fqaVar.b);
    }

    @Override // defpackage.ig1
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.ig1
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.ig1
    public final gg1 getId() {
        return this.a.getId();
    }

    @Override // defpackage.bo1
    public final String getName() {
        return this.b.getName();
    }

    @Override // defpackage.ig1
    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ig1
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.ig1
    public final boolean isConnected() {
        return this.a.isConnected();
    }

    @Override // defpackage.ig1
    public final boolean isScreenCaptureEnabled() {
        return this.a.isScreenCaptureEnabled();
    }

    @Override // defpackage.bo1
    public final CharSequence j() {
        return this.b.j();
    }

    @Override // defpackage.ig1
    public final boolean k() {
        return this.a.k();
    }

    @Override // defpackage.ig1
    public final boolean l() {
        return this.a.l();
    }

    @Override // defpackage.ig1
    public final boolean m() {
        return this.a.m();
    }

    @Override // defpackage.ig1
    public final boolean n() {
        return this.a.n();
    }

    @Override // defpackage.ig1
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.ig1
    public final llf p() {
        return this.a.p();
    }

    @Override // defpackage.bo1
    public final String q() {
        return this.b.q();
    }

    @Override // defpackage.ig1
    public final int r() {
        return this.a.r();
    }

    @Override // defpackage.ig1
    public final llf s() {
        return this.a.s();
    }

    @Override // defpackage.ig1
    public final boolean t() {
        return this.a.t();
    }

    public final String toString() {
        return "ParticipantPair(member=" + this.a + ", user=" + this.b + ")";
    }
}
