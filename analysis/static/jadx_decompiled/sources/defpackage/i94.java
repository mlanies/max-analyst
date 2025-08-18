package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class i94 implements r24 {
    public tt X;
    public us3 Y;
    public r24 Z;
    public final Context a;
    public final ArrayList b;
    public final r24 c;
    public ug5 o;
    public q4f s0;
    public n24 t0;
    public l5c u0;
    public r24 v0;

    public i94(Context context, r24 r24Var) {
        this.a = context.getApplicationContext();
        r24Var.getClass();
        this.c = r24Var;
        this.b = new ArrayList();
    }

    public static void c(r24 r24Var, y0f y0fVar) {
        if (r24Var != null) {
            r24Var.N(y0fVar);
        }
    }

    @Override // defpackage.r24
    public final long L(z24 z24Var) {
        np8.f(this.v0 == null);
        String scheme = z24Var.a.getScheme();
        int i = maf.a;
        Uri uri = z24Var.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.o == null) {
                    ug5 ug5Var = new ug5(false);
                    this.o = ug5Var;
                    b(ug5Var);
                }
                this.v0 = this.o;
            } else {
                if (this.X == null) {
                    tt ttVar = new tt(context);
                    this.X = ttVar;
                    b(ttVar);
                }
                this.v0 = this.X;
            }
        } else if ("asset".equals(scheme)) {
            if (this.X == null) {
                tt ttVar2 = new tt(context);
                this.X = ttVar2;
                b(ttVar2);
            }
            this.v0 = this.X;
        } else if ("content".equals(scheme)) {
            if (this.Y == null) {
                us3 us3Var = new us3(context);
                this.Y = us3Var;
                b(us3Var);
            }
            this.v0 = this.Y;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            r24 r24Var = this.c;
            if (zEquals) {
                if (this.Z == null) {
                    try {
                        r24 r24Var2 = (r24) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.Z = r24Var2;
                        b(r24Var2);
                    } catch (ClassNotFoundException unused) {
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.Z == null) {
                        this.Z = r24Var;
                    }
                }
                this.v0 = this.Z;
            } else if ("udp".equals(scheme)) {
                if (this.s0 == null) {
                    q4f q4fVar = new q4f();
                    this.s0 = q4fVar;
                    b(q4fVar);
                }
                this.v0 = this.s0;
            } else if ("data".equals(scheme)) {
                if (this.t0 == null) {
                    n24 n24Var = new n24(false);
                    this.t0 = n24Var;
                    b(n24Var);
                }
                this.v0 = this.t0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.u0 == null) {
                    l5c l5cVar = new l5c(context);
                    this.u0 = l5cVar;
                    b(l5cVar);
                }
                this.v0 = this.u0;
            } else {
                this.v0 = r24Var;
            }
        }
        return this.v0.L(z24Var);
    }

    @Override // defpackage.r24
    public final void N(y0f y0fVar) {
        y0fVar.getClass();
        this.c.N(y0fVar);
        this.b.add(y0fVar);
        c(this.o, y0fVar);
        c(this.X, y0fVar);
        c(this.Y, y0fVar);
        c(this.Z, y0fVar);
        c(this.s0, y0fVar);
        c(this.t0, y0fVar);
        c(this.u0, y0fVar);
    }

    @Override // defpackage.r24
    public final Map a() {
        r24 r24Var = this.v0;
        return r24Var == null ? Collections.emptyMap() : r24Var.a();
    }

    public final void b(r24 r24Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            r24Var.N((y0f) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.r24
    public final void close() {
        r24 r24Var = this.v0;
        if (r24Var != null) {
            try {
                r24Var.close();
            } finally {
                this.v0 = null;
            }
        }
    }

    @Override // defpackage.r24
    public final Uri getUri() {
        r24 r24Var = this.v0;
        if (r24Var == null) {
            return null;
        }
        return r24Var.getUri();
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) {
        r24 r24Var = this.v0;
        r24Var.getClass();
        return r24Var.read(bArr, i, i2);
    }
}
