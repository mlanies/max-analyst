package ru.ok.android.externcalls.sdk.video.internal;

import defpackage.hi9;
import defpackage.ji9;
import defpackage.kd1;
import defpackage.py0;
import defpackage.sq1;
import defpackage.ssa;
import defpackage.u38;
import defpackage.w51;
import defpackage.yn1;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/ScreenCaptureManagerImpl;", "Lru/ok/android/externcalls/sdk/video/ScreenCaptureManager;", "Lpy0;", "call", "<init>", "(Lpy0;)V", "", "enabled", "isFastScreenShareEnabled", "Le5f;", "setScreenCaptureEnabled", "(ZZ)V", "setAudioCaptureEnabled", "(Z)V", "Lpy0;", "isScreenCaptureEnabled", "()Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ScreenCaptureManagerImpl implements ScreenCaptureManager {
    private final py0 call;

    public ScreenCaptureManagerImpl(py0 py0Var) {
        this.call = py0Var;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public boolean isScreenCaptureEnabled() {
        return this.call.y1.b;
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public void setAudioCaptureEnabled(boolean enabled) {
        this.call.D(enabled);
    }

    @Override // ru.ok.android.externcalls.sdk.video.ScreenCaptureManager
    public void setScreenCaptureEnabled(boolean enabled, boolean isFastScreenShareEnabled) {
        py0 py0Var = this.call;
        if (py0Var.i() && py0Var.i()) {
            if (enabled) {
                py0Var.v("rtc.screencapture.enabled");
            }
            kd1 kd1Var = py0Var.L1;
            kd1Var.getClass();
            if (!enabled || kd1.d(new sq1(0, 2, hi9.class, kd1Var.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;"))) {
                ji9 ji9Var = py0Var.y1;
                if (ji9Var.b != enabled) {
                    ji9Var.b = enabled;
                    ji9Var.c = isFastScreenShareEnabled;
                    ji9Var.a();
                    py0Var.x();
                    py0Var.k(w51.X, null);
                }
                yn1 yn1Var = py0Var.t1;
                if (yn1Var != null) {
                    ssa ssaVar = (!ji9Var.b || py0Var.d2) ? py0Var.m2 : py0Var.l2;
                    if (ssaVar != null) {
                        if (yn1Var.I()) {
                            yn1 yn1Var2 = py0Var.t1;
                            yn1Var2.B0 = ssaVar;
                            u38 u38Var = yn1Var2.x0;
                            if (u38Var != null) {
                                u38Var.e(ssaVar);
                            }
                        } else {
                            yn1 yn1Var3 = py0Var.t1;
                            yn1Var3.B0 = ssaVar;
                            u38 u38Var2 = yn1Var3.x0;
                            if (u38Var2 != null) {
                                u38Var2.e(ssaVar);
                            } else {
                                yn1Var3.U(ssaVar);
                            }
                        }
                    }
                }
            }
        }
        if (enabled) {
            return;
        }
        py0Var.D(false);
    }
}
