package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;
import androidx.work.WorkRequest;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import org.webrtc.EglBase;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class xef {
    public ByteBuffer a;
    public MediaExtractor b;
    public ej9 c;
    public td f;
    public yna g;
    public bkb h;
    public m5d i;
    public final Context o;
    public final o45 p;
    public final String q;
    public final String r;
    public final float s;
    public final float t;
    public final nqb u;
    public final boolean v;
    public final rxd w;
    public long x;
    public long y;
    public int d = -1;
    public int e = -1;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;

    public xef(Context context, o45 o45Var, String str, String str2, float f, float f2, nqb nqbVar, boolean z, rxd rxdVar) {
        this.o = context;
        this.p = o45Var;
        this.q = str;
        this.r = str2;
        this.s = f;
        this.t = f2;
        this.u = nqbVar;
        this.v = z;
        this.w = rxdVar;
    }

    public static boolean a(Context context, o45 o45Var, String str, String str2, float f, float f2, nqb nqbVar, boolean z, rxd rxdVar) {
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        yna ynaVar;
        MediaCodec mediaCodec3;
        MediaCodec mediaCodec4;
        MediaCodec mediaCodec5;
        MediaCodec mediaCodec6;
        MediaCodec mediaCodec7;
        MediaCodec mediaCodec8;
        xef xefVar = new xef(context, o45Var, str, str2, f, f2, nqbVar, z, rxdVar);
        hm9.m("xef", "Start convert with parameters: \nsrcUri: %s\ndstPath: %s\nstartPosition: %f\nendPosition: %f\nquality: %s\nmute: %s", str, str2, Float.valueOf(f), Float.valueOf(f2), nqbVar, Boolean.valueOf(z));
        try {
        } catch (Throwable th) {
            try {
                if (th instanceof InterruptedException) {
                    hm9.p("xef", "execute: interrupted", null);
                    throw th;
                }
                if ((th instanceof RuntimeException) && (th.getCause() instanceof InterruptedException)) {
                    hm9.p("xef", "execute: interrupted", null);
                    throw ((InterruptedException) th.getCause());
                }
                hm9.p("xef", "failed to convert video", th);
                ((cba) xefVar.p).c(new HandledException(th), true);
                bkb bkbVar = xefVar.h;
                if (bkbVar != null && (mediaCodec4 = (MediaCodec) bkbVar.a) != null) {
                    mediaCodec4.release();
                }
                td tdVar = xefVar.f;
                if (tdVar != null && (mediaCodec3 = (MediaCodec) tdVar.c) != null) {
                    mediaCodec3.release();
                }
                MediaExtractor mediaExtractor = xefVar.b;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                ej9 ej9Var = xefVar.c;
                if (ej9Var != null) {
                    ((MediaMuxer) ej9Var.f).release();
                }
                m5d m5dVar = xefVar.i;
                if (m5dVar != null && ((Surface) m5dVar.X) != null) {
                    m5dVar.K();
                }
                ynaVar = xefVar.g;
                if (ynaVar == null || ynaVar.b == null) {
                    return false;
                }
            } catch (Throwable th2) {
                bkb bkbVar2 = xefVar.h;
                if (bkbVar2 != null && (mediaCodec2 = (MediaCodec) bkbVar2.a) != null) {
                    mediaCodec2.release();
                }
                td tdVar2 = xefVar.f;
                if (tdVar2 != null && (mediaCodec = (MediaCodec) tdVar2.c) != null) {
                    mediaCodec.release();
                }
                MediaExtractor mediaExtractor2 = xefVar.b;
                if (mediaExtractor2 != null) {
                    mediaExtractor2.release();
                }
                ej9 ej9Var2 = xefVar.c;
                if (ej9Var2 != null) {
                    ((MediaMuxer) ej9Var2.f).release();
                }
                m5d m5dVar2 = xefVar.i;
                if (m5dVar2 != null && ((Surface) m5dVar2.X) != null) {
                    m5dVar2.K();
                }
                yna ynaVar2 = xefVar.g;
                if (ynaVar2 != null && ynaVar2.b != null) {
                    ynaVar2.a();
                }
                throw th2;
            }
        }
        if (!xefVar.b()) {
            hm9.p("xef", "execute: failed to init recorder", null);
            bkb bkbVar3 = xefVar.h;
            if (bkbVar3 != null && (mediaCodec8 = (MediaCodec) bkbVar3.a) != null) {
                mediaCodec8.release();
            }
            td tdVar3 = xefVar.f;
            if (tdVar3 != null && (mediaCodec7 = (MediaCodec) tdVar3.c) != null) {
                mediaCodec7.release();
            }
            MediaExtractor mediaExtractor3 = xefVar.b;
            if (mediaExtractor3 != null) {
                mediaExtractor3.release();
            }
            ej9 ej9Var3 = xefVar.c;
            if (ej9Var3 != null) {
                ((MediaMuxer) ej9Var3.f).release();
            }
            m5d m5dVar3 = xefVar.i;
            if (m5dVar3 != null && ((Surface) m5dVar3.X) != null) {
                m5dVar3.K();
            }
            ynaVar = xefVar.g;
            if (ynaVar == null || ynaVar.b == null) {
                return false;
            }
            ynaVar.a();
            return false;
        }
        long j = xefVar.x;
        if (j > 0) {
            xefVar.b.seekTo(j, 0);
        } else {
            xefVar.b.seekTo(0L, 0);
        }
        while (!xefVar.l) {
            while (true) {
                if (xefVar.j) {
                    break;
                }
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException("conversion is interrupted");
                }
                int sampleTrackIndex = xefVar.b.getSampleTrackIndex();
                if (sampleTrackIndex != -1 && (!xefVar.n || !xefVar.m)) {
                    if (sampleTrackIndex == xefVar.d) {
                        td tdVar4 = xefVar.f;
                        MediaExtractor mediaExtractor4 = xefVar.b;
                        MediaCodec mediaCodec9 = (MediaCodec) tdVar4.c;
                        int iDequeueInputBuffer = mediaCodec9.dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
                        if (iDequeueInputBuffer >= 0) {
                            ((MediaCodec) tdVar4.c).queueInputBuffer(iDequeueInputBuffer, 0, mediaExtractor4.readSampleData(mediaCodec9.getInputBuffer(iDequeueInputBuffer), 0), mediaExtractor4.getSampleTime(), 0);
                            mediaExtractor4.advance();
                        }
                    } else {
                        int i = xefVar.e;
                        if (sampleTrackIndex != i || i == -1) {
                            xefVar.b.advance();
                        } else {
                            if (z || xefVar.b.getSampleTime() >= xefVar.y) {
                                xefVar.n = true;
                            } else if (xefVar.b.getSampleTime() > xefVar.x) {
                                xefVar.a.rewind();
                                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                bufferInfo.offset = 0;
                                bufferInfo.size = xefVar.b.readSampleData(xefVar.a, 0);
                                bufferInfo.presentationTimeUs = xefVar.b.getSampleTime();
                                bufferInfo.flags = xefVar.b.getSampleFlags();
                                bufferInfo.presentationTimeUs -= xefVar.x;
                                ej9 ej9Var4 = xefVar.c;
                                ByteBuffer byteBuffer = xefVar.a;
                                if (ej9Var4.b()) {
                                    boolean z2 = ej9Var4.c;
                                    MediaMuxer mediaMuxer = (MediaMuxer) ej9Var4.f;
                                    if (!z2) {
                                        mediaMuxer.start();
                                        ej9Var4.c = true;
                                    }
                                    ej9Var4.a();
                                    mediaMuxer.writeSampleData(ej9Var4.b, byteBuffer, bufferInfo);
                                } else {
                                    ((ArrayList) ej9Var4.g).add(new dj9(ej9Var4.b, byteBuffer, bufferInfo));
                                }
                            }
                            xefVar.b.advance();
                        }
                    }
                }
                xefVar.j = true;
                xefVar.b.release();
                td tdVar5 = xefVar.f;
                int iDequeueInputBuffer2 = ((MediaCodec) tdVar5.c).dequeueInputBuffer(WorkRequest.MIN_BACKOFF_MILLIS);
                if (iDequeueInputBuffer2 >= 0) {
                    ((MediaCodec) tdVar5.c).queueInputBuffer(iDequeueInputBuffer2, 0, 0, 0L, 4);
                    tdVar5.b = false;
                } else {
                    tdVar5.b = true;
                }
            }
            if (!xefVar.k) {
                xefVar.f.h();
            }
            if (!xefVar.l) {
                xefVar.h.p();
            }
        }
        bkb bkbVar4 = xefVar.h;
        if (bkbVar4 != null && (mediaCodec6 = (MediaCodec) bkbVar4.a) != null) {
            mediaCodec6.release();
        }
        td tdVar6 = xefVar.f;
        if (tdVar6 != null && (mediaCodec5 = (MediaCodec) tdVar6.c) != null) {
            mediaCodec5.release();
        }
        MediaExtractor mediaExtractor5 = xefVar.b;
        if (mediaExtractor5 != null) {
            mediaExtractor5.release();
        }
        ej9 ej9Var5 = xefVar.c;
        if (ej9Var5 != null) {
            ((MediaMuxer) ej9Var5.f).release();
        }
        m5d m5dVar4 = xefVar.i;
        if (m5dVar4 != null && ((Surface) m5dVar4.X) != null) {
            m5dVar4.K();
        }
        yna ynaVar3 = xefVar.g;
        if (ynaVar3 != null && ynaVar3.b != null) {
            ynaVar3.a();
        }
        hm9.n("xef", "Video convert successfully done");
        return true;
    }

    public final boolean b() throws IOException {
        int i;
        int integer;
        File parentFile;
        this.a = ByteBuffer.allocate(262144);
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.b = mediaExtractor;
        mediaExtractor.setDataSource(this.o, Uri.parse(this.q), (Map<String, String>) null);
        String str = this.r;
        File file = new File(str);
        if (!file.exists() && (parentFile = file.getParentFile()) != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        ej9 ej9Var = new ej9();
        ej9Var.c = false;
        int i2 = -1;
        ej9Var.a = -1;
        ej9Var.b = -1;
        ej9Var.d = false;
        ej9Var.e = false;
        ej9Var.g = new ArrayList();
        ej9Var.f = new MediaMuxer(str, 0);
        this.c = ej9Var;
        int trackCount = this.b.getTrackCount();
        int i3 = 0;
        while (true) {
            if (i3 >= trackCount) {
                i = i2;
                break;
            }
            MediaFormat trackFormat = this.b.getTrackFormat(i3);
            String string = trackFormat.getString("mime");
            hm9.n("xef", string);
            hm9.n("xef", trackFormat.toString());
            this.b.selectTrack(i3);
            if (string.startsWith("video/")) {
                this.d = i3;
                float f = trackFormat.getLong("durationUs");
                this.x = (long) (this.s * f);
                this.y = (long) (f * this.t);
                nqb nqbVar = this.u;
                int i4 = nqbVar.b;
                int i5 = i4 - (i4 % 4);
                int i6 = nqbVar.c;
                int i7 = i6 - (i6 % 4);
                try {
                    integer = trackFormat.getInteger("frame-rate");
                } catch (Throwable unused) {
                    integer = 15;
                }
                bkb bkbVar = new bkb(i5, i7, integer, nqbVar.d, this);
                this.h = bkbVar;
                m5d m5dVar = new m5d(9);
                m5dVar.b = EGL14.EGL_NO_DISPLAY;
                m5dVar.c = EGL14.EGL_NO_CONTEXT;
                m5dVar.o = EGL14.EGL_NO_SURFACE;
                Surface surface = (Surface) bkbVar.c;
                surface.getClass();
                m5dVar.X = surface;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                m5dVar.b = eGLDisplayEglGetDisplay;
                if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                    throw new RuntimeException("unable to get EGL14 display");
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                    m5dVar.b = null;
                    throw new RuntimeException("unable to initialize EGL14");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig((EGLDisplay) m5dVar.b, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
                }
                m5dVar.c = EGL14.eglCreateContext((EGLDisplay) m5dVar.b, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                m5d.u("eglCreateContext");
                if (((EGLContext) m5dVar.c) == null) {
                    throw new RuntimeException("null context");
                }
                m5dVar.o = EGL14.eglCreateWindowSurface((EGLDisplay) m5dVar.b, eGLConfigArr[0], (Surface) m5dVar.X, new int[]{12344}, 0);
                m5d.u("eglCreateWindowSurface");
                EGLSurface eGLSurface = (EGLSurface) m5dVar.o;
                if (eGLSurface == null) {
                    throw new RuntimeException("surface was null");
                }
                this.i = m5dVar;
                if (!EGL14.eglMakeCurrent((EGLDisplay) m5dVar.b, eGLSurface, eGLSurface, (EGLContext) m5dVar.c)) {
                    throw new RuntimeException("eglMakeCurrent failed");
                }
                this.g = new yna();
                this.f = new td(string, trackFormat, this.g, this);
                this.c.d = true;
            } else if (string.startsWith("audio/")) {
                this.e = i3;
                if (this.v) {
                    this.c.e = false;
                } else {
                    ej9 ej9Var2 = this.c;
                    ej9Var2.e = true;
                    ej9Var2.b = ((MediaMuxer) ej9Var2.f).addTrack(trackFormat);
                }
            }
            i = -1;
            if (this.e != -1 && this.d != -1) {
                break;
            }
            i3++;
            i2 = -1;
        }
        return this.d != i;
    }
}
