package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d6g extends ote implements j6 {
    public static final AccelerateInterpolator M0 = new AccelerateInterpolator();
    public static final DecelerateInterpolator N0 = new DecelerateInterpolator();
    public final ArrayList A0;
    public int B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public wof G0;
    public boolean H0;
    public boolean I0;
    public final b6g J0;
    public final b6g K0;
    public final w5e L0;
    public Context X;
    public ActionBarOverlayLayout Y;
    public ActionBarContainer Z;
    public Context o;
    public v54 s0;
    public ActionBarContextView t0;
    public final View u0;
    public boolean v0;
    public c6g w0;
    public c6g x0;
    public i7 y0;
    public boolean z0;

    public d6g(Activity activity, boolean z) {
        super(3);
        new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = 0;
        this.C0 = true;
        this.F0 = true;
        this.J0 = new b6g(this, 0);
        this.K0 = new b6g(this, 1);
        this.L0 = new w5e(this);
        View decorView = activity.getWindow().getDecorView();
        d0(decorView);
        if (z) {
            return;
        }
        this.u0 = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.ote
    public final void H() {
        e0(this.o.getResources().getBoolean(atb.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.ote
    public final boolean L(int i, KeyEvent keyEvent) {
        wq8 wq8Var;
        c6g c6gVar = this.w0;
        if (c6gVar == null || (wq8Var = c6gVar.o) == null) {
            return false;
        }
        wq8Var.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return wq8Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ote
    public final void P(boolean z) {
        if (this.v0) {
            return;
        }
        int i = z ? 4 : 0;
        rwe rweVar = (rwe) this.s0;
        int i2 = rweVar.b;
        this.v0 = true;
        rweVar.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.ote
    public final void Q(boolean z) {
        wof wofVar;
        this.H0 = z;
        if (z || (wofVar = this.G0) == null) {
            return;
        }
        wofVar.a();
    }

    @Override // defpackage.ote
    public final void U(CharSequence charSequence) {
        rwe rweVar = (rwe) this.s0;
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
    public final j7 W(imc imcVar) {
        c6g c6gVar = this.w0;
        if (c6gVar != null) {
            c6gVar.a();
        }
        this.Y.setHideOnContentScrollEnabled(false);
        this.t0.e();
        c6g c6gVar2 = new c6g(this, this.t0.getContext(), imcVar);
        wq8 wq8Var = c6gVar2.o;
        wq8Var.w();
        try {
            if (!c6gVar2.X.o(c6gVar2, wq8Var)) {
                return null;
            }
            this.w0 = c6gVar2;
            c6gVar2.g();
            this.t0.c(c6gVar2);
            c0(true);
            return c6gVar2;
        } finally {
            wq8Var.v();
        }
    }

    public final void c0(boolean z) {
        vof vofVarI;
        vof vofVarI2;
        if (z) {
            if (!this.E0) {
                this.E0 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.Y;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f0(false);
            }
        } else if (this.E0) {
            this.E0 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.Y;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f0(false);
        }
        if (!this.Z.isLaidOut()) {
            if (z) {
                ((rwe) this.s0).a.setVisibility(4);
                this.t0.setVisibility(0);
                return;
            } else {
                ((rwe) this.s0).a.setVisibility(0);
                this.t0.setVisibility(8);
                return;
            }
        }
        if (z) {
            rwe rweVar = (rwe) this.s0;
            vofVarI = zmf.a(rweVar.a);
            vofVarI.a(0.0f);
            vofVarI.c(100L);
            vofVarI.d(new qwe(rweVar, 4));
            vofVarI2 = this.t0.i(0, 200L);
        } else {
            rwe rweVar2 = (rwe) this.s0;
            vof vofVarA = zmf.a(rweVar2.a);
            vofVarA.a(1.0f);
            vofVarA.c(200L);
            vofVarA.d(new qwe(rweVar2, 0));
            vofVarI = this.t0.i(8, 100L);
            vofVarI2 = vofVarA;
        }
        wof wofVar = new wof();
        ArrayList arrayList = wofVar.a;
        arrayList.add(vofVarI);
        View view = (View) vofVarI.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) vofVarI2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(vofVarI2);
        wofVar.b();
    }

    public final void d0(View view) {
        v54 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(mvb.decor_content_parent);
        this.Y = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(mvb.action_bar);
        if (callbackFindViewById instanceof v54) {
            wrapper = (v54) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.s0 = wrapper;
        this.t0 = (ActionBarContextView) view.findViewById(mvb.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(mvb.action_bar_container);
        this.Z = actionBarContainer;
        v54 v54Var = this.s0;
        if (v54Var == null || this.t0 == null || actionBarContainer == null) {
            throw new IllegalStateException(d6g.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((rwe) v54Var).a.getContext();
        this.o = context;
        if ((((rwe) this.s0).b & 4) != 0) {
            this.v0 = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.s0.getClass();
        e0(context.getResources().getBoolean(atb.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.o.obtainStyledAttributes(null, p3c.ActionBar, vsb.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(p3c.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.Y;
            if (!actionBarOverlayLayout2.u0) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.I0 = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p3c.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.Z;
            WeakHashMap weakHashMap = zmf.a;
            omf.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void e0(boolean z) {
        if (z) {
            this.Z.setTabContainer(null);
            ((rwe) this.s0).getClass();
        } else {
            ((rwe) this.s0).getClass();
            this.Z.setTabContainer(null);
        }
        rwe rweVar = (rwe) this.s0;
        rweVar.getClass();
        rweVar.a.setCollapsible(false);
        this.Y.setHasNonEmbeddedTabs(false);
    }

    public final void f0(boolean z) {
        boolean z2 = this.E0 || !this.D0;
        View view = this.u0;
        w5e w5eVar = this.L0;
        if (!z2) {
            if (this.F0) {
                this.F0 = false;
                wof wofVar = this.G0;
                if (wofVar != null) {
                    wofVar.a();
                }
                int i = this.B0;
                b6g b6gVar = this.J0;
                if (i != 0 || (!this.H0 && !z)) {
                    b6gVar.c();
                    return;
                }
                this.Z.setAlpha(1.0f);
                this.Z.setTransitioning(true);
                wof wofVar2 = new wof();
                float f = -this.Z.getHeight();
                if (z) {
                    this.Z.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                vof vofVarA = zmf.a(this.Z);
                vofVarA.e(f);
                View view2 = (View) vofVarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(w5eVar != null ? new z00(w5eVar, view2) : null);
                }
                boolean z3 = wofVar2.e;
                ArrayList arrayList = wofVar2.a;
                if (!z3) {
                    arrayList.add(vofVarA);
                }
                if (this.C0 && view != null) {
                    vof vofVarA2 = zmf.a(view);
                    vofVarA2.e(f);
                    if (!wofVar2.e) {
                        arrayList.add(vofVarA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = M0;
                boolean z4 = wofVar2.e;
                if (!z4) {
                    wofVar2.c = accelerateInterpolator;
                }
                if (!z4) {
                    wofVar2.b = 250L;
                }
                if (!z4) {
                    wofVar2.d = b6gVar;
                }
                this.G0 = wofVar2;
                wofVar2.b();
                return;
            }
            return;
        }
        if (this.F0) {
            return;
        }
        this.F0 = true;
        wof wofVar3 = this.G0;
        if (wofVar3 != null) {
            wofVar3.a();
        }
        this.Z.setVisibility(0);
        int i2 = this.B0;
        b6g b6gVar2 = this.K0;
        if (i2 == 0 && (this.H0 || z)) {
            this.Z.setTranslationY(0.0f);
            float f2 = -this.Z.getHeight();
            if (z) {
                this.Z.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.Z.setTranslationY(f2);
            wof wofVar4 = new wof();
            vof vofVarA3 = zmf.a(this.Z);
            vofVarA3.e(0.0f);
            View view3 = (View) vofVarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(w5eVar != null ? new z00(w5eVar, view3) : null);
            }
            boolean z5 = wofVar4.e;
            ArrayList arrayList2 = wofVar4.a;
            if (!z5) {
                arrayList2.add(vofVarA3);
            }
            if (this.C0 && view != null) {
                view.setTranslationY(f2);
                vof vofVarA4 = zmf.a(view);
                vofVarA4.e(0.0f);
                if (!wofVar4.e) {
                    arrayList2.add(vofVarA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = N0;
            boolean z6 = wofVar4.e;
            if (!z6) {
                wofVar4.c = decelerateInterpolator;
            }
            if (!z6) {
                wofVar4.b = 250L;
            }
            if (!z6) {
                wofVar4.d = b6gVar2;
            }
            this.G0 = wofVar4;
            wofVar4.b();
        } else {
            this.Z.setAlpha(1.0f);
            this.Z.setTranslationY(0.0f);
            if (this.C0 && view != null) {
                view.setTranslationY(0.0f);
            }
            b6gVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.Y;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = zmf.a;
            mmf.c(actionBarOverlayLayout);
        }
    }

    @Override // defpackage.ote
    public final boolean g() {
        iwe iweVar;
        v54 v54Var = this.s0;
        if (v54Var == null || (iweVar = ((rwe) v54Var).a.a1) == null || iweVar.b == null) {
            return false;
        }
        iwe iweVar2 = ((rwe) v54Var).a.a1;
        br8 br8Var = iweVar2 == null ? null : iweVar2.b;
        if (br8Var == null) {
            return true;
        }
        br8Var.collapseActionView();
        return true;
    }

    @Override // defpackage.ote
    public final void h(boolean z) {
        if (z == this.z0) {
            return;
        }
        this.z0 = z;
        ArrayList arrayList = this.A0;
        if (arrayList.size() <= 0) {
            return;
        }
        au1.r(arrayList.get(0));
        throw null;
    }

    @Override // defpackage.ote
    public final int q() {
        return ((rwe) this.s0).b;
    }

    @Override // defpackage.ote
    public final Context y() {
        if (this.X == null) {
            TypedValue typedValue = new TypedValue();
            this.o.getTheme().resolveAttribute(vsb.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.X = new ContextThemeWrapper(this.o, i);
            } else {
                this.X = this.o;
            }
        }
        return this.X;
    }

    public d6g(Dialog dialog) {
        super(3);
        new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = 0;
        this.C0 = true;
        this.F0 = true;
        this.J0 = new b6g(this, 0);
        this.K0 = new b6g(this, 1);
        this.L0 = new w5e(this);
        d0(dialog.getWindow().getDecorView());
    }
}
