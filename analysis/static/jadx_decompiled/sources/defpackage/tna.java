package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class tna {
    public final vna a;

    public tna(int i, Surface surface) {
        if (Build.VERSION.SDK_INT >= 33) {
            this.a = new wna(new OutputConfiguration(i, surface));
        } else {
            this.a = new vna(new una(new OutputConfiguration(i, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tna)) {
            return false;
        }
        return this.a.equals(((tna) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public tna(OutputConfiguration outputConfiguration) {
        this.a = new wna(outputConfiguration);
    }

    public tna(vna vnaVar) {
        this.a = vnaVar;
    }
}
