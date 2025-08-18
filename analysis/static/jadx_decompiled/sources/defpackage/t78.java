package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class t78 {
    public static void a(b70 b70Var, Object obj) {
        g40 g40Var;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        e84 e84Var = (e84) b70Var;
        if (audioDeviceInfo == null) {
            g40Var = null;
        } else {
            e84Var.getClass();
            g40Var = new g40(audioDeviceInfo);
        }
        e84Var.c0 = g40Var;
        x30 x30Var = e84Var.y;
        if (x30Var != null) {
            x30Var.f(audioDeviceInfo);
        }
        AudioTrack audioTrack = e84Var.w;
        if (audioTrack != null) {
            o74.a(audioTrack, e84Var.c0);
        }
    }
}
