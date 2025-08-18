package defpackage;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public abstract class c30 {
    public static void a(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }
}
