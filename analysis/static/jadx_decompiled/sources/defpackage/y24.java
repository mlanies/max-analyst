package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class y24 {
    public final /* synthetic */ int a;
    public Uri b;
    public long c;
    public int d;
    public byte[] e;
    public Map f;
    public long g;
    public long h;
    public String i;
    public int j;
    public Object k;

    public /* synthetic */ y24(boolean z, int i) {
        this.a = i;
    }

    public z24 a() {
        if (this.b != null) {
            return new z24(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public a34 b() {
        fm9.m(this.b, "The uri must be set.");
        return new a34(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final void c(int i) {
        switch (this.a) {
            case 0:
                this.j = i;
                break;
            default:
                this.j = i;
                break;
        }
    }

    public void d() {
        this.f = kfc.s0;
    }

    public final void e(String str) {
        switch (this.a) {
            case 0:
                this.i = str;
                break;
            default:
                this.i = str;
                break;
        }
    }

    public y24(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = 1;
                this.f = Collections.emptyMap();
                this.h = -1L;
                break;
            default:
                this.d = 1;
                this.f = Collections.emptyMap();
                this.h = -1L;
                break;
        }
    }
}
