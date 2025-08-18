package defpackage;

import android.util.Size;
import java.util.List;

/* loaded from: classes.dex */
public interface ev6 extends t7c {
    public static final aa0 B = new aa0(ft.class, null, "camerax.core.imageOutput.targetAspectRatio");
    public static final aa0 C;
    public static final aa0 D;
    public static final aa0 E;
    public static final aa0 F;
    public static final aa0 G;
    public static final aa0 H;
    public static final aa0 I;
    public static final aa0 J;
    public static final aa0 K;

    static {
        Class cls = Integer.TYPE;
        C = new aa0(cls, null, "camerax.core.imageOutput.targetRotation");
        D = new aa0(cls, null, "camerax.core.imageOutput.appTargetRotation");
        E = new aa0(cls, null, "camerax.core.imageOutput.mirrorMode");
        F = new aa0(Size.class, null, "camerax.core.imageOutput.targetResolution");
        G = new aa0(Size.class, null, "camerax.core.imageOutput.defaultResolution");
        H = new aa0(Size.class, null, "camerax.core.imageOutput.maxResolution");
        I = new aa0(List.class, null, "camerax.core.imageOutput.supportedResolutions");
        J = new aa0(kic.class, null, "camerax.core.imageOutput.resolutionSelector");
        K = new aa0(List.class, null, "camerax.core.imageOutput.customOrderedResolutions");
    }

    static void e0(ev6 ev6Var) {
        boolean zO = ev6Var.o(B);
        boolean z = ((Size) ev6Var.f(F, null)) != null;
        if (zO && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (((kic) ev6Var.f(J, null)) != null) {
            if (zO || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int f0(int i) {
        return ((Integer) f(C, Integer.valueOf(i))).intValue();
    }
}
