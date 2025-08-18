package defpackage;

import android.os.Build;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class aua {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final dua d;
    public final dua e;
    public final dua f;
    public final dua g;
    public final dua h;
    public final dua i;
    public final dua j;

    public aua(je7 je7Var, je7 je7Var2, je7 je7Var3, kke kkeVar) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).b());
        dua duaVar = new dua(eua.k);
        this.d = duaVar;
        dua duaVar2 = new dua(eua.f);
        this.e = duaVar2;
        dua duaVar3 = new dua(eua.m);
        this.f = duaVar3;
        dua duaVar4 = new dua(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        this.g = duaVar4;
        dua duaVar5 = new dua(eua.l);
        this.h = duaVar5;
        dua duaVar6 = new dua(eua.h);
        this.i = duaVar6;
        dua duaVar7 = new dua(eua.j);
        this.j = duaVar7;
        int i = Build.VERSION.SDK_INT;
        Continuation continuation = null;
        if (i >= 33) {
            od2.L(new zn5(duaVar, new uta(this, null), 5), contextScopeA);
        }
        od2.L(new zn5(duaVar2, new vta(this, null), 5), contextScopeA);
        if (i >= 34) {
            od2.L(new j31(duaVar3, duaVar4, new c3(this, continuation, 20), 4), contextScopeA);
        } else {
            od2.L(new zn5(duaVar3, new wta(this, null), 5), contextScopeA);
        }
        od2.L(new zn5(duaVar5, new xta(this, null), 5), contextScopeA);
        od2.L(new zn5(duaVar6, new yta(this, null), 5), contextScopeA);
        od2.L(new zn5(duaVar7, new zta(this, null), 5), contextScopeA);
    }

    public static final void a(aua auaVar, String str, String str2) {
        Integer numD = ((an9) auaVar.c.getValue()).d();
        if (numD != null) {
            ky7 ky7Var = new ky7();
            ky7Var.put("pType", str);
            ky7Var.put("screen", numD);
            ky7Var.put("pStatus", str2);
            auaVar.d("permission_changed_state", ky7Var.b());
        }
    }

    public static final String b(aua auaVar, bua buaVar) {
        auaVar.getClass();
        return buaVar == bua.a ? "allowed" : "denied";
    }

    public static String c(dua duaVar) {
        return duaVar.j() ? "allowed" : "denied";
    }

    public final void d(String str, ky7 ky7Var) {
        e47 e47Var = new e47();
        e47Var.c = "PERMISSION";
        je7 je7Var = this.b;
        e47Var.b = ((hyc) ((q33) je7Var.getValue())).t();
        e47Var.o = str;
        e47Var.a = System.currentTimeMillis();
        e47Var.b(ky7Var);
        e47Var.X = ((t33) ((q33) je7Var.getValue())).F();
        ((ad) this.a.getValue()).j(e47Var.c());
    }
}
