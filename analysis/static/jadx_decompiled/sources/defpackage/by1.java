package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class by1 implements cne {
    public final wma a;
    public static final aa0 b = new aa0(av1.class, null, "camerax.core.appConfig.cameraFactoryProvider");
    public static final aa0 c = new aa0(bv1.class, null, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final aa0 o = new aa0(av1.class, null, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final aa0 X = new aa0(Executor.class, null, "camerax.core.appConfig.cameraExecutor");
    public static final aa0 Y = new aa0(Handler.class, null, "camerax.core.appConfig.schedulerHandler");
    public static final aa0 Z = new aa0(Integer.TYPE, null, "camerax.core.appConfig.minimumLoggingLevel");
    public static final aa0 s0 = new aa0(px1.class, null, "camerax.core.appConfig.availableCamerasLimiter");
    public static final aa0 t0 = new aa0(Long.TYPE, null, "camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming");
    public static final aa0 u0 = new aa0(akc.class, null, "camerax.core.appConfig.cameraProviderInitRetryPolicy");
    public static final aa0 v0 = new aa0(wrb.class, null, "camerax.core.appConfig.quirksSettings");

    public by1(wma wmaVar) {
        this.a = wmaVar;
    }

    public final px1 a() {
        Object objH;
        aa0 aa0Var = s0;
        wma wmaVar = this.a;
        wmaVar.getClass();
        try {
            objH = wmaVar.h(aa0Var);
        } catch (IllegalArgumentException unused) {
            objH = null;
        }
        return (px1) objH;
    }

    public final av1 b() {
        Object objH;
        aa0 aa0Var = b;
        wma wmaVar = this.a;
        wmaVar.getClass();
        try {
            objH = wmaVar.h(aa0Var);
        } catch (IllegalArgumentException unused) {
            objH = null;
        }
        return (av1) objH;
    }

    public final long c() {
        aa0 aa0Var = t0;
        Object objH = -1L;
        wma wmaVar = this.a;
        wmaVar.getClass();
        try {
            objH = wmaVar.h(aa0Var);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objH).longValue();
    }

    public final bv1 d() {
        Object objH;
        aa0 aa0Var = c;
        wma wmaVar = this.a;
        wmaVar.getClass();
        try {
            objH = wmaVar.h(aa0Var);
        } catch (IllegalArgumentException unused) {
            objH = null;
        }
        return (bv1) objH;
    }

    @Override // defpackage.t7c
    public final ce3 getConfig() {
        return this.a;
    }

    public final av1 j() {
        Object objH;
        aa0 aa0Var = o;
        wma wmaVar = this.a;
        wmaVar.getClass();
        try {
            objH = wmaVar.h(aa0Var);
        } catch (IllegalArgumentException unused) {
            objH = null;
        }
        return (av1) objH;
    }
}
