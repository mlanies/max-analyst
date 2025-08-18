package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class fr8 extends dle implements MenuItem {
    public Method X;
    public final vde o;

    public fr8(Context context, vde vdeVar) {
        super(context);
        if (vdeVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.o = vdeVar;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.o.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        k7 k7VarB = this.o.b();
        if (k7VarB instanceof cr8) {
            return ((cr8) k7VarB).c;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.o.getActionView();
        return actionView instanceof dr8 ? (View) ((dr8) actionView).a : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.o.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.o.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.o.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.o.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.o.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.o.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.o.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.o.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.o.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.o.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.o.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        cr8 cr8Var = new cr8(this, (Context) this.b, actionProvider);
        if (actionProvider == null) {
            cr8Var = null;
        }
        this.o.a(cr8Var);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new dr8(view);
        }
        this.o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.o.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.o.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.o.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.o.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.o.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.o.setOnActionExpandListener(onActionExpandListener != null ? new er8(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new sde(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.o.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.o.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.o.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.o.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.o.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.o.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.o.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.o.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.o.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        vde vdeVar = this.o;
        vdeVar.setActionView(i);
        View actionView = vdeVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            vdeVar.setActionView(new dr8(actionView));
        }
        return this;
    }
}
