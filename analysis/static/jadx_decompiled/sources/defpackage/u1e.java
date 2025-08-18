package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class u1e implements t24 {
    public final t24 a;
    public long b;
    public Uri c;

    public u1e(t24 t24Var) {
        t24Var.getClass();
        this.a = t24Var;
        this.c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // defpackage.t24
    public final long G(a34 a34Var) {
        this.c = a34Var.a;
        Collections.emptyMap();
        t24 t24Var = this.a;
        long jG = t24Var.G(a34Var);
        Uri uri = t24Var.getUri();
        uri.getClass();
        this.c = uri;
        t24Var.a();
        return jG;
    }

    @Override // defpackage.t24
    public final void H(z0f z0fVar) {
        z0fVar.getClass();
        this.a.H(z0fVar);
    }

    @Override // defpackage.t24
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.t24
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.m24
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += i3;
        }
        return i3;
    }
}
