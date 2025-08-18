package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* loaded from: classes2.dex */
public final class c11 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public c11(CallAnalyticsSender callAnalyticsSender, o23 o23Var, wte wteVar) {
        this.b = callAnalyticsSender;
        this.c = o23Var;
        this.d = wteVar;
        this.a = true;
        this.h = new ey1(5, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(java.util.Collection r7, defpackage.nnf r8, defpackage.la1 r9) {
        /*
            r6 = this;
            boolean r0 = r9.g
            nnf r1 = defpackage.nnf.a
            nz4 r2 = defpackage.nz4.a
            r3 = 1
            if (r0 != 0) goto Le
            if (r8 != r1) goto Le
        Lb:
            r9 = r2
            goto L82
        Le:
            nnf r4 = defpackage.nnf.c
            if (r0 == 0) goto L2b
            if (r8 != r4) goto L2b
            i95 r5 = r9.e
            boolean r5 = r5 instanceof defpackage.h95
            if (r5 == 0) goto L2b
            kl7 r9 = defpackage.j1e.l()
            r9.addAll(r7)
            jb1 r0 = defpackage.jb1.a
            r9.add(r0)
            kl7 r9 = defpackage.j1e.d(r9)
            goto L82
        L2b:
            boolean r5 = r9.l
            if (r0 == 0) goto L6f
            if (r8 != r4) goto L6f
            if (r5 != 0) goto L6f
            kl7 r0 = defpackage.j1e.l()
            r0.addAll(r7)
            j1e r1 = r9.b
            if (r1 == 0) goto L6a
            m31 r1 = r9.f
            if (r1 == 0) goto L6a
            boolean r1 = r1.e
            if (r1 != r3) goto L6a
            boolean r1 = r6.a
            if (r1 == 0) goto L6a
            java.lang.Object r1 = r6.e
            la1 r1 = (defpackage.la1) r1
            i95 r1 = r1.e
            boolean r1 = r1 instanceof defpackage.e95
            if (r1 != 0) goto L6a
            ib1 r1 = new ib1
            java.lang.String r9 = r9.k
            if (r9 == 0) goto L5f
            java.lang.String r9 = defpackage.c37.D(r9)
            goto L60
        L5f:
            r9 = 0
        L60:
            if (r9 != 0) goto L64
            java.lang.String r9 = ""
        L64:
            r1.<init>(r9)
            r0.add(r1)
        L6a:
            kl7 r9 = defpackage.j1e.d(r0)
            goto L82
        L6f:
            if (r0 == 0) goto L7e
            if (r8 != r1) goto L7e
            if (r5 != 0) goto L79
            boolean r0 = r6.a
            if (r0 != 0) goto L7e
        L79:
            boolean r9 = r9.o
            if (r9 == 0) goto L7e
            goto Lb
        L7e:
            java.util.List r9 = defpackage.x53.D0(r7)
        L82:
            int r8 = r8.ordinal()
            r0 = 0
            if (r8 == 0) goto Lb2
            if (r8 == r3) goto Lc1
            r7 = 2
            if (r8 != r7) goto Lac
            kl7 r7 = defpackage.j1e.l()
            java.lang.Object r6 = r6.d
            je7 r6 = (defpackage.je7) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.util.ArrayList r6 = defpackage.dz7.a(r9, r6, r3, r0)
            r7.addAll(r6)
            kl7 r2 = defpackage.j1e.d(r7)
            goto Lc1
        Lac:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lb2:
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto Lb9
            goto Lc1
        Lb9:
            int r6 = r7.size()
            java.util.ArrayList r2 = defpackage.dz7.a(r9, r6, r3, r0)
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c11.a(java.util.Collection, nnf, la1):java.util.List");
    }

    public mvd b(Map map, zx7 zx7Var, List list, gg1 gg1Var) {
        hb1 hb1Var;
        la1 la1Var = (la1) this.e;
        qma qmaVarF = null;
        if (la1Var.s) {
            return null;
        }
        if (la1Var.q == m38.b) {
            i95 i95Var = la1Var.e;
            if (!((i95Var instanceof c95) || (i95Var instanceof b95) || (i95Var instanceof d95)) && !la1Var.g) {
                if ((((nnf) this.f) == nnf.a) && (hb1Var = (hb1) map.get(gg1Var)) != null) {
                    qmaVarF = dz7.f(hb1Var, true, la1Var.m, false);
                }
            }
        }
        return new mvd(list, zx7Var, qmaVarF);
    }

    public zx7 c(nnf nnfVar, Map map, gg1 gg1Var) {
        zx7 zx7Var;
        Object next;
        m31 m31Var = ((la1) this.e).f;
        Object obj = null;
        if (m31Var != null) {
            Long l = m31Var.a;
            zx7Var = new zx7(m31Var.c, m31Var.b, l != null ? new gg1(l.longValue(), 0) : null, false, false, false, false, null, false, false, 3, null, null);
        } else {
            zx7Var = null;
        }
        la1 la1Var = (la1) this.e;
        Map map2 = (Map) this.i;
        hb1 hb1Var = (hb1) map2.get((gg1) this.h);
        if (hb1Var == null && (hb1Var = (hb1) map2.get(la1Var.p)) == null) {
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                gg1 gg1Var2 = (gg1) next;
                if (!tpa.f(gg1Var2, la1Var.h != null ? r10.a.getId() : null)) {
                    break;
                }
            }
            hb1Var = (hb1) map2.get(next);
            if (hb1Var == null) {
                hb1Var = (hb1) x53.h0(map2.values());
            }
        }
        la1 la1Var2 = (la1) this.e;
        if (la1Var2.i.a() || nnfVar == nnf.c) {
            return null;
        }
        nnf nnfVar2 = nnf.a;
        je7 je7Var = (je7) this.c;
        boolean z = la1Var2.g;
        if (!z && nnfVar == nnfVar2 && gg1Var == null) {
            Iterator it2 = map.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (!((hb1) next2).w0) {
                    obj = next2;
                    break;
                }
            }
            hb1 hb1Var2 = (hb1) obj;
            if (hb1Var2 != null) {
                return dz7.e(hb1Var2, (la1) this.e, (bn1) je7Var.getValue());
            }
        } else if (!z && nnfVar == nnfVar2) {
            Iterator it3 = map.values().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (!tpa.f(((hb1) next3).a, gg1Var)) {
                    obj = next3;
                    break;
                }
            }
            hb1 hb1Var3 = (hb1) obj;
            if (hb1Var3 != null) {
                return dz7.e(hb1Var3, (la1) this.e, (bn1) je7Var.getValue());
            }
        } else if (hb1Var != null) {
            return dz7.e(hb1Var, (la1) this.e, (bn1) je7Var.getValue());
        }
        return zx7Var;
    }

    public c11(je7 je7Var, ivc ivcVar) {
        this.b = ivcVar;
        this.c = je7Var;
        this.d = tu0.r(3, new md1(5, this));
        this.e = new la1();
        this.f = nnf.a;
        this.a = true;
        this.i = oz4.a;
    }
}
