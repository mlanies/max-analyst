package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class o30 {
    public static int[] a() {
        ww6 ww6VarI = zw6.i();
        for (int i : s30.e) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                ww6VarI.a(Integer.valueOf(i));
            }
        }
        ww6VarI.a(2);
        return s5c.c0(ww6VarI.j());
    }
}
