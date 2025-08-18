package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class m74 {
    public static y50 a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return y50.d;
        }
        x50 x50Var = new x50();
        boolean z2 = oaf.a > 32 && playbackOffloadSupport == 2;
        x50Var.a = true;
        x50Var.b = z2;
        x50Var.c = z;
        return x50Var.a();
    }
}
