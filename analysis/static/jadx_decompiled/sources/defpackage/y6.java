package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class y6 implements vde {
    public char Y;
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char o;
    public Drawable s0;
    public final Context t0;
    public CharSequence u0;
    public CharSequence v0;
    public int X = 4096;
    public int Z = 4096;
    public ColorStateList w0 = null;
    public PorterDuff.Mode x0 = null;
    public boolean y0 = false;
    public boolean z0 = false;
    public int A0 = 16;

    public y6(Context context, CharSequence charSequence) {
        this.t0 = context;
        this.a = charSequence;
    }

    @Override // defpackage.vde
    public final vde a(k7 k7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.vde
    public final k7 b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.s0;
        if (drawable != null) {
            if (this.y0 || this.z0) {
                this.s0 = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.s0 = drawableMutate;
                if (this.y0) {
                    aq4.h(drawableMutate, this.w0);
                }
                if (this.z0) {
                    aq4.i(this.s0, this.x0);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.Z;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.Y;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.u0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.s0;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.w0;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.x0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.X;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.v0;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A0 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.A0 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.A0 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.A0 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.Y = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.A0 = (z ? 1 : 0) | (this.A0 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.A0 = (z ? 2 : 0) | (this.A0 & (-3));
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final vde setContentDescription(CharSequence charSequence) {
        this.u0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.A0 = (z ? 16 : 0) | (this.A0 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.s0 = drawable;
        c();
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.w0 = colorStateList;
        this.y0 = true;
        c();
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.x0 = mode;
        this.z0 = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.o = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.o = c;
        this.Y = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final vde setTooltipText(CharSequence charSequence) {
        this.v0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.A0 = (this.A0 & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.Y = Character.toLowerCase(c);
        this.Z = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.u0 = charSequence;
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.o = c;
        this.X = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.a = this.t0.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.v0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.s0 = kt3.b(this.t0, i);
        c();
        return this;
    }

    @Override // defpackage.vde, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.o = c;
        this.X = KeyEvent.normalizeMetaState(i);
        this.Y = Character.toLowerCase(c2);
        this.Z = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
