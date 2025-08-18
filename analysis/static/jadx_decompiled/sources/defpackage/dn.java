package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class dn extends rm implements uq8, LayoutInflater.Factory2 {
    public static final qpd s1 = new qpd(0);
    public static final int[] t1 = {R.attr.windowBackground};
    public static final boolean u1 = !"robolectric".equals(Build.FINGERPRINT);
    public ude A0;
    public CharSequence B0;
    public u54 C0;
    public bkg D0;
    public wmc E0;
    public j7 F0;
    public ActionBarContextView G0;
    public PopupWindow H0;
    public sm I0;
    public boolean K0;
    public ViewGroup L0;
    public TextView M0;
    public View N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public cn[] W0;
    public cn X0;
    public boolean Y0;
    public boolean Z0;
    public boolean a1;
    public boolean b1;
    public Configuration c1;
    public final int d1;
    public int e1;
    public int f1;
    public boolean g1;
    public zm h1;
    public zm i1;
    public boolean j1;
    public int k1;
    public boolean m1;
    public Rect n1;
    public Rect o1;
    public so p1;
    public OnBackInvokedDispatcher q1;
    public OnBackInvokedCallback r1;
    public final Object u0;
    public final Context v0;
    public Window w0;
    public ym x0;
    public final km y0;
    public ote z0;
    public vof J0 = null;
    public final sm l1 = new sm(this, 0);

    public dn(Context context, Window window, km kmVar, Object obj) {
        im imVar = null;
        this.d1 = -100;
        this.v0 = context;
        this.y0 = kmVar;
        this.u0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof im)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        imVar = (im) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (imVar != null) {
                this.d1 = ((dn) imVar.V()).d1;
            }
        }
        if (this.d1 == -100) {
            qpd qpdVar = s1;
            Integer num = (Integer) qpdVar.get(this.u0.getClass().getName());
            if (num != null) {
                this.d1 = num.intValue();
                qpdVar.remove(this.u0.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        gn.d();
    }

    public static yq7 m(Context context) {
        yq7 yq7Var;
        yq7 yq7Var2;
        if (Build.VERSION.SDK_INT >= 33 || (yq7Var = rm.c) == null) {
            return null;
        }
        yq7 yq7VarB = vm.b(context.getApplicationContext().getResources().getConfiguration());
        zq7 zq7Var = yq7Var.a;
        if (zq7Var.a.isEmpty()) {
            yq7Var2 = yq7.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < yq7VarB.a.a.size() + zq7Var.a.size()) {
                Locale locale = i < zq7Var.a.size() ? zq7Var.a.get(i) : yq7VarB.a.a.get(i - zq7Var.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            yq7Var2 = new yq7(new zq7(xq7.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return yq7Var2.a.a.isEmpty() ? yq7VarB : yq7Var2;
    }

    public static Configuration q(Context context, int i, yq7 yq7Var, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (yq7Var != null) {
            vm.d(configuration2, yq7Var);
        }
        return configuration2;
    }

    public final int A(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return v(context).D();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.i1 == null) {
                    this.i1 = new zm(this, context);
                }
                return this.i1.D();
            }
        }
        return i;
    }

    public final boolean B() {
        boolean z = this.Y0;
        this.Y0 = false;
        cn cnVarW = w(0);
        if (cnVarW.m) {
            if (!z) {
                p(cnVarW, true);
            }
            return true;
        }
        j7 j7Var = this.F0;
        if (j7Var != null) {
            j7Var.a();
            return true;
        }
        x();
        ote oteVar = this.z0;
        return oteVar != null && oteVar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0173, code lost:
    
        if (r3.Z.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(defpackage.cn r18, android.view.KeyEvent r19) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.C(cn, android.view.KeyEvent):void");
    }

    public final boolean D(cn cnVar, int i, KeyEvent keyEvent) {
        wq8 wq8Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((cnVar.k || E(cnVar, keyEvent)) && (wq8Var = cnVar.h) != null) {
            return wq8Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean E(cn cnVar, KeyEvent keyEvent) {
        u54 u54Var;
        u54 u54Var2;
        Resources.Theme themeNewTheme;
        u54 u54Var3;
        u54 u54Var4;
        if (this.b1) {
            return false;
        }
        if (cnVar.k) {
            return true;
        }
        cn cnVar2 = this.X0;
        if (cnVar2 != null && cnVar2 != cnVar) {
            p(cnVar2, false);
        }
        Window.Callback callback = this.w0.getCallback();
        int i = cnVar.a;
        if (callback != null) {
            cnVar.g = callback.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (u54Var4 = this.C0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) u54Var4;
            actionBarOverlayLayout.e();
            ((rwe) actionBarOverlayLayout.s0).l = true;
        }
        if (cnVar.g == null && (!z || !(this.z0 instanceof mwe))) {
            wq8 wq8Var = cnVar.h;
            if (wq8Var == null || cnVar.o) {
                if (wq8Var == null) {
                    Context context = this.v0;
                    if ((i == 0 || i == 108) && this.C0 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(vsb.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(vsb.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(vsb.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            du3 du3Var = new du3(context, 0);
                            du3Var.getTheme().setTo(themeNewTheme);
                            context = du3Var;
                        }
                    }
                    wq8 wq8Var2 = new wq8(context);
                    wq8Var2.X = this;
                    wq8 wq8Var3 = cnVar.h;
                    if (wq8Var2 != wq8Var3) {
                        if (wq8Var3 != null) {
                            wq8Var3.r(cnVar.i);
                        }
                        cnVar.h = wq8Var2;
                        ql7 ql7Var = cnVar.i;
                        if (ql7Var != null) {
                            wq8Var2.b(ql7Var, wq8Var2.a);
                        }
                    }
                    if (cnVar.h == null) {
                        return false;
                    }
                }
                if (z && (u54Var2 = this.C0) != null) {
                    if (this.D0 == null) {
                        this.D0 = new bkg(2, this);
                    }
                    ((ActionBarOverlayLayout) u54Var2).f(cnVar.h, this.D0);
                }
                cnVar.h.w();
                if (!callback.onCreatePanelMenu(i, cnVar.h)) {
                    wq8 wq8Var4 = cnVar.h;
                    if (wq8Var4 != null) {
                        if (wq8Var4 != null) {
                            wq8Var4.r(cnVar.i);
                        }
                        cnVar.h = null;
                    }
                    if (z && (u54Var = this.C0) != null) {
                        ((ActionBarOverlayLayout) u54Var).f(null, this.D0);
                    }
                    return false;
                }
                cnVar.o = false;
            }
            cnVar.h.w();
            Bundle bundle = cnVar.p;
            if (bundle != null) {
                cnVar.h.s(bundle);
                cnVar.p = null;
            }
            if (!callback.onPreparePanel(0, cnVar.g, cnVar.h)) {
                if (z && (u54Var3 = this.C0) != null) {
                    ((ActionBarOverlayLayout) u54Var3).f(null, this.D0);
                }
                cnVar.h.v();
                return false;
            }
            cnVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            cnVar.h.v();
        }
        cnVar.k = true;
        cnVar.l = false;
        this.X0 = cnVar;
        return true;
    }

    public final void F() {
        if (this.K0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void G() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.q1 != null && (w(0).m || this.F0 != null)) {
                z = true;
            }
            if (z && this.r1 == null) {
                this.r1 = xm.b(this.q1, this);
            } else {
                if (z || (onBackInvokedCallback = this.r1) == null) {
                    return;
                }
                xm.c(this.q1, onBackInvokedCallback);
                this.r1 = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // defpackage.uq8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(defpackage.wq8 r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            u54 r6 = r5.C0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            v54 r6 = r6.s0
            rwe r6 = (defpackage.rwe) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.o
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.v0
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            u54 r6 = r5.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.e()
            v54 r6 = r6.s0
            rwe r6 = (defpackage.rwe) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto Ld3
            e7 r6 = r6.s0
            if (r6 == 0) goto Ld3
            i76 r2 = r6.F0
            if (r2 != 0) goto L4a
            boolean r6 = r6.j()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.w0
            android.view.Window$Callback r6 = r6.getCallback()
            u54 r2 = r5.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.e()
            v54 r2 = r2.s0
            rwe r2 = (defpackage.rwe) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            boolean r2 = r2.p()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            u54 r0 = r5.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.e()
            v54 r0 = r0.s0
            rwe r0 = (defpackage.rwe) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L7e
            e7 r0 = r0.s0
            if (r0 == 0) goto L7e
            boolean r0 = r0.f()
        L7e:
            boolean r0 = r5.b1
            if (r0 != 0) goto Le0
            cn r5 = r5.w(r1)
            wq8 r5 = r5.h
            r6.onPanelClosed(r3, r5)
            goto Le0
        L8c:
            if (r6 == 0) goto Le0
            boolean r2 = r5.b1
            if (r2 != 0) goto Le0
            boolean r2 = r5.j1
            if (r2 == 0) goto La9
            int r2 = r5.k1
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.w0
            android.view.View r0 = r0.getDecorView()
            sm r2 = r5.l1
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            cn r0 = r5.w(r1)
            wq8 r2 = r0.h
            if (r2 == 0) goto Le0
            boolean r4 = r0.o
            if (r4 != 0) goto Le0
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Le0
            wq8 r0 = r0.h
            r6.onMenuOpened(r3, r0)
            u54 r5 = r5.C0
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = (androidx.appcompat.widget.ActionBarOverlayLayout) r5
            r5.e()
            v54 r5 = r5.s0
            rwe r5 = (defpackage.rwe) r5
            androidx.appcompat.widget.Toolbar r5 = r5.a
            r5.w()
            goto Le0
        Ld3:
            cn r6 = r5.w(r1)
            r6.n = r0
            r5.p(r6, r1)
            r0 = 0
            r5.C(r6, r0)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.Q(wq8):void");
    }

    @Override // defpackage.rm
    public final void a() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.z0 != null) {
            x();
            if (this.z0.C()) {
                return;
            }
            y(0);
        }
    }

    @Override // defpackage.rm
    public final void c() throws PackageManager.NameNotFoundException {
        String strK;
        this.Z0 = true;
        k(false, true);
        u();
        Object obj = this.u0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strK = od2.K(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strK = null;
            }
            if (strK != null) {
                ote oteVar = this.z0;
                if (oteVar == null) {
                    this.m1 = true;
                } else {
                    oteVar.P(true);
                }
            }
            synchronized (rm.s0) {
                rm.e(this);
                rm.Z.add(new WeakReference(this));
            }
        }
        this.c1 = new Configuration(this.v0.getResources().getConfiguration());
        this.a1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.rm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.u0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.rm.s0
            monitor-enter(r0)
            defpackage.rm.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.j1
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.w0
            android.view.View r0 = r0.getDecorView()
            sm r1 = r3.l1
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.b1 = r0
            int r0 = r3.d1
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.u0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            qpd r0 = defpackage.dn.s1
            java.lang.Object r1 = r3.u0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.d1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            qpd r0 = defpackage.dn.s1
            java.lang.Object r1 = r3.u0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            ote r0 = r3.z0
            if (r0 == 0) goto L63
            r0.I()
        L63:
            zm r0 = r3.h1
            if (r0 == 0) goto L6a
            r0.y()
        L6a:
            zm r3 = r3.i1
            if (r3 == 0) goto L71
            r3.y()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.d():void");
    }

    @Override // defpackage.rm
    public final boolean f(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.U0 && i == 108) {
            return false;
        }
        if (this.Q0 && i == 1) {
            this.Q0 = false;
        }
        if (i == 1) {
            F();
            this.U0 = true;
            return true;
        }
        if (i == 2) {
            F();
            this.O0 = true;
            return true;
        }
        if (i == 5) {
            F();
            this.P0 = true;
            return true;
        }
        if (i == 10) {
            F();
            this.S0 = true;
            return true;
        }
        if (i == 108) {
            F();
            this.Q0 = true;
            return true;
        }
        if (i != 109) {
            return this.w0.requestFeature(i);
        }
        F();
        this.R0 = true;
        return true;
    }

    @Override // defpackage.rm
    public final void g(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t();
        ViewGroup viewGroup = (ViewGroup) this.L0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.v0).inflate(i, viewGroup);
        this.x0.a(this.w0.getCallback());
    }

    @Override // defpackage.rm
    public final void h(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t();
        ViewGroup viewGroup = (ViewGroup) this.L0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.x0.a(this.w0.getCallback());
    }

    @Override // defpackage.rm
    public final void i(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t();
        ViewGroup viewGroup = (ViewGroup) this.L0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.x0.a(this.w0.getCallback());
    }

    @Override // defpackage.rm
    public final void j(CharSequence charSequence) {
        this.B0 = charSequence;
        u54 u54Var = this.C0;
        if (u54Var != null) {
            u54Var.setWindowTitle(charSequence);
            return;
        }
        ote oteVar = this.z0;
        if (oteVar != null) {
            oteVar.U(charSequence);
            return;
        }
        TextView textView = this.M0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(boolean r13, boolean r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.k(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.w0
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof defpackage.ym
            if (r2 != 0) goto L7a
            ym r1 = new ym
            r1.<init>(r7, r0)
            r7.x0 = r1
            r8.setCallback(r1)
            int[] r0 = defpackage.dn.t1
            android.content.Context r1 = r7.v0
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            gn r4 = defpackage.gn.a()
            monitor-enter(r4)
            oic r5 = r4.a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.e(r3, r1, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.w0 = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.q1
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.r1
            if (r0 == 0) goto L5f
            defpackage.xm.c(r8, r0)
            r7.r1 = r2
        L5f:
            java.lang.Object r8 = r7.u0
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = defpackage.xm.a(r8)
            r7.q1 = r8
            goto L76
        L74:
            r7.q1 = r2
        L76:
            r7.G()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.l(android.view.Window):void");
    }

    public final void n(int i, cn cnVar, wq8 wq8Var) {
        if (wq8Var == null) {
            if (cnVar == null && i >= 0) {
                cn[] cnVarArr = this.W0;
                if (i < cnVarArr.length) {
                    cnVar = cnVarArr[i];
                }
            }
            if (cnVar != null) {
                wq8Var = cnVar.h;
            }
        }
        if ((cnVar == null || cnVar.m) && !this.b1) {
            ym ymVar = this.x0;
            Window.Callback callback = this.w0.getCallback();
            ymVar.getClass();
            try {
                ymVar.X = true;
                callback.onPanelClosed(i, wq8Var);
            } finally {
                ymVar.X = false;
            }
        }
    }

    public final void o(wq8 wq8Var) {
        e7 e7Var;
        if (this.V0) {
            return;
        }
        this.V0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.C0;
        actionBarOverlayLayout.e();
        ActionMenuView actionMenuView = ((rwe) actionBarOverlayLayout.s0).a.a;
        if (actionMenuView != null && (e7Var = actionMenuView.s0) != null) {
            e7Var.f();
            b7 b7Var = e7Var.E0;
            if (b7Var != null && b7Var.b()) {
                b7Var.j.dismiss();
            }
        }
        Window.Callback callback = this.w0.getCallback();
        if (callback != null && !this.b1) {
            callback.onPanelClosed(108, wq8Var);
        }
        this.V0 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(cn cnVar, boolean z) {
        bn bnVar;
        u54 u54Var;
        if (z && cnVar.a == 0 && (u54Var = this.C0) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) u54Var;
            actionBarOverlayLayout.e();
            if (((rwe) actionBarOverlayLayout.s0).a.p()) {
                o(cnVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.v0.getSystemService("window");
        if (windowManager != null && cnVar.m && (bnVar = cnVar.e) != null) {
            windowManager.removeView(bnVar);
            if (z) {
                n(cnVar.a, cnVar, null);
            }
        }
        cnVar.k = false;
        cnVar.l = false;
        cnVar.m = false;
        cnVar.f = null;
        cnVar.n = true;
        if (this.X0 == cnVar) {
            this.X0 = null;
        }
        if (cnVar.a == 0) {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(android.view.KeyEvent r7) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.r(android.view.KeyEvent):boolean");
    }

    public final void s(int i) {
        cn cnVarW = w(i);
        if (cnVarW.h != null) {
            Bundle bundle = new Bundle();
            cnVarW.h.t(bundle);
            if (bundle.size() > 0) {
                cnVarW.p = bundle;
            }
            cnVarW.h.w();
            cnVarW.h.clear();
        }
        cnVarW.o = true;
        cnVarW.n = true;
        if ((i == 108 || i == 0) && this.C0 != null) {
            cn cnVarW2 = w(0);
            cnVarW2.k = false;
            E(cnVarW2, null);
        }
    }

    public final void t() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        int i = 2;
        if (this.K0) {
            return;
        }
        int[] iArr = p3c.AppCompatTheme;
        Context context = this.v0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(p3c.AppCompatTheme_windowActionBar)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p3c.AppCompatTheme_windowNoTitle, false)) {
            f(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(p3c.AppCompatTheme_windowActionBar, false)) {
            f(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p3c.AppCompatTheme_windowActionBarOverlay, false)) {
            f(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p3c.AppCompatTheme_windowActionModeOverlay, false)) {
            f(10);
        }
        this.T0 = typedArrayObtainStyledAttributes.getBoolean(p3c.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        u();
        this.w0.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.U0) {
            viewGroup = this.S0 ? (ViewGroup) layoutInflaterFrom.inflate(zyb.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(zyb.abc_screen_simple, (ViewGroup) null);
        } else if (this.T0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(zyb.abc_dialog_title_material, (ViewGroup) null);
            this.R0 = false;
            this.Q0 = false;
        } else if (this.Q0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(vsb.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new du3(context, typedValue.resourceId) : context).inflate(zyb.abc_screen_toolbar, (ViewGroup) null);
            u54 u54Var = (u54) viewGroup.findViewById(mvb.decor_content_parent);
            this.C0 = u54Var;
            u54Var.setWindowCallback(this.w0.getCallback());
            if (this.R0) {
                ((ActionBarOverlayLayout) this.C0).d(109);
            }
            if (this.O0) {
                ((ActionBarOverlayLayout) this.C0).d(2);
            }
            if (this.P0) {
                ((ActionBarOverlayLayout) this.C0).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.Q0);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.R0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.T0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.S0);
            sb.append(", windowNoTitle: ");
            throw new IllegalArgumentException(au1.j(sb, this.U0, " }"));
        }
        o9g o9gVar = new o9g(i, this);
        WeakHashMap weakHashMap = zmf.a;
        omf.u(viewGroup, o9gVar);
        if (this.C0 == null) {
            this.M0 = (TextView) viewGroup.findViewById(mvb.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(mvb.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.w0.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.w0.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new y8(this));
        this.L0 = viewGroup;
        Object obj = this.u0;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.B0;
        if (!TextUtils.isEmpty(title)) {
            u54 u54Var2 = this.C0;
            if (u54Var2 != null) {
                u54Var2.setWindowTitle(title);
            } else {
                ote oteVar = this.z0;
                if (oteVar != null) {
                    oteVar.U(title);
                } else {
                    TextView textView = this.M0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.L0.findViewById(R.id.content);
        View decorView = this.w0.getDecorView();
        contentFrameLayout2.u0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(p3c.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(p3c.AppCompatTheme_windowFixedWidthMajor)) {
            typedArrayObtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(p3c.AppCompatTheme_windowFixedWidthMinor)) {
            typedArrayObtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(p3c.AppCompatTheme_windowFixedHeightMajor)) {
            typedArrayObtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(p3c.AppCompatTheme_windowFixedHeightMinor)) {
            typedArrayObtainStyledAttributes2.getValue(p3c.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.K0 = true;
        cn cnVarW = w(0);
        if (this.b1 || cnVarW.h != null) {
            return;
        }
        y(108);
    }

    public final void u() {
        if (this.w0 == null) {
            Object obj = this.u0;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.w0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final dle v(Context context) {
        if (this.h1 == null) {
            if (vq7.s0 == null) {
                Context applicationContext = context.getApplicationContext();
                vq7.s0 = new vq7(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.h1 = new zm(this, vq7.s0);
        }
        return this.h1;
    }

    public final cn w(int i) {
        cn[] cnVarArr = this.W0;
        if (cnVarArr == null || cnVarArr.length <= i) {
            cn[] cnVarArr2 = new cn[i + 1];
            if (cnVarArr != null) {
                System.arraycopy(cnVarArr, 0, cnVarArr2, 0, cnVarArr.length);
            }
            this.W0 = cnVarArr2;
            cnVarArr = cnVarArr2;
        }
        cn cnVar = cnVarArr[i];
        if (cnVar != null) {
            return cnVar;
        }
        cn cnVar2 = new cn();
        cnVar2.a = i;
        cnVar2.n = false;
        cnVarArr[i] = cnVar2;
        return cnVar2;
    }

    public final void x() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t();
        if (this.Q0 && this.z0 == null) {
            Object obj = this.u0;
            if (obj instanceof Activity) {
                this.z0 = new d6g((Activity) obj, this.R0);
            } else if (obj instanceof Dialog) {
                this.z0 = new d6g((Dialog) obj);
            }
            ote oteVar = this.z0;
            if (oteVar != null) {
                oteVar.P(this.m1);
            }
        }
    }

    public final void y(int i) {
        this.k1 = (1 << i) | this.k1;
        if (this.j1) {
            return;
        }
        View decorView = this.w0.getDecorView();
        WeakHashMap weakHashMap = zmf.a;
        decorView.postOnAnimation(this.l1);
        this.j1 = true;
    }

    @Override // defpackage.uq8
    public final boolean z(wq8 wq8Var, MenuItem menuItem) {
        cn cnVar;
        Window.Callback callback = this.w0.getCallback();
        if (callback != null && !this.b1) {
            wq8 wq8VarK = wq8Var.k();
            cn[] cnVarArr = this.W0;
            int length = cnVarArr != null ? cnVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    cnVar = cnVarArr[i];
                    if (cnVar != null && cnVar.h == wq8VarK) {
                        break;
                    }
                    i++;
                } else {
                    cnVar = null;
                    break;
                }
            }
            if (cnVar != null) {
                return callback.onMenuItemSelected(cnVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
