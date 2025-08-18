package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.transformer.ExportException;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.client.methods.HttpPost;

/* loaded from: classes2.dex */
public final class bkb implements o05, dke, p1f, pgf, wne {
    public final Object a;
    public Object b;
    public Object c;

    public /* synthetic */ bkb(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.pgf
    public void F(long j) {
    }

    @Override // defpackage.qgf
    public void a() {
        ((p1f) this.a).a();
    }

    @Override // defpackage.o05
    public void b(EncodeException encodeException) {
        ((lq1) this.a).d(encodeException);
    }

    @Override // defpackage.pgf
    public void c(VideoFrameProcessingException videoFrameProcessingException) {
        ((pj3) this.b).accept(new ExportException("Video frame processing error", videoFrameProcessingException, 5001));
    }

    @Override // defpackage.o05
    public void d() {
        ((lq1) this.a).b(null);
    }

    @Override // defpackage.dke
    public void e(gle gleVar) {
        tle tleVar = (tle) this.c;
        long j = ((ol) this.a).a;
        CopyOnWriteArraySet copyOnWriteArraySet = tleVar.o;
        boolean zContains = copyOnWriteArraySet.contains(Long.valueOf(j));
        if (zContains) {
            copyOnWriteArraySet.remove(Long.valueOf(j));
            ((eoe) tleVar.X.getValue()).d(j);
        }
        if (zContains) {
            hm9.n(tle.B0, "executeTask: cancelling task after processing with requestId=" + ((ol) this.a).a);
            return;
        }
        if (!((ExecutorService) ((tle) this.c).y0.getValue()).isShutdown()) {
            if (((lme) this.b).b().a.get()) {
                return;
            }
            ((ExecutorService) ((tle) this.c).y0.getValue()).execute(new ple(this, (ol) this.a, (lme) this.b, gleVar));
            return;
        }
        ol olVar = (ol) this.a;
        if (olVar instanceof ju7) {
            tle tleVar2 = (tle) this.c;
            tleVar2.getClass();
            if (!(olVar instanceof ju7) || tleVar2.b == null) {
                return;
            }
            hm9.k(tle.B0, "countDownSyncLogoutLatch");
            tleVar2.b.countDown();
        }
    }

    @Override // defpackage.p1f
    public sf6 f(int i) {
        return ((p1f) this.a).f(i);
    }

    @Override // defpackage.dke
    public void g(pke pkeVar) {
        if (((ExecutorService) ((tle) this.c).y0.getValue()).isShutdown() || ((lme) this.b).b().a.get()) {
            return;
        }
        ((ExecutorService) ((tle) this.c).y0.getValue()).execute(new qle(this, (lme) this.b, (ol) this.a, pkeVar));
    }

    @Override // defpackage.pgf
    public void h(long j) {
        ((flf) this.c).i = j;
        try {
            ((flf) this.c).f.b();
        } catch (ExportException e) {
            ((pj3) this.b).accept(e);
        }
    }

    @Override // defpackage.dke
    public long i() {
        return ((ol) this.a).a;
    }

    @Override // defpackage.o05
    public void j(d05 d05Var) throws Exception {
        adc adcVar = (adc) this.c;
        MediaMuxer mediaMuxer = adcVar.C;
        nb0 nb0Var = (nb0) this.b;
        if (mediaMuxer != null) {
            try {
                adcVar.K(d05Var, nb0Var);
                d05Var.close();
                return;
            } catch (Throwable th) {
                try {
                    d05Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (adcVar.r) {
            d05Var.close();
            return;
        }
        d05 d05Var2 = adcVar.U;
        if (d05Var2 != null) {
            d05Var2.close();
            adcVar.U = null;
        }
        if (!d05Var.I()) {
            d15 d15Var = (d15) adcVar.F;
            d15Var.h.execute(new r05(d15Var, 3));
            d05Var.close();
        } else {
            adcVar.U = d05Var;
            if (adcVar.n() && adcVar.V.g()) {
                return;
            }
            adcVar.C(nb0Var);
        }
    }

    @Override // defpackage.qgf
    public boolean k() {
        return ((p1f) this.a).k();
    }

    @Override // defpackage.qgf
    public void m(jee jeeVar) {
        ((p1f) this.a).m(jeeVar);
    }

    @Override // defpackage.o05
    public void n(q64 q64Var) {
        ((adc) this.c).G = q64Var;
    }

    @Override // defpackage.pgf
    public void o(int i, int i2) {
        jee jeeVarA;
        try {
            jeeVarA = ((flf) this.c).f.a(i, i2);
        } catch (ExportException e) {
            ((pj3) this.b).accept(e);
            jeeVarA = null;
        }
        m(jeeVarA);
    }

    public void p() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec mediaCodec = (MediaCodec) this.a;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, WorkRequest.MIN_BACKOFF_MILLIS);
        if (iDequeueOutputBuffer != -3) {
            xef xefVar = (xef) this.b;
            if (iDequeueOutputBuffer == -2) {
                if (xefVar != null) {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    ej9 ej9Var = xefVar.c;
                    ej9Var.a = ((MediaMuxer) ej9Var.f).addTrack(outputFormat);
                    return;
                }
                return;
            }
            if (iDequeueOutputBuffer == -1 || iDequeueOutputBuffer < 0) {
                return;
            }
            if (bufferInfo.size > 0 && xefVar != null) {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(iDequeueOutputBuffer);
                if ((bufferInfo.flags & 2) == 0) {
                    float f = (float) (((int) (((bufferInfo.presentationTimeUs / (xefVar.y - xefVar.x)) * 100.0d) * 100.0d)) / 100.0d);
                    qj3 qj3Var = (qj3) xefVar.w.b;
                    if (qj3Var != null) {
                        try {
                            qj3Var.accept(Float.valueOf(f));
                        } catch (Throwable th) {
                            hm9.p("ada", "convertVideo: progress accept failed", th);
                        }
                    }
                }
                ej9 ej9Var2 = xefVar.c;
                if (ej9Var2.b()) {
                    boolean z = ej9Var2.c;
                    MediaMuxer mediaMuxer = (MediaMuxer) ej9Var2.f;
                    if (!z) {
                        mediaMuxer.start();
                        ej9Var2.c = true;
                    }
                    ej9Var2.a();
                    mediaMuxer.writeSampleData(ej9Var2.a, outputBuffer, bufferInfo);
                } else {
                    ((ArrayList) ej9Var2.g).add(new dj9(ej9Var2.a, outputBuffer, bufferInfo));
                }
            }
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            if ((bufferInfo.flags & 4) == 0 || xefVar == null) {
                return;
            }
            MediaCodec mediaCodec2 = (MediaCodec) xefVar.h.a;
            if (mediaCodec2 != null) {
                mediaCodec2.stop();
            }
            MediaCodec mediaCodec3 = (MediaCodec) xefVar.h.a;
            if (mediaCodec3 != null) {
                mediaCodec3.release();
            }
            xefVar.g.a();
            ((MediaMuxer) xefVar.c.f).stop();
            ((MediaMuxer) xefVar.c.f).release();
            xefVar.l = true;
        }
    }

    public void q(ffc ffcVar, hd6 hd6Var) throws VideoFrameProcessingException, GlUtil$GlException {
        bkb bkbVar = this;
        ffc ffcVar2 = ffcVar;
        if (((cd6) bkbVar.c) == null) {
            try {
                cd6 cd6Var = new cd6((Context) bkbVar.a, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                bkbVar.c = cd6Var;
                cd6Var.o(new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f});
                ((cd6) bkbVar.c).q("uTexTransformationMatrix", mr0.l());
            } catch (IOException e) {
                throw new VideoFrameProcessingException(e);
            }
        }
        int i = hd6Var.b;
        int i2 = hd6Var.c;
        int i3 = hd6Var.d;
        mr0.u(i, i2, i3);
        lsd lsdVar = new lsd(i2, i3);
        fl2 fl2Var = (fl2) bkbVar.b;
        fl2Var.j = lsdVar;
        mr0.h();
        cd6 cd6Var2 = (cd6) bkbVar.c;
        cd6Var2.getClass();
        cd6Var2.w();
        int i4 = 3042;
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        mr0.f();
        int i5 = ffcVar2.o - 1;
        while (i5 >= 0) {
            if4 if4Var = (if4) ffcVar2.get(i5);
            cd6 cd6Var3 = (cd6) bkbVar.c;
            cd6Var3.getClass();
            hd6 hd6Var2 = if4Var.b;
            cd6Var3.u(hd6Var2.a, 0, "uTexSampler");
            lsd lsdVar2 = new lsd(hd6Var2.c, hd6Var2.d);
            float[] fArr = (float[]) fl2Var.b;
            Matrix.setIdentityM(fArr, 0);
            float[] fArr2 = (float[]) fl2Var.a;
            Matrix.setIdentityM(fArr2, 0);
            float[] fArr3 = (float[]) fl2Var.e;
            Matrix.setIdentityM(fArr3, 0);
            float[] fArr4 = (float[]) fl2Var.c;
            Matrix.setIdentityM(fArr4, 0);
            float[] fArr5 = (float[]) fl2Var.d;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.setIdentityM((float[]) fl2Var.f, 0);
            float[] fArr6 = (float[]) fl2Var.g;
            Matrix.setIdentityM(fArr6, 0);
            float[] fArr7 = (float[]) fl2Var.h;
            Matrix.setIdentityM(fArr7, 0);
            float[] fArr8 = (float[]) fl2Var.i;
            Matrix.setIdentityM(fArr8, 0);
            k8g k8gVar = if4Var.d;
            Pair pair = (Pair) k8gVar.a;
            int i6 = i5;
            Matrix.translateM(fArr2, 0, ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), 0.0f);
            fm9.l((lsd) fl2Var.j);
            float f = lsdVar2.a;
            lsd lsdVar3 = (lsd) fl2Var.j;
            float f2 = lsdVar2.b;
            Matrix.scaleM(fArr, 0, f / lsdVar3.a, f2 / lsdVar3.b, 1.0f);
            Pair pair2 = (Pair) k8gVar.c;
            Matrix.scaleM(fArr4, 0, ((Float) pair2.first).floatValue(), ((Float) pair2.second).floatValue(), 1.0f);
            Matrix.invertM(fArr5, 0, fArr4, 0);
            Pair pair3 = (Pair) k8gVar.b;
            Matrix.translateM(fArr3, 0, ((Float) pair3.first).floatValue() * (-1.0f), ((Float) pair3.second).floatValue() * (-1.0f), 0.0f);
            Matrix.rotateM((float[]) fl2Var.f, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            Matrix.scaleM(fArr6, 0, f2 / f, 1.0f, 1.0f);
            Matrix.invertM(fArr7, 0, fArr6, 0);
            float[] fArr9 = (float[]) fl2Var.i;
            Matrix.multiplyMM(fArr9, 0, fArr9, 0, (float[]) fl2Var.a, 0);
            float[] fArr10 = (float[]) fl2Var.i;
            Matrix.multiplyMM(fArr10, 0, fArr10, 0, (float[]) fl2Var.b, 0);
            float[] fArr11 = (float[]) fl2Var.i;
            Matrix.multiplyMM(fArr11, 0, fArr11, 0, (float[]) fl2Var.c, 0);
            float[] fArr12 = (float[]) fl2Var.i;
            Matrix.multiplyMM(fArr12, 0, fArr12, 0, (float[]) fl2Var.e, 0);
            float[] fArr13 = (float[]) fl2Var.i;
            Matrix.multiplyMM(fArr13, 0, fArr13, 0, (float[]) fl2Var.d, 0);
            float[] fArr14 = (float[]) fl2Var.i;
            Matrix.multiplyMM(fArr14, 0, fArr14, 0, (float[]) fl2Var.g, 0);
            float[] fArr15 = (float[]) fl2Var.i;
            Matrix.multiplyMM(fArr15, 0, fArr15, 0, (float[]) fl2Var.f, 0);
            float[] fArr16 = (float[]) fl2Var.i;
            Matrix.multiplyMM(fArr16, 0, fArr16, 0, (float[]) fl2Var.h, 0);
            float[] fArr17 = (float[]) fl2Var.i;
            Matrix.multiplyMM(fArr17, 0, fArr17, 0, (float[]) fl2Var.c, 0);
            cd6Var3.q("uTransformationMatrix", fArr8);
            cd6Var3.p("uAlphaScale", 1.0f);
            cd6Var3.h();
            GLES20.glDrawArrays(5, 0, 4);
            mr0.f();
            ffcVar2 = ffcVar;
            i5 = i6 - 1;
            i4 = 3042;
            bkbVar = this;
        }
        GLES20.glDisable(i4);
        mr0.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.akb
            if (r0 == 0) goto L13
            r0 = r10
            akb r0 = (defpackage.akb) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            akb r0 = new akb
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 0
            java.lang.String r5 = "app.profile_migration_complete"
            r6 = 1
            if (r2 == 0) goto L37
            if (r2 != r6) goto L2f
            bkb r9 = r0.o
            defpackage.od2.a0(r10)
            goto La3
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.a
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r10 = r10.getValue()
            q33 r10 = (defpackage.q33) r10
            t33 r10 = (defpackage.t33) r10
            ne7 r10 = r10.g
            r2 = 0
            boolean r10 = r10.getBoolean(r5, r2)
            java.lang.Class<bkb> r2 = defpackage.bkb.class
            if (r10 == 0) goto L68
            java.lang.String r9 = r2.getName()
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L5a
            goto L67
        L5a:
            boolean r0 = r10.c()
            if (r0 == 0) goto L67
            us7 r0 = defpackage.us7.X
            java.lang.String r1 = "profile migration already complete"
            r10.d(r0, r9, r1, r4)
        L67:
            return r3
        L68:
            java.lang.String r10 = r2.getName()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L71
            goto L7e
        L71:
            boolean r7 = r2.c()
            if (r7 == 0) goto L7e
            us7 r7 = defpackage.us7.X
            java.lang.String r8 = "start profile migration"
            r2.d(r7, r10, r8, r4)
        L7e:
            java.lang.Object r10 = r9.b
            je7 r10 = (defpackage.je7) r10
            java.lang.Object r10 = r10.getValue()
            ds3 r10 = (defpackage.ds3) r10
            java.lang.Object r2 = r9.a
            je7 r2 = (defpackage.je7) r2
            java.lang.Object r2 = r2.getValue()
            q33 r2 = (defpackage.q33) r2
            hyc r2 = (defpackage.hyc) r2
            long r7 = r2.t()
            r0.o = r9
            r0.Z = r6
            java.lang.Comparable r10 = r10.b(r7, r0)
            if (r10 != r1) goto La3
            return r1
        La3:
            uj3 r10 = (defpackage.uj3) r10
            if (r10 == 0) goto Lcb
            java.lang.Object r0 = r9.c
            je7 r0 = (defpackage.je7) r0
            java.lang.Object r0 = r0.getValue()
            blb r0 = (defpackage.blb) r0
            kotlinx.coroutines.internal.ContextScope r1 = r0.c
            alb r2 = new alb
            r2.<init>(r10, r0, r4)
            r10 = 3
            defpackage.j47.T(r1, r4, r4, r2, r10)
            java.lang.Object r9 = r9.a
            je7 r9 = (defpackage.je7) r9
            java.lang.Object r9 = r9.getValue()
            q33 r9 = (defpackage.q33) r9
            t33 r9 = (defpackage.t33) r9
            r9.j(r5, r6)
        Lcb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkb.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.qgf
    public void release() {
        ((p1f) this.a).release();
    }

    public ThreadFactory s(String str, Integer num) {
        return (ThreadFactory) ((ConcurrentHashMap) this.c).computeIfAbsent(str, new di(14, new lr1(str, this, num, 9)));
    }

    public synchronized void t(qs0 qs0Var) {
        try {
            qs0 qs0Var2 = qs0Var.a;
            qs0 qs0Var3 = qs0Var.d;
            if (qs0Var2 != null) {
                qs0Var2.d = qs0Var3;
            }
            if (qs0Var3 != null) {
                qs0Var3.a = qs0Var2;
            }
            qs0Var.a = null;
            qs0Var.d = null;
            if (qs0Var == ((qs0) this.b)) {
                this.b = qs0Var3;
            }
            if (qs0Var == ((qs0) this.c)) {
                this.c = qs0Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ bkb(boolean z, Object obj, Object obj2, Object obj3) {
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public bkb(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, gba gbaVar) {
        this.a = uncaughtExceptionHandler;
        this.b = gbaVar;
        this.c = new ConcurrentHashMap();
    }

    public bkb(String str, qq6 qq6Var) {
        this.a = HttpPost.METHOD_NAME;
        this.b = str;
        this.c = qq6Var;
    }

    public bkb(int i) {
        switch (i) {
            case 4:
                this.a = new aab(0);
                this.b = new khe(new ie(14, this));
                break;
            default:
                this.a = new SparseArray();
                break;
        }
    }

    public bkb(int i, int i2, int i3, int i4, xef xefVar) throws IOException {
        this.b = xefVar;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i3);
        mediaFormatCreateVideoFormat.setInteger("bitrate", i4);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.a = mediaCodecCreateEncoderByType;
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.c = mediaCodecCreateEncoderByType.createInputSurface();
        mediaCodecCreateEncoderByType.start();
    }

    public bkb(Executor executor) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new k40(this);
        this.a = new qm(executor, 1);
    }

    public bkb(Context context) {
        this.a = context;
        this.b = new fl2();
    }

    public bkb(flf flfVar, Context context, o1f o1fVar, i63 i63Var, gte gteVar, xw0 xw0Var, crd crdVar, List list) {
        this.c = flfVar;
        this.b = gteVar;
        this.a = o1fVar.m(context, i63Var, xw0Var, this, crdVar, list, flfVar.h);
    }

    public bkb(imc imcVar) {
        this.c = imcVar;
        this.b = new AtomicBoolean(false);
        this.a = ((fu1) imcVar.c).o.schedule(new zt1(this, 0), 2000L, TimeUnit.MILLISECONDS);
    }
}
