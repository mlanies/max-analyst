package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class an9 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final ContextScope e;
    public final String f;
    public final aj9 g;
    public final AtomicInteger h;
    public volatile long i;
    public final AtomicReference j;
    public final AtomicReference k;
    public final AtomicReference l;

    public an9(kke kkeVar, zp zpVar, w1e w1eVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var2;
        this.b = je7Var3;
        this.c = je7Var;
        this.d = je7Var4;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).b());
        this.e = contextScopeA;
        this.f = an9.class.getName();
        this.g = bj9.a();
        this.h = new AtomicInteger(1);
        this.j = new AtomicReference();
        this.k = new AtomicReference();
        this.l = new AtomicReference(v1e.a);
        ((lqf) zpVar).i.add(new fs7(1, this));
        od2.L(new zn5(w1eVar.b, new v59(2, this, an9.class, "onNewCondition", "onNewCondition(Lone/me/sdk/statistics/conditions/StatsExternalConditions$ConditionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 5), contextScopeA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.an9 r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof defpackage.zm9
            if (r0 == 0) goto L16
            r0 = r8
            zm9 r0 = (defpackage.zm9) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            zm9 r0 = new zm9
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            aj9 r7 = r0.X
            an9 r0 = r0.o
            defpackage.od2.a0(r8)
            r8 = r7
            r7 = r0
            goto L5e
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            defpackage.od2.a0(r8)
            java.util.concurrent.atomic.AtomicReference r8 = r7.k
            r8.set(r4)
            java.util.concurrent.atomic.AtomicReference r8 = r7.j
            r8.set(r4)
            java.util.concurrent.atomic.AtomicInteger r8 = r7.h
            r8.set(r3)
            r5 = 0
            r7.i = r5
            aj9 r8 = r7.g
            r0.o = r7
            r0.X = r8
            r0.s0 = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L5e
            goto L87
        L5e:
            je7 r0 = r7.a     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L88
            q33 r0 = (defpackage.q33) r0     // Catch: java.lang.Throwable -> L88
            t33 r0 = (defpackage.t33) r0     // Catch: java.lang.Throwable -> L88
            long r0 = r0.F()     // Catch: java.lang.Throwable -> L88
            r2 = 1
            long r0 = r0 + r2
            je7 r7 = r7.a     // Catch: java.lang.Throwable -> L88
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L88
            q33 r7 = (defpackage.q33) r7     // Catch: java.lang.Throwable -> L88
            t33 r7 = (defpackage.t33) r7     // Catch: java.lang.Throwable -> L88
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = "app.stats.session.id"
            r7.l(r1, r0)     // Catch: java.lang.Throwable -> L88
            r8.e(r4)
            e5f r1 = defpackage.e5f.a
        L87:
            return r1
        L88:
            r7 = move-exception
            r8.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an9.a(an9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void g(an9 an9Var, wuc wucVar) {
        an9Var.f(wucVar, spa.f);
    }

    public final ky7 b(int i, ms7 ms7Var, spa spaVar) {
        zud zudVar;
        Map map;
        ky7 ky7Var = new ky7();
        ky7Var.put("action_id", Integer.valueOf(this.h.getAndIncrement()));
        ky7Var.put("screen_to", Integer.valueOf(i));
        Object obj = (ms7Var == null || (map = ms7Var.e) == null) ? null : map.get("screen_to");
        if (obj != null) {
            ky7Var.put("prev_time", Long.valueOf(ms7Var.a));
            ky7Var.put("screen_from", obj);
        }
        v1e v1eVar = (v1e) this.l.get();
        boolean zF = tpa.f(spaVar, spa.f);
        int i2 = 2;
        v1e v1eVar2 = v1e.c;
        v1e v1eVar3 = v1e.b;
        if (zF) {
            v1eVar.getClass();
            if (v1eVar == v1eVar3 || v1eVar == v1eVar2) {
                if (v1eVar == v1eVar3) {
                    crd crdVar = b2b.b;
                    i2 = 1;
                } else {
                    crd crdVar2 = b2b.b;
                }
                ky7Var.put("pip", Integer.valueOf(i2));
            }
        } else {
            b2b b2bVar = spaVar.a;
            if (b2bVar != null) {
                ky7Var.put("pip", Integer.valueOf(b2bVar.a));
            } else {
                v1eVar.getClass();
                if (v1eVar == v1eVar3 || v1eVar == v1eVar2) {
                    if (v1eVar == v1eVar3) {
                        crd crdVar3 = b2b.b;
                        i2 = 1;
                    } else {
                        crd crdVar4 = b2b.b;
                    }
                    ky7Var.put("pip", Integer.valueOf(i2));
                }
            }
            int i3 = spaVar.b;
            if (i3 != 0) {
                ky7Var.put("reason", Integer.valueOf(ey8.c(i3)));
            }
            Long l = spaVar.d;
            if (l != null && (zudVar = spaVar.c) != null) {
                ky7Var.put("source_id", l);
                ky7Var.put("source_type", Integer.valueOf(zudVar.a));
            }
        }
        us usVar = spaVar.e;
        if (usVar != null && !usVar.isEmpty()) {
            ky7Var.put("reason_meta", Collections.unmodifiableMap(usVar));
        }
        return ky7Var.b();
    }

    public final ms7 c(int i, ky7 ky7Var) {
        String str;
        e47 e47Var = new e47();
        e47Var.c = "NAV";
        je7 je7Var = this.a;
        e47Var.b = ((hyc) ((q33) je7Var.getValue())).t();
        if (i == 1) {
            str = "COLD_START";
        } else if (i == 2) {
            str = "WARM_START";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "GO";
        }
        e47Var.o = str;
        e47Var.X = ((t33) ((q33) je7Var.getValue())).F();
        e47Var.a = System.currentTimeMillis();
        e47Var.b(ky7Var);
        return e47Var.c();
    }

    public final Integer d() {
        Map map;
        ms7 ms7Var = (ms7) this.k.get();
        Object obj = (ms7Var == null || (map = ms7Var.e) == null) ? null : map.get("screen_to");
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    public final boolean e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.i;
        qyc qycVar = (qyc) ((y7d) this.b.getValue());
        qycVar.getClass();
        return jElapsedRealtime < qycVar.q(PmsKey.f116statsessionbackgroundthreshold, 60000L);
    }

    public final void f(wuc wucVar, spa spaVar) {
        Map map;
        ms7 ms7Var = (ms7) this.k.get();
        int i = ms7Var == null ? 1 : 3;
        Object obj = (ms7Var == null || (map = ms7Var.e) == null) ? null : map.get("screen_to");
        if (tpa.f(obj, 1) && !e()) {
            v1e v1eVar = (v1e) this.l.get();
            v1eVar.getClass();
            if (v1eVar != v1e.b && v1eVar != v1e.c) {
                return;
            }
        }
        j47.T(this.e, null, null, new ym9(i, this, wucVar, spaVar, ms7Var, null), 3);
        if (obj == null) {
            return;
        }
        boolean zEquals = Integer.valueOf(wucVar.a).equals(1);
        boolean zEquals2 = obj.equals(150);
        je7 je7Var = this.d;
        if (zEquals2) {
            ((ita) je7Var.getValue()).e(2, zEquals ? 2 : 3);
        } else if (obj.equals(350)) {
            ((ita) je7Var.getValue()).d(2, zEquals ? 2 : 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(int r6, defpackage.ms7 r7, int r8, defpackage.spa r9, boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r5 = this;
            e5f r0 = defpackage.e5f.a
            if (r7 != 0) goto L6
            goto L8f
        L6:
            java.lang.String r1 = "screen_to"
            java.util.Map r2 = r7.e
            java.lang.Object r1 = r2.get(r1)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 != 0) goto L14
            goto L8f
        L14:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r6 == r1) goto L1e
            goto L8f
        L1e:
            java.lang.String r1 = "pip"
            java.lang.Object r1 = r2.get(r1)
            b2b r3 = r9.a
            r4 = 0
            if (r3 == 0) goto L30
            int r3 = r3.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L31
        L30:
            r3 = r4
        L31:
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L38
            goto L8f
        L38:
            java.lang.String r1 = "reason"
            java.lang.Object r1 = r2.get(r1)
            int r3 = r9.b
            if (r3 == 0) goto L4b
            int r3 = defpackage.ey8.c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L4c
        L4b:
            r3 = r4
        L4c:
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L53
            goto L8f
        L53:
            java.lang.String r1 = "source_type"
            java.lang.Object r1 = r2.get(r1)
            zud r3 = r9.c
            if (r3 == 0) goto L64
            int r3 = r3.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L65
        L64:
            r3 = r4
        L65:
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L6c
            goto L8f
        L6c:
            java.lang.String r1 = "source_id"
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r3 = r9.d
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L7b
            goto L8f
        L7b:
            java.lang.String r1 = "reason_meta"
            java.lang.Object r1 = r2.get(r1)
            us r2 = r9.e
            if (r2 == 0) goto L89
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r2)
        L89:
            boolean r1 = defpackage.tpa.f(r1, r4)
            if (r1 != 0) goto Lce
        L8f:
            ky7 r7 = r5.b(r6, r7, r9)
            ms7 r7 = r5.c(r8, r7)
            java.util.concurrent.atomic.AtomicReference r8 = r5.k
            iz0 r1 = new iz0
            r2 = 7
            r1.<init>(r2, r7)
            r8.updateAndGet(r1)
            r8 = 1
            if (r6 == r8) goto Lb1
            java.util.concurrent.atomic.AtomicReference r6 = r5.j
            iz0 r8 = new iz0
            r1 = 8
            r8.<init>(r1, r9)
            r6.updateAndGet(r8)
        Lb1:
            je7 r5 = r5.c
            if (r10 == 0) goto Lc5
            java.lang.Object r5 = r5.getValue()
            ad r5 = (defpackage.ad) r5
            java.lang.Object r5 = r5.k(r7, r11)
            tx3 r6 = defpackage.tx3.a
            if (r5 != r6) goto Lc4
            return r5
        Lc4:
            return r0
        Lc5:
            java.lang.Object r5 = r5.getValue()
            ad r5 = (defpackage.ad) r5
            r5.j(r7)
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an9.h(int, ms7, int, spa, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
