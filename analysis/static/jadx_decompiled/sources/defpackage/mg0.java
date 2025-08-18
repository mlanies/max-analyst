package defpackage;

import android.app.Activity;

/* loaded from: classes.dex */
public final class mg0 extends fz4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mg0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                ug0 ug0Var = (ug0) this.b;
                ug0Var.d.h();
                ug0Var.e.h();
                break;
            default:
                boolean z = ((lqf) this.b).k;
                if (!((lqf) this.b).k) {
                    hm9.m0("lqf", "set visible=true on onActivityResumed", new Object[0]);
                    ((lqf) this.b).k = true;
                }
                boolean z2 = ((lqf) this.b).l;
                if (!((lqf) this.b).l) {
                    hm9.m0("lqf", "set screenOn=true on onActivityResumed", new Object[0]);
                    ((lqf) this.b).l = true;
                }
                if (!z || !z2) {
                    hm9.m0("lqf", "crutch! call onAppGoesForeground", new Object[0]);
                    ((lqf) this.b).b();
                    break;
                }
        }
    }

    @Override // defpackage.fz4, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                ((lqf) this.b).f++;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, "lqf", "onActivityStarted, visibleActivitiesCount: " + ((lqf) this.b).f, null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.fz4, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                lqf lqfVar = (lqf) this.b;
                lqfVar.f--;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, "lqf", "onActivityStopped, visibleActivitiesCount: " + ((lqf) this.b).f, null);
                }
                if (((lqf) this.b).k) {
                    lqf lqfVar2 = (lqf) this.b;
                    if (lqfVar2.f == 0) {
                        lqfVar2.k = false;
                        ((lqf) this.b).a();
                        break;
                    }
                }
                break;
        }
    }
}
