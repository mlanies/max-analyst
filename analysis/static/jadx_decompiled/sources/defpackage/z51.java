package defpackage;

import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;

/* loaded from: classes.dex */
public final class z51 implements um1 {
    public final /* synthetic */ iab a;

    public z51(iab iabVar) {
        this.a = iabVar;
    }

    @Override // defpackage.um1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (connectedInfo.isFirstConnection()) {
            return;
        }
        ((fab) this.a).n(f51.c);
    }

    @Override // defpackage.um1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        ((fab) this.a).n(g51.c);
    }
}
