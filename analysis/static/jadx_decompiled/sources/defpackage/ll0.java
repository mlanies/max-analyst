package defpackage;

/* loaded from: classes.dex */
public final class ll0 implements zl4, as {
    public jn X;
    public boolean Y;
    public volatile boolean Z;
    public final f2a a;
    public final ml0 b;
    public boolean c;
    public boolean o;
    public long s0;

    public ll0(f2a f2aVar, ml0 ml0Var) {
        this.a = f2aVar;
        this.b = ml0Var;
    }

    public final void a(long j, Object obj) {
        if (this.Z) {
            return;
        }
        if (!this.Y) {
            synchronized (this) {
                try {
                    if (this.Z) {
                        return;
                    }
                    if (this.s0 == j) {
                        return;
                    }
                    if (this.o) {
                        jn jnVar = this.X;
                        if (jnVar == null) {
                            jnVar = new jn(1, (byte) 0);
                            this.X = jnVar;
                        }
                        jnVar.c(obj);
                        return;
                    }
                    this.c = true;
                    this.Y = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        test(obj);
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.b.B(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.Z;
    }

    @Override // defpackage.b7b
    public final boolean test(Object obj) {
        return this.Z || hv9.a(this.a, obj);
    }
}
