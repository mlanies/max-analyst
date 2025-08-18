package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ir5 extends AtomicInteger implements gs5, xae {
    public static final hr5[] C0 = new hr5[0];
    public static final hr5[] D0 = new hr5[0];
    public int A0;
    public final int B0;
    public final int X;
    public volatile bqd Y;
    public volatile boolean Z;
    public final vae a;
    public final b66 b;
    public final boolean c;
    public final int o;
    public final az s0 = new az();
    public volatile boolean t0;
    public final AtomicReference u0;
    public final AtomicLong v0;
    public xae w0;
    public long x0;
    public long y0;
    public int z0;

    public ir5(vae vaeVar, b66 b66Var, boolean z, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.u0 = atomicReference;
        this.v0 = new AtomicLong();
        this.a = vaeVar;
        this.b = b66Var;
        this.c = z;
        this.o = i;
        this.X = i2;
        this.B0 = Math.max(1, i >> 1);
        atomicReference.lazySet(C0);
    }

    public final boolean a() {
        if (this.t0) {
            bqd bqdVar = this.Y;
            if (bqdVar != null) {
                bqdVar.clear();
            }
            return true;
        }
        if (this.c || this.s0.get() == null) {
            return false;
        }
        bqd bqdVar2 = this.Y;
        if (bqdVar2 != null) {
            bqdVar2.clear();
        }
        this.s0.e(this.a);
        return true;
    }

    @Override // defpackage.vae
    public final void b() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        c();
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    @Override // defpackage.xae
    public final void cancel() {
        bqd bqdVar;
        if (this.t0) {
            return;
        }
        this.t0 = true;
        this.w0.cancel();
        AtomicReference atomicReference = this.u0;
        hr5[] hr5VarArr = D0;
        hr5[] hr5VarArr2 = (hr5[]) atomicReference.getAndSet(hr5VarArr);
        if (hr5VarArr2 != hr5VarArr) {
            for (hr5 hr5Var : hr5VarArr2) {
                hr5Var.getClass();
                zae.a(hr5Var);
            }
            this.s0.b();
        }
        if (getAndIncrement() != 0 || (bqdVar = this.Y) == null) {
            return;
        }
        bqdVar.clear();
    }

    public final void d() {
        long j;
        long j2;
        long j3;
        boolean z;
        int i;
        int i2;
        long j4;
        long j5;
        vae vaeVar = this.a;
        int iAddAndGet = 1;
        while (!a()) {
            bqd bqdVar = this.Y;
            long jAddAndGet = this.v0.get();
            boolean z2 = jAddAndGet == Long.MAX_VALUE;
            long j6 = 0;
            if (bqdVar != null) {
                long j7 = 0;
                j = 0;
                while (jAddAndGet != 0) {
                    Object objPoll = bqdVar.poll();
                    if (a()) {
                        return;
                    }
                    if (objPoll == null) {
                        break;
                    }
                    vaeVar.e(objPoll);
                    j++;
                    j7++;
                    jAddAndGet--;
                }
                if (j7 != 0) {
                    jAddAndGet = z2 ? Long.MAX_VALUE : this.v0.addAndGet(-j7);
                }
            } else {
                j = 0;
            }
            boolean z3 = this.Z;
            bqd bqdVar2 = this.Y;
            hr5[] hr5VarArr = (hr5[]) this.u0.get();
            int length = hr5VarArr.length;
            if (z3 && ((bqdVar2 == null || bqdVar2.isEmpty()) && length == 0)) {
                this.s0.e(this.a);
                return;
            }
            int i3 = iAddAndGet;
            if (length != 0) {
                long j8 = this.y0;
                int i4 = this.z0;
                if (length <= i4 || hr5VarArr[i4].a != j8) {
                    if (length <= i4) {
                        i4 = 0;
                    }
                    for (int i5 = 0; i5 < length && hr5VarArr[i4].a != j8; i5++) {
                        i4++;
                        if (i4 == length) {
                            i4 = 0;
                        }
                    }
                    this.z0 = i4;
                    this.y0 = hr5VarArr[i4].a;
                }
                int i6 = i4;
                boolean z4 = false;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        z = z4;
                        break;
                    }
                    if (a()) {
                        return;
                    }
                    hr5 hr5Var = hr5VarArr[i6];
                    Object obj = null;
                    while (true) {
                        dqd dqdVar = hr5Var.Y;
                        if (dqdVar == null) {
                            i = length;
                            break;
                        }
                        i = length;
                        Object obj2 = obj;
                        long j9 = j6;
                        while (true) {
                            if (jAddAndGet == j6) {
                                j4 = j6;
                                break;
                            }
                            if (a()) {
                                return;
                            }
                            try {
                                Object objPoll2 = dqdVar.poll();
                                if (objPoll2 == null) {
                                    obj2 = objPoll2;
                                    j4 = 0;
                                    break;
                                } else {
                                    vaeVar.e(objPoll2);
                                    jAddAndGet--;
                                    j9++;
                                    obj2 = objPoll2;
                                    j6 = 0;
                                }
                            } catch (Throwable th) {
                                c37.B(th);
                                zae.a(hr5Var);
                                this.s0.a(th);
                                if (!this.c) {
                                    this.w0.cancel();
                                }
                                if (a()) {
                                    return;
                                }
                                h(hr5Var);
                                i7++;
                                i2 = i;
                                z4 = true;
                            }
                        }
                        if (j9 != j4) {
                            jAddAndGet = !z2 ? this.v0.addAndGet(-j9) : Long.MAX_VALUE;
                            hr5Var.a(j9);
                            j5 = 0;
                        } else {
                            j5 = j4;
                        }
                        if (jAddAndGet == j5 || obj2 == null) {
                            break;
                        }
                        length = i;
                        obj = obj2;
                        j6 = 0;
                    }
                    boolean z5 = hr5Var.X;
                    dqd dqdVar2 = hr5Var.Y;
                    if (z5 && (dqdVar2 == null || dqdVar2.isEmpty())) {
                        h(hr5Var);
                        if (a()) {
                            return;
                        }
                        j++;
                        z4 = true;
                    }
                    if (jAddAndGet == 0) {
                        z = z4;
                        break;
                    }
                    i6++;
                    i2 = i;
                    if (i6 == i2) {
                        i6 = 0;
                    }
                    i7++;
                    length = i2;
                    j6 = 0;
                }
                this.z0 = i6;
                this.y0 = hr5VarArr[i6].a;
                j3 = j;
                j2 = 0;
            } else {
                j2 = 0;
                j3 = j;
                z = false;
            }
            if (j3 != j2 && !this.t0) {
                this.w0.j(j3);
            }
            if (z) {
                iAddAndGet = i3;
            } else {
                iAddAndGet = addAndGet(-i3);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vae
    public final void e(Object obj) {
        if (this.Z) {
            return;
        }
        try {
            Object objMo131apply = this.b.mo131apply(obj);
            Objects.requireNonNull(objMo131apply, "The mapper returned a null Publisher");
            ypb ypbVar = (ypb) objMo131apply;
            if (!(ypbVar instanceof kde)) {
                int i = this.X;
                long j = this.x0;
                this.x0 = 1 + j;
                hr5 hr5Var = new hr5(this, i, j);
                while (true) {
                    AtomicReference atomicReference = this.u0;
                    hr5[] hr5VarArr = (hr5[]) atomicReference.get();
                    if (hr5VarArr == D0) {
                        zae.a(hr5Var);
                        return;
                    }
                    int length = hr5VarArr.length;
                    hr5[] hr5VarArr2 = new hr5[length + 1];
                    System.arraycopy(hr5VarArr, 0, hr5VarArr2, 0, length);
                    hr5VarArr2[length] = hr5Var;
                    while (!atomicReference.compareAndSet(hr5VarArr, hr5VarArr2)) {
                        if (atomicReference.get() != hr5VarArr) {
                            break;
                        }
                    }
                    ((wq5) ypbVar).d(hr5Var);
                    return;
                }
            }
            try {
                Object obj2 = ((kde) ypbVar).get();
                if (obj2 == null) {
                    if (this.o == Integer.MAX_VALUE || this.t0) {
                        return;
                    }
                    int i2 = this.A0 + 1;
                    this.A0 = i2;
                    int i3 = this.B0;
                    if (i2 == i3) {
                        this.A0 = 0;
                        this.w0.j(i3);
                        return;
                    }
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j2 = this.v0.get();
                    bqd bqdVarG = this.Y;
                    if (j2 == 0 || !(bqdVarG == null || bqdVarG.isEmpty())) {
                        if (bqdVarG == null) {
                            bqdVarG = g();
                        }
                        if (!bqdVarG.offer(obj2)) {
                            onError(new QueueOverflowException());
                        }
                    } else {
                        this.a.e(obj2);
                        if (j2 != Long.MAX_VALUE) {
                            this.v0.decrementAndGet();
                        }
                        if (this.o != Integer.MAX_VALUE && !this.t0) {
                            int i4 = this.A0 + 1;
                            this.A0 = i4;
                            int i5 = this.B0;
                            if (i4 == i5) {
                                this.A0 = 0;
                                this.w0.j(i5);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else if (!g().offer(obj2)) {
                    onError(new QueueOverflowException());
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
                d();
            } catch (Throwable th) {
                c37.B(th);
                this.s0.a(th);
                c();
            }
        } catch (Throwable th2) {
            c37.B(th2);
            this.w0.cancel();
            onError(th2);
        }
    }

    @Override // defpackage.vae
    public final void f(xae xaeVar) {
        if (zae.e(this.w0, xaeVar)) {
            this.w0 = xaeVar;
            this.a.f(this);
            if (this.t0) {
                return;
            }
            int i = this.o;
            if (i == Integer.MAX_VALUE) {
                xaeVar.j(Long.MAX_VALUE);
            } else {
                xaeVar.j(i);
            }
        }
    }

    public final bqd g() {
        bqd pwdVar = this.Y;
        if (pwdVar == null) {
            pwdVar = this.o == Integer.MAX_VALUE ? new pwd(this.X) : new owd(this.o);
            this.Y = pwdVar;
        }
        return pwdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(hr5 hr5Var) {
        hr5[] hr5VarArr;
        while (true) {
            AtomicReference atomicReference = this.u0;
            hr5[] hr5VarArr2 = (hr5[]) atomicReference.get();
            int length = hr5VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (hr5VarArr2[i] == hr5Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                hr5VarArr = C0;
            } else {
                hr5[] hr5VarArr3 = new hr5[length - 1];
                System.arraycopy(hr5VarArr2, 0, hr5VarArr3, 0, i);
                System.arraycopy(hr5VarArr2, i + 1, hr5VarArr3, i, (length - i) - 1);
                hr5VarArr = hr5VarArr3;
            }
            while (!atomicReference.compareAndSet(hr5VarArr2, hr5VarArr)) {
                if (atomicReference.get() != hr5VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.v0, j);
            c();
        }
    }

    @Override // defpackage.vae
    public final void onError(Throwable th) {
        if (this.Z) {
            j47.Z(th);
            return;
        }
        if (this.s0.a(th)) {
            this.Z = true;
            if (!this.c) {
                for (hr5 hr5Var : (hr5[]) this.u0.getAndSet(D0)) {
                    hr5Var.getClass();
                    zae.a(hr5Var);
                }
            }
            c();
        }
    }
}
