package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class sa8 implements t24 {
    public final t24 a;
    public sa4 b;

    public sa8(Context context, Uri uri) {
        this.a = new j94(context);
        G(new a34(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null));
    }

    @Override // defpackage.t24
    public final long G(a34 a34Var) {
        long jG = this.a.G(a34Var);
        this.b = new sa4(this, a34Var.f, jG != -1 ? a34Var.f + jG : jG);
        return jG;
    }

    @Override // defpackage.t24
    public final void H(z0f z0fVar) {
        this.a.H(z0fVar);
    }

    @Override // defpackage.t24
    public final void close() {
        this.b = null;
        try {
            this.a.close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.m24
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }
}
