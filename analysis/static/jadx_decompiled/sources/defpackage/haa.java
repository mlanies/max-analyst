package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final class haa extends x54 {
    public static final /* synthetic */ bc7[] f;
    public final je7 a;
    public boolean b = true;
    public final LinkedList c = new LinkedList();
    public final gaa d = new gaa();
    public r61 e;

    static {
        oi9 oi9Var = new oi9(haa.class, "router", "getRouter()Lone/me/sdk/arch/rootcontroller/RouterWrapper;");
        nec.a.getClass();
        f = new bc7[]{oi9Var};
    }

    public haa(je7 je7Var) {
        this.a = je7Var;
    }

    @Override // defpackage.x54
    public final ArrayList a() {
        ArrayList arrayListE = f().C().e();
        ArrayList arrayList = new ArrayList(z53.S(arrayListE, 10));
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            arrayList.add(new faa((coc) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.x54
    public final int b() {
        if (!this.b) {
            return f().C().a.a.size();
        }
        List listE = this.c;
        if (listE.isEmpty()) {
            listE = f().C().e();
        }
        return listE.size();
    }

    @Override // defpackage.x54
    public final void c(l64 l64Var) {
        coc cocVarD = d(l64Var, !a().isEmpty());
        if (this.b) {
            this.c.add(cocVarD);
            return;
        }
        f().C().R(cocVarD);
        r61 r61Var = this.e;
        if (r61Var != null) {
            ((ty3) r61Var.a.getValue()).getClass();
        }
    }

    public final coc d(l64 l64Var, boolean z) {
        coc cocVarE = i24.e((Widget) l64Var.f.a(), null, null);
        cocVarE.d(l64Var.a);
        if (z) {
            j64 j64Var = j64.c;
            j64 j64Var2 = l64Var.e;
            if (j64Var2 != j64Var) {
                Object objInvoke = j64Var2.a.invoke();
                zu3 zu3VarE = objInvoke instanceof zu3 ? (zu3) objInvoke : null;
                if (zu3VarE == null) {
                    zu3VarE = e();
                }
                cocVarE.c(zu3VarE);
                Object objInvoke2 = j64Var2.b.invoke();
                zu3 zu3VarE2 = objInvoke2 instanceof zu3 ? (zu3) objInvoke2 : null;
                if (zu3VarE2 == null) {
                    zu3VarE2 = e();
                }
                cocVarE.a(zu3VarE2);
            }
        }
        return cocVarE;
    }

    public final ch e() {
        return ((se5) ((qe5) this.a.getValue())).u() ? new u18(0) : new ao6(0);
    }

    public final foc f() {
        return this.d.A(f[0]);
    }

    public final void g(k56 k56Var) {
        this.b = true;
        k56Var.invoke();
        this.b = false;
        LinkedList linkedList = this.c;
        if (linkedList.isEmpty()) {
            return;
        }
        ArrayList arrayListE = f().C().e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (!((Widget) ((coc) obj).a).getA0()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayListT0 = x53.t0(arrayListE, arrayList);
        ArrayList arrayListE2 = f().T().e();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : linkedList) {
            if (((Widget) ((coc) obj2).a).getA0()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayListT02 = x53.t0(arrayListE2, arrayList2);
        linkedList.clear();
        f().T().P(arrayListT02, null);
        znc zncVarC = f().C();
        coc cocVar = (coc) x53.q0(arrayListT0);
        zncVarC.P(arrayListT0, cocVar != null ? cocVar.b() : null);
    }
}
