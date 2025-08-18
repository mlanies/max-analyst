package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ay implements s78, e15, cbe {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final Object o;

    public ay(String str, bj6 bj6Var) throws NumberFormatException {
        boolean z;
        int i;
        this.a = 2;
        this.X = new HashMap();
        this.o = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            z = false;
            i = -1;
        }
        this.b = z;
        this.c = i;
        this.Y = bj6Var;
    }

    public static void p(ay ayVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        iy iyVar = (iy) ayVar.X;
        fm9.k(iyVar.c == null);
        HandlerThread handlerThread = iyVar.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) ayVar.o;
        mediaCodec.setCallback(iyVar, handler);
        iyVar.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((w78) ayVar.Y).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        ayVar.c = 1;
    }

    public static String q(int i, String str) {
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

    @Override // defpackage.s78
    public void a(long j, int i, int i2, int i3) {
        ((w78) this.Y).a(j, i, i2, i3);
    }

    @Override // defpackage.cbe
    public void b(long j) {
    }

    @Override // defpackage.l54
    public jbe c() {
        np8.f(!this.b);
        if (this.c == 2) {
            ArrayDeque arrayDeque = (ArrayDeque) this.Y;
            if (!arrayDeque.isEmpty()) {
                jbe jbeVar = (jbe) arrayDeque.removeFirst();
                hbe hbeVar = (hbe) this.X;
                if (hbeVar.f(4)) {
                    jbeVar.a(4);
                } else {
                    long j = hbeVar.Y;
                    ByteBuffer byteBuffer = hbeVar.o;
                    byteBuffer.getClass();
                    byte[] bArrArray = byteBuffer.array();
                    ((vu4) this.o).getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                    parcelObtain.setDataPosition(0);
                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                    parcelObtain.recycle();
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                    parcelableArrayList.getClass();
                    jbeVar.w(hbeVar.Y, new g03(j, tu0.h(xz3.D0, parcelableArrayList), 5), 0L);
                }
                hbeVar.v();
                this.c = 0;
                return jbeVar;
            }
        }
        return null;
    }

    @Override // defpackage.s78
    public void d(int i, long j) {
        ((MediaCodec) this.o).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.s78
    public int e() {
        int i;
        ((w78) this.Y).b();
        iy iyVar = (iy) this.X;
        synchronized (iyVar.a) {
            try {
                IllegalStateException illegalStateException = iyVar.n;
                if (illegalStateException != null) {
                    iyVar.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = iyVar.j;
                if (codecException != null) {
                    iyVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = iyVar.k;
                if (cryptoException != null) {
                    iyVar.k = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(iyVar.l > 0 || iyVar.m)) {
                    b23 b23Var = iyVar.d;
                    int i2 = b23Var.a;
                    int i3 = b23Var.b;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = b23Var.c[i2];
                        b23Var.a = (i2 + 1) & b23Var.d;
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // defpackage.l54
    public Object f() {
        np8.f(!this.b);
        if (this.c != 0) {
            return null;
        }
        this.c = 1;
        return (hbe) this.X;
    }

    @Override // defpackage.s78
    public void flush() {
        switch (this.a) {
            case 0:
                ((w78) this.Y).flush();
                ((MediaCodec) this.o).flush();
                iy iyVar = (iy) this.X;
                synchronized (iyVar.a) {
                    iyVar.l++;
                    Handler handler = iyVar.c;
                    int i = oaf.a;
                    handler.post(new b(10, iyVar));
                }
                ((MediaCodec) this.o).start();
                return;
            default:
                np8.f(!this.b);
                ((hbe) this.X).v();
                this.c = 0;
                return;
        }
    }

    @Override // defpackage.s78
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int i;
        ((w78) this.Y).b();
        iy iyVar = (iy) this.X;
        synchronized (iyVar.a) {
            try {
                IllegalStateException illegalStateException = iyVar.n;
                if (illegalStateException != null) {
                    iyVar.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = iyVar.j;
                if (codecException != null) {
                    iyVar.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = iyVar.k;
                if (cryptoException != null) {
                    iyVar.k = null;
                    throw cryptoException;
                }
                i = -1;
                if (!(iyVar.l > 0 || iyVar.m)) {
                    b23 b23Var = iyVar.e;
                    int i2 = b23Var.a;
                    int i3 = b23Var.b;
                    if (!(i2 == i3)) {
                        if (i2 == i3) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        i = b23Var.c[i2];
                        b23Var.a = b23Var.d & (i2 + 1);
                        if (i >= 0) {
                            fm9.l(iyVar.h);
                            MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) iyVar.f.remove();
                            bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                        } else if (i == -2) {
                            iyVar.h = (MediaFormat) iyVar.g.remove();
                        }
                    }
                }
            } finally {
            }
        }
        return i;
    }

    @Override // defpackage.s78
    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.o).getInputBuffer(i);
    }

    @Override // defpackage.s78
    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.o).getOutputBuffer(i);
    }

    @Override // defpackage.s78
    public MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        iy iyVar = (iy) this.X;
        synchronized (iyVar.a) {
            try {
                mediaFormat = iyVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.s78
    public void h(int i) {
        ((MediaCodec) this.o).setVideoScalingMode(i);
    }

    @Override // defpackage.s78
    public void i(int i, rz3 rz3Var, long j, int i2) {
        ((w78) this.Y).i(i, rz3Var, j, i2);
    }

    @Override // defpackage.s78
    public void j(Surface surface) {
        ((MediaCodec) this.o).setOutputSurface(surface);
    }

    @Override // defpackage.s78
    public boolean k(d88 d88Var) {
        iy iyVar = (iy) this.X;
        synchronized (iyVar.a) {
            iyVar.o = d88Var;
        }
        return true;
    }

    @Override // defpackage.l54
    public void l(hbe hbeVar) {
        np8.f(!this.b);
        np8.f(this.c == 1);
        np8.d(((hbe) this.X) == hbeVar);
        this.c = 2;
    }

    @Override // defpackage.e15
    public boolean m(int i) {
        return this.b && n(i) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.e15
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.f15 n(int r20) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay.n(int):f15");
    }

    @Override // defpackage.s78
    public void o(r88 r88Var, Handler handler) {
        ((MediaCodec) this.o).setOnFrameRenderedListener(new xx(this, r88Var, 1), handler);
    }

    @Override // defpackage.s78
    public void release() {
        switch (this.a) {
            case 0:
                try {
                    if (this.c == 1) {
                        ((w78) this.Y).shutdown();
                        iy iyVar = (iy) this.X;
                        synchronized (iyVar.a) {
                            iyVar.m = true;
                            iyVar.b.quit();
                            iyVar.a();
                        }
                    }
                    this.c = 2;
                    if (this.b) {
                        return;
                    }
                    try {
                        int i = oaf.a;
                        if (i >= 30 && i < 33) {
                            ((MediaCodec) this.o).stop();
                        }
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    if (!this.b) {
                        try {
                            int i2 = oaf.a;
                            if (i2 >= 30 && i2 < 33) {
                                ((MediaCodec) this.o).stop();
                            }
                        } finally {
                        }
                    }
                    throw th;
                }
            default:
                this.b = true;
                return;
        }
    }

    @Override // defpackage.s78
    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.o).releaseOutputBuffer(i, z);
    }

    @Override // defpackage.s78
    public void setParameters(Bundle bundle) {
        ((w78) this.Y).setParameters(bundle);
    }

    public ay() {
        this.a = 5;
        this.o = new vu4();
        this.X = new hbe(1);
        this.Y = new ArrayDeque();
        for (int i = 0; i < 2; i++) {
            ((ArrayDeque) this.Y).addFirst(new y02(this, 1));
        }
        this.c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ay(android.content.Context r19, int r20) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay.<init>(android.content.Context, int):void");
    }

    public ay(MediaCodec mediaCodec, HandlerThread handlerThread, w78 w78Var) {
        this.a = 0;
        this.o = mediaCodec;
        this.X = new iy(handlerThread);
        this.Y = w78Var;
        this.c = 0;
    }

    public ay(CharSequence charSequence, String str, String str2) {
        this.a = 1;
        this.o = charSequence;
        this.X = str;
        this.Y = str2;
        this.b = true;
        this.c = 15;
    }
}
