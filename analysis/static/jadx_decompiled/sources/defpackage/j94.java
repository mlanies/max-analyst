package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class j94 implements t24 {
    public ut X;
    public vs3 Y;
    public t24 Z;
    public final Context a;
    public final ArrayList b;
    public final t24 c;
    public vg5 o;
    public r4f s0;
    public o24 t0;
    public m5c u0;
    public t24 v0;

    public j94(Context context) {
        this(context, new nb4(null, 8000, 8000, false, new imc(21)));
    }

    public static void c(t24 t24Var, z0f z0fVar) {
        if (t24Var != null) {
            t24Var.H(z0fVar);
        }
    }

    @Override // defpackage.t24
    public final long G(a34 a34Var) {
        fm9.k(this.v0 == null);
        String scheme = a34Var.a.getScheme();
        int i = oaf.a;
        Uri uri = a34Var.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.o == null) {
                    vg5 vg5Var = new vg5(false);
                    this.o = vg5Var;
                    b(vg5Var);
                }
                this.v0 = this.o;
            } else {
                if (this.X == null) {
                    ut utVar = new ut(context);
                    this.X = utVar;
                    b(utVar);
                }
                this.v0 = this.X;
            }
        } else if ("asset".equals(scheme)) {
            if (this.X == null) {
                ut utVar2 = new ut(context);
                this.X = utVar2;
                b(utVar2);
            }
            this.v0 = this.X;
        } else if ("content".equals(scheme)) {
            if (this.Y == null) {
                vs3 vs3Var = new vs3(context);
                this.Y = vs3Var;
                b(vs3Var);
            }
            this.v0 = this.Y;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            t24 t24Var = this.c;
            if (zEquals) {
                if (this.Z == null) {
                    try {
                        t24 t24Var2 = (t24) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.Z = t24Var2;
                        b(t24Var2);
                    } catch (ClassNotFoundException unused) {
                        z04.c0("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.Z == null) {
                        this.Z = t24Var;
                    }
                }
                this.v0 = this.Z;
            } else if ("udp".equals(scheme)) {
                if (this.s0 == null) {
                    r4f r4fVar = new r4f();
                    this.s0 = r4fVar;
                    b(r4fVar);
                }
                this.v0 = this.s0;
            } else if ("data".equals(scheme)) {
                if (this.t0 == null) {
                    o24 o24Var = new o24(false);
                    this.t0 = o24Var;
                    b(o24Var);
                }
                this.v0 = this.t0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.u0 == null) {
                    m5c m5cVar = new m5c(context);
                    this.u0 = m5cVar;
                    b(m5cVar);
                }
                this.v0 = this.u0;
            } else {
                this.v0 = t24Var;
            }
        }
        return this.v0.G(a34Var);
    }

    @Override // defpackage.t24
    public final void H(z0f z0fVar) {
        z0fVar.getClass();
        this.c.H(z0fVar);
        this.b.add(z0fVar);
        c(this.o, z0fVar);
        c(this.X, z0fVar);
        c(this.Y, z0fVar);
        c(this.Z, z0fVar);
        c(this.s0, z0fVar);
        c(this.t0, z0fVar);
        c(this.u0, z0fVar);
    }

    @Override // defpackage.t24
    public final Map a() {
        t24 t24Var = this.v0;
        return t24Var == null ? Collections.emptyMap() : t24Var.a();
    }

    public final void b(t24 t24Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            t24Var.H((z0f) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.t24
    public final void close() {
        t24 t24Var = this.v0;
        if (t24Var != null) {
            try {
                t24Var.close();
            } finally {
                this.v0 = null;
            }
        }
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        t24 t24Var = this.v0;
        if (t24Var == null) {
            return null;
        }
        return t24Var.getUri();
    }

    @Override // defpackage.m24
    public final int read(byte[] bArr, int i, int i2) {
        t24 t24Var = this.v0;
        t24Var.getClass();
        return t24Var.read(bArr, i, i2);
    }

    public j94(Context context, t24 t24Var) {
        this.a = context.getApplicationContext();
        t24Var.getClass();
        this.c = t24Var;
        this.b = new ArrayList();
    }
}
