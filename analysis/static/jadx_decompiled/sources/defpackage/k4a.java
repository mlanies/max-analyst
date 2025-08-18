package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.exception.ApiArgumentValidateException;

/* loaded from: classes2.dex */
public final class k4a implements pk {
    public static final long[] g = new long[0];
    public final String a = k4a.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public k4a(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, khe kheVar) {
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
        this.e = je7Var4;
        this.f = kheVar;
    }

    public static long v(k4a k4aVar, ol olVar) {
        ome omeVarZ = k4aVar.z();
        omeVarZ.getClass();
        return ome.a(omeVarZ.a, new mme(olVar, false, false, 0L, 0));
    }

    public static long w(k4a k4aVar, ol olVar) {
        return ome.d(k4aVar.z(), olVar, false, 0, 12);
    }

    public final long A(String str, boolean z) {
        if (true ^ (str == null || w9e.C0(str))) {
            return ome.b(z(), new ei7(((p7b) y()).a.o(), str, z));
        }
        throw new IllegalArgumentException("link is empty".toString());
    }

    public final long[] B(long j, long j2, List list, List list2, da3 da3Var, boolean z, mg4 mg4Var) {
        int iOrdinal;
        boolean zO = o(j);
        long[] jArr = c32.b;
        if (!zO) {
            return jArr;
        }
        if (list.size() != list2.size() && (iOrdinal = x().ordinal()) != 0) {
            if (iOrdinal == 1) {
                hm9.p(this.a, "messageIds.size() != messageServerIds.size()", new ApiArgumentValidateException("messageIds.size() != messageServerIds.size()"));
                return jArr;
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            throw new ApiArgumentValidateException("messageIds.size() != messageServerIds.size()");
        }
        if (list2.isEmpty()) {
            return jArr;
        }
        ArrayList arrayListI0 = x53.I0(list2, 100, 100);
        ArrayList arrayListI02 = x53.I0(list, 100, 100);
        ArrayList arrayList = new ArrayList(z53.S(arrayListI02, 10));
        Iterator it = arrayListI02.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                y53.R();
                throw null;
            }
            arrayList.add(Long.valueOf(ome.d(z(), new pe9(((p7b) y()).a.o(), j, j2, (List) next, (List) arrayListI0.get(i), da3Var, z, mg4Var, false), false, 0, 12)));
            i = i2;
        }
        return x53.E0(arrayList);
    }

    public final long C(long j, long j2, long j3, long j4, String str, String str2, vx8 vx8Var, List list, boolean z, List list2) {
        if (!o(j) || !p(j2) || !q(j4)) {
            return 0L;
        }
        return ome.d(z(), new ve9(((p7b) y()).a.o(), j, j2, j3, j4, str, str2, vx8Var, list, list2, z), false, 0, 12);
    }

    public final long D(long j, List list) {
        return v(this, new wp3(1, ((p7b) y()).a.o(), j, list));
    }

    public final long E(long j, long j2, long j3, long j4, String str, gx8 gx8Var) {
        int iOrdinal;
        if (!o(j) || !p(j2) || !q(j4)) {
            return 0L;
        }
        if (str.length() > 0 || (iOrdinal = x().ordinal()) == 0) {
            return ome.d(z(), new ff9(((p7b) y()).a.o(), j, j2, j3, j4, new bx8(gx8Var, str)), false, 0, 12);
        }
        if (iOrdinal == 1) {
            hm9.p(this.a, "reaction can't be empty", new ApiArgumentValidateException("reaction can't be empty"));
            return 0L;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ApiArgumentValidateException("reaction can't be empty");
    }

    public final long F(String str, a20 a20Var) {
        return ((s8g) this.e.getValue()).b(new b32(((p7b) y()).a.o(), str, 0L, a20Var));
    }

    public final long G(boolean z) {
        hm9.n(this.a, "ping, active = " + z + ", current time = " + nu0.G(Long.valueOf(System.currentTimeMillis())));
        return v(this, new t0b(((p7b) y()).a.o(), z));
    }

    public final long H(int i, long j, a20 a20Var, String str, String str2, String str3, String str4, String str5) {
        return ome.d(z(), new sab(((p7b) y()).a.o(), str, str2, str3, j, a20Var, str4, str5, i), false, 0, 12);
    }

    public final long I(long j, long j2, List list, boolean z, int i) {
        rk2 rk2Var = new rk2(((p7b) y()).a.o(), j, j2, 2, list, ek2.ADMIN, true, 0, i);
        return z ? ome.d(z(), rk2Var, false, 0, 12) : v(this, rk2Var);
    }

    public final Object J(dle dleVar, Continuation continuation) {
        return z().e(dleVar, continuation);
    }

    public final drd K(dle dleVar, ztc ztcVar) {
        tle tleVar = (tle) z().a;
        tleVar.getClass();
        return new q1a(1, new ypc(tleVar, 9, dleVar)).i(ztcVar);
    }

    public final long L(boolean z, long j, long j2, long j3, long j4, String str, boolean z2, boolean z3, String str2) {
        yjf yjfVar = new yjf(((p7b) y()).a.o(), j, j2, j3, j4, str, z2, z3, str2, false);
        return z ? ome.d(z(), yjfVar, false, 0, 12) : v(this, yjfVar);
    }

    public final long d(long j, long j2, List list, boolean z) {
        if (!o(j)) {
            return 0L;
        }
        return ome.d(z(), new rk2(((p7b) y()).a.o(), j, j2, 1, list, ek2.MEMBER, z, 0, 0), false, 0, 12);
    }

    public final long e(int i, long j) {
        return ome.d(z(), new zt(i, ((p7b) y()).a.o(), j), false, 0, 12);
    }

    public final long f(int i, long[] jArr) {
        return ome.d(z(), new nu(i, ((p7b) y()).a.o(), jArr), false, 0, 12);
    }

    public final long g(int i, long j) {
        return v(this, new qu(i, ((p7b) y()).a.o(), j));
    }

    public final long h(long j, long j2, long j3) {
        if (o(j)) {
            return v(this, new rs2(((p7b) y()).a.o(), j, j2, 0, null, false, null, null, null, null, null, null, false, j3));
        }
        return 0L;
    }

    public final long i(long j, long j2, boolean z, long j3) {
        if (!o(j)) {
            return 0L;
        }
        return ome.d(z(), new q92(((p7b) y()).a.o(), j, j2, j3, z), false, 0, 12);
    }

    public final long j(long j) {
        return v(this, new kc2(0, ((p7b) y()).a.o(), Collections.singletonList(Long.valueOf(j))));
    }

    public final long k(long j, boolean z) {
        br2 br2Var = new br2(((p7b) y()).a.o(), j, false);
        return z ? ome.d(z(), br2Var, false, 0, 12) : v(this, br2Var);
    }

    public final long l(long j, long j2, int i, String str, boolean z, HashMap map) {
        if (o(j)) {
            return v(this, new rs2(((p7b) y()).a.o(), j, j2, i, str, z, null, map, null, null, null, null, false, 0L));
        }
        return 0L;
    }

    public final long m(long j, long j2, String str, String str2, a20 a20Var) {
        if (!o(j)) {
            return 0L;
        }
        return ome.d(z(), new rs2(((p7b) y()).a.o(), j, j2, 0, null, false, null, null, str, str2, a20Var, null, false, 0L), false, 0, 12);
    }

    public final long n(long j, String str, long j2) {
        if (!o(j)) {
            return 0L;
        }
        return ome.d(z(), new rs2(((p7b) y()).a.o(), j, j2, 0, null, false, str, null, null, null, null, null, false, 0L), false, 0, 12);
    }

    public final boolean o(long j) {
        int iOrdinal;
        if ((j != 0) || (iOrdinal = x().ordinal()) == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            hm9.p(this.a, "invalid chat local id", new ApiArgumentValidateException("invalid chat local id"));
            return false;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ApiArgumentValidateException("invalid chat local id");
    }

    public final boolean p(long j) {
        int iOrdinal;
        if ((j != 0) || (iOrdinal = x().ordinal()) == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            hm9.p(this.a, "invalid message local id", new ApiArgumentValidateException("invalid message local id"));
            return false;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ApiArgumentValidateException("invalid message local id");
    }

    public final boolean q(long j) {
        int iOrdinal;
        if ((j != 0) || (iOrdinal = x().ordinal()) == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            hm9.p(this.a, "invalid message server id", new ApiArgumentValidateException("invalid message server id"));
            return false;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new ApiArgumentValidateException("invalid message server id");
    }

    public final long r(long j) {
        if (!o(j)) {
            return 0L;
        }
        return ome.d(z(), new de3(((p7b) y()).a.o(), j, false, null, false, g, false, null, null), false, 0, 12);
    }

    public final long s() {
        return ome.d(z(), new de3(((p7b) y()).a.o(), 0L, true, null, false, g, false, null, null), false, 0, 12);
    }

    public final long t(gaf gafVar, boolean z) {
        return ome.d(z(), new de3(((p7b) y()).a.o(), 0L, false, gafVar, z, g, false, null, null), false, 0, 12);
    }

    public final long[] u(List list) {
        if (list.isEmpty()) {
            return c32.b;
        }
        ArrayList arrayListI0 = x53.I0(list, 100, 100);
        int size = arrayListI0.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = Long.valueOf(v(this, new wp3(((p7b) y()).a.o(), x53.E0((List) arrayListI0.get(i)), -1L))).longValue();
        }
        return jArr;
    }

    public final j4a x() {
        return (j4a) this.f.getValue();
    }

    public final m7b y() {
        return (m7b) this.c.getValue();
    }

    public final ome z() {
        return (ome) this.b.getValue();
    }
}
