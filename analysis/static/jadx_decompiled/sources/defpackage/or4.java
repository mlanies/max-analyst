package defpackage;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;

/* loaded from: classes.dex */
public final class or4 implements sr4 {
    @Override // defpackage.sr4
    public final er4 a(kr4 kr4Var, oy5 oy5Var) {
        if (oy5Var.z0 == null) {
            return null;
        }
        return new f35(new DrmSession$DrmSessionException(new UnsupportedDrmException(), 6001));
    }

    @Override // defpackage.sr4
    public final int b(oy5 oy5Var) {
        return oy5Var.z0 != null ? 1 : 0;
    }

    @Override // defpackage.sr4
    public final void c(Looper looper, i4b i4bVar) {
    }
}
