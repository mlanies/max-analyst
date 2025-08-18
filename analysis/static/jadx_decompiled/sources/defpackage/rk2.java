package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class rk2 extends ol implements lme, hua {
    public long X;
    public final int Y;
    public final List Z;
    public final long o;
    public final ek2 s0;
    public final boolean t0;
    public final int u0;
    public final int v0;
    public final String w0;

    public rk2(long j, long j2, long j3, int i, List list, ek2 ek2Var, boolean z, int i2, int i3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = i;
        this.Z = list;
        this.s0 = ek2Var;
        this.t0 = z;
        this.u0 = i2;
        this.v0 = i3;
        this.w0 = rk2.class.getName();
    }

    @Override // defpackage.hua
    public final int c() {
        k92 k92Var;
        i92 i92Var;
        e52 e52VarC = m().C(this.o);
        if (e52VarC == null || (i92Var = (k92Var = e52VarC.b).c) == i92.Y || i92Var == i92.X || i92Var == i92.o) {
            return 3;
        }
        if (this.X == 0) {
            long j = k92Var.a;
            if (j != 0) {
                this.X = j;
            }
        }
        return this.X != 0 ? 1 : 2;
    }

    @Override // defpackage.hua
    public final void d() {
        hm9.n(this.w0, "onMaxFailCount");
        int iOrdinal = this.s0.ordinal();
        int i = this.Y;
        List list = this.Z;
        long j = this.o;
        if (iOrdinal == 0) {
            int iS = au1.s(i);
            if (iS == 0) {
                p82 p82VarM = m();
                e52 e52VarC = p82VarM.C(j);
                if (e52VarC != null) {
                    p82VarM.h(j, false, new z72(1, list));
                    p82VarM.m.c(new vz2(Collections.singletonList(Long.valueOf(e52VarC.a)), false));
                }
            } else {
                if (iS != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                m().d(j, list);
            }
        } else if (iOrdinal == 1) {
            int iS2 = au1.s(i);
            if (iS2 == 0) {
                p82 p82VarM2 = m();
                e52 e52VarC2 = p82VarM2.C(j);
                if (e52VarC2 != null) {
                    p82VarM2.h(j, false, new z72(2, list));
                    p82VarM2.m.c(new vz2(Collections.singletonList(Long.valueOf(e52VarC2.a)), false));
                }
            } else {
                if (iS2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                p82 p82VarM3 = m();
                e52 e52VarC3 = p82VarM3.C(j);
                if (e52VarC3 != null) {
                    p82VarM3.h(j, false, new ui0(p82VarM3, list, this.v0, 2));
                    p82VarM3.m.c(new vz2(Collections.singletonList(Long.valueOf(e52VarC3.a)), false));
                }
            }
        } else if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        ((k4a) j()).j(this.X);
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) throws Throwable {
        e52 e52VarC;
        sk2 sk2Var = (sk2) gleVar;
        boolean z = !sk2Var.X.isEmpty();
        long j = this.o;
        if (z) {
            ArrayList arrayListK = p().k(j, sk2Var.X);
            if (!arrayListK.isEmpty()) {
                ArrayList arrayList = new ArrayList(z53.S(arrayListK, 10));
                Iterator it = arrayListK.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((cu8) it.next()).b));
                }
                p().c(j, arrayList);
                l().c(new re9(j, arrayList, null));
            }
        }
        if (sk2Var.c != null) {
            m().c0(Collections.singletonList(sk2Var.c));
        }
        if (this.s0 == ek2.ADMIN && this.Y == 1 && (e52VarC = m().C(j)) != null) {
            Iterator it2 = this.Z.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!e52VarC.b.R.containsKey(Long.valueOf(((Number) it2.next()).longValue()))) {
                    l().c(new oi0(this.a, new pke("friend.blocks.me", "friend.blocks.me", null)));
                    break;
                }
            }
        }
        l().c(new tk2(this.a, this.Z, this.s0, this.o, this.Y));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatMembersUpdate chatMembersUpdate = new Tasks.ChatMembersUpdate();
        chatMembersUpdate.requestId = this.a;
        chatMembersUpdate.chatId = this.o;
        chatMembersUpdate.chatServerId = this.X;
        chatMembersUpdate.operation = wg0.c(this.Y);
        chatMembersUpdate.userIds = nd7.j(this.Z);
        chatMembersUpdate.chatMemberType = this.s0.a;
        chatMembersUpdate.showHistory = this.t0;
        return qw8.toByteArray(chatMembersUpdate);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (!f46.U(pkeVar.b)) {
            d();
        }
        l().c(new oi0(this.a, pkeVar));
        if (this.s0 == ek2.MEMBER) {
            l().c(new ku3(pkeVar, this.o, this.Z));
        }
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.E0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        return new au(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0);
    }
}
