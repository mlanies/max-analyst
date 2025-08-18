package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class br8 implements vde {
    public MenuItem.OnMenuItemClickListener A0;
    public CharSequence B0;
    public CharSequence C0;
    public int J0;
    public View K0;
    public k7 L0;
    public MenuItem.OnActionExpandListener M0;
    public CharSequence X;
    public CharSequence Y;
    public Intent Z;
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public char s0;
    public char u0;
    public Drawable w0;
    public final wq8 y0;
    public qae z0;
    public int t0 = 4096;
    public int v0 = 4096;
    public int x0 = 0;
    public ColorStateList D0 = null;
    public PorterDuff.Mode E0 = null;
    public boolean F0 = false;
    public boolean G0 = false;
    public boolean H0 = false;
    public int I0 = 16;
    public boolean N0 = false;

    public br8(wq8 wq8Var, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.y0 = wq8Var;
        this.a = i2;
        this.b = i;
        this.c = i3;
        this.o = i4;
        this.X = charSequence;
        this.J0 = i5;
    }

    public static void c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // defpackage.vde
    public final vde a(k7 k7Var) {
        this.K0 = null;
        this.L0 = k7Var;
        this.y0.p(true);
        k7 k7Var2 = this.L0;
        if (k7Var2 != null) {
            k7Var2.h(new qqd(19, this));
        }
        return this;
    }

    @Override // defpackage.vde
    public final k7 b() {
        return this.L0;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.J0 & 8) == 0) {
            return false;
        }
        if (this.K0 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.M0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.y0.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.H0 && (this.F0 || this.G0)) {
            drawable = drawable.mutate();
            if (this.F0) {
                aq4.h(drawable, this.D0);
            }
            if (this.G0) {
                aq4.i(drawable, this.E0);
            }
            this.H0 = false;
        }
        return drawable;
    }

    public final boolean e() {
        k7 k7Var;
        if ((this.J0 & 8) == 0) {
            return false;
        }
        if (this.K0 == null && (k7Var = this.L0) != null) {
            this.K0 = k7Var.d(this);
        }
        return this.K0 != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.M0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.y0.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.I0 & 32) == 32;
    }

    public final void g(boolean z) {
        if (z) {
            this.I0 |= 32;
        } else {
            this.I0 &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.K0;
        if (view != null) {
            return view;
        }
        k7 k7Var = this.L0;
        if (k7Var == null) {
            return null;
        }
        View viewD = k7Var.d(this);
        this.K0 = viewD;
        return viewD;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.v0;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.u0;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.B0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.w0;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.x0;
        if (i == 0) {
            return null;
        }
        Drawable drawableN = s36.n(this.y0.a, i);
        this.x0 = 0;
        this.w0 = drawableN;
        return d(drawableN);
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.D0;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.E0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.Z;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.t0;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.s0;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.z0;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.X;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.Y;
        return charSequence != null ? charSequence : this.X;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.C0;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.z0 != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.N0;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.I0 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.I0 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.I0 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        k7 k7Var = this.L0;
        return (k7Var == null || !k7Var.g()) ? (this.I0 & 8) == 0 : (this.I0 & 8) == 0 && this.L0.b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.K0 = view;
        this.L0 = null;
        if (view != null && view.getId() == -1 && (i = this.a) > 0) {
            view.setId(i);
        }
        wq8 wq8Var = this.y0;
        wq8Var.v0 = true;
        wq8Var.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.u0 == c) {
            return this;
        }
        this.u0 = Character.toLowerCase(c);
        this.y0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.I0;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.I0 = i2;
        if (i != i2) {
            this.y0.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.I0;
        if ((i & 4) != 0) {
            wq8 wq8Var = this.y0;
            wq8Var.getClass();
            ArrayList arrayList = wq8Var.Y;
            int size = arrayList.size();
            wq8Var.w();
            for (int i2 = 0; i2 < size; i2++) {
                br8 br8Var = (br8) arrayList.get(i2);
                if (br8Var.b == this.b && (br8Var.I0 & 4) != 0 && br8Var.isCheckable()) {
                    boolean z2 = br8Var == this;
                    int i3 = br8Var.I0;
                    int i4 = (z2 ? 2 : 0) | (i3 & (-3));
                    br8Var.I0 = i4;
                    if (i3 != i4) {
                        br8Var.y0.p(false);
                    }
                }
            }
            wq8Var.v();
        } else {
            int i5 = (i & (-3)) | (z ? 2 : 0);
            this.I0 = i5;
            if (i != i5) {
                this.y0.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.I0 |= 16;
        } else {
            this.I0 &= -17;
        }
        this.y0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.x0 = 0;
        this.w0 = drawable;
        this.H0 = true;
        this.y0.p(false);
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.D0 = colorStateList;
        this.F0 = true;
        this.H0 = true;
        this.y0.p(false);
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.E0 = mode;
        this.G0 = true;
        this.H0 = true;
        this.y0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.Z = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.s0 == c) {
            return this;
        }
        this.s0 = c;
        this.y0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.M0 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.s0 = c;
        this.u0 = Character.toLowerCase(c2);
        this.y0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.J0 = i;
        wq8 wq8Var = this.y0;
        wq8Var.v0 = true;
        wq8Var.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.X = charSequence;
        this.y0.p(false);
        qae qaeVar = this.z0;
        if (qaeVar != null) {
            qaeVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.Y = charSequence;
        this.y0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.I0;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.I0 = i2;
        if (i != i2) {
            wq8 wq8Var = this.y0;
            wq8Var.s0 = true;
            wq8Var.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.X;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final vde setContentDescription(CharSequence charSequence) {
        this.B0 = charSequence;
        this.y0.p(false);
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final vde setTooltipText(CharSequence charSequence) {
        this.C0 = charSequence;
        this.y0.p(false);
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.u0 == c && this.v0 == i) {
            return this;
        }
        this.u0 = Character.toLowerCase(c);
        this.v0 = KeyEvent.normalizeMetaState(i);
        this.y0.p(false);
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.s0 == c && this.t0 == i) {
            return this;
        }
        this.s0 = c;
        this.t0 = KeyEvent.normalizeMetaState(i);
        this.y0.p(false);
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.s0 = c;
        this.t0 = KeyEvent.normalizeMetaState(i);
        this.u0 = Character.toLowerCase(c2);
        this.v0 = KeyEvent.normalizeMetaState(i2);
        this.y0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.w0 = null;
        this.x0 = i;
        this.H0 = true;
        this.y0.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.y0.a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Context context = this.y0.a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.K0 = viewInflate;
        this.L0 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.a) > 0) {
            viewInflate.setId(i2);
        }
        wq8 wq8Var = this.y0;
        wq8Var.v0 = true;
        wq8Var.p(true);
        return this;
    }
}
