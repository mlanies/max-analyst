package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.media3.muxer.Muxer$MuxerException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h36 implements fj9 {
    public static final ffc s0;
    public static final ffc t0;
    public g36 X;
    public boolean Y;
    public boolean Z;
    public final MediaMuxer a;
    public final long b;
    public final HashMap c = new HashMap();
    public final HashMap o = new HashMap();

    static {
        ww6 ww6Var = new ww6(4);
        ww6Var.b("video/avc", "video/3gpp", "video/mp4v-es");
        int i = oaf.a;
        if (i >= 24) {
            ww6Var.a("video/hevc");
        }
        if (i >= 34) {
            ww6Var.a("video/av01");
        }
        s0 = ww6Var.j();
        Object[] objArr = {"audio/mp4a-latm", "audio/3gpp", "audio/amr-wb"};
        c54.n(3, objArr);
        t0 = zw6.h(3, objArr);
    }

    public h36(MediaMuxer mediaMuxer, long j) {
        this.a = mediaMuxer;
        this.b = oaf.S(j);
    }

    public static void a(MediaMuxer mediaMuxer) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            mediaMuxer.stop();
        } catch (RuntimeException e) {
            if (oaf.a < 30) {
                try {
                    Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    Integer num = (Integer) declaredField.get(mediaMuxer);
                    num.getClass();
                    Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(mediaMuxer, num);
                } catch (Exception unused) {
                }
            }
            throw e;
        }
    }

    @Override // defpackage.fj9
    public final void close() throws Muxer$MuxerException {
        if (this.Z) {
            return;
        }
        boolean z = this.Y;
        MediaMuxer mediaMuxer = this.a;
        if (!z) {
            try {
                mediaMuxer.start();
                this.Y = true;
            } catch (RuntimeException e) {
                throw new Muxer$MuxerException("Failed to start the muxer", e);
            }
        }
        if (this.b != -9223372036854775807L && this.X != null) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            bufferInfo.set(0, 0, this.b, 4);
            g36 g36Var = this.X;
            g36Var.getClass();
            f(g36Var, ByteBuffer.allocateDirect(0), bufferInfo);
        }
        this.Y = false;
        try {
            try {
                a(mediaMuxer);
            } catch (RuntimeException e2) {
                throw new Muxer$MuxerException("Failed to stop the MediaMuxer", e2);
            }
        } finally {
            mediaMuxer.release();
            this.Z = true;
        }
    }

    @Override // defpackage.fj9
    public final void e(d99 d99Var) {
        if (d99Var instanceof ae9) {
            ae9 ae9Var = (ae9) d99Var;
            this.a.setLocation(ae9Var.a, ae9Var.b);
        }
    }

    @Override // defpackage.fj9
    public final void f(g36 g36Var, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws Muxer$MuxerException {
        long j = bufferInfo.presentationTimeUs;
        long j2 = this.b;
        if (j2 == -9223372036854775807L || g36Var != this.X || j <= j2) {
            boolean z = this.Y;
            HashMap map = this.o;
            MediaMuxer mediaMuxer = this.a;
            if (!z) {
                if (oaf.a < 30 && j < 0) {
                    map.put(g36Var, Long.valueOf(-j));
                }
                try {
                    mediaMuxer.start();
                    this.Y = true;
                } catch (RuntimeException e) {
                    throw new Muxer$MuxerException("Failed to start the muxer", e);
                }
            }
            long jLongValue = map.containsKey(g36Var) ? ((Long) map.get(g36Var)).longValue() : 0L;
            long j3 = j + jLongValue;
            HashMap map2 = this.c;
            long jLongValue2 = map2.containsKey(g36Var) ? ((Long) map2.get(g36Var)).longValue() : 0L;
            boolean z2 = oaf.a > 24 || j3 >= jLongValue2;
            StringBuilder sbK = au1.k(j3, "Samples not in presentation order (", " < ");
            sbK.append(jLongValue2);
            sbK.append(") unsupported on this API version");
            fm9.j(sbK.toString(), z2);
            map2.put(g36Var, Long.valueOf(j3));
            boolean z3 = jLongValue == 0 || j3 >= jLongValue2;
            StringBuilder sbK2 = au1.k(j3, "Samples not in presentation order (", " < ");
            sbK2.append(jLongValue2);
            sbK2.append(") unsupported when using negative PTS workaround");
            fm9.j(sbK2.toString(), z3);
            bufferInfo.set(bufferInfo.offset, bufferInfo.size, j3, bufferInfo.flags);
            try {
                fm9.k(g36Var instanceof g36);
                mediaMuxer.writeSampleData(g36Var.a, byteBuffer, bufferInfo);
            } catch (RuntimeException e2) {
                StringBuilder sbK3 = au1.k(j3, "Failed to write sample for presentationTimeUs=", ", size=");
                sbK3.append(bufferInfo.size);
                throw new Muxer$MuxerException(sbK3.toString(), e2);
            }
        }
    }

    @Override // defpackage.fj9
    public final g36 i(qy5 qy5Var) throws Muxer$MuxerException {
        MediaFormat mediaFormatCreateAudioFormat;
        int i = qy5Var.w;
        String str = qy5Var.n;
        str.getClass();
        boolean zK = ia9.k(str);
        MediaMuxer mediaMuxer = this.a;
        if (zK) {
            mediaFormatCreateAudioFormat = MediaFormat.createVideoFormat(str, qy5Var.t, qy5Var.u);
            j47.W(mediaFormatCreateAudioFormat, qy5Var.A);
            try {
                mediaMuxer.setOrientationHint(i);
            } catch (RuntimeException e) {
                throw new Muxer$MuxerException(zr6.h(i, "Failed to set orientation hint with rotationDegrees="), e);
            }
        } else {
            mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, qy5Var.C, qy5Var.B);
            String str2 = qy5Var.d;
            if (str2 != null) {
                mediaFormatCreateAudioFormat.setString("language", str2);
            }
        }
        j47.k0(mediaFormatCreateAudioFormat, qy5Var.q);
        try {
            g36 g36Var = new g36(mediaMuxer.addTrack(mediaFormatCreateAudioFormat));
            if (zK) {
                this.X = g36Var;
            }
            return g36Var;
        } catch (RuntimeException e2) {
            throw new Muxer$MuxerException("Failed to add track with format=" + qy5Var, e2);
        }
    }
}
