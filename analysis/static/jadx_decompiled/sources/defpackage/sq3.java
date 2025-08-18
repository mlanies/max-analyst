package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class sq3 extends ol implements lme, hua {
    public final int X;
    public final String Y;
    public final String Z;
    public final long o;
    public final String s0;
    public final String t0;

    public sq3(int i, long j, long j2, String str, String str2, String str3, String str4) {
        super(j);
        this.o = j2;
        this.X = i;
        this.Y = str;
        this.Z = str2;
        this.s0 = str3;
        this.t0 = str4;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        tq3 tq3Var = (tq3) gleVar;
        if (tq3Var.c != null) {
            n().u(Collections.singletonList(tq3Var.c));
            ((k4a) j()).u(Collections.singletonList(Long.valueOf(tq3Var.c.a)));
        }
        p82 p82VarM = m();
        long j = this.o;
        e52 e52VarF = p82VarM.F(j);
        if (e52VarF == null) {
            return;
        }
        int iS = au1.s(this.X);
        long j2 = e52VarF.a;
        if (iS == 0) {
            m().j(j, i92.o);
            l().c(new vz2(Collections.singletonList(Long.valueOf(j2)), true, false, null, null, 124));
            return;
        }
        k92 k92Var = e52VarF.b;
        if (iS == 1) {
            m().j(j, i92.a);
            ((k4a) j()).j(k92Var.a);
            l().c(new vz2(Collections.singletonList(Long.valueOf(j2)), true, false, null, null, 124));
            return;
        }
        if (iS != 2 && iS != 3 && iS != 4) {
            throw new NoWhenBranchMatchedException();
        }
        ((k4a) j()).j(k92Var.a);
        l().c(new vz2(Collections.singletonList(Long.valueOf(j2)), true, false, null, null, 124));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ContactUpdate contactUpdate = new Tasks.ContactUpdate();
        contactUpdate.requestId = this.a;
        contactUpdate.contactId = this.o;
        String str = this.Y;
        if (str != null) {
            contactUpdate.oldName = str;
        }
        String str2 = this.Z;
        if (str2 != null) {
            contactUpdate.oldLastName = str2;
        }
        String str3 = this.s0;
        if (str3 != null) {
            contactUpdate.newName = str3;
        }
        String str4 = this.t0;
        if (str4 != null) {
            contactUpdate.lastName = str4;
        }
        contactUpdate.action = ms2.b(this.X);
        return qw8.toByteArray(contactUpdate);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        String str = pkeVar.b;
        boolean zU = f46.U(str);
        long j = this.a;
        if (!zU) {
            int iS = au1.s(this.X);
            Object obj = null;
            long j2 = this.o;
            if (iS == 0) {
                el3 el3VarN = n();
                el3VarN.getClass();
                hm9.n("ContactController", "undo block, id = " + j2);
                el3VarN.c(j2, new v02(18, obj));
                ((ike) el3VarN.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                el3VarN.g.c(new ps3(j2));
            } else if (iS == 1) {
                el3 el3VarN2 = n();
                el3VarN2.getClass();
                hm9.n("ContactController", "undo unblock, id = " + j2);
                el3VarN2.c(j2, new v02(18, nl3.a));
                ((ike) el3VarN2.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                el3VarN2.g.c(new ps3(j2));
            } else if (iS == 2) {
                el3 el3VarN3 = n();
                el3VarN3.getClass();
                hm9.n("ContactController", "undo remove, id = " + j2);
                el3VarN3.c(j2, new f9(ol3.a, 22, obj));
                el3VarN3.r(j2, false);
                ((ike) el3VarN3.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                el3VarN3.g.c(new ps3(j2));
            } else if (iS == 3) {
                el3 el3VarN4 = n();
                el3VarN4.getClass();
                hm9.n("ContactController", "undo add, id = " + j2);
                el3VarN4.c(j2, new f9(ol3.b, 22, obj));
                ((ike) el3VarN4.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                el3VarN4.g.c(new ps3(j2));
            } else {
                if (iS != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                el3 el3VarN5 = n();
                el3VarN5.getClass();
                Long lValueOf = Long.valueOf(j2);
                String str2 = this.Y;
                String str3 = this.Z;
                hm9.m("ContactController", "undo rename, id = %d => %s %s", lValueOf, str2, str3);
                el3VarN5.c(j2, new bl3(str2, str3, 0));
                ps3 ps3Var = new ps3(j2);
                av0 av0Var = el3VarN5.g;
                av0Var.c(ps3Var);
                ((ike) el3VarN5.l.get()).f(Collections.singletonList(Long.valueOf(j2)));
                av0Var.c(new ps3(j2));
            }
            if ("not.found".equals(str)) {
                n().o(j2);
            }
            t().d(j);
        }
        l().c(new oi0(j, pkeVar));
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.Y;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        tq2 tq2Var = new tq2((sla) null, 10);
        tq2Var.i(this.o, "contactId");
        int i = this.X;
        if (i != 0) {
            tq2Var.p("action", ms2.b(i));
        }
        String str = this.s0;
        if (!oag.t(str)) {
            tq2Var.p("firstName", str);
        }
        String str2 = this.t0;
        if (oag.u(str2)) {
            tq2Var.p("lastName", str2);
        }
        return tq2Var;
    }
}
