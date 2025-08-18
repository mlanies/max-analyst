package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class l74 {
    public static y50 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return y50.d;
        }
        x50 x50Var = new x50();
        x50Var.a = true;
        x50Var.c = z;
        return x50Var.a();
    }
}
