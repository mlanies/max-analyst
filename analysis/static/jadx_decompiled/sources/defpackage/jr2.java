package defpackage;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jr2 {
    public static final /* synthetic */ int m = 0;
    public final long a;
    public final y7d b;
    public final iy2 c;
    public final k56 d;
    public final je7 e;
    public x77 f;
    public volatile i92 g;
    public volatile long h;
    public volatile long i;
    public volatile boolean j;
    public final je7 k;
    public final lx3 l;

    public jr2(long j, qqd qqdVar, je7 je7Var, y7d y7dVar, iy2 iy2Var, b7c b7cVar) {
        this.a = j;
        this.b = y7dVar;
        this.c = iy2Var;
        this.d = b7cVar;
        this.e = je7Var;
        int i = ft4.o;
        this.i = 0L;
        this.k = tu0.r(2, new md1(14, this));
        this.l = ((nx3) qqdVar.b).plus(new hr2(qx7.c, 0));
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "jr2", ey8.h(j, "init #"), null);
        }
    }

    public final e52 a() {
        return (e52) ((jz2) this.c).m(this.a).a.getValue();
    }

    public final boolean b() {
        if (a() != null) {
            e52 e52VarA = a();
            Long lValueOf = e52VarA != null ? Long.valueOf(e52VarA.a) : null;
            ty2 ty2Var = ((jz2) this.c).b;
            e52 e52Var = (e52) ((j0e) ((ConcurrentHashMap) ty2Var.Z).computeIfAbsent(0L, new di(4, new jy2(0, ty2Var)))).getValue();
            if (tpa.f(lValueOf, e52Var != null ? Long.valueOf(e52Var.a) : null)) {
                return true;
            }
        }
        return false;
    }

    public final e5f c(long j, Continuation continuation) {
        boolean zB = b();
        e5f e5fVar = e5f.a;
        if (zB && j == 0) {
            hm9.k0("jr2", null, "requestForChatSubscribeIfNeed #%d: invalid serverId == 0L", Arrays.copyOf(new Object[]{new Long(this.a)}, 1));
            return e5fVar;
        }
        int i = ft4.o;
        long jS = z7.S(System.nanoTime(), kt4.NANOSECONDS);
        long jG = ft4.g(jS, this.i);
        if (ft4.c(jG, ((ft4) this.k.getValue()).a) < 0) {
            hm9.k0("jr2", null, "requestForChatSubscribeIfNeed #%d: request diff = %s", Arrays.copyOf(new Object[]{new Long(this.a), new ft4(jG)}, 2));
            return e5fVar;
        }
        if (!((Boolean) this.d.invoke()).booleanValue()) {
            hm9.m0("jr2", "requestForChatSubscribeIfNeed: needSubscribeToPushes return false!", new Object[0]);
            return e5fVar;
        }
        this.i = jS;
        k4a k4aVar = (k4a) ((pk) this.e.getValue());
        k4a.v(k4aVar, new br2(((p7b) k4aVar.y()).a.o(), j, true));
        iy2 iy2Var = this.c;
        ((jz2) iy2Var).l().Y(this.a, true);
        return e5fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final e5f e(Continuation continuation) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "jr2", ey8.h(this.a, "unsubscribe() #"), null);
        }
        int i = ft4.o;
        this.i = 0L;
        e52 e52VarF = f(a());
        e5f e5fVar = e5f.a;
        if (e52VarF == null) {
            return e5fVar;
        }
        ((k4a) ((pk) this.e.getValue())).k(e52VarF.b.a, false);
        iy2 iy2Var = this.c;
        ((jz2) iy2Var).l().Y(this.a, false);
        return e5fVar;
    }

    public final e52 f(e52 e52Var) {
        e52 e52VarA = a();
        long j = this.a;
        if (e52VarA == null) {
            hm9.m0("jr2", "validate #%d: chat is null", Long.valueOf(j));
            return null;
        }
        if (b()) {
            return e52VarA;
        }
        k92 k92Var = e52VarA.b;
        if (k92Var.a == 0) {
            hm9.m0("jr2", "validate #%d: chatServerId == 0L", Long.valueOf(j));
            return null;
        }
        if (e52VarA.C() || e52VarA.R()) {
            hm9.m("jr2", "validate #%d: chat is valid!", Long.valueOf(j));
            return e52Var;
        }
        hm9.m0("jr2", "validate #%d: invalid chat status %s", Long.valueOf(j), k92Var.c);
        return null;
    }
}
