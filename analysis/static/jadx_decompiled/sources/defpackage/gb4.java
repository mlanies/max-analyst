package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class gb4 implements do7 {
    public long X;
    public long Y;
    public long Z;
    public final Uri a;
    public final vq7 b = new vq7("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final t24 c;
    public qm6 o;
    public long s0;
    public boolean t0;
    public IOException u0;
    public boolean v0;
    public final /* synthetic */ hb4 w0;

    public gb4(hb4 hb4Var, Uri uri) {
        this.w0 = hb4Var;
        this.a = uri;
        this.c = ((q24) ((w4d) hb4Var.s0).b).a();
    }

    public static boolean a(gb4 gb4Var, long j) {
        gb4Var.s0 = SystemClock.elapsedRealtime() + j;
        hb4 hb4Var = gb4Var.w0;
        if (!gb4Var.a.equals(hb4Var.X)) {
            return false;
        }
        List list = ((ym6) hb4Var.y0).e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            gb4 gb4Var2 = (gb4) hb4Var.b.get(((wm6) list.get(i)).a);
            gb4Var2.getClass();
            if (jElapsedRealtime > gb4Var2.s0) {
                Uri uri = gb4Var2.a;
                hb4Var.X = uri;
                gb4Var2.e(hb4Var.c(uri));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // defpackage.do7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b11 C(defpackage.go7 r8, long r9, long r11, java.io.IOException r13, int r14) {
        /*
            r7 = this;
            bqa r8 = (defpackage.bqa) r8
            yn7 r9 = new yn7
            long r0 = r8.a
            u1e r10 = r8.o
            android.net.Uri r10 = r10.c
            r9.<init>(r11)
            java.lang.String r11 = "_HLS_msn"
            java.lang.String r10 = r10.getQueryParameter(r11)
            r3 = 0
            r11 = 1
            if (r10 == 0) goto L19
            r10 = r11
            goto L1a
        L19:
            r10 = r3
        L1a:
            boolean r12 = r13 instanceof androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException
            b11 r0 = defpackage.vq7.Y
            hb4 r6 = r7.w0
            int r8 = r8.c
            if (r10 != 0) goto L26
            if (r12 == 0) goto L3e
        L26:
            boolean r10 = r13 instanceof androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException
            if (r10 == 0) goto L30
            r10 = r13
            androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException r10 = (androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException) r10
            int r10 = r10.o
            goto L33
        L30:
            r10 = 2147483647(0x7fffffff, float:NaN)
        L33:
            if (r12 != 0) goto L94
            r12 = 400(0x190, float:5.6E-43)
            if (r10 == r12) goto L94
            r12 = 503(0x1f7, float:7.05E-43)
            if (r10 != r12) goto L3e
            goto L94
        L3e:
            wn7 r10 = new wn7
            r10.<init>(r14, r13)
            java.util.concurrent.CopyOnWriteArrayList r12 = r6.c
            java.util.Iterator r12 = r12.iterator()
            r14 = r3
        L4a:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r12.next()
            gn6 r1 = (defpackage.gn6) r1
            android.net.Uri r2 = r7.a
            boolean r1 = r1.c(r2, r10, r3)
            r1 = r1 ^ r11
            r14 = r14 | r1
            goto L4a
        L5f:
            java.lang.Object r7 = r6.u0
            huc r7 = (defpackage.huc) r7
            if (r14 == 0) goto L82
            r7.getClass()
            long r1 = defpackage.huc.q(r10)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 == 0) goto L7f
            b11 r10 = new b11
            r4 = 5
            r5 = 0
            r0 = r10
            r0.<init>(r1, r3, r4, r5)
        L7d:
            r0 = r10
            goto L82
        L7f:
            b11 r10 = defpackage.vq7.Z
            goto L7d
        L82:
            boolean r10 = r0.a()
            r10 = r10 ^ r11
            java.lang.Object r11 = r6.v0
            jn r11 = (defpackage.jn) r11
            r11.C(r9, r8, r13, r10)
            if (r10 == 0) goto La6
            r7.getClass()
            goto La6
        L94:
            long r1 = android.os.SystemClock.elapsedRealtime()
            r7.Z = r1
            r7.c(r3)
            java.lang.Object r7 = r6.v0
            jn r7 = (defpackage.jn) r7
            int r10 = defpackage.oaf.a
            r7.C(r9, r8, r13, r11)
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb4.C(go7, long, long, java.io.IOException, int):b11");
    }

    public final Uri b() {
        qm6 qm6Var = this.o;
        Uri uri = this.a;
        if (qm6Var != null) {
            om6 om6Var = qm6Var.v;
            if (om6Var.a != -9223372036854775807L || om6Var.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                qm6 qm6Var2 = this.o;
                if (qm6Var2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(qm6Var2.k + qm6Var2.r.size()));
                    qm6 qm6Var3 = this.o;
                    if (qm6Var3.n != -9223372036854775807L) {
                        zw6 zw6Var = qm6Var3.s;
                        int size = zw6Var.size();
                        if (!zw6Var.isEmpty() && ((hm6) mqd.m(zw6Var)).x0) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                om6 om6Var2 = this.o.v;
                if (om6Var2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", om6Var2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        e(z ? b() : this.a);
    }

    public final void d(Uri uri) {
        hb4 hb4Var = this.w0;
        bqa bqaVar = new bqa(this.c, uri, 4, ((en6) hb4Var.t0).i((ym6) hb4Var.y0, this.o));
        huc hucVar = (huc) hb4Var.u0;
        int i = bqaVar.c;
        ((jn) hb4Var.v0).F(new yn7(bqaVar.a, bqaVar.b, this.b.v(bqaVar, this, hucVar.p(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        this.s0 = 0L;
        if (this.t0) {
            return;
        }
        vq7 vq7Var = this.b;
        if (vq7Var.o() || vq7Var.n()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.Z;
        if (jElapsedRealtime >= j) {
            d(uri);
        } else {
            this.t0 = true;
            this.w0.o.postDelayed(new wt1(this, 22, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.qm6 r65, defpackage.yn7 r66) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb4.f(qm6, yn7):void");
    }

    @Override // defpackage.do7
    public final void m(go7 go7Var, long j, long j2, boolean z) {
        bqa bqaVar = (bqa) go7Var;
        long j3 = bqaVar.a;
        Uri uri = bqaVar.o.c;
        yn7 yn7Var = new yn7(j2);
        hb4 hb4Var = this.w0;
        ((huc) hb4Var.u0).getClass();
        ((jn) hb4Var.v0).x(yn7Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.do7
    public final void v(go7 go7Var, long j, long j2) {
        bqa bqaVar = (bqa) go7Var;
        an6 an6Var = (an6) bqaVar.Y;
        Uri uri = bqaVar.o.c;
        yn7 yn7Var = new yn7(j2);
        if (an6Var instanceof qm6) {
            f((qm6) an6Var, yn7Var);
            ((jn) this.w0.v0).z(yn7Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException parserExceptionB = ParserException.b(null, "Loaded playlist has unexpected type.");
            this.u0 = parserExceptionB;
            ((jn) this.w0.v0).C(yn7Var, 4, parserExceptionB, true);
        }
        ((huc) this.w0.u0).getClass();
    }
}
