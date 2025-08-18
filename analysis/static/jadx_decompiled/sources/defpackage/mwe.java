package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class mwe extends ote {
    public final Window.Callback X;
    public final qje Y;
    public boolean Z;
    public final rwe o;
    public boolean s0;
    public boolean t0;
    public final ArrayList u0;
    public final gwe v0;

    public mwe(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        super(3);
        this.u0 = new ArrayList();
        this.v0 = new gwe(1, this);
        u5e u5eVar = new u5e(this);
        toolbar.getClass();
        rwe rweVar = new rwe(toolbar, false);
        this.o = rweVar;
        callback.getClass();
        this.X = callback;
        rweVar.k = callback;
        toolbar.setOnMenuItemClickListener(u5eVar);
        if (!rweVar.g) {
            rweVar.h = charSequence;
            if ((rweVar.b & 8) != 0) {
                Toolbar toolbar2 = rweVar.a;
                toolbar2.setTitle(charSequence);
                if (rweVar.g) {
                    zmf.k(toolbar2.getRootView(), charSequence);
                }
            }
        }
        this.Y = new qje(1, this);
    }

    @Override // defpackage.ote
    public final boolean C() {
        rwe rweVar = this.o;
        Toolbar toolbar = rweVar.a;
        gwe gweVar = this.v0;
        toolbar.removeCallbacks(gweVar);
        Toolbar toolbar2 = rweVar.a;
        WeakHashMap weakHashMap = zmf.a;
        toolbar2.postOnAnimation(gweVar);
        return true;
    }

    @Override // defpackage.ote
    public final void H() {
    }

    @Override // defpackage.ote
    public final void I() {
        this.o.a.removeCallbacks(this.v0);
    }

    @Override // defpackage.ote
    public final boolean L(int i, KeyEvent keyEvent) {
        Menu menuC0 = c0();
        if (menuC0 == null) {
            return false;
        }
        menuC0.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuC0.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ote
    public final boolean M(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            N();
        }
        return true;
    }

    @Override // defpackage.ote
    public final boolean N() {
        return this.o.a.w();
    }

    @Override // defpackage.ote
    public final void P(boolean z) {
    }

    @Override // defpackage.ote
    public final void Q(boolean z) {
    }

    @Override // defpackage.ote
    public final void U(CharSequence charSequence) {
        rwe rweVar = this.o;
        if (rweVar.g) {
            return;
        }
        rweVar.h = charSequence;
        if ((rweVar.b & 8) != 0) {
            Toolbar toolbar = rweVar.a;
            toolbar.setTitle(charSequence);
            if (rweVar.g) {
                zmf.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.ote
    public final boolean a() {
        e7 e7Var;
        ActionMenuView actionMenuView = this.o.a.a;
        return (actionMenuView == null || (e7Var = actionMenuView.s0) == null || !e7Var.f()) ? false : true;
    }

    public final Menu c0() {
        boolean z = this.s0;
        rwe rweVar = this.o;
        if (!z) {
            ar0 ar0Var = new ar0(this);
            w5e w5eVar = new w5e(this);
            Toolbar toolbar = rweVar.a;
            toolbar.b1 = ar0Var;
            toolbar.c1 = w5eVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.t0 = ar0Var;
                actionMenuView.u0 = w5eVar;
            }
            this.s0 = true;
        }
        return rweVar.a.getMenu();
    }

    @Override // defpackage.ote
    public final boolean g() {
        br8 br8Var;
        iwe iweVar = this.o.a.a1;
        if (iweVar == null || (br8Var = iweVar.b) == null) {
            return false;
        }
        if (iweVar == null) {
            br8Var = null;
        }
        if (br8Var == null) {
            return true;
        }
        br8Var.collapseActionView();
        return true;
    }

    @Override // defpackage.ote
    public final void h(boolean z) {
        if (z == this.t0) {
            return;
        }
        this.t0 = z;
        ArrayList arrayList = this.u0;
        if (arrayList.size() <= 0) {
            return;
        }
        au1.r(arrayList.get(0));
        throw null;
    }

    @Override // defpackage.ote
    public final int q() {
        return this.o.b;
    }

    @Override // defpackage.ote
    public final Context y() {
        return this.o.a.getContext();
    }
}
