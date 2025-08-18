package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.util.UUID;

/* loaded from: classes.dex */
public final class g35 implements fr4 {
    public final DrmSession$DrmSessionException a;

    public g35(DrmSession$DrmSessionException drmSession$DrmSessionException) {
        this.a = drmSession$DrmSessionException;
    }

    @Override // defpackage.fr4
    public final UUID a() {
        return ew0.a;
    }

    @Override // defpackage.fr4
    public final boolean b() {
        return false;
    }

    @Override // defpackage.fr4
    public final boolean c(String str) {
        return false;
    }

    @Override // defpackage.fr4
    public final DrmSession$DrmSessionException d() {
        return this.a;
    }

    @Override // defpackage.fr4
    public final qz3 e() {
        return null;
    }

    @Override // defpackage.fr4
    public final void f(lr4 lr4Var) {
    }

    @Override // defpackage.fr4
    public final void g(lr4 lr4Var) {
    }

    @Override // defpackage.fr4
    public final int getState() {
        return 1;
    }
}
