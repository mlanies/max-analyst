package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class p30 {
    public static zw6 a(h30 h30Var) {
        ww6 ww6VarI = zw6.i();
        m5f it = t30.e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue();
            if (oaf.a >= oaf.r(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) h30Var.b().a)) {
                ww6VarI.a(num);
            }
        }
        ww6VarI.a(2);
        return ww6VarI.j();
    }

    public static int b(int i, int i2, h30 h30Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iT = oaf.t(i3);
            if (iT != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iT).build(), (AudioAttributes) h30Var.b().a)) {
                return i3;
            }
        }
        return 0;
    }
}
