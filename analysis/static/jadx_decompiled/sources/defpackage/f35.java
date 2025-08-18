package defpackage;

import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* loaded from: classes.dex */
public final class f35 implements er4 {
    public final DrmSession$DrmSessionException a;

    public f35(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.a = drmSession$DrmSessionException;
    }

    @Override // defpackage.er4
    public final UUID a() {
        return bw0.a;
    }

    @Override // defpackage.er4
    public final boolean b() {
        return false;
    }

    @Override // defpackage.er4
    public final boolean c(String str) {
        return false;
    }

    @Override // defpackage.er4
    public final DrmSession$DrmSessionException d() {
        return this.a;
    }

    @Override // defpackage.er4
    public final pz3 e() {
        return null;
    }

    @Override // defpackage.er4
    public final void f(kr4 kr4Var) {
    }

    @Override // defpackage.er4
    public final void g(kr4 kr4Var) {
    }

    @Override // defpackage.er4
    public final int getState() {
        return 1;
    }
}
