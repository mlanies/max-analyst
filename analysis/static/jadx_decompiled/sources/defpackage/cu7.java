package defpackage;

import org.apache.http.cookie.ClientCookie;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class cu7 {
    public static final /* synthetic */ int G = 0;
    public final je7 A;
    public final je7 B;
    public final je7 C;
    public final je7 D;
    public final je7 E;
    public final je7 F;
    public final blb a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;
    public final je7 x;
    public final je7 y;
    public final je7 z;

    public cu7(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10, je7 je7Var11, je7 je7Var12, je7 je7Var13, je7 je7Var14, je7 je7Var15, je7 je7Var16, je7 je7Var17, je7 je7Var18, je7 je7Var19, je7 je7Var20, je7 je7Var21, je7 je7Var22, je7 je7Var23, je7 je7Var24, je7 je7Var25, je7 je7Var26, je7 je7Var27, je7 je7Var28, je7 je7Var29, je7 je7Var30, je7 je7Var31, blb blbVar) {
        this.a = blbVar;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
        this.e = je7Var4;
        this.f = je7Var5;
        this.g = je7Var6;
        this.h = je7Var7;
        this.i = je7Var8;
        this.j = je7Var9;
        this.k = je7Var10;
        this.l = je7Var11;
        this.m = je7Var12;
        this.n = je7Var13;
        this.o = je7Var14;
        this.p = je7Var15;
        this.q = je7Var16;
        this.r = je7Var17;
        this.s = je7Var18;
        this.t = je7Var19;
        this.u = je7Var20;
        this.v = je7Var21;
        this.w = je7Var22;
        this.x = je7Var23;
        this.y = je7Var24;
        this.z = je7Var25;
        this.A = je7Var26;
        this.B = je7Var27;
        this.C = je7Var28;
        this.D = je7Var29;
        this.E = je7Var30;
        this.F = je7Var31;
    }

    public static final long a(lec lecVar) {
        int i = ft4.o;
        long jS = z7.S(System.nanoTime(), kt4.NANOSECONDS);
        long jG = ft4.g(jS, lecVar.a);
        lecVar.a = jS;
        return jG;
    }

    public final gj b() {
        return (gj) this.E.getValue();
    }

    public final t20 c() {
        return (t20) this.u.getValue();
    }

    public final ct1 d() {
        return (ct1) this.C.getValue();
    }

    public final p82 e() {
        return (p82) this.i.getValue();
    }

    public final ri4 f() {
        return (ri4) this.e.getValue();
    }

    public final sc5 g() {
        return (sc5) this.y.getValue();
    }

    public final js7 h() {
        return (js7) this.F.getValue();
    }

    public final af8 i() {
        return (af8) this.p.getValue();
    }

    public final xb9 j() {
        return (xb9) this.A.getValue();
    }

    public final bva k() {
        return (bva) this.s.getValue();
    }

    public final lva l() {
        return (lva) this.t.getValue();
    }

    public final w7b m() {
        return (w7b) this.l.getValue();
    }

    public final m9b n() {
        return (m9b) this.z.getValue();
    }

    public final s8g o() {
        return (s8g) this.m.getValue();
    }

    public final void p(kt7 kt7Var, long j) {
        kt7 kt7Var2;
        long jLongValue;
        long j2 = ((p7b) ((m7b) this.d.getValue())).a.g.getLong("app.last.chat.marker", 0L);
        Long lValueOf = Long.valueOf(j2);
        if (j2 == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
            kt7Var2 = kt7Var;
        } else {
            kt7Var2 = kt7Var;
            jLongValue = Long.MAX_VALUE;
        }
        long j3 = kt7Var2.v0;
        Long lValueOf2 = Long.valueOf(j3);
        if (j3 == 0) {
            lValueOf2 = null;
        }
        long jMin = Math.min(jLongValue, lValueOf2 != null ? lValueOf2.longValue() : Long.MAX_VALUE);
        if (jMin == Long.MAX_VALUE || jMin <= 0) {
            return;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            z7d z7dVar = ((p7b) ((m7b) this.d.getValue())).b;
            z7dVar.getClass();
            int iQ = (int) z7dVar.q(PmsKey.f24chatspagesize, 50);
            StringBuilder sbK = au1.k(jMin, "api.chatsList(", ", ");
            sbK.append(j);
            sbK.append(", ");
            sbK.append(iQ);
            sbK.append(")");
            ir6Var.d(us7Var, "cu7", sbK.toString(), null);
        }
        pk pkVar = (pk) this.b.getValue();
        z7d z7dVar2 = ((p7b) ((m7b) this.d.getValue())).b;
        z7dVar2.getClass();
        k4a k4aVar = (k4a) pkVar;
        ome.d(k4aVar.z(), new nt2((int) z7dVar2.q(PmsKey.f24chatspagesize, 50), ((p7b) k4aVar.y()).a.o(), jMin, j), false, 0, 12);
    }

    public final void q() {
        long j;
        t33 t33Var = ((p7b) ((m7b) this.d.getValue())).a;
        long j2 = t33Var.g.getLong("app.reset.at.time", 0L);
        String strF = ((f5a) this.c.getValue()).f();
        long jN = t33Var.n();
        if (j2 > 0 && j2 < jN && strF != null && strF.length() != 0) {
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                us7 us7Var = us7.X;
                StringBuilder sbK = au1.k(j2, "Drop cache: resetAt=", ", lastLogin=");
                sbK.append(jN);
                ir6Var.d(us7Var, "cu7", sbK.toString(), null);
            }
            ((w9a) ((kke) this.B.getValue())).b().mo20dispatch(hz4.a, new nn6(7, this));
            return;
        }
        k4a k4aVar = (k4a) ((pk) this.b.getValue());
        p7b p7bVar = (p7b) k4aVar.y();
        t33 t33Var2 = p7bVar.a;
        long jP = t33Var2.p();
        long j3 = t33Var2.g.getLong("user.contactsLastSync", 0L);
        long jF = t33Var2.f("user.presenceLastSync", 0L);
        String name = k4a.class.getName();
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            us7 us7Var2 = us7.X;
            String strG = nu0.G(Long.valueOf(jP));
            String strG2 = nu0.G(Long.valueOf(j3));
            String strG3 = nu0.G(Long.valueOf(jF));
            StringBuilder sbK2 = k7d.k("LoginTamTask: chatsLastSync = ", strG, ", contactLastSync = ", strG2, ", presenceLastSync = ");
            sbK2.append(strG3);
            ir6Var2.d(us7Var2, name, sbK2.toString(), null);
        }
        String strW = p7bVar.b.w(pyc.a, null);
        if (p7bVar.b.g.getInt(ClientCookie.VERSION_ATTR, 1) < 6) {
            p7bVar.b.k(6, ClientCookie.VERSION_ATTR);
            strW = null;
            j = 0;
        } else {
            j = jP;
        }
        long jO = ((p7b) k4aVar.y()).a.o();
        String strF2 = ((f5a) k4aVar.d.getValue()).f();
        if (strF2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        k4a.v(k4aVar, new ht7(jO, strF2, j, j3, jF, strW, t33Var2.g.getLong("user.callsLastSync", 0L), t33Var2.g.getLong("app.last.login.time", 0L), t33Var2.g.getLong("user.draftsLastSync", -1L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0582 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x03a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r15v25, types: [q33] */
    /* JADX WARN: Type inference failed for: r1v30, types: [int] */
    /* JADX WARN: Type inference failed for: r3v103, types: [q33] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(long r37, defpackage.kt7 r39, long r40, kotlin.coroutines.Continuation r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu7.r(long, kt7, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void s(boolean z, vi4 vi4Var, long j) {
        ((ad) this.h.getValue()).e(ft4.e(j), z ? "FIRST_LOGIN_PROCESSING_TIME" : "LOGIN_PROCESSING_TIME", vi4Var.name());
    }

    public final void t(boolean z, vi4 vi4Var, long j) {
        ((ad) this.h.getValue()).e(ft4.e(j), z ? "INTERACTIVE_FIRST_LOGIN_PROCESSING_TIME" : "INTERACTIVE_LOGIN_PROCESSING_TIME", vi4Var.name());
    }

    /* JADX WARN: Path cross not found for [B:109:0x04c9, B:112:0x04dc], limit reached: 124 */
    /* JADX WARN: Path cross not found for [B:112:0x04dc, B:109:0x04c9], limit reached: 124 */
    /* JADX WARN: Path cross not found for [B:48:0x01c6, B:52:0x01d6], limit reached: 124 */
    /* JADX WARN: Path cross not found for [B:52:0x01d6, B:48:0x01c6], limit reached: 124 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0470  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0144 -> B:40:0x0159). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x03fc -> B:93:0x03fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x044b -> B:96:0x046e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x0452 -> B:96:0x046e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.util.Map r31, kotlin.coroutines.Continuation r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu7.u(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
