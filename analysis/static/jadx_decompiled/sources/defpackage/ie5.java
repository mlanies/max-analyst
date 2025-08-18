package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class ie5 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ie5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity, Bundle bundle) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void k(Activity activity) {
    }

    private final void l(Activity activity) {
    }

    private final void m(Activity activity) {
    }

    private final void n(Activity activity) {
    }

    private final void o(Activity activity, Bundle bundle) {
    }

    private final void p(Activity activity, Bundle bundle) {
    }

    private final void q(Activity activity, Bundle bundle) {
    }

    private final void r(Activity activity, Bundle bundle) {
    }

    private final void s(Activity activity) {
    }

    private final void t(Activity activity) {
    }

    private final void u(Activity activity) {
    }

    private final void v(Activity activity) {
    }

    private final void w(Activity activity) {
    }

    private final void x(Activity activity) {
    }

    private final void y(Activity activity) {
    }

    private final void z(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                ArrayDeque arrayDeque = (ArrayDeque) this.b;
                                if (arrayDeque.contains(string)) {
                                    break;
                                } else {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException unused) {
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null && "1".equals(bundle2.getString("google.c.a.tc"))) {
                            fl5 fl5VarB = fl5.b();
                            fl5VarB.a();
                            au1.r(fl5VarB.d.a(bd.class));
                        }
                        m6d.w("_no", bundle2);
                        break;
                    }
                }
                break;
            case 1:
                vmc vmcVar = vmc.a;
                vmc.b.add(new qw3(2, (zaa) this.b));
                View decorView = activity.getWindow().getDecorView();
                ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                if (viewGroup != null) {
                    viewGroup.setOnHierarchyChangeListener(vmcVar);
                }
                pk5 pk5Var = new pk5(v3c.F(ys.Q(new View[]{activity.getWindow().getDecorView().getRootView()}), new ww9(7), new ww9()));
                while (pk5Var.hasNext()) {
                    View view = (View) pk5Var.next();
                    ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup2 != null) {
                        viewGroup2.setOnHierarchyChangeListener(vmcVar);
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ((rta) this.b).b.h();
                break;
            default:
                int i = Build.VERSION.SDK_INT;
                aua auaVar = (aua) this.b;
                if (i >= 33) {
                    auaVar.d.h();
                }
                auaVar.e.h();
                auaVar.f.h();
                if (i >= 34) {
                    auaVar.g.h();
                }
                auaVar.h.h();
                auaVar.i.h();
                auaVar.j.h();
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i = this.a;
    }

    public ie5() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }
}
