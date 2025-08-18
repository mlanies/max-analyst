package defpackage;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class dd1 extends pnf {
    public final rg1 X;
    public final je7 Y;
    public final je7 Z;
    public final bd1 b;
    public final h7b c;
    public final m5d o;
    public volatile Long s0;
    public final q0e t0;
    public final w7c u0;
    public final s35 v0;

    public dd1(bd1 bd1Var, h7b h7bVar, m5d m5dVar, hs1 hs1Var, rg1 rg1Var, je7 je7Var, je7 je7Var2) {
        int i = 5;
        this.b = bd1Var;
        this.c = h7bVar;
        this.o = m5dVar;
        this.X = rg1Var;
        this.Y = je7Var2;
        this.Z = je7Var;
        q0e q0eVarA = r0e.a(rc1.k);
        this.t0 = q0eVarA;
        this.u0 = new w7c(q0eVarA);
        this.v0 = new s35(0);
        CharSequence charSequence = null;
        od2.L(new zn5(new v7c(hs1Var.a), new yc1(this, null), 5), this.a);
        if (bd1Var instanceof zc1) {
            r();
            return;
        }
        if (!(bd1Var instanceof ad1)) {
            throw new NoWhenBranchMatchedException();
        }
        ad1 ad1Var = (ad1) bd1Var;
        while (true) {
            q0e q0eVar = this.t0;
            Object value = q0eVar.getValue();
            rc1 rc1Var = (rc1) value;
            boolean z = !ad1Var.c;
            CharSequence charSequence2 = ad1Var.d;
            CharSequence charSequence3 = z ? charSequence2 : charSequence;
            long j = ad1Var.a;
            Long lValueOf = Long.valueOf(j);
            h7b h7bVar2 = this.c;
            uc0 uc0VarB = h7bVar2.b(charSequence3, lValueOf);
            jqe iqeVar = charSequence2 != null ? new iqe(charSequence2) : new eqe(t7a.k);
            String str = ad1Var.b;
            if (q0eVar.c(value, rc1.a(rc1Var, uc0VarB, c37.D(str), new pc1(h7bVar2.c(str)), iqeVar, rc1.j, kc1.a, false, Long.valueOf(j), 1))) {
                break;
            } else {
                charSequence = null;
            }
        }
        long j2 = ((ad1) this.b).a;
        se5 se5Var = (se5) ((qe5) this.Y.getValue());
        se5Var.getClass();
        if (se5Var.n(PmsKey.f44groupcallchatsupport, false)) {
            w7c w7cVarN = ((jz2) ((iy2) this.Z.getValue())).n(j2);
            int i2 = ft4.o;
            od2.L(od2.X(new zn5(od2.w(nu0.Q(w7cVarN, z7.R(1, kt4.SECONDS)), new ai0(i)), new lq0(2, this, dd1.class, "updateActions", "updateActions(Lru/ok/tamtam/chats/Chat;)V", 4, 4), 5), this.a, wld.a, 0), this.a);
        }
    }

    public final void q(long j) {
        long j2 = r7a.c;
        if (j == j2) {
            r();
            return;
        }
        w7c w7cVar = this.u0;
        CharSequence charSequence = ((rc1) w7cVar.a.getValue()).c;
        s35 s35Var = this.v0;
        if (charSequence == null) {
            pnf.o(s35Var, new ia1(new eqe(t7a.o)));
            return;
        }
        if (j == r7a.b) {
            Long l = ((rc1) w7cVar.a.getValue()).i;
            if (l != null) {
                long jLongValue = l.longValue();
                z71.c.getClass();
                wg0.k(":chats?id=" + jLongValue + "&type=server", s35Var);
                return;
            }
            return;
        }
        if (j == r7a.a) {
            CharSequence charSequence2 = ((rc1) w7cVar.a.getValue()).c;
            if (charSequence2 != null) {
                pnf.o(s35Var, new fa1(charSequence2));
                return;
            }
            return;
        }
        if (j == r7a.d) {
            pnf.o(s35Var, new ga1(charSequence));
            return;
        }
        if (j == r7a.e) {
            pnf.o(s35Var, new ha1(charSequence));
            return;
        }
        if (j != r7a.f) {
            if (j == j2) {
                r();
            }
        } else {
            this.X.j(charSequence.toString(), !((rc1) w7cVar.a.getValue()).h, false, ((rc1) w7cVar.a.getValue()).h, new x2(this, 12, charSequence));
        }
    }

    public final void r() {
        if (((rc1) this.u0.a.getValue()).c == null && this.s0 == null) {
            j47.T(this.a, null, null, new cd1(this, null), 3);
            return;
        }
        String name = dd1.class.getName();
        boolean z = ((rc1) this.u0.a.getValue()).c != null;
        hm9.m0(name, "Skip creating call link: callLink=" + z + " createJoinLinkRequestId=" + this.s0, new Object[0]);
    }
}
