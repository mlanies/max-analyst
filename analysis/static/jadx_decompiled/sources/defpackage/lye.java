package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class lye implements Application.ActivityLifecycleCallbacks {
    public final kbd a;
    public int b;

    public lye(kbd kbdVar) {
        this.a = kbdVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            this.a.e(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.b == 0) {
            this.a.e(false);
        }
        this.b++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
