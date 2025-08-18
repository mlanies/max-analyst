package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes.dex */
public final class v30 extends AudioDeviceCallback {
    public final /* synthetic */ x30 a;

    public v30(x30 x30Var) {
        this.a = x30Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        x30 x30Var = this.a;
        x30Var.d(t30.b((Context) x30Var.b, (h30) x30Var.u0, (g40) x30Var.t0));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        x30 x30Var = this.a;
        if (oaf.m(audioDeviceInfoArr, (g40) x30Var.t0)) {
            x30Var.t0 = null;
        }
        x30Var.d(t30.b((Context) x30Var.b, (h30) x30Var.u0, (g40) x30Var.t0));
    }
}
