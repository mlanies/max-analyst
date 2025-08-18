package defpackage;

import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public final class rg1 {
    public final l5g a;
    public final khe b = new khe(new k11(22));
    public final je7 c = fua.a.b();
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public kyd h;
    public boolean i;
    public boolean j;
    public boolean k;
    public k56 l;
    public final khe m;
    public final khe n;

    public rg1(khe kheVar, l5g l5gVar) {
        this.a = l5gVar;
        ws1 ws1Var = ws1.a;
        this.d = ws1Var.getAccessor().d(gh3.class);
        this.e = ws1Var.getAccessor().d(bt1.class);
        this.f = ws1Var.getAccessor().d(qe5.class);
        this.g = kheVar;
        final int i = 0;
        this.m = new khe(new k56(this) { // from class: qg1
            public final /* synthetic */ rg1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Boolean.valueOf(((se5) ((qe5) this.b.f.getValue())).r());
                    default:
                        return Boolean.valueOf(((se5) ((qe5) this.b.f.getValue())).s());
                }
            }
        });
        final int i2 = 1;
        this.n = new khe(new k56(this) { // from class: qg1
            public final /* synthetic */ rg1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(((se5) ((qe5) this.b.f.getValue())).r());
                    default:
                        return Boolean.valueOf(((se5) ((qe5) this.b.f.getValue())).s());
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(kyd kydVar, k56 k56Var) {
        boolean zF = ((gh3) this.d.getValue()).f();
        if (k56Var == null) {
            c();
            return;
        }
        je7 je7Var = this.g;
        if (!zF && kydVar != null && !((wr1) d()).f(kydVar)) {
            if (!ps1.a((znc) je7Var.getValue())) {
                sg1.c.P1().b(":call-active", null);
            }
            c();
            return;
        }
        l5g l5gVar = this.a;
        if (!zF) {
            l5gVar.b();
            return;
        }
        if (kydVar == null) {
            ((wr1) d()).v();
            f(k56Var);
            return;
        }
        if ((kydVar instanceof hyd) && !this.k && ((wr1) d()).f(kydVar)) {
            sg1.c.P1().b(":call-join-preview?link=".concat(((hyd) kydVar).a), null);
            return;
        }
        if (((wr1) d()).k().j instanceof d95) {
            f(k56Var);
            return;
        }
        if (!((wr1) d()).f(kydVar)) {
            if (((wr1) d()).k().g) {
                ((wr1) d()).e();
            }
            if (!ps1.a((znc) je7Var.getValue())) {
                sg1.c.P1().b(":call-active", null);
            }
            c();
            return;
        }
        this.l = k56Var;
        boolean z = this.i;
        l5gVar.getClass();
        int i = z ? v7a.d : v7a.c;
        bc7[] bc7VarArr = BottomSheetWidget.x0;
        lg3 lg3VarE = wg0.e(v7a.f, 4, null);
        lg3VarE.f(new eqe(v7a.e));
        lg3VarE.d(u7a.b, new eqe(i));
        lg3VarE.c(u7a.a, new eqe(v7a.b));
        ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
        Widget widget = l5gVar.b;
        confirmationBottomSheetE.setTargetController(widget);
        uu3 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        foc focVar = parentController instanceof foc ? (foc) parentController : null;
        znc zncVarT = focVar != null ? focVar.T() : null;
        confirmationBottomSheetE.z0(widget);
        if (zncVarT != null) {
            coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
            wg0.l(false, cocVar, true, "BottomSheetWidget");
            zncVarT.G(cocVar);
        }
    }

    public final boolean b(int i, String[] strArr, int[] iArr) {
        if (i != 178) {
            return false;
        }
        boolean zB = e().b(strArr);
        l5g l5gVar = this.a;
        if (!zB) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    c();
                    l5gVar.g(e0c.permission_detail_dialog_title, e0c.permission_detail_dialog_subtitile);
                }
            }
            c();
            return false;
        }
        if (this.j) {
            k56 k56Var = this.l;
            boolean zF = ((gh3) this.d.getValue()).f();
            if (k56Var == null) {
                c();
            } else if (zF) {
                k56Var.invoke();
            } else {
                l5gVar.b();
            }
        } else {
            a(this.h, this.l);
        }
        return true;
    }

    public final void c() {
        this.l = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.k = false;
    }

    public final kr1 d() {
        return (kr1) this.b.getValue();
    }

    public final eua e() {
        return (eua) this.c.getValue();
    }

    public final void f(k56 k56Var) {
        if (!ps1.a((znc) this.g.getValue()) && k56Var != null) {
            k56Var.invoke();
        }
        c();
    }

    public final boolean g(int i) {
        if (i == qvb.call_permission_dialog_check_continue) {
            ((wr1) n31.a.d()).v();
            f(this.l);
            return true;
        }
        if (i != qvb.call_permission_dialog_check_cancel) {
            return false;
        }
        c();
        return true;
    }

    public final void h(boolean z) {
        String str = ((wr1) d()).k().c;
        boolean z2 = ((wr1) d()).k().h;
        je7 je7Var = this.e;
        if (z && !e().b(eua.l)) {
            bt1 bt1Var = (bt1) je7Var.getValue();
            bt1Var.getClass();
            bt1.c(bt1Var, "REQUEST_PERMISSION_CAM", str, "OUT_OF_CALL", null, null, null, z2, 56);
        }
        if (e().b(eua.h)) {
            return;
        }
        bt1 bt1Var2 = (bt1) je7Var.getValue();
        bt1Var2.getClass();
        bt1.c(bt1Var2, "REQUEST_PERMISSION_MIC", str, "AFTER_INITIATION", null, null, null, z2, 56);
    }

    public final void i(long j, boolean z, k56 k56Var) {
        c();
        boolean zBooleanValue = ((Boolean) this.m.getValue()).booleanValue();
        l5g l5gVar = this.a;
        if (!zBooleanValue) {
            l5gVar.a();
            return;
        }
        gyd gydVar = new gyd(new xm1(j, z));
        if (e().a(z, l5gVar)) {
            a(gydVar, k56Var);
            return;
        }
        h(z);
        this.h = gydVar;
        this.l = k56Var;
        this.i = z;
    }

    public final void j(String str, boolean z, boolean z2, boolean z3, k56 k56Var) {
        c();
        this.k = z3;
        boolean zBooleanValue = ((Boolean) this.n.getValue()).booleanValue();
        l5g l5gVar = this.a;
        if (!zBooleanValue || w9e.C0(str)) {
            l5gVar.a();
            return;
        }
        hyd hydVar = new hyd(str, z);
        if (e().a(z2, l5gVar)) {
            a(hydVar, k56Var);
            return;
        }
        h(z2);
        this.h = hydVar;
        this.l = k56Var;
        this.i = z2;
    }

    public final void l(long j, boolean z, k56 k56Var) {
        c();
        iyd iydVar = new iyd(new zm1(j, z));
        if (e().a(z, this.a)) {
            a(iydVar, k56Var);
            return;
        }
        h(z);
        this.h = iydVar;
        this.l = k56Var;
        this.i = z;
    }
}
