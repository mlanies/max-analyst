package defpackage;

import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* loaded from: classes.dex */
public final class i6a implements SystemServicesManager$PushTokenGeneratedListener {
    public final /* synthetic */ k6a a;

    public i6a(k6a k6aVar) {
        this.a = k6aVar;
    }

    @Override // one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener
    public final void onPushTokenGenerated(String str) {
        k6a k6aVar = this.a;
        k6aVar.i.m(null, k6aVar.e());
    }
}
