package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class t1e implements r24 {
    public final r24 a;
    public long b;
    public Uri c;
    public Map o;

    public t1e(r24 r24Var) {
        r24Var.getClass();
        this.a = r24Var;
        this.c = Uri.EMPTY;
        this.o = Collections.emptyMap();
    }

    @Override // defpackage.r24
    public final long L(z24 z24Var) {
        this.c = z24Var.a;
        this.o = Collections.emptyMap();
        r24 r24Var = this.a;
        long jL = r24Var.L(z24Var);
        Uri uri = r24Var.getUri();
        uri.getClass();
        this.c = uri;
        this.o = r24Var.a();
        return jL;
    }

    @Override // defpackage.r24
    public final void N(y0f y0fVar) {
        y0fVar.getClass();
        this.a.N(y0fVar);
    }

    @Override // defpackage.r24
    public final Map a() {
        return this.a.a();
    }

    @Override // defpackage.r24
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.r24
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += i3;
        }
        return i3;
    }
}
