package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class mr5 extends wk0 implements gs5 {
    public xae Y;
    public dqd Z;
    public final vae a;
    public final b66 b;
    public final int c;
    public final int o;
    public volatile boolean s0;
    public volatile boolean t0;
    public Iterator v0;
    public int w0;
    public int x0;
    public final AtomicReference u0 = new AtomicReference();
    public final AtomicLong X = new AtomicLong();

    public mr5(vae vaeVar, b66 b66Var, int i) {
        this.a = vaeVar;
        this.b = b66Var;
        this.c = i;
        this.o = i - (i >> 2);
    }

    @Override // defpackage.vae
    public final void b() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        h();
    }

    @Override // defpackage.xae
    public final void cancel() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        this.Y.cancel();
        if (getAndIncrement() == 0) {
            this.Z.clear();
        }
    }

    @Override // defpackage.dqd
    public final void clear() {
        this.v0 = null;
        this.Z.clear();
    }

    @Override // defpackage.vae
    public final void e(Object obj) {
        if (this.s0) {
            return;
        }
        if (this.x0 != 0 || this.Z.offer(obj)) {
            h();
        } else {
            onError(new QueueOverflowException());
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.Y, xaeVar)) {
            this.Y = xaeVar;
            if (xaeVar instanceof vqb) {
                vqb vqbVar = (vqb) xaeVar;
                int iN = vqbVar.n(3);
                if (iN == 1) {
                    this.x0 = iN;
                    this.Z = vqbVar;
                    this.s0 = true;
                    this.a.f(this);
                    return;
                }
                if (iN == 2) {
                    this.x0 = iN;
                    this.Z = vqbVar;
                    this.a.f(this);
                    xaeVar.j(this.c);
                    return;
                }
            }
            this.Z = new owd(this.c);
            this.a.f(this);
            xaeVar.j(this.c);
        }
    }

    public final boolean g(boolean z, boolean z2, vae vaeVar, dqd dqdVar) {
        if (this.t0) {
            this.v0 = null;
            dqdVar.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        if (((Throwable) this.u0.get()) == null) {
            if (!z2) {
                return false;
            }
            vaeVar.b();
            return true;
        }
        Throwable thD = q45.d(this.u0);
        this.v0 = null;
        dqdVar.clear();
        vaeVar.onError(thD);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146 A[PHI: r6
      0x0146: PHI (r6v4 java.util.Iterator) = (r6v3 java.util.Iterator), (r6v6 java.util.Iterator) binds: [B:36:0x0091, B:77:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr5.h():void");
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.v0 == null && this.Z.isEmpty();
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.X, j);
            h();
        }
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        return this.x0 == 1 ? 1 : 0;
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        if (this.s0 || !q45.a(this.u0, th)) {
            j47.Z(th);
        } else {
            this.s0 = true;
            h();
        }
    }

    @Override // defpackage.dqd
    public final Object poll() {
        Iterator it = this.v0;
        while (true) {
            if (it == null) {
                Object objPoll = this.Z.poll();
                if (objPoll != null) {
                    it = ((Iterable) this.b.mo131apply(objPoll)).iterator();
                    if (it.hasNext()) {
                        this.v0 = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.v0 = null;
        }
        return next;
    }
}
