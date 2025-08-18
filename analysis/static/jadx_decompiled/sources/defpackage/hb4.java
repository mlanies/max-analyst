package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import androidx.work.WorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class hb4 implements co7, do7 {
    public static final av1 A0 = new av1();
    public static final av1 B0 = new av1();
    public Uri X;
    public boolean Y;
    public Handler o;
    public final Object s0;
    public final Object t0;
    public final Object u0;
    public Object v0;
    public Object w0;
    public Object x0;
    public Object y0;
    public Object z0;
    public final /* synthetic */ int a = 0;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final HashMap b = new HashMap();
    public long Z = -9223372036854775807L;

    public hb4(gaa gaaVar, buc bucVar, dn6 dn6Var) {
        this.s0 = gaaVar;
        this.t0 = dn6Var;
        this.u0 = bucVar;
    }

    @Override // defpackage.do7
    public b11 C(go7 go7Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        bqa bqaVar = (bqa) go7Var;
        long j3 = bqaVar.a;
        Uri uri = bqaVar.o.c;
        yn7 yn7Var = new yn7(j2);
        ((huc) this.u0).getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i2 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        boolean z = jMin == -9223372036854775807L;
        ((jn) this.v0).C(yn7Var, bqaVar.c, iOException, z);
        return z ? vq7.Z : new b11(jMin, 0, 5, false);
    }

    public pm6 a(Uri uri, boolean z) {
        HashMap map = this.b;
        pm6 pm6Var = ((fb4) map.get(uri)).o;
        if (pm6Var != null && z && !uri.equals(this.X)) {
            List list = ((xm6) this.y0).e;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (uri.equals(((vm6) list.get(i)).a)) {
                    pm6 pm6Var2 = (pm6) this.z0;
                    if (pm6Var2 == null || !pm6Var2.o) {
                        this.X = uri;
                        fb4 fb4Var = (fb4) map.get(uri);
                        pm6 pm6Var3 = fb4Var.o;
                        if (pm6Var3 == null || !pm6Var3.o) {
                            fb4Var.c(c(uri));
                        } else {
                            this.z0 = pm6Var3;
                            ((rm6) ((hn6) this.x0)).q(pm6Var3);
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return pm6Var;
    }

    public qm6 b(Uri uri, boolean z) {
        HashMap map = this.b;
        qm6 qm6Var = ((gb4) map.get(uri)).o;
        if (qm6Var != null && z) {
            if (!uri.equals(this.X)) {
                List list = ((ym6) this.y0).e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((wm6) list.get(i)).a)) {
                        qm6 qm6Var2 = (qm6) this.z0;
                        if (qm6Var2 == null || !qm6Var2.o) {
                            this.X = uri;
                            gb4 gb4Var = (gb4) map.get(uri);
                            qm6 qm6Var3 = gb4Var.o;
                            if (qm6Var3 == null || !qm6Var3.o) {
                                gb4Var.e(c(uri));
                            } else {
                                this.z0 = qm6Var3;
                                ((sm6) ((in6) this.x0)).v(qm6Var3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            gb4 gb4Var2 = (gb4) map.get(uri);
            qm6 qm6Var4 = gb4Var2.o;
            if (!gb4Var2.v0) {
                gb4Var2.v0 = true;
                if (qm6Var4 != null && !qm6Var4.o) {
                    gb4Var2.c(true);
                }
            }
        }
        return qm6Var;
    }

    public final Uri c(Uri uri) {
        im6 im6Var;
        jm6 jm6Var;
        switch (this.a) {
            case 0:
                pm6 pm6Var = (pm6) this.z0;
                if (pm6Var == null || !pm6Var.v.e || (im6Var = (im6) pm6Var.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder builderBuildUpon = uri.buildUpon();
                builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(im6Var.b));
                int i = im6Var.c;
                if (i != -1) {
                    builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
                }
                return builderBuildUpon.build();
            default:
                qm6 qm6Var = (qm6) this.z0;
                if (qm6Var == null || !qm6Var.v.e || (jm6Var = (jm6) qm6Var.t.get(uri)) == null) {
                    return uri;
                }
                Uri.Builder builderBuildUpon2 = uri.buildUpon();
                builderBuildUpon2.appendQueryParameter("_HLS_msn", String.valueOf(jm6Var.b));
                int i2 = jm6Var.c;
                if (i2 != -1) {
                    builderBuildUpon2.appendQueryParameter("_HLS_part", String.valueOf(i2));
                }
                return builderBuildUpon2.build();
        }
    }

    public final boolean d(Uri uri) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                fb4 fb4Var = (fb4) this.b.get(uri);
                if (fb4Var.o != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long jMax = Math.max(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, maf.M(fb4Var.o.u));
                    pm6 pm6Var = fb4Var.o;
                    if (pm6Var.o || (i = pm6Var.d) == 2 || i == 1 || fb4Var.X + jMax > jElapsedRealtime) {
                        break;
                    }
                }
                break;
            default:
                gb4 gb4Var = (gb4) this.b.get(uri);
                if (gb4Var.o != null) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long jMax2 = Math.max(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, oaf.h0(gb4Var.o.u));
                    qm6 qm6Var = gb4Var.o;
                    if (qm6Var.o || (i2 = qm6Var.d) == 2 || i2 == 1 || gb4Var.X + jMax2 > jElapsedRealtime2) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // defpackage.do7
    public void m(go7 go7Var, long j, long j2, boolean z) {
        bqa bqaVar = (bqa) go7Var;
        long j3 = bqaVar.a;
        Uri uri = bqaVar.o.c;
        yn7 yn7Var = new yn7(j2);
        ((huc) this.u0).getClass();
        ((jn) this.v0).x(yn7Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.co7
    public void o(fo7 fo7Var, long j, long j2, boolean z) {
        aqa aqaVar = (aqa) fo7Var;
        long j3 = aqaVar.a;
        t1e t1eVar = aqaVar.o;
        xn7 xn7Var = new xn7(j3, aqaVar.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        ((buc) this.u0).getClass();
        ((gk8) this.v0).d(xn7Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.do7
    public void v(go7 go7Var, long j, long j2) {
        ym6 ym6Var;
        bqa bqaVar = (bqa) go7Var;
        an6 an6Var = (an6) bqaVar.Y;
        boolean z = an6Var instanceof qm6;
        if (z) {
            String str = an6Var.a;
            ym6 ym6Var2 = ym6.l;
            Uri uri = Uri.parse(str);
            ny5 ny5Var = new ny5();
            ny5Var.a = "0";
            ny5Var.l = ia9.l("application/x-mpegURL");
            ym6Var = new ym6("", Collections.emptyList(), Collections.singletonList(new wm6(uri, new qy5(ny5Var), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            ym6Var = (ym6) an6Var;
        }
        this.y0 = ym6Var;
        this.X = ((wm6) ym6Var.e.get(0)).a;
        this.c.add(new eb4(this));
        List list = ym6Var.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list.get(i);
            this.b.put(uri2, new gb4(this, uri2));
        }
        Uri uri3 = bqaVar.o.c;
        yn7 yn7Var = new yn7(j2);
        gb4 gb4Var = (gb4) this.b.get(this.X);
        if (z) {
            gb4Var.f((qm6) an6Var, yn7Var);
        } else {
            gb4Var.c(false);
        }
        ((huc) this.u0).getClass();
        ((jn) this.v0).z(yn7Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.co7
    public void y(fo7 fo7Var, long j, long j2) {
        xm6 xm6Var;
        aqa aqaVar = (aqa) fo7Var;
        zm6 zm6Var = (zm6) aqaVar.Y;
        boolean z = zm6Var instanceof pm6;
        if (z) {
            String str = zm6Var.a;
            xm6 xm6Var2 = xm6.n;
            Uri uri = Uri.parse(str);
            my5 my5Var = new my5();
            my5Var.a = "0";
            my5Var.j = "application/x-mpegURL";
            xm6Var = new xm6("", Collections.emptyList(), Collections.singletonList(new vm6(uri, new oy5(my5Var), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            xm6Var = (xm6) zm6Var;
        }
        this.y0 = xm6Var;
        this.X = ((vm6) xm6Var.e.get(0)).a;
        this.c.add(new db4(this));
        List list = xm6Var.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list.get(i);
            this.b.put(uri2, new fb4(this, uri2));
        }
        long j3 = aqaVar.a;
        z24 z24Var = aqaVar.b;
        t1e t1eVar = aqaVar.o;
        xn7 xn7Var = new xn7(j3, z24Var, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        fb4 fb4Var = (fb4) this.b.get(this.X);
        if (z) {
            fb4Var.d((pm6) zm6Var);
        } else {
            fb4Var.c(fb4Var.a);
        }
        ((buc) this.u0).getClass();
        ((gk8) this.v0).f(xn7Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.co7
    public b11 z(fo7 fo7Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        aqa aqaVar = (aqa) fo7Var;
        long j3 = aqaVar.a;
        t1e t1eVar = aqaVar.o;
        xn7 xn7Var = new xn7(j3, aqaVar.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        ((buc) this.u0).getClass();
        if ((iOException instanceof com.google.android.exoplayer2.ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException) || (iOException instanceof com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i2 = com.google.android.exoplayer2.upstream.DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof com.google.android.exoplayer2.upstream.DataSourceException) && ((com.google.android.exoplayer2.upstream.DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        boolean z = jMin == -9223372036854775807L;
        ((gk8) this.v0).i(xn7Var, aqaVar.c, iOException, z);
        return z ? jo7.Y : jo7.e(jMin, false);
    }

    public hb4(w4d w4dVar, huc hucVar, en6 en6Var) {
        this.s0 = w4dVar;
        this.t0 = en6Var;
        this.u0 = hucVar;
    }
}
