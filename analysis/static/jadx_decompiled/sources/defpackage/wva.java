package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class wva implements zu6, a76, gq1, erd, kxd, abe, e1d, hpf, q70, l3a, ofc, ifg {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ wva(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zu6
    public void A(String str) {
        ((xva) this.b).c((rx) ((mec) this.c).a, new File(str));
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        switch (this.a) {
            case 1:
                ((lq1) this.b).b((ay1) this.c);
                break;
            case 4:
                ((erd) this.c).a(obj);
                break;
            default:
                erd erdVar = (erd) this.b;
                try {
                    ((rqd) this.c).c.accept(obj);
                    erdVar.a(obj);
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    erdVar.onError(th);
                }
        }
    }

    @Override // defpackage.ofc
    public void accept(Object obj, Object obj2) {
        ahg ahgVar;
        pe5 pe5Var;
        qne qneVar = (qne) obj2;
        bhg bhgVar = (bhg) obj;
        td tdVar = (td) this.b;
        LocationRequest locationRequest = (LocationRequest) this.c;
        bhgVar.getClass();
        rw4 rw4VarX = tdVar.x();
        hm7 hm7Var = (hm7) rw4VarX.c;
        Objects.requireNonNull(hm7Var);
        pe5[] pe5VarArrH = bhgVar.h();
        boolean z = false;
        if (pe5VarArrH != null) {
            int i = 0;
            while (true) {
                if (i >= pe5VarArrH.length) {
                    pe5Var = null;
                    break;
                }
                pe5Var = pe5VarArrH[i];
                if ("location_updates_with_callback".equals(pe5Var.a)) {
                    break;
                } else {
                    i++;
                }
            }
            if (pe5Var != null && pe5Var.b() >= 1) {
                z = true;
            }
        }
        synchronized (bhgVar.L0) {
            try {
                ahg ahgVar2 = (ahg) bhgVar.L0.get(hm7Var);
                if (ahgVar2 == null || z) {
                    ahgVar = new ahg(tdVar);
                    bhgVar.L0.put(hm7Var, ahgVar);
                } else {
                    td tdVar2 = ahgVar2.d;
                    synchronized (tdVar2) {
                        rw4 rw4Var = (rw4) tdVar2.c;
                        if (rw4Var != rw4VarX) {
                            rw4Var.b = null;
                            rw4Var.c = null;
                            tdVar2.c = rw4VarX;
                        }
                    }
                    ahgVar = ahgVar2;
                    ahgVar2 = null;
                }
                if (z) {
                    nkg nkgVar = (nkg) bhgVar.o();
                    khg khgVar = new khg(2, ahgVar2 == null ? null : ahgVar2, ahgVar, null, hm7Var.b + "@" + System.identityHashCode(hm7Var.a));
                    ygg yggVar = new ygg(null, qneVar);
                    Parcel parcelG0 = nkgVar.G0();
                    zfg.b(parcelG0, khgVar);
                    zfg.b(parcelG0, locationRequest);
                    parcelG0.writeStrongBinder(yggVar);
                    nkgVar.H0(parcelG0, 88);
                } else {
                    nkg nkgVar2 = (nkg) bhgVar.o();
                    mhg mhgVar = new mhg(1, new lhg(locationRequest, null, false, false, false, false, Long.MAX_VALUE), null, ahgVar, null, new wgg(qneVar, ahgVar), hm7Var.b + "@" + System.identityHashCode(hm7Var.a));
                    Parcel parcelG02 = nkgVar2.G0();
                    zfg.b(parcelG02, mhgVar);
                    nkgVar2.H0(parcelG02, 59);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(oa5 oa5Var, l3f l3fVar) {
        int i = 0;
        while (true) {
            xze[] xzeVarArr = (xze[]) this.c;
            if (i >= xzeVarArr.length) {
                return;
            }
            l3fVar.a();
            l3fVar.b();
            xze xzeVarB = oa5Var.B(l3fVar.e, 3);
            oy5 oy5Var = (oy5) ((List) this.b).get(i);
            String str = oy5Var.w0;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            String strValueOf = String.valueOf(str);
            np8.c(strValueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(strValueOf) : new String("Invalid closed caption mime type provided: "), z);
            String str2 = oy5Var.a;
            if (str2 == null) {
                l3fVar.b();
                str2 = l3fVar.f;
            }
            my5 my5Var = new my5();
            my5Var.a = str2;
            my5Var.k = str;
            my5Var.d = oy5Var.o;
            my5Var.c = oy5Var.c;
            my5Var.C = oy5Var.O0;
            my5Var.m = oy5Var.y0;
            xzeVarB.d(new oy5(my5Var));
            xzeVarArr[i] = xzeVarB;
            i++;
        }
    }

    @Override // defpackage.erd
    public void c(zl4 zl4Var) {
        switch (this.a) {
            case 4:
                dm4.c((AtomicReference) this.b, zl4Var);
                break;
            default:
                ((erd) this.b).c(zl4Var);
                break;
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        ((lq1) this.b).d(th);
    }

    @Override // defpackage.hpf
    public void dispose() {
        SparseArray sparseArray = (SparseArray) ((gpf) this.c).a;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            List list = (List) sparseArray.valueAt(size);
            if (list.remove((cn9) this.b) && list.isEmpty()) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // defpackage.e1d
    public void e(sue sueVar, oa5 oa5Var, l3f l3fVar) {
    }

    @Override // defpackage.e1d
    public void f(yaf yafVar) {
        h3f h3fVar;
        if (yafVar.v() == 0 && (yafVar.v() & 128) != 0) {
            yafVar.I(6);
            int iC = yafVar.c() / 4;
            int i = 0;
            while (true) {
                h3fVar = (h3f) this.c;
                if (i >= iC) {
                    break;
                }
                s02 s02Var = (s02) this.b;
                yafVar.g(0, s02Var.b, 4);
                s02Var.q(0);
                int i2 = s02Var.i(16);
                s02Var.t(3);
                if (i2 == 0) {
                    s02Var.t(13);
                } else {
                    int i3 = s02Var.i(13);
                    if (h3fVar.f.get(i3) == null) {
                        h3fVar.f.put(i3, new g1d(new l0f(h3fVar, i3)));
                        h3fVar.l++;
                    }
                }
                i++;
            }
            if (h3fVar.a != 2) {
                h3fVar.f.remove(0);
            }
        }
    }

    @Override // defpackage.abe
    public int g(long j) {
        long[] jArr = (long[]) this.c;
        int iB = maf.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Comparable h(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.caf
            if (r0 == 0) goto L13
            r0 = r7
            caf r0 = (defpackage.caf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            caf r0 = new caf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r7)
            goto L55
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.c
            je7 r7 = (defpackage.je7) r7
            java.lang.Object r7 = r7.getValue()
            blb r7 = (defpackage.blb) r7
            java.lang.Object r6 = r6.b
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r6 = r6.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            long r4 = r6.t()
            r0.Y = r3
            java.lang.Object r7 = r7.a(r4, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            oab r7 = (defpackage.oab) r7
            uj3 r6 = r7.d
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wva.h(kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    @Override // defpackage.abe
    public long i(int i) {
        np8.d(i >= 0);
        long[] jArr = (long[]) this.c;
        np8.d(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.kxd
    public long j(long j) {
        wv7 wv7Var = (wv7) this.b;
        Long lValueOf = (Long) wv7Var.c(j);
        if (lValueOf == null) {
            lh4 lh4Var = (lh4) this.c;
            long j2 = lh4Var.a;
            lh4Var.a = 1 + j2;
            lValueOf = Long.valueOf(j2);
            wv7Var.f(j, lValueOf);
        }
        return lValueOf.longValue();
    }

    @Override // defpackage.zu6
    public void k() {
        ((xva) this.b).b((rx) ((mec) this.c).a, new Exception("onDownloadFailed"));
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        ((Map) ((aab) this.c).b).remove((qne) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7 A[PHI: r7 r8
      0x00d7: PHI (r7v7 java.lang.Integer) = (r7v5 java.lang.Integer), (r7v5 java.lang.Integer), (r7v8 java.lang.Integer) binds: [B:58:0x010e, B:55:0x0105, B:37:0x00d5] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r8v8 java.lang.Integer) = (r8v5 java.lang.Integer), (r8v6 java.lang.Integer), (r8v5 java.lang.Integer) binds: [B:58:0x010e, B:55:0x0105, B:37:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // defpackage.gq1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(defpackage.b8c r20, defpackage.yic r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wva.m(b8c, yic):void");
    }

    @Override // defpackage.hpf
    public int n(int i) {
        return i;
    }

    @Override // defpackage.hpf
    public int o(int i) {
        gpf gpfVar = (gpf) this.c;
        List arrayList = (List) ((SparseArray) gpfVar.a).get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((SparseArray) gpfVar.a).put(i, arrayList);
        }
        cn9 cn9Var = (cn9) this.b;
        if (!arrayList.contains(cn9Var)) {
            arrayList.add(cn9Var);
        }
        return i;
    }

    @Override // defpackage.erd
    public void onError(Throwable th) {
        switch (this.a) {
            case 4:
                ((erd) this.c).onError(th);
                break;
            default:
                ((erd) this.b).onError(th);
                break;
        }
    }

    @Override // defpackage.abe
    public List p(long j) {
        xz3 xz3Var;
        int iF = maf.f((long[]) this.c, j, false);
        return (iF == -1 || (xz3Var = ((xz3[]) this.b)[iF]) == xz3.C0) ? Collections.emptyList() : Collections.singletonList(xz3Var);
    }

    @Override // defpackage.gq1
    public void q(b8c b8cVar, IOException iOException) {
        ((m8c) this.b).c(iOException);
    }

    @Override // defpackage.ifg
    public Object r() {
        Context context = (Context) ((zig) ((ifg) this.b)).a.b;
        if (context != null) {
            return new fkg(context, (kkg) ((ifg) this.c).r());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public String toString() {
        switch (this.a) {
            case 11:
                Throwable th = (Throwable) this.c;
                return "ThreadDump(threadsCount=" + ((Map) this.b) + ", allStackTraces=" + (th != null ? j47.n0(th) : null) + ")";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.abe
    public int u() {
        return ((long[]) this.c).length;
    }

    public /* synthetic */ wva(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public wva(Context context) {
        l63 l63Var;
        this.a = 10;
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            l63Var = l63.a;
        } else if (i != 32) {
            l63Var = l63.c;
        } else {
            l63Var = l63.b;
        }
        q0e q0eVarA = r0e.a(l63Var);
        this.b = q0eVarA;
        this.c = new w7c(q0eVarA);
        context.registerComponentCallbacks(new fd2(2, this));
    }

    public wva(List list) {
        this.a = 5;
        this.b = list;
        this.c = new xze[list.size()];
    }

    public wva() {
        this.a = 2;
        this.b = new tt3(cpc.e, new eqe(dpc.j), Integer.valueOf(woc.c0), (Integer) null, 20);
        this.c = new tt3(cpc.a, new eqe(dpc.g), Integer.valueOf(gpc.u), (Integer) null, 20);
    }

    public wva(lh4 lh4Var) {
        this.a = 8;
        this.c = lh4Var;
        this.b = new wv7();
    }

    public wva(h3f h3fVar) {
        this.a = 12;
        this.c = h3fVar;
        this.b = new s02(new byte[4], 4, 1, (byte) 0);
    }
}
