package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class p7c {
    public static final /* synthetic */ int j = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final khe g;
    public final je7 h;
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public p7c(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8) {
        this.a = je7Var3;
        this.b = je7Var7;
        this.c = je7Var8;
        this.d = je7Var2;
        this.e = je7Var6;
        this.f = je7Var;
        this.g = new khe(new z30(22, je7Var4));
        this.h = je7Var5;
    }

    public static /* synthetic */ long e(p7c p7cVar, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, int i) {
        return p7cVar.d(j2, j3, j4, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? false : z3, false);
    }

    public final p82 a() {
        return (p82) this.a.getValue();
    }

    public final void b(e52 e52Var) {
        es8 es8Var = e52Var.c;
        if (es8Var == null) {
            return;
        }
        long j2 = e52Var.b.a;
        cu8 cu8Var = es8Var.a;
        e(this, j2, cu8Var.o, cu8Var.c, false, false, false, 88);
        ((cea) this.b.getValue()).a(j2);
    }

    public final void c(e52 e52Var) {
        cu8 cu8Var;
        es8 es8Var = e52Var.c;
        if (es8Var == null || (cu8Var = es8Var.a) == null) {
            return;
        }
        long j2 = cu8Var.o;
        if (j2 <= 0) {
            return;
        }
        e(this, e52Var.b.a, j2, cu8Var.c, true, false, false, 112);
    }

    public final long d(long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        Integer num;
        int i = 0;
        long j5 = z ? j3 - 1 : j3;
        StringBuilder sbK = au1.k(j2, "sendReadMark: chatServerId = ", ", mark = ");
        sbK.append(j3);
        sbK.append(", messageServerId = ");
        sbK.append(j4);
        hm9.n("p7c", sbK.toString());
        e52 e52VarZ = a().z(j2);
        if (e52VarZ == null) {
            rw9 rw9Var = (rw9) this.c.getValue();
            if (rw9Var != null) {
                rw9Var.f(j2, j5);
            }
        } else {
            final p82 p82VarA = a();
            final long jT = ((p7b) ((m7b) this.d.getValue())).a.t();
            p82VarA.getClass();
            final long j6 = e52VarZ.a;
            final long j7 = j5;
            sj3 sj3Var = new sj3() { // from class: g82
                public final /* synthetic */ Integer d = null;
                public final /* synthetic */ boolean e = true;

                @Override // defpackage.sj3
                public final void accept(Object obj) {
                    u82 u82Var = (u82) obj;
                    p82 p82Var = p82VarA;
                    p82Var.getClass();
                    Map mapD = u82Var.d();
                    long j8 = jT;
                    Long l = (Long) mapD.get(Long.valueOf(j8));
                    if (l == null) {
                        return;
                    }
                    long jLongValue = l.longValue();
                    long j9 = j7;
                    boolean z5 = jLongValue != j9;
                    if (z5) {
                        mapD.put(Long.valueOf(j8), Long.valueOf(j9));
                    }
                    Integer num2 = this.d;
                    if (num2 != null) {
                        u82Var.m = num2.intValue();
                    }
                    if (this.e && z5 && j8 == p82Var.K()) {
                        rm4 rm4Var = p82Var.B;
                        if (rm4Var.get() != null) {
                            ((rw9) rm4Var.get()).e(j6, j9);
                        }
                    }
                }
            };
            sj3 o7cVar = new o7c();
            if (z || z2) {
                final int iA = z ? (int) ((au8) this.e.getValue()).a(j6, j5) : 0;
                Integer numValueOf = Integer.valueOf(iA);
                a().getClass();
                o7cVar = new sj3() { // from class: e82
                    @Override // defpackage.sj3
                    public final void accept(Object obj) {
                        u82 u82Var = (u82) obj;
                        int i2 = iA;
                        u82Var.m = i2;
                        if (i2 == 0) {
                            u82Var.N = false;
                            u82Var.O = false;
                        }
                    }
                };
                num = numValueOf;
            } else {
                num = null;
            }
            a().getClass();
            d82 d82Var = new d82(z, i);
            hm9.m("p7c", "update chat %d, setAsUnread = %b, count = %s", Long.valueOf(j6), Boolean.valueOf(z), num);
            p82 p82VarA2 = a();
            sj3[] sj3VarArr = {sj3Var, o7cVar, d82Var};
            p82VarA2.getClass();
            if (!p82VarA2.h(j6, false, new v02(4, sj3VarArr)).e0()) {
                return 0L;
            }
        }
        k4a k4aVar = (k4a) ((pk) this.f.getValue());
        long jD = !k4aVar.q(j4) ? 0L : ome.d(k4aVar.z(), new pd2(((p7b) k4aVar.y()).a.o(), j2, j3, j4, z, z3, z4), false, 0, 12);
        ConcurrentHashMap concurrentHashMap = this.i;
        zl4 zl4Var = (zl4) concurrentHashMap.get(Long.valueOf(j2));
        if (zl4Var != null) {
            zl4Var.g();
        }
        concurrentHashMap.remove(Long.valueOf(j2));
        concurrentHashMap.put(Long.valueOf(j2), ((ztc) this.g.getValue()).b(new u05(2, jD, j2, this)));
        return jD;
    }
}
