package defpackage;

import android.location.Location;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class ck9 implements b66, qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk9 b;

    public /* synthetic */ ck9(fk9 fk9Var, int i) {
        this.a = i;
        this.b = fk9Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        e08 e08Var;
        String strD;
        ConcurrentHashMap concurrentHashMap;
        boolean z;
        int i = 3;
        boolean z2 = true;
        int i2 = 2;
        final fk9 fk9Var = this.b;
        switch (this.a) {
            case 1:
                e08 e08Var2 = (e08) obj;
                fk9Var.getClass();
                long j = e08Var2.c;
                if (j != 0) {
                    ConcurrentHashMap concurrentHashMap2 = fk9Var.c;
                    e08 e08Var3 = (e08) concurrentHashMap2.get(Long.valueOf(j));
                    if (e08Var3 != null) {
                        d08 d08VarA = e08Var3.a();
                        d08VarA.f = e08Var2.f;
                        d08VarA.g = e08Var2.g;
                        d08VarA.i = e08Var2.i;
                        concurrentHashMap2.put(Long.valueOf(e08Var3.c), new e08(d08VarA));
                        fk9Var.e2();
                        break;
                    }
                } else {
                    fk9Var.E0 = e08Var2;
                    fk9Var.f2();
                    break;
                }
                break;
            case 2:
                fk9Var.s0.getClass();
                i28 i28Var = new i28(new f38[]{m28.a, new f38() { // from class: dk9
                    @Override // defpackage.f38
                    public final void a(b38 b38Var) {
                        fk9 fk9Var2 = fk9Var;
                        e08 e08Var4 = fk9Var2.w0;
                        if (e08Var4 == null || !e08Var4.h) {
                            b38Var.a(Collections.emptyList());
                            return;
                        }
                        fk9Var2.s0.getClass();
                        m28 m28Var = m28.a;
                        kw8 kw8Var = kw8.a;
                        kw8 kw8Var2 = (kw8) m28Var.c(kw8Var);
                        if (kw8Var2 == kw8Var) {
                            b38Var.a(Collections.emptyList());
                        } else {
                            b38Var.a(Collections.singletonList(kw8Var2));
                        }
                    }
                }}, 1);
                jj9 jj9Var = new jj9(8);
                int i3 = wq5.a;
                hm9.j0(i3, "bufferSize");
                ds5 ds5Var = new ds5(new yq5(new nr5(i28Var, jj9Var, i3), new jj9(9)), 1);
                hle hleVar = fk9Var.z0;
                hleVar.getClass();
                drd drdVarI = ds5Var.m(((jle) hleVar).a()).i(ce.a());
                iq1 iq1Var = new iq1(new ck9(fk9Var, 3), 2, new ck9(fk9Var, 5));
                drdVarI.k(iq1Var);
                fk9Var.X.a(iq1Var);
                break;
            case 3:
                List list = (List) obj;
                fk9Var.getClass();
                hm9.m("fk9", "invalidateLiveLocations %s", list);
                ConcurrentHashMap concurrentHashMap3 = fk9Var.c;
                Iterator it = concurrentHashMap3.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    er7 er7Var = er7.Z;
                    e08 e08Var4 = fk9Var.w0;
                    if (!zHasNext) {
                        ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                        Iterator it2 = list.iterator();
                        while (true) {
                            boolean zHasNext2 = it2.hasNext();
                            i08 i08Var = i08.c;
                            if (!zHasNext2) {
                                final boolean z3 = fk9Var.C0.d == 3;
                                fk9Var.b2(new tj3() { // from class: ek9
                                    @Override // defpackage.tj3
                                    public final void accept(Object obj2) {
                                        gr7 gr7Var = (gr7) obj2;
                                        gr7Var.b = z3;
                                        gr7Var.m = false;
                                        gr7Var.n = false;
                                        gr7Var.p = 0L;
                                        gr7Var.q = 0L;
                                        gr7Var.r = false;
                                    }
                                });
                                if (concurrentHashMap4.size() == 1) {
                                    e08 e08Var5 = (e08) concurrentHashMap4.values().iterator().next();
                                    if (fk9Var.C0.h != e08Var5.c) {
                                        d08 d08VarA2 = e08Var5.a();
                                        d08VarA2.d = i08Var;
                                        concurrentHashMap4.put(Long.valueOf(e08Var5.c), new e08(d08VarA2));
                                        fk9Var.b2(new gj0(e08Var5, 2));
                                    }
                                }
                                long j2 = fk9Var.C0.h;
                                if (j2 != 0 && (e08Var = (e08) concurrentHashMap4.get(Long.valueOf(j2))) != null) {
                                    fk9Var.g2(e08Var.c);
                                    if (fk9Var.F0 && fk9Var.C0.o == -1) {
                                        el9 el9Var = (el9) ((kk9) fk9Var.b);
                                        er7 er7Var2 = e08Var.a;
                                        el9Var.B(er7Var2.a, er7Var2.b, false);
                                    }
                                }
                                fk9Var.h2(null);
                                fk9Var.e2();
                                break;
                            } else {
                                ((kw8) it2.next()).getClass();
                                if (((e08) concurrentHashMap4.get(0L)) == null && (e08Var4 == null || e08Var4.h || e08Var4.c != 0)) {
                                    if (fk9Var.t0 == 0) {
                                        strD = fk9Var.v0;
                                    } else {
                                        uj3 uj3VarI = fk9Var.x0.i(0L, false);
                                        strD = uj3VarI != null ? uj3VarI.d() : "";
                                    }
                                    d08 d08Var = new d08(er7Var);
                                    d08Var.b = 0L;
                                    d08Var.c = 0L;
                                    d08Var.j = 0L;
                                    d08Var.h = true;
                                    d08Var.e = strD;
                                    d08Var.k = false;
                                    if (0 != fk9Var.C0.h) {
                                        i08Var = i08.b;
                                    }
                                    d08Var.d = i08Var;
                                    d08Var.l = "";
                                    e08 e08Var6 = new e08(d08Var);
                                    concurrentHashMap4.put(0L, e08Var6);
                                    fk9Var.H0.e(e08Var6);
                                }
                            }
                        }
                    } else {
                        Map.Entry entry = (Map.Entry) it.next();
                        e08 e08Var7 = (e08) entry.getValue();
                        Long l = (Long) entry.getKey();
                        long jLongValue = l.longValue();
                        if (jLongValue != 0 && e08Var7.h) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    ((kw8) it3.next()).getClass();
                                    if (jLongValue == 0) {
                                        er7 er7Var3 = e08Var7.a;
                                        ConcurrentHashMap concurrentHashMap5 = concurrentHashMap3;
                                        boolean zF = ((nd) fk9Var.Z).f(er7Var3.a, er7Var3.b, 1.401298464324817E-45d, 1.401298464324817E-45d);
                                        boolean z4 = e08Var7.k ^ z2;
                                        d08 d08VarA3 = e08Var7.a();
                                        d08VarA3.a = er7Var;
                                        d08VarA3.j = 0L;
                                        d08VarA3.h = z2;
                                        d08VarA3.k = false;
                                        Long lValueOf = Long.valueOf(e08Var7.c);
                                        e08 e08Var8 = new e08(d08VarA3);
                                        concurrentHashMap = concurrentHashMap5;
                                        concurrentHashMap.put(lValueOf, e08Var8);
                                        e08 e08Var9 = (e08) concurrentHashMap.get(l);
                                        if (e08Var9 != null && (e08Var9.i || !zF || !z4)) {
                                            fk9Var.H0.e(e08Var9);
                                        }
                                        z = true;
                                    }
                                } else {
                                    concurrentHashMap = concurrentHashMap3;
                                    z = false;
                                }
                            }
                            if ((e08Var4 == null || e08Var4.c != jLongValue) && !z) {
                                it.remove();
                            }
                            concurrentHashMap3 = concurrentHashMap;
                            z2 = true;
                        }
                    }
                }
                break;
            case 4:
            default:
                fk9Var.getClass();
                fk9Var.b2(new cy1(i2, (Boolean) obj));
                fk9Var.h2(null);
                break;
            case 5:
                fk9Var.getClass();
                Locale locale = Locale.ENGLISH;
                hm9.p("fk9", "Can't get getActiveLiveLocations for chat " + fk9Var.u0, (Throwable) obj);
                break;
            case 6:
                fk9Var.G0.e(Boolean.TRUE);
                break;
            case 7:
                fk9Var.Y.a(fk9Var);
                fk9Var.b2(new vx1(fk9Var, i, (Boolean) obj));
                fk9Var.h2(null);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) throws IOException {
        double d;
        double d2;
        float f;
        List<e08> list;
        e08 e08Var = (e08) obj;
        fk9 fk9Var = this.b;
        fk9Var.getClass();
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is main!");
        }
        long j = e08Var.c;
        ir7 ir7Var = fk9Var.C0;
        if (j != ir7Var.h || ir7Var.o == -1 || (list = (List) fk9Var.o.get(Long.valueOf(j))) == null) {
            d = 1.401298464324817E-45d;
            d2 = 1.401298464324817E-45d;
        } else {
            for (e08 e08Var2 : list) {
                if (e08Var2.j == fk9Var.C0.o) {
                    er7 er7Var = e08Var2.a;
                    d = er7Var.a;
                    d2 = er7Var.b;
                    break;
                }
            }
            d = 1.401298464324817E-45d;
            d2 = 1.401298464324817E-45d;
        }
        if (d == 1.401298464324817E-45d || d2 == 1.401298464324817E-45d) {
            er7 er7Var2 = e08Var.a;
            d = er7Var2.a;
            d2 = er7Var2.b;
        }
        er7 er7Var3 = fk9Var.D0;
        String strC = ((nd) fk9Var.Z).c(d, d2, er7Var3.a, er7Var3.b);
        if (e08Var.c == 0 || !fk9Var.D0.a()) {
            f = -1.0f;
        } else {
            er7 er7Var4 = fk9Var.D0;
            float[] fArr = new float[1];
            Location.distanceBetween(d, d2, er7Var4.a, er7Var4.b, fArr);
            f = fArr[0];
        }
        d08 d08VarA = e08Var.a();
        d08VarA.f = strC;
        d08VarA.g = f;
        d08VarA.i = false;
        return new e08(d08VarA);
    }
}
