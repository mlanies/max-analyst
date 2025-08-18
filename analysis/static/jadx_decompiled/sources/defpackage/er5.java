package defpackage;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class er5 implements gs5, vqb {
    public int X;
    public final Collection Y;
    public final b66 Z;
    public final vae a;
    public xae b;
    public vqb c;
    public boolean o;

    public er5(vae vaeVar, b66 b66Var, Collection collection) {
        this.a = vaeVar;
        this.Z = b66Var;
        this.Y = collection;
    }

    @Override // defpackage.vae
    public final void b() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.Y.clear();
        this.a.b();
    }

    @Override // defpackage.xae
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.dqd
    public final void clear() {
        this.Y.clear();
        this.c.clear();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (this.o) {
            return;
        }
        int i = this.X;
        vae vaeVar = this.a;
        if (i != 0) {
            vaeVar.e(null);
            return;
        }
        try {
            Object objMo131apply = this.Z.mo131apply(obj);
            Objects.requireNonNull(objMo131apply, "The keySelector returned a null key");
            if (this.Y.add(objMo131apply)) {
                vaeVar.e(obj);
            } else {
                this.b.j(1L);
            }
        } catch (Throwable th) {
            c37.B(th);
            this.b.cancel();
            onError(th);
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.b, xaeVar)) {
            this.b = xaeVar;
            if (xaeVar instanceof vqb) {
                this.c = (vqb) xaeVar;
            }
            this.a.f(this);
        }
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.xae
    public final void j(long j) {
        this.b.j(j);
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        vqb vqbVar = this.c;
        if (vqbVar == null || (i & 4) != 0) {
            return 0;
        }
        int iN = vqbVar.n(i);
        if (iN == 0) {
            return iN;
        }
        this.X = iN;
        return iN;
    }

    @Override // defpackage.dqd
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        if (this.o) {
            j47.Z(th);
            return;
        }
        this.o = true;
        this.Y.clear();
        this.a.onError(th);
    }

    @Override // defpackage.dqd
    public final Object poll() {
        Object objPoll;
        while (true) {
            objPoll = this.c.poll();
            if (objPoll == null) {
                break;
            }
            Object objMo131apply = this.Z.mo131apply(objPoll);
            Objects.requireNonNull(objMo131apply, "The keySelector returned a null key");
            if (this.Y.add(objMo131apply)) {
                break;
            }
            if (this.X == 2) {
                this.b.j(1L);
            }
        }
        return objPoll;
    }
}
