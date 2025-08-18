package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class cr8 extends k7 implements ActionProvider.VisibilityListener {
    public qqd b;
    public final ActionProvider c;
    public final /* synthetic */ fr8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr8(fr8 fr8Var, Context context, ActionProvider actionProvider) {
        super(context);
        this.d = fr8Var;
        this.c = actionProvider;
    }

    @Override // defpackage.k7
    public final boolean a() {
        return this.c.hasSubMenu();
    }

    @Override // defpackage.k7
    public final boolean b() {
        return this.c.isVisible();
    }

    @Override // defpackage.k7
    public final View c() {
        return this.c.onCreateActionView();
    }

    @Override // defpackage.k7
    public final View d(MenuItem menuItem) {
        return this.c.onCreateActionView(menuItem);
    }

    @Override // defpackage.k7
    public final boolean e() {
        return this.c.onPerformDefaultAction();
    }

    @Override // defpackage.k7
    public final void f(SubMenu subMenu) {
        this.d.getClass();
        this.c.onPrepareSubMenu(subMenu);
    }

    @Override // defpackage.k7
    public final boolean g() {
        return this.c.overridesItemVisibility();
    }

    @Override // defpackage.k7
    public final void h(qqd qqdVar) {
        this.b = qqdVar;
        this.c.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        qqd qqdVar = this.b;
        if (qqdVar != null) {
            wq8 wq8Var = ((br8) qqdVar.b).y0;
            wq8Var.s0 = true;
            wq8Var.p(true);
        }
    }
}
