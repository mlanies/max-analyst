package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* loaded from: classes2.dex */
public final class zbf implements SystemServicesManager$PushTokenGeneratedListener {
    public final je7 a;
    public final je7 b;

    public zbf(v4 v4Var) {
        this.a = v4Var.d(f5a.class);
        this.b = v4Var.d(pk.class);
    }

    @Override // one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener
    public final void onPushTokenGenerated(String str) {
        oq0 oq0VarC = ((f5a) this.a.getValue()).c();
        if (!oq0VarC.a || oq0VarC.b) {
            return;
        }
        ((k4a) ((pk) this.b.getValue())).s();
    }
}
