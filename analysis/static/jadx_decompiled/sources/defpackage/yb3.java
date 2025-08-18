package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class yb3 extends Activity implements ynf, pi6, isc, j3a, i8, m3a, a4a, r3a, s3a, yq8, eh7, gc7 {
    public static final /* synthetic */ int D0 = 0;
    public boolean A0;
    public final khe B0;
    public final khe C0;
    public xnf X;
    public final vb3 Y;
    public final khe Z;
    public final gh7 a = new gh7(this);
    public final jt3 b = new jt3(0);
    public final pl8 c;
    public final td o;
    public final wb3 s0;
    public final CopyOnWriteArrayList t0;
    public final CopyOnWriteArrayList u0;
    public final CopyOnWriteArrayList v0;
    public final CopyOnWriteArrayList w0;
    public final CopyOnWriteArrayList x0;
    public final CopyOnWriteArrayList y0;
    public boolean z0;

    public yb3() {
        final b bVar = (b) this;
        this.c = new pl8(new ob3(bVar, 0));
        td tdVar = new td((isc) this);
        this.o = tdVar;
        this.Y = new vb3(bVar);
        this.Z = new khe(new xb3(bVar, 2));
        new AtomicInteger();
        this.s0 = new wb3(bVar);
        this.t0 = new CopyOnWriteArrayList();
        this.u0 = new CopyOnWriteArrayList();
        this.v0 = new CopyOnWriteArrayList();
        this.w0 = new CopyOnWriteArrayList();
        this.x0 = new CopyOnWriteArrayList();
        this.y0 = new CopyOnWriteArrayList();
        gh7 gh7Var = this.a;
        if (gh7Var == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.".toString());
        }
        final int i = 0;
        gh7Var.a(new ug7() { // from class: pb3
            @Override // defpackage.ug7
            public final void m(eh7 eh7Var, eg7 eg7Var) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case 0:
                        if (eg7Var == eg7.ON_STOP && (window = bVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        yb3 yb3Var = bVar;
                        if (eg7Var == eg7.ON_DESTROY) {
                            yb3Var.b.b = null;
                            if (!yb3Var.isChangingConfigurations()) {
                                yb3Var.w().a();
                            }
                            vb3 vb3Var = yb3Var.Y;
                            yb3 yb3Var2 = vb3Var.o;
                            yb3Var2.getWindow().getDecorView().removeCallbacks(vb3Var);
                            yb3Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(vb3Var);
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.a.a(new ug7() { // from class: pb3
            @Override // defpackage.ug7
            public final void m(eh7 eh7Var, eg7 eg7Var) {
                Window window;
                View viewPeekDecorView;
                switch (i2) {
                    case 0:
                        if (eg7Var == eg7.ON_STOP && (window = bVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        yb3 yb3Var = bVar;
                        if (eg7Var == eg7.ON_DESTROY) {
                            yb3Var.b.b = null;
                            if (!yb3Var.isChangingConfigurations()) {
                                yb3Var.w().a();
                            }
                            vb3 vb3Var = yb3Var.Y;
                            yb3 yb3Var2 = vb3Var.o;
                            yb3Var2.getWindow().getDecorView().removeCallbacks(vb3Var);
                            yb3Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(vb3Var);
                            break;
                        }
                        break;
                }
            }
        });
        this.a.a(new fdc(1, bVar));
        tdVar.s();
        z7.k(this);
        ((mm) tdVar.o).f("android:support:activity-result", new qb3(0, bVar));
        int i3 = 0;
        z(new rb3(bVar, i3));
        this.B0 = new khe(new xb3(bVar, i3));
        this.C0 = new khe(new xb3(bVar, 3));
    }

    public final void A(d16 d16Var) {
        this.w0.add(d16Var);
    }

    public final void B(d16 d16Var) {
        this.x0.add(d16Var);
    }

    public final void C(d16 d16Var) {
        this.u0.add(d16Var);
    }

    public final i3a E() {
        return (i3a) this.C0.getValue();
    }

    public final void F() {
        s5c.Z(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(eyb.view_tree_view_model_store_owner, this);
        wmd.G(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(gyb.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(gyb.report_drawn, this);
    }

    public final void G(Bundle bundle) {
        super.onCreate(bundle);
        int i = bhc.a;
        ju0.y(this);
    }

    public Object H() {
        return null;
    }

    public final void I(Bundle bundle) {
        fg7 fg7Var = fg7.c;
        gh7 gh7Var = this.a;
        gh7Var.c("setCurrentState");
        gh7Var.e(fg7Var);
        super.onSaveInstanceState(bundle);
    }

    public final void J(e16 e16Var) {
        pl8 pl8Var = this.c;
        ((CopyOnWriteArrayList) pl8Var.b).remove(e16Var);
        au1.r(((HashMap) pl8Var.o).remove(e16Var));
        ((Runnable) pl8Var.c).run();
    }

    public final void K(d16 d16Var) {
        this.t0.remove(d16Var);
    }

    public final void L(d16 d16Var) {
        this.w0.remove(d16Var);
    }

    public final void N(d16 d16Var) {
        this.x0.remove(d16Var);
    }

    public final void P(d16 d16Var) {
        this.u0.remove(d16Var);
    }

    @Override // defpackage.eh7
    public final gh7 Q() {
        return this.a;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = zmf.a;
        return l(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        WeakHashMap weakHashMap = zmf.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.gc7
    public final boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.pi6
    public final vnf o() {
        return (vnf) this.B0.getValue();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.s0.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        E().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.t0.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.o.t(bundle);
        jt3 jt3Var = this.b;
        jt3Var.b = this;
        Iterator it = ((CopyOnWriteArraySet) jt3Var.a).iterator();
        while (it.hasNext()) {
            ((n3a) it.next()).a();
        }
        G(bundle);
        int i = bhc.a;
        ju0.y(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((e16) it.next()).a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        boolean z = true;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((e16) it.next()).a.p(menuItem)) {
                break;
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.z0) {
            return;
        }
        Iterator it = this.w0.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(new lg9(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.v0.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((e16) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.A0) {
            return;
        }
        Iterator it = this.x0.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(new tza(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.b).iterator();
        while (it.hasNext()) {
            ((e16) it.next()).a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.s0.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ub3 ub3Var;
        Object objH = H();
        xnf xnfVar = this.X;
        if (xnfVar == null && (ub3Var = (ub3) getLastNonConfigurationInstance()) != null) {
            xnfVar = ub3Var.b;
        }
        if (xnfVar == null && objH == null) {
            return null;
        }
        ub3 ub3Var2 = new ub3();
        ub3Var2.a = objH;
        ub3Var2.b = xnfVar;
        return ub3Var2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        gh7 gh7Var = this.a;
        if (gh7Var instanceof gh7) {
            fg7 fg7Var = fg7.c;
            gh7Var.c("setCurrentState");
            gh7Var.e(fg7Var);
        }
        I(bundle);
        this.o.u(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.u0.iterator();
        while (it.hasNext()) {
            ((tj3) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // defpackage.pi6
    public final wh9 p() {
        wh9 wh9Var = new wh9(0);
        if (getApplication() != null) {
            wh9Var.a(unf.d, getApplication());
        }
        wh9Var.a(z7.e, this);
        wh9Var.a(z7.f, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            wh9Var.a(z7.g, extras);
        }
        return wh9Var;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (hye.a()) {
                Trace.beginSection(c37.F("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            j56 j56Var = (j56) this.Z.getValue();
            synchronized (j56Var.b) {
                try {
                    j56Var.c = true;
                    Iterator it = j56Var.d.iterator();
                    while (it.hasNext()) {
                        ((k56) it.next()).invoke();
                    }
                    j56Var.d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void s(e16 e16Var) {
        pl8 pl8Var = this.c;
        ((CopyOnWriteArrayList) pl8Var.b).add(e16Var);
        ((Runnable) pl8Var.c).run();
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    public final void t(tj3 tj3Var) {
        this.t0.add(tj3Var);
    }

    @Override // defpackage.ynf
    public final xnf w() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.".toString());
        }
        if (this.X == null) {
            ub3 ub3Var = (ub3) getLastNonConfigurationInstance();
            if (ub3Var != null) {
                this.X = ub3Var.b;
            }
            if (this.X == null) {
                this.X = new xnf();
            }
        }
        return this.X;
    }

    @Override // defpackage.isc
    public final mm y() {
        return (mm) this.o.o;
    }

    public final void z(n3a n3aVar) {
        jt3 jt3Var = this.b;
        if (((Context) jt3Var.b) != null) {
            n3aVar.a();
        }
        ((CopyOnWriteArraySet) jt3Var.a).add(n3aVar);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.z0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.z0 = false;
            Iterator it = this.w0.iterator();
            while (it.hasNext()) {
                ((tj3) it.next()).accept(new lg9(z));
            }
        } catch (Throwable th) {
            this.z0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.A0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.A0 = false;
            Iterator it = this.x0.iterator();
            while (it.hasNext()) {
                ((tj3) it.next()).accept(new tza(z));
            }
        } catch (Throwable th) {
            this.A0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        this.Y.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
