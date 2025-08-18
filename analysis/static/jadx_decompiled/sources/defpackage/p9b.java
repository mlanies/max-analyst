package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class p9b extends gz4 {
    final /* synthetic */ q9b this$0;

    public p9b(q9b q9bVar) {
        this.this$0 = q9bVar;
    }

    @Override // defpackage.gz4, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.gz4, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        q9b q9bVar = this.this$0;
        int i = q9bVar.b - 1;
        q9bVar.b = i;
        if (i == 0) {
            q9bVar.X.postDelayed(q9bVar.Z, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        n9b.a(activity, new o9b(this.this$0));
    }

    @Override // defpackage.gz4, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        q9b q9bVar = this.this$0;
        int i = q9bVar.a - 1;
        q9bVar.a = i;
        if (i == 0 && q9bVar.c) {
            q9bVar.Y.d(eg7.ON_STOP);
            q9bVar.o = true;
        }
    }
}
