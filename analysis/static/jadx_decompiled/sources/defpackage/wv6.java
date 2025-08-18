package defpackage;

import android.net.Uri;
import java.io.File;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final class wv6 {
    public final uv6 a;
    public final Uri b;
    public final int c;
    public File d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ju6 h;
    public final jic i;
    public final anc j;
    public final a9b k;
    public final vv6 l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final q6b q;
    public final uhc r;
    public final Boolean s;
    public final bp4 t;
    public final String u;
    public final int v;

    public wv6(xv6 xv6Var) {
        this.a = xv6Var.g;
        Uri uri = xv6Var.a;
        this.b = uri;
        int i = -1;
        if (uri != null) {
            if (e9f.e(uri)) {
                i = 0;
            } else if (uri.getPath() != null && "file".equals(e9f.b(uri))) {
                String strA = ym8.a(uri.getPath());
                i = strA != null ? eae.o0(strA, "video/", false) : false ? 2 : 3;
            } else if ("content".equals(e9f.b(uri))) {
                i = 4;
            } else if ("asset".equals(e9f.b(uri))) {
                i = 5;
            } else if ("res".equals(e9f.b(uri))) {
                i = 6;
            } else if ("data".equals(uri.getScheme())) {
                i = 7;
            } else if ("android.resource".equals(e9f.b(uri))) {
                i = 8;
            }
        }
        this.c = i;
        this.e = xv6Var.h;
        this.f = xv6Var.i;
        this.g = xv6Var.j;
        this.h = xv6Var.f;
        this.i = xv6Var.d;
        anc ancVar = xv6Var.e;
        this.j = ancVar == null ? anc.b : ancVar;
        xv6Var.getClass();
        this.k = xv6Var.k;
        this.l = xv6Var.b;
        boolean z = (xv6Var.c & 48) == 0 && (e9f.e(xv6Var.a) || xv6.c(xv6Var.a));
        this.n = z;
        int i2 = xv6Var.c;
        this.m = !z ? i2 | 48 : i2;
        this.o = (i2 & 15) == 0;
        this.p = xv6Var.m;
        this.q = xv6Var.l;
        this.r = xv6Var.n;
        this.s = xv6Var.o;
        this.t = xv6Var.p;
        this.v = xv6Var.q;
        this.u = xv6Var.r;
    }

    public static wv6 a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return xv6.d(uri).a();
    }

    public static wv6 b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return a(Uri.parse(str));
    }

    public final synchronized File c() {
        try {
            if (this.d == null) {
                this.b.getPath().getClass();
                this.d = new File(this.b.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final boolean d(int i) {
        return (this.m & i) == 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wv6)) {
            return false;
        }
        wv6 wv6Var = (wv6) obj;
        if (this.f != wv6Var.f || this.n != wv6Var.n || this.o != wv6Var.o || !j47.B(this.b, wv6Var.b) || !j47.B(this.a, wv6Var.a) || !j47.B(this.u, wv6Var.u) || !j47.B(this.d, wv6Var.d)) {
            return false;
        }
        wv6Var.getClass();
        if (!j47.B(null, null) || !j47.B(this.h, wv6Var.h) || !j47.B(this.i, wv6Var.i) || !j47.B(this.k, wv6Var.k) || !j47.B(this.l, wv6Var.l) || !j47.B(Integer.valueOf(this.m), Integer.valueOf(wv6Var.m)) || !j47.B(this.p, wv6Var.p) || !j47.B(this.s, wv6Var.s) || !j47.B(this.t, wv6Var.t) || !j47.B(this.j, wv6Var.j) || this.g != wv6Var.g) {
            return false;
        }
        q6b q6bVar = this.q;
        ww0 ww0VarB = q6bVar != null ? q6bVar.b() : null;
        q6b q6bVar2 = wv6Var.q;
        return j47.B(ww0VarB, q6bVar2 != null ? q6bVar2.b() : null) && this.v == wv6Var.v;
    }

    public final int hashCode() {
        q6b q6bVar = this.q;
        return tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(tfg.i(0, this.a), this.b), Boolean.valueOf(this.f)), null), this.k), this.l), Integer.valueOf(this.m)), Boolean.valueOf(this.n)), Boolean.valueOf(this.o)), this.h), this.p), this.i), this.j), q6bVar != null ? q6bVar.b() : null), this.s), this.t), Integer.valueOf(this.v)), Boolean.valueOf(this.g));
    }

    public final String toString() {
        nw4 nw4VarR0 = j47.r0(this);
        nw4VarR0.e(this.b, "uri");
        nw4VarR0.e(this.a, "cacheChoice");
        nw4VarR0.e(this.h, "decodeOptions");
        nw4VarR0.e(this.q, "postprocessor");
        nw4VarR0.e(this.k, LogFactory.PRIORITY_KEY);
        nw4VarR0.e(this.i, "resizeOptions");
        nw4VarR0.e(this.j, "rotationOptions");
        nw4VarR0.e(null, "bytesRange");
        nw4VarR0.e(this.s, "resizingAllowedOverride");
        nw4VarR0.e(this.t, "downsampleOverride");
        nw4VarR0.d("progressiveRenderingEnabled", this.e);
        nw4VarR0.d("localThumbnailPreviewsEnabled", this.f);
        nw4VarR0.d("loadThumbnailOnly", this.g);
        nw4VarR0.e(this.l, "lowestPermittedRequestLevel");
        nw4VarR0.a(this.m, "cachesDisabled");
        nw4VarR0.d("isDiskCacheEnabled", this.n);
        nw4VarR0.d("isMemoryCacheEnabled", this.o);
        nw4VarR0.e(this.p, "decodePrefetches");
        nw4VarR0.a(this.v, "delayMs");
        return nw4VarR0.toString();
    }
}
