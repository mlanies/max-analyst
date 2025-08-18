package defpackage;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class er8 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ fr8 b;

    public er8(fr8 fr8Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = fr8Var;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.M(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.M(menuItem));
    }
}
