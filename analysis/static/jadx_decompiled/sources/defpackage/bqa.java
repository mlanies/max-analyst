package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class bqa implements go7 {
    public final zpa X;
    public volatile Object Y;
    public final long a;
    public final a34 b;
    public final int c;
    public final u1e o;

    public bqa(t24 t24Var, Uri uri, int i, zpa zpaVar) {
        Map mapEmptyMap = Collections.emptyMap();
        fm9.m(uri, "The uri must be set.");
        a34 a34Var = new a34(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.o = new u1e(t24Var);
        this.b = a34Var;
        this.c = i;
        this.X = zpaVar;
        this.a = yn7.b.getAndIncrement();
    }

    @Override // defpackage.go7
    public final void a() {
    }

    @Override // defpackage.go7
    public final void load() throws IOException {
        this.o.b = 0L;
        w24 w24Var = new w24(this.o, this.b);
        try {
            w24Var.m();
            Uri uri = this.o.a.getUri();
            uri.getClass();
            this.Y = this.X.a(uri, w24Var);
        } finally {
            oaf.h(w24Var);
        }
    }
}
