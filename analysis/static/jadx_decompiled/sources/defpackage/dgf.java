package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class dgf {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            fm9.c("Failed to call Surface.setFrameRate", e);
        }
    }
}
