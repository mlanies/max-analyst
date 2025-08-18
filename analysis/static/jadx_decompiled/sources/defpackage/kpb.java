package defpackage;

import ru.ok.android.externcalls.sdk.audio.ProximityTracker;

/* loaded from: classes.dex */
public final class kpb implements ProximityTracker {
    public final je7 a;

    public kpb(je7 je7Var) {
        this.a = je7Var;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final boolean getCanUseSpeaker() {
        je7 je7Var = this.a;
        return (((jpb) je7Var.getValue()).f == null || ((jpb) je7Var.getValue()).e) ? false : true;
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final void startTrackingProximity() {
        ((jpb) this.a.getValue()).a();
    }

    @Override // ru.ok.android.externcalls.sdk.audio.ProximityTracker
    public final void stopTrackingProximity() {
        ((jpb) this.a.getValue()).b();
    }
}
