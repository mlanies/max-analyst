package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ym implements Window.Callback {
    public boolean X;
    public final /* synthetic */ dn Y;
    public final Window.Callback a;
    public qje b;
    public boolean c;
    public boolean o;

    public ym(dn dnVar, Window.Callback callback) {
        this.Y = dnVar;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        y5g.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.o;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.Y.r(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        dn dnVar = this.Y;
        dnVar.x();
        ote oteVar = dnVar.z0;
        if (oteVar != null && oteVar.L(keyCode, keyEvent)) {
            return true;
        }
        cn cnVar = dnVar.X0;
        if (cnVar != null && dnVar.D(cnVar, keyEvent.getKeyCode(), keyEvent)) {
            cn cnVar2 = dnVar.X0;
            if (cnVar2 == null) {
                return true;
            }
            cnVar2.l = true;
            return true;
        }
        if (dnVar.X0 == null) {
            cn cnVarW = dnVar.w(0);
            dnVar.E(cnVarW, keyEvent);
            boolean zD = dnVar.D(cnVarW, keyEvent.getKeyCode(), keyEvent);
            cnVarW.k = false;
            if (zD) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof wq8)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        qje qjeVar = this.b;
        if (qjeVar != null) {
            View view = i == 0 ? new View(((mwe) qjeVar.b).o.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(i, menu);
        dn dnVar = this.Y;
        if (i == 108) {
            dnVar.x();
            ote oteVar = dnVar.z0;
            if (oteVar != null) {
                oteVar.h(true);
            }
        } else {
            dnVar.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.X) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        dn dnVar = this.Y;
        if (i == 108) {
            dnVar.x();
            ote oteVar = dnVar.z0;
            if (oteVar != null) {
                oteVar.h(false);
                return;
            }
            return;
        }
        if (i != 0) {
            dnVar.getClass();
            return;
        }
        cn cnVarW = dnVar.w(i);
        if (cnVarW.m) {
            dnVar.p(cnVarW, false);
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        z5g.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        wq8 wq8Var = menu instanceof wq8 ? (wq8) menu : null;
        if (i == 0 && wq8Var == null) {
            return false;
        }
        if (wq8Var != null) {
            wq8Var.I0 = true;
        }
        qje qjeVar = this.b;
        if (qjeVar != null && i == 0) {
            mwe mweVar = (mwe) qjeVar.b;
            if (!mweVar.Z) {
                mweVar.o.l = true;
                mweVar.Z = true;
            }
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (wq8Var != null) {
            wq8Var.I0 = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        wq8 wq8Var = this.Y.w(0).h;
        if (wq8Var != null) {
            d(list, wq8Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return x5g.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int i2 = 1;
        dn dnVar = this.Y;
        dnVar.getClass();
        if (i != 0) {
            return x5g.b(this.a, callback, i);
        }
        Context context = dnVar.v0;
        die dieVar = new die();
        dieVar.b = context;
        dieVar.a = callback;
        dieVar.c = new ArrayList();
        dieVar.o = new qpd();
        j7 j7Var = dnVar.F0;
        if (j7Var != null) {
            j7Var.a();
        }
        imc imcVar = new imc(dnVar, 3, dieVar);
        dnVar.x();
        ote oteVar = dnVar.z0;
        if (oteVar != null) {
            dnVar.F0 = oteVar.W(imcVar);
        }
        if (dnVar.F0 == null) {
            vof vofVar = dnVar.J0;
            if (vofVar != null) {
                vofVar.b();
            }
            j7 j7Var2 = dnVar.F0;
            if (j7Var2 != null) {
                j7Var2.a();
            }
            if (dnVar.y0 != null) {
                boolean z = dnVar.b1;
            }
            if (dnVar.G0 == null) {
                boolean z2 = dnVar.T0;
                Context context2 = dnVar.v0;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(vsb.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context2.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        du3 du3Var = new du3(context2, 0);
                        du3Var.getTheme().setTo(themeNewTheme);
                        context2 = du3Var;
                    }
                    dnVar.G0 = new ActionBarContextView(context2, null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, vsb.actionModePopupWindowStyle);
                    dnVar.H0 = popupWindow;
                    i6b.d(popupWindow, 2);
                    dnVar.H0.setContentView(dnVar.G0);
                    dnVar.H0.setWidth(-1);
                    context2.getTheme().resolveAttribute(vsb.actionBarSize, typedValue, true);
                    dnVar.G0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    dnVar.H0.setHeight(-2);
                    dnVar.I0 = new sm(dnVar, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) dnVar.L0.findViewById(mvb.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        dnVar.x();
                        ote oteVar2 = dnVar.z0;
                        Context contextY = oteVar2 != null ? oteVar2.y() : null;
                        if (contextY != null) {
                            context2 = contextY;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        dnVar.G0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (dnVar.G0 != null) {
                vof vofVar2 = dnVar.J0;
                if (vofVar2 != null) {
                    vofVar2.b();
                }
                dnVar.G0.e();
                Context context3 = dnVar.G0.getContext();
                ActionBarContextView actionBarContextView = dnVar.G0;
                uxd uxdVar = new uxd();
                uxdVar.c = context3;
                uxdVar.o = actionBarContextView;
                uxdVar.X = imcVar;
                wq8 wq8Var = new wq8(actionBarContextView.getContext());
                wq8Var.w0 = 1;
                uxdVar.s0 = wq8Var;
                wq8Var.X = uxdVar;
                if (((i7) imcVar.b).o(uxdVar, wq8Var)) {
                    uxdVar.g();
                    dnVar.G0.c(uxdVar);
                    dnVar.F0 = uxdVar;
                    if (dnVar.K0 && (viewGroup = dnVar.L0) != null && viewGroup.isLaidOut()) {
                        dnVar.G0.setAlpha(0.0f);
                        vof vofVarA = zmf.a(dnVar.G0);
                        vofVarA.a(1.0f);
                        dnVar.J0 = vofVarA;
                        vofVarA.d(new tm(i2, dnVar));
                    } else {
                        dnVar.G0.setAlpha(1.0f);
                        dnVar.G0.setVisibility(0);
                        if (dnVar.G0.getParent() instanceof View) {
                            View view = (View) dnVar.G0.getParent();
                            WeakHashMap weakHashMap = zmf.a;
                            mmf.c(view);
                        }
                    }
                    if (dnVar.H0 != null) {
                        dnVar.w0.getDecorView().post(dnVar.I0);
                    }
                } else {
                    dnVar.F0 = null;
                }
            }
            dnVar.G();
            dnVar.F0 = dnVar.F0;
        }
        dnVar.G();
        j7 j7Var3 = dnVar.F0;
        if (j7Var3 != null) {
            return dieVar.s(j7Var3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
