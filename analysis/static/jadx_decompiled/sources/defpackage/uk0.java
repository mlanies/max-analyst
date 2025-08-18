package defpackage;

/* loaded from: classes.dex */
public abstract class uk0 implements f2a, tqb {
    public int X;
    public final f2a a;
    public zl4 b;
    public tqb c;
    public boolean o;

    public uk0(f2a f2aVar) {
        this.a = f2aVar;
    }

    public final int a(int i) {
        tqb tqbVar = this.c;
        if (tqbVar == null || (i & 4) != 0) {
            return 0;
        }
        int iN = tqbVar.n(i);
        if (iN != 0) {
            this.X = iN;
        }
        return iN;
    }

    @Override // defpackage.f2a
    public void b() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.a.b();
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        if (dm4.f(this.b, zl4Var)) {
            this.b = zl4Var;
            if (zl4Var instanceof tqb) {
                this.c = (tqb) zl4Var;
            }
            this.a.c(this);
        }
    }

    public void clear() {
        this.c.clear();
    }

    @Override // defpackage.zl4
    public final void g() {
        this.b.g();
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.b.h();
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.uqb
    public int n(int i) {
        return a(i);
    }

    @Override // defpackage.dqd
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.f2a
    public void onError(Throwable th) {
        if (this.o) {
            j47.Z(th);
        } else {
            this.o = true;
            this.a.onError(th);
        }
    }
}
