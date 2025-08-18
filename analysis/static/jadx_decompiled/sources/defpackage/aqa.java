package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class aqa implements fo7 {
    public final ypa X;
    public volatile Object Y;
    public final long a;
    public final z24 b;
    public final int c;
    public final t1e o;

    public aqa(r24 r24Var, Uri uri, int i, ypa ypaVar) {
        Map mapEmptyMap = Collections.emptyMap();
        if (uri == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        z24 z24Var = new z24(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.o = new t1e(r24Var);
        this.b = z24Var;
        this.c = i;
        this.X = ypaVar;
        this.a = xn7.h.getAndIncrement();
    }

    @Override // defpackage.fo7
    public final void a() {
    }

    @Override // defpackage.fo7
    public final void load() throws IOException {
        this.o.b = 0L;
        w24 w24Var = new w24(this.o, this.b);
        try {
            w24Var.m();
            Uri uri = this.o.a.getUri();
            uri.getClass();
            this.Y = this.X.g(uri, w24Var);
        } finally {
            maf.h(w24Var);
        }
    }
}
