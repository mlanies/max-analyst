package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class qx9 {
    public static final /* synthetic */ int e = 0;
    public final kke a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public qx9(je7 je7Var, je7 je7Var2, je7 je7Var3, kke kkeVar) {
        this.a = kkeVar;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.qx9 r4, java.util.List r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.ix9
            if (r0 == 0) goto L16
            r0 = r6
            ix9 r0 = (defpackage.ix9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Y = r1
            goto L1b
        L16:
            ix9 r0 = new ix9
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            defpackage.od2.a0(r6)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L4a
        L2a:
            r4 = move-exception
            goto L4c
        L2c:
            r4 = move-exception
            goto L57
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            defpackage.od2.a0(r6)
            je7 r4 = r4.b     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            ud5 r4 = (defpackage.ud5) r4     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.Y = r3     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r6 = r4.b(r5, r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r1 = r6
            goto L56
        L4c:
            java.lang.String r5 = "qx9"
            java.lang.String r6 = "getAnalyticsEntries: failed"
            defpackage.hm9.l(r5, r6, r4)
            nz4 r4 = defpackage.nz4.a
            r1 = r4
        L56:
            return r1
        L57:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx9.a(qx9, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.qx9 r7, long r8, long r10, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r12 instanceof defpackage.jx9
            if (r0 == 0) goto L17
            r0 = r12
            jx9 r0 = (defpackage.jx9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.s0 = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            jx9 r0 = new jx9
            r0.<init>(r7, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.Y
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.s0
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            long r10 = r6.X
            long r8 = r6.o
            defpackage.od2.a0(r12)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L32
            goto L57
        L30:
            r7 = move-exception
            goto L59
        L32:
            r7 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            defpackage.od2.a0(r12)
            je7 r7 = r7.d     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L32
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L32
            r1 = r7
            yx9 r1 = (defpackage.yx9) r1     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L32
            r6.o = r8     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L32
            r6.X = r10     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L32
            r6.s0 = r2     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L32
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.b(r2, r4, r6)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.CancellationException -> L32
            if (r12 != r0) goto L57
            goto L6e
        L57:
            r0 = r12
            goto L6e
        L59:
            java.lang.String r12 = "getProcessedMessage: failed for chatServerId="
            java.lang.String r0 = ", messageId="
            java.lang.StringBuilder r8 = defpackage.au1.k(r8, r12, r0)
            java.lang.String r9 = " "
            java.lang.String r8 = defpackage.zr6.k(r8, r10, r9)
            java.lang.String r9 = "qx9"
            defpackage.hm9.l(r9, r8, r7)
            r7 = 0
            r0 = r7
        L6e:
            return r0
        L6f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx9.b(qx9, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object c(qx9 qx9Var, List list, List list2, boolean z, Continuation continuation) {
        Object objH;
        Object next;
        qx9Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            vd5 vd5Var = (vd5) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                ux9 ux9Var = (ux9) next;
                if (ux9Var.a == vd5Var.b && ux9Var.b == vd5Var.c) {
                    break;
                }
            }
            ux9 ux9Var2 = (ux9) next;
            if (ux9Var2 != null) {
                boolean z2 = ux9Var2 instanceof tx9;
                long j = ux9Var2.a;
                long j2 = ux9Var2.b;
                if (z2) {
                    StringBuilder sbK = au1.k(j2, "onMessagesProcessed: show, messageId=", ", chatId=");
                    sbK.append(j);
                    hm9.n("qx9", sbK.toString());
                    boolean z3 = ((tx9) ux9Var2).d;
                    rx9 rx9VarE = qx9Var.e();
                    rx9VarE.getClass();
                    String str = vd5Var.k;
                    try {
                        if (str.length() != 0) {
                            us usVar = new us(0);
                            rx9.a(usVar, vd5Var);
                            usVar.put("p_op", "show");
                            rx9VarE.b().b(str, usVar);
                        }
                    } catch (Exception e2) {
                        hm9.p(rx9.d, "onNotificationShow: failed", e2);
                        ((cba) rx9VarE.c()).c(new HandledException("failed to log notification show", e2), true);
                    }
                    arrayList.add(vd5.a(vd5Var));
                } else {
                    if (!(ux9Var2 instanceof sx9)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    StringBuilder sbK2 = au1.k(j2, "onMessagesProcessed: drop, messageId=", ", chatId=");
                    sbK2.append(j);
                    sbK2.append(", reason=");
                    ks4 ks4Var = ((sx9) ux9Var2).d;
                    sbK2.append(ks4Var);
                    hm9.n("qx9", sbK2.toString());
                    rx9 rx9VarE2 = qx9Var.e();
                    rx9VarE2.getClass();
                    String str2 = vd5Var.k;
                    try {
                        if (str2.length() != 0) {
                            HashMap map = new HashMap();
                            rx9.a(map, vd5Var);
                            map.put("p_op", "drop");
                            map.put("p_dr", ks4Var.a);
                            rx9VarE2.b().b(str2, map);
                        }
                    } catch (Exception e3) {
                        hm9.p(rx9.d, "onNotificationShow: failed", e3);
                        ((cba) rx9VarE2.c()).c(new HandledException("failed to log notification drop", e3), true);
                    }
                    arrayList.add(vd5.a(vd5Var));
                }
            }
        }
        boolean z4 = !arrayList.isEmpty();
        e5f e5fVar = e5f.a;
        return (z4 && (objH = qx9Var.h(arrayList, continuation)) == tx3.a) ? objH : e5fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.qx9 r4, java.util.ArrayList r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.px9
            if (r0 == 0) goto L13
            r0 = r6
            px9 r0 = (defpackage.px9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            px9 r0 = new px9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.od2.a0(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L59
        L27:
            r4 = move-exception
            goto L52
        L29:
            r4 = move-exception
            goto L5c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r6)
            je7 r4 = r4.d     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yx9 r4 = (defpackage.yx9) r4     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.Y = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r4.getClass()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            xx9 r6 = new xx9     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            ilc r4 = r4.a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r4 = defpackage.ote.j(r4, r6, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r4 != r1) goto L59
            goto L5b
        L52:
            java.lang.String r5 = "qx9"
            java.lang.String r6 = "storeMessagesProcessed: failed "
            defpackage.hm9.l(r5, r6, r4)
        L59:
            e5f r1 = defpackage.e5f.a
        L5b:
            return r1
        L5c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx9.d(qx9, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final rx9 e() {
        return (rx9) this.c.getValue();
    }

    public final Object f(je5 je5Var, vd5 vd5Var, cqb cqbVar) throws Throwable {
        Object objT0 = j47.t0(((w9a) this.a).b(), new kx9(vd5Var, this, je5Var, null), cqbVar);
        return objT0 == tx3.a ? objT0 : e5f.a;
    }

    public final Object g(long j, long j2, Continuation continuation) throws Throwable {
        Object objT0 = j47.t0(((w9a) this.a).b(), new mx9(this, j, j2, null), continuation);
        return objT0 == tx3.a ? objT0 : e5f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.nx9
            if (r0 == 0) goto L13
            r0 = r6
            nx9 r0 = (defpackage.nx9) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            nx9 r0 = new nx9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            defpackage.od2.a0(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L5a
        L27:
            r4 = move-exception
            goto L53
        L29:
            r4 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r6)
            je7 r4 = r4.b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            ud5 r4 = (defpackage.ud5) r4     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.Y = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r4.getClass()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            uh r6 = new uh     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 8
            r6.<init>(r4, r2, r5)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            ilc r4 = r4.a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r4 = defpackage.ote.j(r4, r6, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r4 != r1) goto L5a
            return r1
        L53:
            java.lang.String r5 = "qx9"
            java.lang.String r6 = "putAnalyticsEntries: failed"
            defpackage.hm9.l(r5, r6, r4)
        L5a:
            e5f r4 = defpackage.e5f.a
            return r4
        L5d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx9.h(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
