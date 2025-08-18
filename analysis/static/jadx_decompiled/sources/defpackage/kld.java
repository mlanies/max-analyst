package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public class kld extends o3 implements si9, vy1, y66 {
    public final int X;
    public final int Y;
    public final int Z;
    public Object[] s0;
    public long t0;
    public long u0;
    public int v0;
    public int w0;

    public kld(int i, int i2, int i3) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0077, B:34:0x007f, B:38:0x0092, B:41:0x0099, B:42:0x009d, B:43:0x009e, B:22:0x004b), top: B:50:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [o3] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [kld] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [on5] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p3] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [mld] */
    /* JADX WARN: Type inference failed for: r9v8, types: [mld] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ac -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(defpackage.kld r8, defpackage.on5 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.jld
            if (r0 == 0) goto L13
            r0 = r10
            jld r0 = (defpackage.jld) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            jld r0 = new jld
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            x77 r8 = r0.Z
            mld r9 = r0.Y
            on5 r2 = r0.X
            kld r5 = r0.o
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L74
        L38:
            r8 = move-exception
            goto Lb2
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            x77 r8 = r0.Z
            mld r9 = r0.Y
            on5 r2 = r0.X
            kld r5 = r0.o
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L38
            goto L77
        L4f:
            mld r9 = r0.Y
            on5 r8 = r0.X
            kld r2 = r0.o
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb2
        L5e:
            defpackage.od2.a0(r10)
            p3 r10 = r8.h()
            mld r10 = (defpackage.mld) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            lx3 r2 = r0.b     // Catch: java.lang.Throwable -> Laf
            c32 r5 = defpackage.c32.X     // Catch: java.lang.Throwable -> Laf
            jx3 r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Laf
            x77 r2 = (defpackage.x77) r2     // Catch: java.lang.Throwable -> Laf
        L74:
            r5 = r8
            r8 = r2
            r2 = r10
        L77:
            java.lang.Object r10 = r5.w(r9)     // Catch: java.lang.Throwable -> L38
            kotlinx.coroutines.internal.Symbol r6 = defpackage.lld.a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L90
            r0.o = r5     // Catch: java.lang.Throwable -> L38
            r0.X = r2     // Catch: java.lang.Throwable -> L38
            r0.Y = r9     // Catch: java.lang.Throwable -> L38
            r0.Z = r8     // Catch: java.lang.Throwable -> L38
            r0.u0 = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.m(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L77
            return
        L90:
            if (r8 == 0) goto L9e
            boolean r6 = r8.isActive()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.getCancellationException()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        L9e:
            r0.o = r5     // Catch: java.lang.Throwable -> L38
            r0.X = r2     // Catch: java.lang.Throwable -> L38
            r0.Y = r9     // Catch: java.lang.Throwable -> L38
            r0.Z = r8     // Catch: java.lang.Throwable -> L38
            r0.u0 = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return
        Laf:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb2:
            r5.l(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kld.o(kld, on5, kotlin.coroutines.Continuation):void");
    }

    @Override // defpackage.si9, defpackage.on5
    public final Object a(Object obj, Continuation continuation) {
        Continuation[] continuationArrR;
        hld hldVar;
        if (g(obj)) {
            return e5f.a;
        }
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        Continuation[] continuationArrR2 = ft.a;
        synchronized (this) {
            try {
                if (u(obj)) {
                    sy1Var.resumeWith(e5f.a);
                    continuationArrR = r(continuationArrR2);
                    hldVar = null;
                } else {
                    hld hldVar2 = new hld(this, this.v0 + this.w0 + s(), obj, sy1Var);
                    q(hldVar2);
                    this.w0++;
                    if (this.Y == 0) {
                        continuationArrR2 = r(continuationArrR2);
                    }
                    continuationArrR = continuationArrR2;
                    hldVar = hldVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (hldVar != null) {
            nu0.w(sy1Var, new hy1(2, hldVar));
        }
        for (Continuation continuation2 : continuationArrR) {
            if (continuation2 != null) {
                continuation2.resumeWith(e5f.a);
            }
        }
        Object objM = sy1Var.m();
        tx3 tx3Var = tx3.a;
        if (objM != tx3Var) {
            objM = e5f.a;
        }
        return objM == tx3Var ? objM : e5f.a;
    }

    @Override // defpackage.gld
    public final List b() {
        synchronized (this) {
            int iS = (int) ((s() + this.v0) - this.t0);
            if (iS == 0) {
                return nz4.a;
            }
            ArrayList arrayList = new ArrayList(iS);
            Object[] objArr = this.s0;
            for (int i = 0; i < iS; i++) {
                arrayList.add(lld.c(objArr, this.t0 + i));
            }
            return arrayList;
        }
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) throws Throwable {
        o(this, on5Var, continuation);
        return tx3.a;
    }

    @Override // defpackage.y66
    public final mn5 e(lx3 lx3Var, int i, int i2) {
        return lld.e(this, lx3Var, i, i2);
    }

    @Override // defpackage.si9
    public final void f() {
        synchronized (this) {
            x(s() + this.v0, this.u0, s() + this.v0, s() + this.v0 + this.w0);
        }
    }

    @Override // defpackage.si9
    public final boolean g(Object obj) {
        int i;
        boolean z;
        Continuation[] continuationArrR = ft.a;
        synchronized (this) {
            if (u(obj)) {
                continuationArrR = r(continuationArrR);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArrR) {
            if (continuation != null) {
                continuation.resumeWith(e5f.a);
            }
        }
        return z;
    }

    @Override // defpackage.o3
    public final p3 j() {
        mld mldVar = new mld();
        mldVar.a = -1L;
        return mldVar;
    }

    @Override // defpackage.o3
    public final p3[] k() {
        return new mld[2];
    }

    public final Object m(mld mldVar, jld jldVar) {
        sy1 sy1Var = new sy1(1, v3c.u(jldVar));
        sy1Var.n();
        synchronized (this) {
            if (v(mldVar) < 0) {
                mldVar.b = sy1Var;
            } else {
                sy1Var.resumeWith(e5f.a);
            }
        }
        Object objM = sy1Var.m();
        return objM == tx3.a ? objM : e5f.a;
    }

    public final void n() {
        if (this.Y != 0 || this.w0 > 1) {
            Object[] objArr = this.s0;
            while (this.w0 > 0 && lld.c(objArr, (s() + (this.v0 + this.w0)) - 1) == lld.a) {
                this.w0--;
                lld.d(objArr, s() + this.v0 + this.w0, null);
            }
        }
    }

    public final void p() {
        p3[] p3VarArr;
        lld.d(this.s0, s(), null);
        this.v0--;
        long jS = s() + 1;
        if (this.t0 < jS) {
            this.t0 = jS;
        }
        if (this.u0 < jS) {
            if (this.b != 0 && (p3VarArr = this.a) != null) {
                for (p3 p3Var : p3VarArr) {
                    if (p3Var != null) {
                        mld mldVar = (mld) p3Var;
                        long j = mldVar.a;
                        if (j >= 0 && j < jS) {
                            mldVar.a = jS;
                        }
                    }
                }
            }
            this.u0 = jS;
        }
    }

    public final void q(Object obj) {
        int i = this.v0 + this.w0;
        Object[] objArrT = this.s0;
        if (objArrT == null) {
            objArrT = t(0, 2, null);
        } else if (i >= objArrT.length) {
            objArrT = t(i, objArrT.length * 2, objArrT);
        }
        lld.d(objArrT, s() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Continuation[] r(Continuation[] continuationArr) {
        p3[] p3VarArr;
        mld mldVar;
        sy1 sy1Var;
        int length = continuationArr.length;
        if (this.b != 0 && (p3VarArr = this.a) != null) {
            int length2 = p3VarArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                p3 p3Var = p3VarArr[i];
                if (p3Var != null && (sy1Var = (mldVar = (mld) p3Var).b) != null && v(mldVar) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        continuationArr = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                    }
                    continuationArr[length] = sy1Var;
                    mldVar.b = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long s() {
        return Math.min(this.u0, this.t0);
    }

    public final Object[] t(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.s0 = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jS = s();
        for (int i3 = 0; i3 < i; i3++) {
            long j = i3 + jS;
            lld.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean u(Object obj) {
        int i = this.b;
        int i2 = this.X;
        if (i == 0) {
            if (i2 != 0) {
                q(obj);
                int i3 = this.v0 + 1;
                this.v0 = i3;
                if (i3 > i2) {
                    p();
                }
                this.u0 = s() + this.v0;
            }
            return true;
        }
        int i4 = this.v0;
        int i5 = this.Y;
        if (i4 >= i5 && this.u0 <= this.t0) {
            int i6 = ild.$EnumSwitchMapping$0[au1.s(this.Z)];
            if (i6 == 1) {
                return false;
            }
            if (i6 == 2) {
                return true;
            }
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        q(obj);
        int i7 = this.v0 + 1;
        this.v0 = i7;
        if (i7 > i5) {
            p();
        }
        long jS = s() + this.v0;
        long j = this.t0;
        if (((int) (jS - j)) > i2) {
            x(1 + j, this.u0, s() + this.v0, s() + this.v0 + this.w0);
        }
        return true;
    }

    public final long v(mld mldVar) {
        long j = mldVar.a;
        if (j < s() + this.v0) {
            return j;
        }
        if (this.Y <= 0 && j <= s() && this.w0 != 0) {
            return j;
        }
        return -1L;
    }

    public final Object w(mld mldVar) {
        Object obj;
        Continuation[] continuationArrY = ft.a;
        synchronized (this) {
            try {
                long jV = v(mldVar);
                if (jV < 0) {
                    obj = lld.a;
                } else {
                    long j = mldVar.a;
                    Object objC = lld.c(this.s0, jV);
                    if (objC instanceof hld) {
                        objC = ((hld) objC).c;
                    }
                    mldVar.a = jV + 1;
                    Object obj2 = objC;
                    continuationArrY = y(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrY) {
            if (continuation != null) {
                continuation.resumeWith(e5f.a);
            }
        }
        return obj;
    }

    public final void x(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jS = s(); jS < jMin; jS++) {
            lld.d(this.s0, jS, null);
        }
        this.t0 = j;
        this.u0 = j2;
        this.v0 = (int) (j3 - jMin);
        this.w0 = (int) (j4 - j3);
    }

    public final Continuation[] y(long j) {
        long j2;
        long j3;
        Continuation[] continuationArr;
        long j4;
        p3[] p3VarArr;
        long j5 = this.u0;
        Continuation[] continuationArr2 = ft.a;
        if (j > j5) {
            return continuationArr2;
        }
        long jS = s();
        long j6 = this.v0 + jS;
        int i = this.Y;
        if (i == 0 && this.w0 > 0) {
            j6++;
        }
        if (this.b != 0 && (p3VarArr = this.a) != null) {
            for (p3 p3Var : p3VarArr) {
                if (p3Var != null) {
                    long j7 = ((mld) p3Var).a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.u0) {
            return continuationArr2;
        }
        long jS2 = s() + this.v0;
        int iMin = this.b > 0 ? Math.min(this.w0, i - ((int) (jS2 - j6))) : this.w0;
        long j8 = this.w0 + jS2;
        if (iMin > 0) {
            Continuation[] continuationArr3 = new Continuation[iMin];
            Object[] objArr = this.s0;
            long j9 = jS2;
            int i2 = 0;
            while (true) {
                if (jS2 >= j8) {
                    j2 = j6;
                    j3 = j8;
                    break;
                }
                Object objC = lld.c(objArr, jS2);
                j2 = j6;
                Symbol symbol = lld.a;
                if (objC != symbol) {
                    hld hldVar = (hld) objC;
                    int i3 = i2 + 1;
                    j3 = j8;
                    continuationArr3[i2] = hldVar.o;
                    lld.d(objArr, jS2, symbol);
                    lld.d(objArr, j9, hldVar.c);
                    j4 = 1;
                    j9++;
                    if (i3 >= iMin) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j3 = j8;
                    j4 = 1;
                }
                jS2 += j4;
                j6 = j2;
                j8 = j3;
            }
            continuationArr = continuationArr3;
            jS2 = j9;
        } else {
            j2 = j6;
            j3 = j8;
            continuationArr = continuationArr2;
        }
        int i4 = (int) (jS2 - jS);
        long j10 = this.b == 0 ? jS2 : j2;
        long jMax = Math.max(this.t0, jS2 - Math.min(this.X, i4));
        if (i == 0 && jMax < j3 && tpa.f(lld.c(this.s0, jMax), lld.a)) {
            jS2++;
            jMax++;
        }
        x(jMax, j10, jS2, j3);
        n();
        return (continuationArr.length == 0) ^ true ? r(continuationArr) : continuationArr;
    }
}
