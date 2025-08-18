package defpackage;

import android.app.Activity;

/* loaded from: classes.dex */
public final class o9b extends gz4 {
    final /* synthetic */ q9b this$0;

    public o9b(q9b q9bVar) {
        this.this$0 = q9bVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        q9b q9bVar = this.this$0;
        int i = q9bVar.a + 1;
        q9bVar.a = i;
        if (i == 1 && q9bVar.o) {
            q9bVar.Y.d(eg7.ON_START);
            q9bVar.o = false;
        }
    }
}
