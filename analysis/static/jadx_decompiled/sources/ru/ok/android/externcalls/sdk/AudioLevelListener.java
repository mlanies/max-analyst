package ru.ok.android.externcalls.sdk;

import android.os.Handler;
import defpackage.uoa;
import defpackage.w4g;
import defpackage.z99;

/* loaded from: classes2.dex */
public class AudioLevelListener implements z99 {
    private final Handler handler;
    private boolean isActive;
    private final w4g noise;
    private final Runnable reporter;
    private final short triggerDiff;

    public AudioLevelListener(short s, Handler handler, Runnable runnable) {
        w4g w4gVar = new w4g();
        w4gVar.a = Float.NaN;
        this.noise = w4gVar;
        this.isActive = true;
        this.reporter = runnable;
        this.triggerDiff = s;
        this.handler = handler;
        w4gVar.a = Float.isNaN(w4gVar.a) ? 0.0f : 0.0f + (0.95f * w4gVar.a);
    }

    public void listen() {
        this.isActive = true;
    }

    @Override // defpackage.z99
    public void onSample(int i, int i2, int i3, uoa uoaVar) {
        if (this.isActive) {
            float f = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
            for (int i4 = 0; i4 < uoaVar.a; i4++) {
                float fAbs = Math.abs((int) uoaVar.a(i4));
                f = Float.isNaN(f) ? fAbs : (0.3f * fAbs) + (0.7f * f);
                w4g w4gVar = this.noise;
                if (!Float.isNaN(w4gVar.a)) {
                    fAbs = (fAbs * 0.05f) + (0.95f * w4gVar.a);
                }
                w4gVar.a = fAbs;
                if (f - this.noise.a > this.triggerDiff) {
                    this.handler.post(this.reporter);
                    return;
                }
            }
        }
    }

    public void stop() {
        this.isActive = false;
    }
}
