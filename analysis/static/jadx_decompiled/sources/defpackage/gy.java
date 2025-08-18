package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class gy implements w78 {
    public static final ArrayDeque Z = new ArrayDeque();
    public static final Object s0 = new Object();
    public final ae3 X;
    public boolean Y;
    public final MediaCodec a;
    public final HandlerThread b;
    public cy c;
    public final AtomicReference o;

    public gy(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ae3 ae3Var = new ae3(1, false);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.X = ae3Var;
        this.o = new AtomicReference();
    }

    public static ey c() {
        ArrayDeque arrayDeque = Z;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new ey();
                }
                return (ey) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w78
    public final void a(long j, int i, int i2, int i3) {
        b();
        ey eyVarC = c();
        eyVarC.a = i;
        eyVarC.b = 0;
        eyVarC.c = i2;
        eyVarC.e = j;
        eyVarC.f = i3;
        cy cyVar = this.c;
        int i4 = oaf.a;
        cyVar.obtainMessage(1, eyVarC).sendToTarget();
    }

    @Override // defpackage.w78
    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.o.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.w78
    public final void flush() {
        if (this.Y) {
            try {
                cy cyVar = this.c;
                cyVar.getClass();
                cyVar.removeCallbacksAndMessages(null);
                ae3 ae3Var = this.X;
                ae3Var.c();
                cy cyVar2 = this.c;
                cyVar2.getClass();
                cyVar2.obtainMessage(3).sendToTarget();
                ae3Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.w78
    public final void i(int i, rz3 rz3Var, long j, int i2) {
        b();
        ey eyVarC = c();
        eyVarC.a = i;
        eyVarC.b = 0;
        eyVarC.c = 0;
        eyVarC.e = j;
        eyVarC.f = i2;
        int i3 = rz3Var.f;
        MediaCodec.CryptoInfo cryptoInfo = eyVarC.d;
        cryptoInfo.numSubSamples = i3;
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
        if (oaf.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(rz3Var.g, rz3Var.h));
        }
        this.c.obtainMessage(2, eyVarC).sendToTarget();
    }

    @Override // defpackage.w78
    public final void setParameters(Bundle bundle) {
        b();
        cy cyVar = this.c;
        int i = oaf.a;
        cyVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.w78
    public final void shutdown() {
        if (this.Y) {
            flush();
            this.b.quit();
        }
        this.Y = false;
    }

    @Override // defpackage.w78
    public final void start() {
        if (this.Y) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new cy(this, handlerThread.getLooper(), 1);
        this.Y = true;
    }
}
