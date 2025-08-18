package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ix implements uu {
    public final long a;
    public final String b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Serializable m;

    public ix(long j, kke kkeVar, mg4 mg4Var, ol6 ol6Var, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, wxc wxcVar) {
        this.a = j;
        this.c = kkeVar;
        this.d = mg4Var;
        this.e = ol6Var;
        this.f = wxcVar;
        this.b = ix.class.getName();
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).b());
        this.g = contextScopeA;
        this.h = je7Var3;
        this.i = je7Var;
        this.j = je7Var2;
        this.k = je7Var4;
        this.l = je7Var5;
        this.m = new khe(new x5(13, this));
        if (ol6Var.b()) {
            j47.T(contextScopeA, null, null, new cx(je7Var4, this, null), 3);
        }
    }

    public static final Object a(ix ixVar, zs0 zs0Var) throws Throwable {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ixVar.m;
        boolean z = !copyOnWriteArrayList.isEmpty();
        ArrayList arrayList = (ArrayList) ixVar.l;
        if (z) {
            arrayList.addAll(copyOnWriteArrayList);
            copyOnWriteArrayList.clear();
        }
        boolean z2 = !arrayList.isEmpty();
        e5f e5fVar = e5f.a;
        if (!z2) {
            return e5fVar;
        }
        List listD0 = x53.D0(arrayList);
        arrayList.clear();
        Object objF = ixVar.f(listD0, zs0Var);
        return objF == tx3.a ? objF : e5fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [e52, ix] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.uu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r17, long r18, long r20, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix.b(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ts0
            if (r0 == 0) goto L13
            r0 = r6
            ts0 r0 = (defpackage.ts0) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ts0 r0 = new ts0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.od2.a0(r6)
            goto L60
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ua3 r5 = r0.o
            defpackage.od2.a0(r6)
            goto L54
        L38:
            defpackage.od2.a0(r6)
            ua3 r6 = defpackage.ngg.a()
            java.lang.Object r5 = r5.i
            kld r5 = (defpackage.kld) r5
            bhe r2 = new bhe
            r2.<init>(r6)
            r0.o = r6
            r0.Z = r4
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r5 = r6
        L54:
            r6 = 0
            r0.o = r6
            r0.Z = r3
            java.lang.Object r5 = r5.awaitInternal(r0)
            if (r5 != r1) goto L60
            return r1
        L60:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [e52, ix] */
    @Override // defpackage.uu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(int r18, long r19, long r21, kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix.d(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.e52 r18, java.util.List r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix.e(e52, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.util.List r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix.f(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ix(nx3 nx3Var, nx3 nx3Var2, long j, g27 g27Var, hs7 hs7Var, es7 es7Var) {
        ai0 ai0Var = new ai0(1);
        this.c = nx3Var;
        this.d = nx3Var2;
        this.a = j;
        this.e = g27Var;
        this.f = hs7Var;
        this.g = es7Var;
        this.h = ai0Var;
        this.b = "Buffer:".concat("LogController");
        ContextScope contextScopeA = j1e.a(f46.a().plus(nx3Var2));
        this.i = lld.b(1, 0, 2, 2);
        this.j = lld.b(0, Integer.MAX_VALUE, 2, 1);
        this.k = new AtomicBoolean(false);
        this.l = new ArrayList();
        this.m = new CopyOnWriteArrayList();
        j47.T(contextScopeA, null, null, new at0(this, null), 3);
    }
}
