package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import one.me.android.MainActivity;
import ru.ok.messages.views.fragments.base.FrgBase;

/* loaded from: classes2.dex */
public abstract class q5 extends im implements ase {
    public y7g K0;
    public c8 L0;
    public gua M0;
    public sme N0;
    public int O0;
    public boolean P0;
    public p5 R0;
    public HashMap T0;
    public final HashSet Q0 = new HashSet();
    public long S0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void X(sme smeVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar instanceof FrgBase) {
                FrgBase frgBase = (FrgBase) aVar;
                frgBase.r1 = smeVar;
                View view = frgBase.U0;
                if (frgBase instanceof wme) {
                    ((wme) frgBase).z(smeVar);
                } else if (view != null) {
                    frgBase.i1();
                }
            } else if (aVar instanceof wme) {
                ((wme) aVar).z(smeVar);
            }
            X(smeVar, aVar.c0().c.f());
        }
    }

    @Override // defpackage.yb3
    public final Object H() {
        return this.T0;
    }

    @Override // androidx.fragment.app.b
    public void U() {
        super.U();
        hm9.n("q5", "onResumeFragments: " + getLocalClassName() + "@" + hashCode());
        this.P0 = true;
        if (((f5a) ((y8a) ((ed3) this.K0.b)).getAccessor().c(f5a.class)).d()) {
            cy7 cy7VarR = ((y8a) ((ed3) this.K0.b)).r();
            HashSet hashSet = this.Q0;
            int i = tu0.m;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                cy7VarR.c((pi0) it.next());
            }
            hashSet.clear();
        } else {
            d0();
        }
        if (this.M0 != null) {
            this.M0 = null;
        }
        c8 c8Var = this.L0;
        if (c8Var != null) {
            c0(c8Var.a, c8Var.b, c8Var.c);
            this.L0 = null;
        }
    }

    public final void Y() {
        super.finish();
        if (((y8a) ((ed3) this.K0.b)).n().c.u()) {
            overridePendingTransition(0, R.anim.fade_out);
        }
    }

    public abstract String Z();

    public void a0() {
    }

    @Override // defpackage.im, defpackage.yb3, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        super.addContentView(view, layoutParams);
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        if (configuration != null) {
            String strR = ((y8a) vl.b()).n().a.r();
            if (!TextUtils.isEmpty(strR)) {
                Context baseContext = getBaseContext();
                int i = lz7.g;
                configuration.setTo(baseContext.getResources().getConfiguration());
                Locale locale = new Locale(strR);
                Locale.setDefault(locale);
                configuration.fontScale = 0.0f;
                configuration.setLocale(locale);
            }
        }
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.im, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String strR = ((y8a) vl.b()).n().a.r();
        if (TextUtils.isEmpty(strR)) {
            super.attachBaseContext(context);
            return;
        }
        int i = lz7.g;
        if (!oag.t(strR)) {
            Locale locale = new Locale(strR);
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.fontScale = 0.0f;
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
    }

    public final void b0(View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
        decorView.setSystemUiVisibility(u().c ? 3846 : 3862);
    }

    public void c0(int i, int i2, Intent intent) {
    }

    public void d0() {
        hm9.k("q5", "onLogout " + getLocalClassName());
        setResult(0);
        finishAffinity();
    }

    public final void e0() {
        s5c.Z(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(eyb.view_tree_view_model_store_owner, this);
        wmd.G(getWindow().getDecorView(), this);
    }

    public final void f0(int i) {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (((y8a) ((ed3) this.K0.b)).n().c.u()) {
            return;
        }
        overridePendingTransition(0, 0);
    }

    public final void g0(View.OnSystemUiVisibilityChangeListener onSystemUiVisibilityChangeListener) {
        View decorView = getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(onSystemUiVisibilityChangeListener);
        decorView.setSystemUiVisibility(u().c ? 1792 : 1808);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        int i;
        Resources.Theme theme = super.getTheme();
        sme smeVarU = u();
        if (smeVarU != null && smeVarU.c && (i = this.O0) != kpc.c && i != kpc.d && i != kpc.e && i != kpc.f && i != kpc.b) {
            theme.applyStyle(kpc.a, true);
        }
        return theme;
    }

    public boolean h0() {
        return this instanceof MainActivity;
    }

    public final void i0() {
        if (((y8a) ((ed3) this.K0.b)).n().c.d("app.pinLock.screenshotEnabled", true)) {
            getWindow().clearFlags(8192);
        } else {
            getWindow().addFlags(8192);
        }
    }

    @Override // androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.P0) {
            c0(i, i2, intent);
        } else {
            this.L0 = new c8(i, i2, intent);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper
    public final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        this.O0 = i;
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.yb3, android.app.Activity
    public void onBackPressed() {
        View view;
        if (this.P0) {
            for (a aVar : S().c.f()) {
                if (aVar != null && aVar.o0() && !aVar.p0() && (view = aVar.U0) != null && view.getWindowToken() != null && aVar.U0.getVisibility() == 0 && (aVar instanceof FrgBase) && ((FrgBase) aVar).n1()) {
                    return;
                }
            }
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public void onCreate(Bundle bundle) {
        q7g q7gVar = (q7g) ((y8a) vl.b()).getAccessor().c(q7g.class);
        q7gVar.getClass();
        hm9.n("q7g", "enableWorkManager");
        q7gVar.b.d();
        ub3 ub3Var = (ub3) getLastNonConfigurationInstance();
        Object obj = ub3Var != null ? ub3Var.a : null;
        if (obj == null || !(obj instanceof Map)) {
            this.T0 = new HashMap();
        } else {
            this.T0 = (HashMap) obj;
        }
        this.K0 = new y7g(vl.b());
        this.N0 = ((tme) ((y8a) vl.b()).getAccessor().c(tme.class)).c();
        S().p.add(new p16() { // from class: o5
            @Override // defpackage.p16
            public final void a(a aVar) {
                q5 q5Var = this.a;
                q5Var.getClass();
                try {
                    aVar.getClass();
                    ((xie) ((y8a) ((ed3) q5Var.K0.b)).getAccessor().c(xie.class)).c().getClass();
                } catch (Throwable unused) {
                }
            }
        });
        i0();
        super.onCreate(bundle);
        hm9.n("q5", "onCreate: " + getLocalClassName() + "@" + hashCode());
        if (!((y8a) ((ed3) this.K0.b)).n().c.u()) {
            overridePendingTransition(0, 0);
        }
        if (bundle != null) {
            tu0.u(bundle, this.Q0);
        }
        ((y8a) ((ed3) this.K0.b)).r().d(this);
        this.R0 = new p5(this);
        ((y8a) ((ed3) this.K0.b)).r().d(this.R0);
    }

    @Override // defpackage.im, androidx.fragment.app.b, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            ((y8a) ((ed3) this.K0.b)).r().f(this);
            ((y8a) ((ed3) this.K0.b)).r().f(this.R0);
        } catch (Exception unused) {
        }
        hm9.n("q5", "onDestroy: " + getLocalClassName() + "@" + hashCode());
        if (isChangingConfigurations()) {
            return;
        }
        for (Object obj : this.T0.values()) {
            if (obj instanceof cn4) {
                ((cn4) obj).c = 0;
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        for (ynf ynfVar : S().c.f()) {
            if (ynfVar instanceof hc7) {
                ((hc7) ynfVar).B0(i, keyEvent);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.yb3, android.app.Activity
    public void onNewIntent(Intent intent) {
        hm9.k("q5", "onNewIntent: intent =" + intent + " " + getLocalClassName() + "@" + hashCode());
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onPause() {
        super.onPause();
        hm9.n("q5", "onPause: " + getLocalClassName() + "@" + hashCode());
        this.P0 = false;
        if (TextUtils.isEmpty(Z())) {
            return;
        }
        ((y8a) ((ed3) this.K0.b)).b().l(SystemClock.elapsedRealtime() - this.S0, Z());
    }

    @Override // androidx.fragment.app.b, defpackage.yb3, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        wmd.z(this, strArr, iArr);
        if (!this.P0) {
            this.M0 = new gua(i, strArr, iArr);
        }
        if (Arrays.asList(strArr).contains("android.permission.READ_CONTACTS") && wmd.j(this, wmd.e)) {
            ((y8a) ((ed3) this.K0.b)).p().getClass();
            ((jva) ((bva) ((jyc) jke.b()).getAccessor().c(bva.class))).c();
        }
    }

    @Override // androidx.fragment.app.b, android.app.Activity
    public void onResume() {
        super.onResume();
        this.S0 = SystemClock.elapsedRealtime();
        hm9.n("q5", "onResume: " + getLocalClassName() + "@" + hashCode());
        if (TextUtils.isEmpty(Z())) {
            return;
        }
        hm9.n("q5", "sendScreen: onResume " + Z());
    }

    @Override // defpackage.yb3, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        HashSet hashSet = this.Q0;
        int i = tu0.m;
        hm9.k("tu0", "onSaveInstanceState");
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(hashSet));
    }

    @Override // defpackage.im, androidx.fragment.app.b, android.app.Activity
    public void onStart() {
        super.onStart();
        hm9.k("q5", "onStart: " + getLocalClassName() + "@" + hashCode());
    }

    @Override // defpackage.im, androidx.fragment.app.b, android.app.Activity
    public void onStop() {
        super.onStop();
        hm9.k("q5", "onStop: " + getLocalClassName() + "@" + hashCode());
    }

    @Override // defpackage.yb3, android.app.Activity
    public void onUserLeaveHint() {
        for (a aVar : S().c.f()) {
            if (aVar instanceof FrgBase) {
                ((FrgBase) aVar).getClass();
            }
        }
        super.onUserLeaveHint();
    }

    @Override // defpackage.im, defpackage.yb3, android.app.Activity
    public final void setContentView(int i) {
        e0();
        super.setContentView(i);
    }

    @Override // defpackage.ase
    public sme u() {
        return this.N0;
    }

    @Override // defpackage.im, defpackage.yb3, android.app.Activity
    public void setContentView(View view) {
        e0();
        super.setContentView(view);
    }

    @Override // defpackage.im, defpackage.yb3, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e0();
        super.setContentView(view, layoutParams);
    }
}
