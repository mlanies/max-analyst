package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zx implements r78 {
    public final boolean X;
    public boolean Y;
    public int Z = 0;
    public final MediaCodec a;
    public final hy b;
    public final fy c;
    public final boolean o;

    public zx(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.a = mediaCodec;
        this.b = new hy(handlerThread);
        this.c = new fy(mediaCodec, handlerThread2);
        this.o = z;
        this.X = z2;
    }

    public static void b(zx zxVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        hy hyVar = zxVar.b;
        np8.f(hyVar.c == null);
        HandlerThread handlerThread = hyVar.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = zxVar.a;
        mediaCodec.setCallback(hyVar, handler);
        hyVar.c = handler;
        j47.k("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        j47.A();
        fy fyVar = zxVar.c;
        if (!fyVar.f) {
            HandlerThread handlerThread2 = fyVar.b;
            handlerThread2.start();
            fyVar.c = new cy(fyVar, handlerThread2.getLooper(), 0);
            fyVar.f = true;
        }
        j47.k("startCodec");
        mediaCodec.start();
        j47.A();
        zxVar.Z = 1;
    }

    public static String c(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.r78
    public final void a(long j, int i, int i2, int i3) {
        fy fyVar = this.c;
        RuntimeException runtimeException = (RuntimeException) fyVar.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        dy dyVarB = fy.b();
        dyVarB.a = i;
        dyVarB.b = 0;
        dyVarB.c = i2;
        dyVarB.e = j;
        dyVarB.f = i3;
        cy cyVar = fyVar.c;
        int i4 = maf.a;
        cyVar.obtainMessage(0, dyVarB).sendToTarget();
    }

    @Override // defpackage.r78
    public final void d(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.r78
    public final int e() {
        int iG;
        hy hyVar = this.b;
        synchronized (hyVar.a) {
            try {
                boolean z = true;
                iG = -1;
                if (!(hyVar.k > 0 || hyVar.l)) {
                    IllegalStateException illegalStateException = hyVar.m;
                    if (illegalStateException != null) {
                        hyVar.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = hyVar.j;
                    if (codecException != null) {
                        hyVar.j = null;
                        throw codecException;
                    }
                    uy uyVar = hyVar.d;
                    if (uyVar.o != 0) {
                        z = false;
                    }
                    if (!z) {
                        iG = uyVar.g();
                    }
                }
            } finally {
            }
        }
        return iG;
    }

    public final void f() {
        if (this.o) {
            try {
                fy fyVar = this.c;
                ae3 ae3Var = fyVar.e;
                synchronized (ae3Var) {
                    ae3Var.b = false;
                }
                cy cyVar = fyVar.c;
                cyVar.getClass();
                cyVar.obtainMessage(2).sendToTarget();
                ae3Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.r78
    public final void flush() {
        this.c.a();
        MediaCodec mediaCodec = this.a;
        mediaCodec.flush();
        boolean z = this.X;
        hy hyVar = this.b;
        if (!z) {
            hyVar.a(mediaCodec);
        } else {
            hyVar.a(null);
            mediaCodec.start();
        }
    }

    @Override // defpackage.r78
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int iG;
        hy hyVar = this.b;
        synchronized (hyVar.a) {
            try {
                boolean z = true;
                iG = -1;
                if (!(hyVar.k > 0 || hyVar.l)) {
                    IllegalStateException illegalStateException = hyVar.m;
                    if (illegalStateException != null) {
                        hyVar.m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = hyVar.j;
                    if (codecException != null) {
                        hyVar.j = null;
                        throw codecException;
                    }
                    uy uyVar = hyVar.e;
                    if (uyVar.o != 0) {
                        z = false;
                    }
                    if (!z) {
                        iG = uyVar.g();
                        if (iG >= 0) {
                            np8.g(hyVar.h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) hyVar.f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (iG == -2) {
                            hyVar.h = (MediaFormat) hyVar.g.remove();
                        }
                    }
                }
            } finally {
            }
        }
        return iG;
    }

    @Override // defpackage.r78
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.r78
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.r78
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        hy hyVar = this.b;
        synchronized (hyVar.a) {
            try {
                mediaFormat = hyVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.r78
    public final void h(int i) {
        f();
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.r78
    public final void j(Surface surface) {
        f();
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.r78
    public final void k(int i, rz3 rz3Var, long j) {
        fy fyVar = this.c;
        RuntimeException runtimeException = (RuntimeException) fyVar.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        dy dyVarB = fy.b();
        dyVarB.a = i;
        dyVarB.b = 0;
        dyVarB.c = 0;
        dyVarB.e = j;
        dyVarB.f = 0;
        int i2 = rz3Var.f;
        MediaCodec.CryptoInfo cryptoInfo = dyVarB.d;
        cryptoInfo.numSubSamples = i2;
        int[] iArr = (int[]) rz3Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = (int[]) rz3Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = (byte[]) rz3Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = (byte[]) rz3Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = rz3Var.c;
        if (maf.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(rz3Var.g, rz3Var.h));
        }
        fyVar.c.obtainMessage(1, dyVarB).sendToTarget();
    }

    @Override // defpackage.r78
    public final void l(r88 r88Var, Handler handler) {
        f();
        this.a.setOnFrameRenderedListener(new xx(this, r88Var, 0), handler);
    }

    @Override // defpackage.r78
    public final void release() {
        try {
            if (this.Z == 1) {
                fy fyVar = this.c;
                if (fyVar.f) {
                    fyVar.a();
                    fyVar.b.quit();
                }
                fyVar.f = false;
                hy hyVar = this.b;
                synchronized (hyVar.a) {
                    hyVar.l = true;
                    hyVar.b.quit();
                    hyVar.b();
                }
            }
            this.Z = 2;
            if (this.Y) {
                return;
            }
            this.a.release();
            this.Y = true;
        } catch (Throwable th) {
            if (!this.Y) {
                this.a.release();
                this.Y = true;
            }
            throw th;
        }
    }

    @Override // defpackage.r78
    public final void releaseOutputBuffer(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // defpackage.r78
    public final void setParameters(Bundle bundle) {
        f();
        this.a.setParameters(bundle);
    }
}
