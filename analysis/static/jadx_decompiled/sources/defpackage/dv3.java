package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dv3 extends znc {
    public uu3 j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;

    public dv3() {
        this.e = 2;
    }

    @Override // defpackage.znc
    public final void H(coc cocVar) {
        if (this.m) {
            cocVar.a.setDetachFrozen(true);
        }
        super.H(cocVar);
    }

    @Override // defpackage.znc
    public final void J(int i, String str) {
        uu3 uu3Var = this.j;
        if (uu3Var == null || uu3Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().J(i, str);
    }

    @Override // defpackage.znc
    public final void M(String str, String[] strArr, int i) {
        uu3 uu3Var = this.j;
        if (uu3Var == null || uu3Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().M(str, strArr, i);
    }

    @Override // defpackage.znc
    public final void N(Bundle bundle) {
        super.N(bundle);
        this.k = bundle.getInt("ControllerHostedRouter.hostId");
        this.n = bundle.getBoolean("ControllerHostedRouter.boundToContainer");
        this.l = bundle.getString("ControllerHostedRouter.tag");
    }

    @Override // defpackage.znc
    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("ControllerHostedRouter.hostId", this.k);
        bundle.putBoolean("ControllerHostedRouter.boundToContainer", this.n);
        bundle.putString("ControllerHostedRouter.tag", this.l);
    }

    @Override // defpackage.znc
    public final void P(List list, zu3 zu3Var) {
        if (this.m) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((coc) it.next()).a.setDetachFrozen(true);
            }
        }
        super.P(list, zu3Var);
    }

    @Override // defpackage.znc
    public final void S(uu3 uu3Var) {
        uu3Var.setParentController(this.j);
        uu3Var.setRouter(this);
        uu3Var.onContextAvailable();
    }

    @Override // defpackage.znc
    public final void T(Intent intent) {
        uu3 uu3Var = this.j;
        if (uu3Var == null || uu3Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().T(intent);
    }

    @Override // defpackage.znc
    public final void U(String str, Intent intent, int i) {
        uu3 uu3Var = this.j;
        if (uu3Var == null || uu3Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().U(str, intent, i);
    }

    @Override // defpackage.znc
    public final void V(String str, Intent intent, int i, Bundle bundle) {
        uu3 uu3Var = this.j;
        if (uu3Var == null || uu3Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().V(str, intent, i, bundle);
    }

    @Override // defpackage.znc
    public final void W(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        uu3 uu3Var = this.j;
        if (uu3Var == null || uu3Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().W(str, intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // defpackage.znc
    public final void Y(String str) {
        uu3 uu3Var = this.j;
        if (uu3Var == null || uu3Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().Y(str);
    }

    public final void Z() {
        ViewParent viewParent = this.i;
        if (viewParent != null && (viewParent instanceof yu3)) {
            K((yu3) viewParent);
        }
        Iterator it = new ArrayList(this.d).iterator();
        while (it.hasNext()) {
            uu3 uu3Var = (uu3) it.next();
            if (uu3Var.getView() != null) {
                uu3Var.detach(uu3Var.getView(), true, false);
            }
        }
        Iterator it2 = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it2;
            if (!u1Var.hasNext()) {
                break;
            }
            coc cocVar = (coc) u1Var.next();
            if (cocVar.a.getView() != null) {
                uu3 uu3Var2 = cocVar.a;
                uu3Var2.detach(uu3Var2.getView(), true, false);
            }
        }
        this.g = false;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener(null);
        }
        this.i = null;
    }

    public final void a0(boolean z) {
        this.m = z;
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            } else {
                ((coc) u1Var.next()).a.setDetachFrozen(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(uu3 uu3Var, ViewGroup viewGroup) {
        if (this.j == uu3Var && this.i == viewGroup) {
            return;
        }
        Z();
        if (viewGroup instanceof yu3) {
            a((yu3) viewGroup);
        }
        this.j = uu3Var;
        this.i = viewGroup;
        Q(uu3Var.onBackPressedDispatcherEnabled);
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                this.i.post(new q57(21, this));
                return;
            }
            ((coc) u1Var.next()).a.setParentController(uu3Var);
        }
    }

    @Override // defpackage.znc
    public final void c(boolean z) {
        a0(false);
        super.c(z);
    }

    @Override // defpackage.znc
    public final Activity d() {
        uu3 uu3Var = this.j;
        if (uu3Var != null) {
            return uu3Var.getActivity();
        }
        return null;
    }

    @Override // defpackage.znc
    public final znc i() {
        uu3 uu3Var = this.j;
        return (uu3Var == null || uu3Var.getRouter() == null) ? this : this.j.getRouter().i();
    }

    @Override // defpackage.znc
    public final List j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.j.getChildRouters());
        arrayList.addAll(this.j.getRouter().j());
        return arrayList;
    }

    @Override // defpackage.znc
    public final fm5 k() {
        if (i() != this) {
            return i().k();
        }
        uu3 uu3Var = this.j;
        throw new IllegalStateException("Unable to retrieve TransactionIndexer from ".concat(uu3Var != null ? String.format(Locale.ENGLISH, "%s (attached? %b, destroyed? %b, parent: %s)", uu3Var.getClass().getSimpleName(), Boolean.valueOf(this.j.isAttached()), Boolean.valueOf(this.j.isBeingDestroyed), this.j.getParentController()) : "null host controller"));
    }

    @Override // defpackage.znc
    public final void o() {
        uu3 uu3Var = this.j;
        if (uu3Var == null || uu3Var.getRouter() == null) {
            return;
        }
        this.j.getRouter().o();
    }

    @Override // defpackage.znc
    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        Z();
    }

    @Override // defpackage.znc
    public final void y(coc cocVar, coc cocVar2, boolean z) {
        super.y(cocVar, cocVar2, z);
        if (cocVar == null || this.j.isAttached()) {
            return;
        }
        if (cocVar.b() != null && !cocVar.b().d()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                return;
            } else {
                ((coc) u1Var.next()).a.setNeedsAttach(false);
            }
        }
    }
}
