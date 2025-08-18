package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class qae extends wq8 implements SubMenu {
    public final wq8 K0;
    public final br8 L0;

    public qae(Context context, wq8 wq8Var, br8 br8Var) {
        super(context);
        this.K0 = wq8Var;
        this.L0 = br8Var;
    }

    @Override // defpackage.wq8
    public final boolean d(br8 br8Var) {
        return this.K0.d(br8Var);
    }

    @Override // defpackage.wq8
    public final boolean e(wq8 wq8Var, MenuItem menuItem) {
        return super.e(wq8Var, menuItem) || this.K0.e(wq8Var, menuItem);
    }

    @Override // defpackage.wq8
    public final boolean f(br8 br8Var) {
        return this.K0.f(br8Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.L0;
    }

    @Override // defpackage.wq8
    public final String j() {
        br8 br8Var = this.L0;
        int i = br8Var != null ? br8Var.a : 0;
        if (i == 0) {
            return null;
        }
        return zr6.h(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.wq8
    public final wq8 k() {
        return this.K0.k();
    }

    @Override // defpackage.wq8
    public final boolean m() {
        return this.K0.m();
    }

    @Override // defpackage.wq8
    public final boolean n() {
        return this.K0.n();
    }

    @Override // defpackage.wq8
    public final boolean o() {
        return this.K0.o();
    }

    @Override // defpackage.wq8, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.K0.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.L0.setIcon(drawable);
        return this;
    }

    @Override // defpackage.wq8, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.K0.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.L0.setIcon(i);
        return this;
    }
}
