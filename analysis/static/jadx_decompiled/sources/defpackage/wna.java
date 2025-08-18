package defpackage;

import android.hardware.camera2.params.OutputConfiguration;

/* loaded from: classes.dex */
public final class wna extends vna {
    @Override // defpackage.vna
    public final Object c() {
        Object obj = this.a;
        c54.k(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // defpackage.vna
    public final void e(long j) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j);
    }

    @Override // defpackage.vna
    public final void f(int i) {
        ((OutputConfiguration) c()).setMirrorMode(i);
    }

    @Override // defpackage.vna
    public final void h(long j) {
        if (j == -1) {
            return;
        }
        ((OutputConfiguration) c()).setStreamUseCase(j);
    }
}
