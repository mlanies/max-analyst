package defpackage;

import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;

/* loaded from: classes.dex */
public final class pr4 implements tr4 {
    @Override // defpackage.tr4
    public final fr4 a(lr4 lr4Var, qy5 qy5Var) {
        if (qy5Var.r == null) {
            return null;
        }
        return new g35(new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001));
    }

    @Override // defpackage.tr4
    public final void c(Looper looper, j4b j4bVar) {
    }

    @Override // defpackage.tr4
    public final int d(qy5 qy5Var) {
        return qy5Var.r != null ? 1 : 0;
    }
}
