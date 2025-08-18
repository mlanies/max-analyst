package defpackage;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class o74 {
    public static void a(AudioTrack audioTrack, g40 g40Var) {
        audioTrack.setPreferredDevice(g40Var == null ? null : g40Var.a);
    }
}
