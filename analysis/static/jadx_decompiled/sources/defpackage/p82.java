package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.tamtam.exception.ChatNotFoundException;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class p82 {
    public static final v00 I = new v00(9);
    public static final v00 J = new v00(10);
    public static final EnumSet K;
    public static final EnumSet L;
    public static final EnumSet M;
    public static final un0 N;
    public final rm4 A;
    public final rm4 B;
    public final je7 C;
    public final rm4 D;
    public o82 G;
    public final rm4 l;
    public final av0 m;
    public final m7b n;
    public final rm4 o;
    public final rm4 p;
    public final rm4 q;
    public final rm4 r;
    public final rm4 s;
    public final rm4 t;
    public final ztc u;
    public final rm4 v;
    public final rm4 w;
    public final rm4 x;
    public final ztc y;
    public final ztc z;
    public e52 a = null;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public volatile boolean i = false;
    public final fb3 j = new fb3();
    public final Set k = Collections.synchronizedSet(new HashSet());
    public final q0e E = r0e.a(null);
    public final us F = new us(0);
    public final ReentrantLock H = new ReentrantLock();

    static {
        i92 i92Var = i92.a;
        i92 i92Var2 = i92.b;
        K = EnumSet.of(i92Var, i92Var2, i92.c, i92.X, i92.o, i92.Y, i92.Z);
        L = EnumSet.of(i92Var, i92Var2);
        M = EnumSet.of(i92Var);
        N = new un0(16);
    }

    public p82(rm4 rm4Var, av0 av0Var, m7b m7bVar, rm4 rm4Var2, rm4 rm4Var3, rm4 rm4Var4, rm4 rm4Var5, rm4 rm4Var6, rm4 rm4Var7, ztc ztcVar, rm4 rm4Var8, rm4 rm4Var9, rm4 rm4Var10, rm4 rm4Var11, ztc ztcVar2, ztc ztcVar3, rm4 rm4Var12, rm4 rm4Var13, je7 je7Var) {
        this.l = rm4Var;
        this.m = av0Var;
        this.n = m7bVar;
        this.o = rm4Var2;
        this.D = rm4Var11;
        this.p = rm4Var3;
        this.q = rm4Var4;
        this.r = rm4Var5;
        this.s = rm4Var6;
        this.t = rm4Var7;
        this.u = ztcVar;
        this.v = rm4Var8;
        this.w = rm4Var9;
        this.x = rm4Var10;
        this.y = ztcVar2;
        this.z = ztcVar3;
        this.A = rm4Var12;
        this.B = rm4Var13;
        this.C = je7Var;
    }

    public static x82 H(u82 u82Var, Set set) {
        if (b10.D0.equals(set)) {
            x82 x82Var = u82Var.q;
            return x82Var != null ? x82Var : x82.g;
        }
        if (b10.E0.equals(set)) {
            x82 x82Var2 = u82Var.r;
            return x82Var2 != null ? x82Var2 : x82.g;
        }
        if (b10.F0.equals(set)) {
            x82 x82Var3 = u82Var.s;
            return x82Var3 != null ? x82Var3 : x82.g;
        }
        if (b10.G0.equals(set)) {
            x82 x82Var4 = u82Var.t;
            return x82Var4 != null ? x82Var4 : x82.g;
        }
        if (b10.H0.equals(set)) {
            x82 x82Var5 = u82Var.u;
            return x82Var5 != null ? x82Var5 : x82.g;
        }
        if (b10.I0.equals(set)) {
            x82 x82Var6 = u82Var.v;
            return x82Var6 != null ? x82Var6 : x82.g;
        }
        if (b10.J0.equals(set)) {
            x82 x82Var7 = u82Var.w;
            return x82Var7 != null ? x82Var7 : x82.g;
        }
        x82 x82Var8 = x82.f;
        return new x82(null, 0, 0L, 0L, Collections.emptyList());
    }

    public static x82 I(k92 k92Var, Set set) {
        if (b10.D0.equals(set)) {
            x82 x82Var = k92Var.q;
            return x82Var != null ? x82Var : x82.g;
        }
        if (b10.E0.equals(set)) {
            x82 x82Var2 = k92Var.r;
            return x82Var2 != null ? x82Var2 : x82.g;
        }
        if (b10.F0.equals(set)) {
            x82 x82Var3 = k92Var.s;
            return x82Var3 != null ? x82Var3 : x82.g;
        }
        if (b10.G0.equals(set)) {
            x82 x82Var4 = k92Var.t;
            return x82Var4 != null ? x82Var4 : x82.g;
        }
        if (b10.H0.equals(set)) {
            x82 x82Var5 = k92Var.u;
            return x82Var5 != null ? x82Var5 : x82.g;
        }
        if (b10.I0.equals(set)) {
            x82 x82Var6 = k92Var.v;
            return x82Var6 != null ? x82Var6 : x82.g;
        }
        if (b10.J0.equals(set)) {
            x82 x82Var7 = k92Var.w;
            return x82Var7 != null ? x82Var7 : x82.g;
        }
        x82 x82Var8 = x82.f;
        return new x82(null, 0, 0L, 0L, Collections.emptyList());
    }

    public static boolean L(k92 k92Var, Set set) {
        return b10.D0.equals(set) ? k92Var.q != null : b10.E0.equals(set) ? k92Var.r != null : b10.F0.equals(set) ? k92Var.s != null : b10.G0.equals(set) ? k92Var.t != null : b10.H0.equals(set) ? k92Var.u != null : b10.I0.equals(set) ? k92Var.v != null : b10.J0.equals(set) && k92Var.w != null;
    }

    public static /* synthetic */ String a(String str) {
        return zr6.i("syncSelf(", str, "): unlocked");
    }

    public static void a0(u82 u82Var, Set set, x82 x82Var) {
        if (b10.D0.equals(set)) {
            u82Var.q = x82Var;
            return;
        }
        if (b10.E0.equals(set)) {
            u82Var.r = x82Var;
            return;
        }
        if (b10.F0.equals(set)) {
            u82Var.s = x82Var;
            return;
        }
        if (b10.G0.equals(set)) {
            u82Var.t = x82Var;
            return;
        }
        if (b10.H0.equals(set)) {
            u82Var.u = x82Var;
        } else if (b10.I0.equals(set)) {
            u82Var.v = x82Var;
        } else if (b10.J0.equals(set)) {
            u82Var.w = x82Var;
        }
    }

    public static void l0(u82 u82Var, cu8 cu8Var) {
        if (cu8Var.o()) {
            return;
        }
        u82Var.j = cu8Var.b;
        long j = u82Var.k;
        long j2 = cu8Var.o;
        if (j2 > j) {
            u82Var.k = j2;
            return;
        }
        long j3 = cu8Var.w0;
        if (j3 > j) {
            u82Var.k = j3;
        }
    }

    public static boolean m(e52 e52Var, EnumSet enumSet, boolean z, qe5 qe5Var) {
        k92 k92Var = e52Var.b;
        if (k92Var.b != j92.c) {
            if (!z && e52Var.J() && e52Var.e0() && !e52Var.d0() && e52Var.L()) {
                return true;
            }
            if (e52Var.J() && !e52Var.e0() && e52Var.C() && k92Var.a().e == 0) {
                return false;
            }
            return enumSet.contains(k92Var.c);
        }
        if (e52Var.I() && !e52Var.h0() && k92Var.a().e == 0) {
            return false;
        }
        if (z) {
            boolean z2 = ((se5) qe5Var).t() && (e52Var.y() || e52Var.d0() || oag.s(e52Var.e(e52Var.Y), 512));
            if ((e52Var.x() || z2) && e52Var.C()) {
                return true;
            }
        } else if (e52Var.c0()) {
            return true;
        }
        return false;
    }

    public static void q(u82 u82Var) {
        b92 b92Var = u82Var.p;
        if (b92Var == null) {
            b92Var = b92.h;
        }
        a92 a92VarA = b92Var.a();
        a92VarA.e = 0L;
        u82Var.p = new b92(a92VarA);
    }

    public static k92 t(long j, long j2, int i, long j3, Map map, long j4, int i2, long j5, long j6, w4d w4dVar) {
        u82 u82Var = new u82();
        u(u82Var, j, j2, i, j3, map, j4, i2, j5, j6, "", "", w4dVar);
        return new k92(u82Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(defpackage.u82 r13, long r14, long r16, int r18, long r19, java.util.Map r21, long r22, int r24, long r25, long r27, java.lang.String r29, java.lang.String r30, defpackage.w4d r31) {
        /*
            r0 = r13
            r1 = r14
            r3 = r16
            r5 = r18
            r6 = r19
            r8 = r31
            r9 = 2
            r10 = 0
            if (r5 == r9) goto L13
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 == 0) goto L15
        L13:
            r0.l = r3
        L15:
            if (r5 == r9) goto L1b
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 == 0) goto L1d
        L1b:
            r0.a = r1
        L1d:
            int r1 = defpackage.au1.s(r18)
            r2 = 3
            r3 = 1
            if (r1 == r3) goto L35
            j92 r4 = defpackage.j92.b
            if (r1 == r9) goto L37
            if (r1 == r2) goto L32
            r10 = 4
            if (r1 == r10) goto L2f
            goto L37
        L2f:
            j92 r4 = defpackage.j92.o
            goto L37
        L32:
            j92 r4 = defpackage.j92.c
            goto L37
        L35:
            j92 r4 = defpackage.j92.a
        L37:
            r0.b = r4
            if (r5 != r2) goto L60
            java.lang.Long r1 = java.lang.Long.valueOf(r19)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.I = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r19)
            s82 r2 = new s82
            r2.<init>()
            r2.b = r6
            r4 = 2047(0x7ff, float:2.868E-42)
            r2.a = r4
            t82 r4 = new t82
            r4.<init>(r2)
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r4)
            r13.e(r1)
        L60:
            if (r24 == 0) goto L6d
            int r1 = defpackage.au1.s(r24)
            if (r1 == r3) goto L69
            goto L6a
        L69:
            r9 = r3
        L6a:
            r0.r0 = r9
            goto L6f
        L6d:
            r0.r0 = r9
        L6f:
            i92 r1 = defpackage.i92.Z
            r0.c = r1
            r0.d = r6
            int r1 = r21.size()
            r0.G = r1
            java.util.Map r1 = r13.d()
            r2 = r21
            r1.putAll(r2)
            r1 = r22
            r0.k = r1
            r1 = r25
            r0.p0 = r1
            r1 = r27
            r0.q0 = r1
            r1 = r29
            r0.g = r1
            r1 = r30
            r0.h = r1
            if (r8 == 0) goto La7
            java.lang.Object r1 = r8.b
            long[] r1 = (long[]) r1
            int r2 = r1.length
            if (r2 <= 0) goto La7
            c92 r2 = new c92
            r2.<init>(r1)
            goto La8
        La7:
            r2 = 0
        La8:
            r0.D = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.u(u82, long, long, int, long, java.util.Map, long, int, long, long, java.lang.String, java.lang.String, w4d):void");
    }

    public final l92 A(long j) {
        l92 l92Var = (l92) this.d.get(Long.valueOf(j));
        return (l92Var != null || this.i) ? l92Var : X(j);
    }

    public final l92 B(long j) {
        l92 l92Var = (l92) this.e.get(Long.valueOf(j));
        return (l92Var != null || this.i) ? l92Var : ((k24) ((c34) this.l.get())).b.f(j);
    }

    public final e52 C(long j) {
        ConcurrentHashMap concurrentHashMap = this.f;
        e52 e52Var = (e52) concurrentHashMap.get(Long.valueOf(j));
        if (e52Var != null) {
            return n(e52Var);
        }
        e();
        return n((e52) concurrentHashMap.get(Long.valueOf(j)));
    }

    public final ArrayList D(EnumSet enumSet, boolean z, c7b c7bVar) {
        boolean zTest;
        e();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            e52 e52Var = (e52) ((Map.Entry) it.next()).getValue();
            if (c7bVar != null) {
                try {
                    zTest = c7bVar.test(e52Var);
                } catch (Exception unused) {
                }
            } else {
                zTest = true;
            }
            if (zTest && m(e52Var, enumSet, z, ((p7b) this.n).e)) {
                arrayList.add(e52Var);
            }
        }
        return arrayList;
    }

    public final List E(Comparator comparator) {
        ArrayList arrayListX = x(null);
        Collections.sort(arrayListX, comparator);
        return Collections.unmodifiableList(arrayListX);
    }

    public final e52 F(long j) {
        return (e52) this.c.get(Long.valueOf(j ^ K()));
    }

    public final int G() {
        Iterator it = this.f.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((e52) it.next()).b.a().e != 0) {
                i++;
            }
        }
        return i;
    }

    public final ti9 J(long j) {
        Long lValueOf = Long.valueOf(j);
        us usVar = this.F;
        Object objA = usVar.get(lValueOf);
        if (objA == null) {
            objA = r0e.a(null);
            usVar.put(lValueOf, objA);
        }
        return (ti9) objA;
    }

    public final long K() {
        return ((p7b) this.n).a.t();
    }

    public final boolean M(long j, v82 v82Var) {
        e52 e52VarC = C(j);
        return e52VarC != null && e52VarC.b.B.contains(v82Var);
    }

    public final cu8 N(long j, fs8 fs8Var) throws Throwable {
        hm9.n("p82", "insertMessageIfNeeded");
        if (fs8Var == null) {
            return null;
        }
        rm4 rm4Var = this.s;
        cu8 cu8VarJ = ((au8) rm4Var.get()).j(j, fs8Var.a);
        if (cu8VarJ != null) {
            return cu8VarJ;
        }
        long j2 = fs8Var.Y;
        if (j2 != 0) {
            vlc vlcVar = ((k24) ((au8) rm4Var.get()).a).c;
            ru8 ru8VarH = vlcVar.d().h(j, j2);
            cu8 cu8VarB = ru8VarH != null ? vlcVar.b(ru8VarH) : null;
            if (cu8VarB != null) {
                hm9.m("p82", "last message for chat %d founded by cid %d. Update it", Long.valueOf(j), Long.valueOf(j2));
                vlc vlcVar2 = ((k24) ((c34) this.l.get())).c;
                oz7 oz7Var = iu8.b;
                vlcVar2.o(fs8Var, j, false, null);
                ((au8) rm4Var.get()).w(cu8VarB, iz7.g(fs8Var.s0, (vxc) this.q.get()));
                return ((au8) rm4Var.get()).q(cu8VarB.b);
            }
        }
        hm9.m("p82", "insertMessageIfNeeded: insert message, cid = %d, chatId = %d, chatId = %d", Long.valueOf(j2), Long.valueOf(j), Long.valueOf(fs8Var.b));
        return ((au8) rm4Var.get()).q(((au8) rm4Var.get()).f(j, K(), fs8Var));
    }

    public final void O() throws Resources.NotFoundException {
        mpa mpaVar;
        e();
        if (this.f.isEmpty()) {
            return;
        }
        Iterator it = this.f.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                this.m.c(new vz2(Collections.emptyList(), true));
                return;
            }
            e52 e52Var = (e52) it.next();
            boolean z = e52Var.u0 != null;
            boolean z2 = e52Var.v0 != null;
            boolean z3 = e52Var.x0 != null;
            boolean z4 = e52Var.w0.get() != null;
            e52Var.u0 = null;
            e52Var.v0 = null;
            e52Var.x0 = null;
            e52Var.w0.set(null);
            if (z) {
                e52Var.k0();
            }
            if (z2) {
                e52Var.j0();
            }
            if (z3) {
                e52Var.l0();
            }
            if (z4 && (mpaVar = (mpa) e52Var.w0.updateAndGet(new c52(e52Var, 0))) != null) {
            }
        }
    }

    public final boolean P(e52 e52Var) {
        e52 e52Var2 = this.a;
        return e52Var2 != null && e52Var.a == e52Var2.a;
    }

    public final void Q(long j) {
        e52 e52VarC = C(j);
        if (e52VarC != null) {
            h(j, false, new f9(this, 19, e52VarC));
        }
        e52 e52VarI = i(j, i92.b);
        sna snaVar = (sna) this.v.get();
        long j2 = e52VarI.b.a;
        snaVar.getClass();
        sna.a(j2);
        pk pkVar = (pk) this.p.get();
        k92 k92Var = e52VarI.b;
        long j3 = k92Var.a;
        k4a k4aVar = (k4a) pkVar;
        if (k4aVar.o(j)) {
            k4a.w(k4aVar, new uc2(((p7b) k4aVar.y()).a.o(), j, j3));
        }
        je7 je7Var = this.C;
        if (je7Var.getValue() != null) {
            zb2 zb2Var = (zb2) ((ta2) je7Var.getValue());
            zb2Var.getClass();
            j47.T(zb2Var.Z, null, null, new mb2(zb2Var, k92Var.a, null), 3);
        }
        vz2 vz2Var = new vz2(Collections.singletonList(Long.valueOf(j)), true);
        av0 av0Var = this.m;
        av0Var.c(vz2Var);
        av0Var.c(new ue7(j));
    }

    public final void R(long j, u82 u82Var, cu8 cu8Var) {
        hm9.m("p82", "onControlMessage, chatId = %d, messageDb.event = %s", Long.valueOf(u82Var.a), cu8Var.f().a);
        q10 q10VarF = cu8Var.f();
        int iOrdinal = q10VarF.a.ordinal();
        v82 v82Var = v82.c;
        switch (iOrdinal) {
            case 1:
            case 2:
                Iterator it = q10VarF.c.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    if (!M(j, v82Var)) {
                        u82Var.d().put(l, 0L);
                    }
                }
                break;
            case 3:
                boolean zM = M(j, v82Var);
                long j2 = q10VarF.b;
                if (!zM) {
                    u82Var.d().remove(Long.valueOf(j2));
                }
                if (j2 == K()) {
                    u82Var.c = i92.b;
                    break;
                }
                break;
            case 4:
                Map mapD = u82Var.d();
                long j3 = cu8Var.Y;
                mapD.remove(Long.valueOf(j3));
                if (j3 == K()) {
                    u82Var.c = i92.o;
                    break;
                }
                break;
            case 5:
                if (!M(j, v82.a)) {
                    u82Var.g = q10VarF.d;
                    break;
                }
                break;
            case 6:
                if (!M(j, v82.b)) {
                    u82Var.h = q10VarF.f;
                    break;
                }
                break;
        }
    }

    public final e52 S(long j, long j2, cu8 cu8Var) {
        StringBuilder sbK = au1.k(j, "onMsgSend, chatId = ", ", serverChatId = ");
        sbK.append(j2);
        sbK.append(", messageDb = ");
        sbK.append(cu8Var);
        hm9.n("p82", sbK.toString());
        return h(j, true, new u72(this, j2, cu8Var, j));
    }

    public final e52 T(final long j, final boolean z, final cu8 cu8Var, final boolean z2, final long j2) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            StringBuilder sbK = au1.k(j, "onNotifMessage: chatId=", ",message=");
            sbK.append(cu8Var.b);
            sbK.append(",updateNewMessage=");
            sbK.append(z2);
            ir6Var.d(us7Var, "p82", sbK.toString(), null);
        }
        return h(j, true, new qj3() { // from class: r72
            /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
            @Override // defpackage.qj3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r32) {
                /*
                    Method dump skipped, instructions count: 480
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r72.accept(java.lang.Object):void");
            }
        });
    }

    public final void U(long j, l92 l92Var) {
        this.d.put(Long.valueOf(j), l92Var);
        k92 k92Var = l92Var.c;
        long j2 = k92Var.a;
        if (j2 != 0 || k92Var.f(((p7b) this.n).a.t())) {
            this.e.put(Long.valueOf(j2), l92Var);
        }
        this.b.put(Long.valueOf(l92Var.c.l), l92Var);
    }

    public final void V(long j, boolean z) {
        hm9.n("p82", "removeFromFavorites: " + j);
        Z(j, 0L, z);
    }

    public final void W(long j, v82 v82Var) {
        if (M(j, v82Var)) {
            h(j, false, new h82(v82Var, 0));
        }
    }

    public final l92 X(long j) {
        elc elcVar = ((k24) ((c34) this.l.get())).b;
        la2 la2VarE = elcVar.c().e(j);
        if (la2VarE != null) {
            return elcVar.a(la2VarE);
        }
        return null;
    }

    public final void Y(long j, boolean z) {
        hm9.m("p82", "setChatSubscribedToUpdates: chatId=%d, subscribed=%b", Long.valueOf(j), Boolean.valueOf(z));
        try {
        } catch (Throwable th) {
            hm9.p("p82", "setChatSubscribedToUpdates fail!", th);
        }
    }

    public final void Z(long j, long j2, boolean z) {
        h(j, false, new c10(j2, 3));
        if (z) {
            ((k4a) ((pk) this.p.get())).r(j);
        }
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), true));
    }

    public final e52 b(j92 j92Var, List list, String str, String str2) {
        String str3;
        l92 l92Var;
        if (j92Var == j92.a) {
            Long l = (Long) list.get(0);
            long jLongValue = l.longValue();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, "p82", ey8.h(jLongValue, "insertDialog contactId="), null);
            }
            long jK = K();
            long jK2 = K() ^ jLongValue;
            us usVar = new us(2);
            usVar.put(Long.valueOf(jK), 0L);
            usVar.put(l, 0L);
            str3 = "p82";
            k92 k92VarT = t(jK2, jK2, 2, jK, usVar, 0L, 3, 0L, 0L, null);
            e52 e52VarF = F(jLongValue);
            if (e52VarF != null) {
                ((k24) ((c34) this.l.get())).b.h(e52VarF.a, k92VarT);
                l92Var = new l92(e52VarF.a, e52VarF.b);
            } else {
                l92Var = new l92(((k24) ((c34) this.l.get())).b.e(k92VarT), k92VarT);
            }
        } else {
            str3 = "p82";
            long jK3 = K();
            long jNanoTime = System.nanoTime();
            us usVar2 = new us(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                usVar2.put((Long) it.next(), 0L);
            }
            usVar2.put(Long.valueOf(jK3), 0L);
            u82 u82Var = new u82();
            u(u82Var, 0L, jNanoTime, 3, jK3, usVar2, 0L, 3, 0L, 0L, str, str2, null);
            k92 k92Var = new k92(u82Var);
            l92Var = new l92(((k24) ((c34) this.l.get())).b.e(k92Var), k92Var);
        }
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, str3, "add chat; chatId=" + l92Var.b + ",type=" + j92Var, null);
        }
        U(l92Var.b, l92Var);
        return h0(l92Var.b, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e52 b0(defpackage.f52 r56, defpackage.xq2 r57) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p82.b0(f52, xq2):e52");
    }

    public final void c(long j, v82 v82Var) {
        if (M(j, v82Var)) {
            return;
        }
        h(j, false, new h82(v82Var, 1));
    }

    public final gi9 c0(List list) {
        return (gi9) e0("storeChatsFromServer", new id0(this, list, (Object) null, 20));
    }

    public final void d(long j, List list) {
        e52 e52VarC = C(j);
        if (e52VarC != null) {
            h(j, false, new z72(0, list));
            this.m.c(new vz2(Collections.singletonList(Long.valueOf(e52VarC.a)), false));
        }
    }

    public final gi9 d0(List list, Map map) {
        return (gi9) e0("storeChatsFromServer", new id0(this, list, map, 20));
    }

    public final void e() {
        if (this.i) {
            return;
        }
        f0("awaitLoading", new s72(this, 0));
    }

    public final Object e0(String str, lde ldeVar) {
        ir6 ir6Var;
        ir6 ir6Var2;
        ir6 ir6Var3;
        if (str != null) {
            ir6 ir6Var4 = hm9.m;
            if (ir6Var4 != null && ir6Var4.c()) {
                ir6Var4.d(us7.X, "p82", "syncSelf(" + str + ')', null);
            }
            if (this.H.isLocked() && (ir6Var3 = hm9.m) != null && ir6Var3.c()) {
                us7 us7Var = us7.Z;
                StringBuilder sbM = au1.m("syncSelf(", str, "): self is locked! ");
                sbM.append(this.H.getHoldCount());
                ir6Var3.d(us7Var, "p82", sbM.toString(), null);
            }
        }
        this.H.lock();
        try {
            Object obj = ldeVar.get();
            this.H.unlock();
            if (str != null && (ir6Var2 = hm9.m) != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, "p82", a(str), null);
            }
            return obj;
        } catch (Throwable th) {
            this.H.unlock();
            if (str != null && (ir6Var = hm9.m) != null && ir6Var.c()) {
                ir6Var.d(us7.X, "p82", a(str), null);
            }
            throw th;
        }
    }

    public final pa3 f() {
        fb3 fb3Var = this.j;
        return (fb3Var.a.get() == fb3.X && fb3Var.c == null) ? wa3.a : fb3Var;
    }

    public final void f0(String str, Runnable runnable) {
        e0(str, new v02(5, runnable));
    }

    public final e52 g(l92 l92Var, cu8 cu8Var) {
        e52 e52VarB = ((ma2) this.x.get()).b(l92Var, cu8Var);
        f0(null, new w72(this, l92Var.b, e52VarB, true));
        return e52VarB;
    }

    public final void g0(long j) {
        e52 e52VarC = C(j);
        if (e52VarC != null) {
            l(0L, e52VarC);
            ((k4a) ((pk) this.p.get())).r(e52VarC.a);
            je7 je7Var = this.C;
            if (je7Var.getValue() != null) {
                ta2 ta2Var = (ta2) je7Var.getValue();
                long j2 = e52VarC.b.a;
                zb2 zb2Var = (zb2) ta2Var;
                vxd vxdVar = zb2Var.H0;
                if (vxdVar != null) {
                    vxdVar.cancel((CancellationException) null);
                }
                sb2 sb2Var = new sb2(zb2Var, null);
                zb2Var.H0 = j47.T(zb2Var.Z, zb2Var.Y, null, sb2Var, 2);
            }
        }
    }

    public final e52 h(long j, boolean z, qj3 qj3Var) {
        if (A(j) == null) {
            e();
        }
        l92 l92VarA = A(j);
        if (l92VarA == null) {
            hm9.n("p82", "changeChatField: chat with id = " + j + " not found");
            return null;
        }
        u82 u82VarH = l92VarA.c.h();
        try {
            qj3Var.accept(u82VarH);
            U(j, new l92(j, new k92(u82VarH)));
            ((s8g) this.w.get()).a(new n9d(j));
            return h0(j, z);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final e52 h0(long j, boolean z) {
        cu8 cu8VarJ;
        e52 e52VarC = C(j);
        l92 l92VarA = A(j);
        if (l92VarA == null) {
            throw new ChatNotFoundException(ey8.h(j, "chat is null for #"));
        }
        if (e52VarC == null || z) {
            return g(l92VarA, null);
        }
        k92 k92Var = l92VarA.c;
        long j2 = k92Var.j;
        k92 k92Var2 = e52VarC.b;
        boolean z2 = true;
        boolean z3 = j2 == k92Var2.j;
        boolean z4 = k92Var.L == k92Var2.L;
        boolean z5 = k92Var.j0 == k92Var2.j0;
        if (!z3 || !z4 || !z5) {
            return g(l92VarA, null);
        }
        boolean zG = e52VarC.G();
        rm4 rm4Var = this.x;
        es8 es8Var = e52VarC.c;
        e52 e52VarB = (zG && es8Var == null && (cu8VarJ = ((au8) this.s.get()).j(j, k92Var.j)) != null) ? ((ma2) rm4Var.get()).b(l92VarA, cu8VarJ) : null;
        if (e52VarB == null) {
            e52VarB = ((ma2) rm4Var.get()).a(j, ((p7b) this.n).a.t(), l92VarA.c, es8Var, e52VarC.o, e52VarC.X);
            e52VarB.o0((el3) this.r.get());
        }
        e52 e52Var = e52VarB;
        f0(null, new w72(this, j, e52Var, z2));
        return e52Var;
    }

    public final e52 i(long j, i92 i92Var) {
        return h(j, false, new v02(6, i92Var));
    }

    public final void i0(long j, long j2) {
        hm9.m("p82", "updateChatLastSearchClickTime: chatId=%d, chatSearchClickTime=%d", Long.valueOf(j), Long.valueOf(j2));
        l92 l92VarA = A(j);
        if (l92VarA != null) {
            if (l92VarA.c.Y < j2 || j2 == 0) {
                h(j, false, new c10(j2, 5));
            }
        }
    }

    public final void j(long j, i92 i92Var) {
        hm9.n("p82", "changeDialogStatus, contactId = " + j + ", status = " + i92Var);
        e52 e52VarF = F(j);
        if (e52VarF != null) {
            long j2 = e52VarF.a;
            i(j2, i92Var);
            this.m.c(new vz2(Collections.singletonList(Long.valueOf(j2)), true));
        }
    }

    public final void j0(long j, k92 k92Var, long j2) {
        hm9.m("p82", "updateChatWriteTime: chatId=%d, chatWriteTime=%d", Long.valueOf(j), Long.valueOf(j2));
        if (k92Var == null || k92Var.Z >= j2) {
            return;
        }
        h(j, false, new c10(j2, 9));
    }

    public final void k(long j, long j2, uaa uaaVar) {
        hm9.m("p82", "Change draft: %d, draft = %s draftUpdateTime = %d", Long.valueOf(j), uaaVar, Long.valueOf(j2));
        e52 e52VarH = h(j, false, new x72(this, uaaVar, j2, 0));
        je7 je7Var = this.C;
        if (je7Var.getValue() != null) {
            ((zb2) ((ta2) je7Var.getValue())).k(j, e52VarH);
        }
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), true));
    }

    public final e52 k0(final long j, final cu8 cu8Var, final boolean z) {
        if (cu8Var != null && cu8Var.o()) {
            return C(j);
        }
        hm9.n("p82", "updateLastMessage: chatId = " + j + ", messageDb = " + cu8Var + ", force = " + z);
        return h(j, true, new qj3() { // from class: f82
            @Override // defpackage.qj3
            public final void accept(Object obj) {
                u82 u82Var = (u82) obj;
                p82 p82Var = this.a;
                p82Var.getClass();
                cu8 cu8Var2 = cu8Var;
                if (cu8Var2 == null) {
                    u82Var.j = 0L;
                } else {
                    cu8 cu8VarQ = ((au8) p82Var.s.get()).q(u82Var.j);
                    if (z || cu8VarQ == null || cu8Var2.o > cu8VarQ.o) {
                        p82.l0(u82Var, cu8Var2);
                    }
                }
                p82Var.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), true));
            }
        });
    }

    public final void l(long j, e52 e52Var) {
        StringBuilder sb = new StringBuilder("changeMuteUntil, chatId = ");
        long j2 = e52Var.a;
        sb.append(j2);
        sb.append(", dontDisturbUntil = ");
        sb.append(j);
        hm9.n("p82", sb.toString());
        h(j2, false, new c10(j, 2));
        je7 je7Var = this.C;
        if (je7Var.getValue() != null) {
            ta2 ta2Var = (ta2) je7Var.getValue();
            long j3 = e52Var.b.a;
            zb2 zb2Var = (zb2) ta2Var;
            vxd vxdVar = zb2Var.H0;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            sb2 sb2Var = new sb2(zb2Var, null);
            zb2Var.H0 = j47.T(zb2Var.Z, zb2Var.Y, null, sb2Var, 2);
        }
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j2)), false));
    }

    public final void m0(String str, long j, long j2, long j3) {
        hm9.m("p82", "updateLastPushMessage %d", Long.valueOf(j));
        e52 e52VarZ = z(j);
        if (e52VarZ == null) {
            hm9.k0("p82", null, "updateLastPushMessage: chat not found! %d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
            return;
        }
        v72 v72Var = new v72(j2, str, j3);
        long j4 = e52VarZ.a;
        h(j4, true, v72Var);
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j4)), true));
    }

    public final e52 n(e52 e52Var) {
        if (e52Var == null) {
            return null;
        }
        if (e52Var.c == null) {
            k92 k92Var = e52Var.b;
            if (k92Var.j != 0) {
                l92 l92VarX = X(e52Var.a);
                cu8 cu8VarQ = ((au8) this.s.get()).q(k92Var.j);
                if (cu8VarQ == null) {
                    return e52Var;
                }
                hm9.m0("p82", "checkChat! lastMessage is null but chat.data.getLastMessageId() not 0", new Object[0]);
                ((cba) ((o45) this.o.get())).c(new HandledException("check.chat.error"), false);
                U(l92VarX.b, l92VarX);
                return g(l92VarX, cu8VarQ);
            }
        }
        return e52Var;
    }

    public final void n0(int i, long j) {
        hm9.n("p82", "updateNewMessages, chatId = " + j + ", count = " + i);
        h(j, false, new hd0(i, 3, this));
        this.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), false));
    }

    public final void o(long j, long j2) {
        hm9.m("p82", "clearChatInternal: id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        e52 e52VarC = C(j);
        if (e52VarC != null) {
            sna snaVar = (sna) this.v.get();
            long j3 = e52VarC.b.a;
            snaVar.getClass();
            sna.a(j3);
        }
        J(j).setValue(null);
        h(j, false, new c10(1 + j2, 7));
        r(j, j2);
        h(j, false, new c10(j2, 6));
        re9 re9Var = new re9(j, 0L, j2, mg4.REGULAR);
        av0 av0Var = this.m;
        av0Var.c(re9Var);
        av0Var.c(new vz2(Collections.singletonList(Long.valueOf(j)), false));
    }

    public final void o0(long j) {
        hm9.m("p82", "updatePinMessage: chatId = %d", Long.valueOf(j));
        h0(j, true);
    }

    public final void p(long j) {
        hm9.m("p82", "clearDraft, chatId = %d", Long.valueOf(j));
        e52 e52VarC = C(j);
        if (e52VarC == null) {
            hm9.k0("p82", null, "clearDraft: chat is null", Arrays.copyOf(new Object[0], 0));
        } else {
            k(j, e52VarC.b.g0, null);
        }
    }

    public final e52 p0(long j, final long j2, final long j3, final int i, final boolean z) {
        hm9.m("p82", "updateReadMark: chatId=%d, userId=%d, mark=%d, newMessages=%d, notifySelfReadMarkChangedListener=%b", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), Boolean.valueOf(z));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        e52 e52VarH = h(j, false, new qj3() { // from class: l82
            @Override // defpackage.qj3
            public final void accept(Object obj) {
                u82 u82Var = (u82) obj;
                p82 p82Var = this.a;
                p82Var.getClass();
                Map mapD = u82Var.d();
                long j4 = j2;
                Long l = (Long) mapD.get(Long.valueOf(j4));
                if (l == null) {
                    return;
                }
                long jLongValue = l.longValue();
                long j5 = j3;
                boolean z2 = false;
                boolean z3 = jLongValue != j5;
                if (z3) {
                    mapD.put(Long.valueOf(j4), Long.valueOf(j5));
                }
                int i2 = i;
                if (i2 >= 0) {
                    u82Var.m = i2;
                }
                if (z && z3 && j4 == p82Var.K()) {
                    z2 = true;
                }
                atomicBoolean.set(z2);
            }
        });
        if (atomicBoolean.get()) {
            rm4 rm4Var = this.B;
            if (rm4Var.get() != null) {
                ((rw9) rm4Var.get()).e(j, j3);
            }
        }
        return e52VarH;
    }

    public final int r(long j, long j2) {
        hm9.m("p82", "clearMessagesInChat id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        au8 au8Var = (au8) this.s.get();
        au8Var.getClass();
        int iD = au8Var.d(j, j2, mg4.REGULAR);
        v(j, null, j2);
        w(j);
        return iD;
    }

    public final void s() {
        if (this.i && !this.f.isEmpty()) {
            for (e52 e52Var : this.f.values()) {
                e52Var.u0 = null;
                e52Var.v0 = null;
                e52Var.x0 = null;
                e52Var.w0.set(null);
            }
            this.m.c(new vz2(Collections.emptyList(), true));
        }
    }

    public final void v(long j, u82 u82Var, long j2) {
        if (j2 == Long.MAX_VALUE) {
            j2--;
        }
        cu8 cu8VarR = ((au8) this.s.get()).r(j, 1 + j2);
        hm9.m("p82", "findAndUpdateFirstMessage, chatId = %d, time = %s, message = %s", Long.valueOf(j), nu0.G(Long.valueOf(j2)), cu8VarR);
        if (u82Var == null) {
            h(j, false, new c10(cu8VarR != null ? cu8VarR.b : 0L, 4));
        } else {
            u82Var.x = cu8VarR != null ? cu8VarR.b : 0L;
        }
    }

    public final void w(long j) {
        au8 au8Var = (au8) this.s.get();
        au8Var.getClass();
        k0(j, au8Var.p(j, mg4.REGULAR), true);
    }

    public final ArrayList x(un0 un0Var) {
        return D(L, false, new lt1(((p7b) this.n).a.t(), un0Var, 1));
    }

    public final iqd y(long j) {
        e52 e52Var = (e52) this.f.get(Long.valueOf(j));
        if (e52Var != null) {
            return iqd.g(e52Var);
        }
        return new ib3(new q1a(2, new c82(this, j, 0)), f()).m(this.y);
    }

    public final e52 z(long j) {
        ConcurrentHashMap concurrentHashMap = this.g;
        e52 e52Var = (e52) concurrentHashMap.get(Long.valueOf(j));
        if (e52Var != null) {
            return e52Var;
        }
        e();
        return (e52) concurrentHashMap.get(Long.valueOf(j));
    }
}
