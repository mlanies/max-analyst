package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes.dex */
public final class z6 extends k06 {
    public final /* synthetic */ int u0 = 0;
    public final /* synthetic */ View v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.v0 = actionMenuItemView;
    }

    @Override // defpackage.k06
    public final und b() {
        b7 b7Var;
        switch (this.u0) {
            case 0:
                a7 a7Var = ((ActionMenuItemView) this.v0).z0;
                if (a7Var == null || (b7Var = ((c7) a7Var).a.E0) == null) {
                    return null;
                }
                return b7Var.a();
            default:
                b7 b7Var2 = ((d7) this.v0).o.D0;
                if (b7Var2 == null) {
                    return null;
                }
                return b7Var2.a();
        }
    }

    @Override // defpackage.k06
    public final boolean c() {
        und undVarB;
        switch (this.u0) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.v0;
                vq8 vq8Var = actionMenuItemView.x0;
                return vq8Var != null && vq8Var.a(actionMenuItemView.u0) && (undVarB = b()) != null && undVarB.a();
            default:
                ((d7) this.v0).o.l();
                return true;
        }
    }

    @Override // defpackage.k06
    public boolean d() {
        switch (this.u0) {
            case 1:
                e7 e7Var = ((d7) this.v0).o;
                if (e7Var.F0 != null) {
                    return false;
                }
                e7Var.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(d7 d7Var, View view) {
        super(view);
        this.v0 = d7Var;
    }
}
