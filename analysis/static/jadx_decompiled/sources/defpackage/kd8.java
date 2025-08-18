package defpackage;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class kd8 implements gd {
    public jn A0;
    public jn B0;
    public qy5 C0;
    public qy5 D0;
    public qy5 E0;
    public boolean F0;
    public int G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public boolean L0;
    public final Context a;
    public final zc4 b;
    public final PlaybackSession c;
    public String t0;
    public PlaybackMetrics.Builder u0;
    public int v0;
    public PlaybackException y0;
    public jn z0;
    public final kue X = new kue();
    public final hue Y = new hue();
    public final HashMap s0 = new HashMap();
    public final HashMap Z = new HashMap();
    public final long o = SystemClock.elapsedRealtime();
    public int w0 = 0;
    public int x0 = 0;

    public kd8(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        zc4 zc4Var = new zc4();
        this.b = zc4Var;
        zc4Var.d = this;
    }

    @Override // defpackage.gd
    public final void A(fd fdVar, p3b p3bVar, p3b p3bVar2, int i) {
        if (i == 1) {
            this.F0 = true;
        }
        this.v0 = i;
    }

    @Override // defpackage.gd
    public final void J(fd fdVar, n54 n54Var) {
        this.I0 += n54Var.h;
        this.J0 += n54Var.f;
    }

    @Override // defpackage.gd
    public final void L(fd fdVar, int i, long j) {
        yj8 yj8Var = fdVar.d;
        if (yj8Var != null) {
            String strC = this.b.c(fdVar.b, yj8Var);
            HashMap map = this.s0;
            Long l = (Long) map.get(strC);
            HashMap map2 = this.Z;
            Long l2 = (Long) map2.get(strC);
            map.put(strC, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strC, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:256:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04ca  */
    @Override // defpackage.gd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(defpackage.q3b r25, defpackage.imc r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd8.N(q3b, imc):void");
    }

    @Override // defpackage.gd
    public final void R(fd fdVar, pc8 pc8Var, IOException iOException, boolean z) {
        this.G0 = pc8Var.a;
    }

    @Override // defpackage.gd
    public final void T(fd fdVar, jlf jlfVar) {
        jn jnVar = this.z0;
        if (jnVar != null) {
            qy5 qy5Var = (qy5) jnVar.c;
            if (qy5Var.u == -1) {
                ny5 ny5VarA = qy5Var.a();
                ny5VarA.s = jlfVar.a;
                ny5VarA.t = jlfVar.b;
                int i = 15;
                this.z0 = new jn(jnVar.b, i, ny5VarA.a(), (String) jnVar.o);
            }
        }
    }

    @Override // defpackage.gd
    public final void W(fd fdVar, pc8 pc8Var) {
        yj8 yj8Var = fdVar.d;
        if (yj8Var == null) {
            return;
        }
        qy5 qy5Var = (qy5) pc8Var.g;
        qy5Var.getClass();
        yj8Var.getClass();
        jn jnVar = new jn(pc8Var.c, 15, qy5Var, this.b.c(fdVar.b, yj8Var));
        int i = pc8Var.b;
        if (i != 0) {
            if (i == 1) {
                this.A0 = jnVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.B0 = jnVar;
                return;
            }
        }
        this.z0 = jnVar;
    }

    public final boolean a(jn jnVar) {
        String str;
        if (jnVar != null) {
            String str2 = (String) jnVar.o;
            zc4 zc4Var = this.b;
            synchronized (zc4Var) {
                str = zc4Var.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.u0;
        if (builder != null && this.L0) {
            builder.setAudioUnderrunCount(this.K0);
            this.u0.setVideoFramesDropped(this.I0);
            this.u0.setVideoFramesPlayed(this.J0);
            Long l = (Long) this.Z.get(this.t0);
            this.u0.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.s0.get(this.t0);
            this.u0.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.u0.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.c.reportPlaybackMetrics(this.u0.build());
        }
        this.u0 = null;
        this.t0 = null;
        this.K0 = 0;
        this.I0 = 0;
        this.J0 = 0;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.L0 = false;
    }

    public final void c(mue mueVar, yj8 yj8Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.u0;
        if (yj8Var == null || (iB = mueVar.b(yj8Var.a)) == -1) {
            return;
        }
        hue hueVar = this.Y;
        int i = 0;
        mueVar.g(iB, hueVar, false);
        int i2 = hueVar.c;
        kue kueVar = this.X;
        mueVar.o(i2, kueVar);
        ib8 ib8Var = kueVar.c.b;
        if (ib8Var != null) {
            int iJ = oaf.J(ib8Var.a, ib8Var.b);
            i = iJ != 0 ? iJ != 1 ? iJ != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (kueVar.m != -9223372036854775807L && !kueVar.k && !kueVar.i && !kueVar.a()) {
            builder.setMediaDurationMillis(oaf.h0(kueVar.m));
        }
        builder.setPlaybackType(kueVar.a() ? 2 : 1);
        this.L0 = true;
    }

    public final void d(fd fdVar, String str) {
        yj8 yj8Var = fdVar.d;
        if ((yj8Var == null || !yj8Var.b()) && str.equals(this.t0)) {
            b();
        }
        this.Z.remove(str);
        this.s0.remove(str);
    }

    public final void e(int i, long j, qy5 qy5Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = jd8.i(i).setTimeSinceCreatedMillis(j - this.o);
        if (qy5Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = qy5Var.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = qy5Var.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = qy5Var.j;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = qy5Var.i;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = qy5Var.t;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = qy5Var.u;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = qy5Var.B;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = qy5Var.C;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = qy5Var.d;
            if (str4 != null) {
                int i9 = oaf.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = qy5Var.v;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.L0 = true;
        this.c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override // defpackage.gd
    public final void m0(fd fdVar, PlaybackException playbackException) {
        this.y0 = playbackException;
    }
}
