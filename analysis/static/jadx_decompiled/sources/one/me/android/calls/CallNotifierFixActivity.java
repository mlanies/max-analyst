package one.me.android.calls;

import android.app.Activity;
import android.os.Bundle;
import defpackage.ty0;
import defpackage.y8a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/calls/CallNotifierFixActivity;", "Landroid/app/Activity;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallNotifierFixActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setShowWhenLocked(true);
        setTurnScreenOn(true);
        ((ty0) y8a.a.getAccessor().c(ty0.class)).a(this, getIntent(), "CallNotifierFixActivity");
        finish();
    }
}
