package defpackage;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class n9b {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
