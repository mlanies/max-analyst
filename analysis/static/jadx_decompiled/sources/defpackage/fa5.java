package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.work.WorkRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class fa5 extends v2 {
    public static final int[] G0 = {2, 3, 6, 7, 8, 9, 11, 14};
    public static final long H0;
    public boolean A0;
    public t26 B0;
    public t26 C0;
    public ScheduledFuture D0;
    public boolean E0;
    public long F0;
    public ba5 X;
    public final int Y;
    public final Surface Z;
    public final va8 o;
    public final SurfaceTexture s0;
    public final float[] t0;
    public final ConcurrentLinkedQueue u0;
    public final ScheduledExecutorService v0;
    public final boolean w0;
    public final boolean x0;
    public int y0;
    public int z0;

    static {
        H0 = oaf.O() ? WorkRequest.MIN_BACKOFF_MILLIS : 500L;
    }

    public fa5(va8 va8Var, final nx0 nx0Var, boolean z, boolean z2) throws VideoFrameProcessingException {
        super(nx0Var);
        this.o = va8Var;
        this.w0 = z;
        this.x0 = z2;
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            mr0.f();
            int i = iArr[0];
            mr0.d(36197, i, 9729);
            this.Y = i;
            SurfaceTexture surfaceTexture = new SurfaceTexture(i);
            this.s0 = surfaceTexture;
            this.t0 = new float[16];
            this.u0 = new ConcurrentLinkedQueue();
            this.v0 = Executors.newSingleThreadScheduledExecutor(new pd3(3, "ExtTexMgr:Timer"));
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: da5
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    fa5 fa5Var = this.a;
                    fa5Var.getClass();
                    nx0Var.v(new ca5(fa5Var, 4));
                }
            });
            this.Z = new Surface(surfaceTexture);
            this.F0 = -9223372036854775807L;
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    public static float A(int i, float f) {
        float f2 = 1.0f;
        float f3 = 1.0f;
        for (int i2 = 2; i2 <= 256; i2 *= 2) {
            int i3 = (((i + i2) - 1) / i2) * i2;
            for (int i4 = 0; i4 <= 2; i4++) {
                float f4 = i;
                float f5 = i3;
                float f6 = (f4 - i4) / f5;
                if (Math.abs(f6 - f) < Math.abs(f2 - f)) {
                    f3 = f4 / f5;
                    f2 = f6;
                }
            }
        }
        return Math.abs(f2 - f) > 1.0E-9f ? f : f3;
    }

    public final void B() {
        t26 t26Var;
        if (this.y0 == 0 || this.z0 == 0 || this.B0 != null) {
            return;
        }
        this.s0.updateTexImage();
        this.z0--;
        if (this.w0) {
            t26Var = this.C0;
            t26Var.getClass();
        } else {
            t26Var = (t26) this.u0.element();
        }
        this.B0 = t26Var;
        this.y0--;
        this.s0.getTransformMatrix(this.t0);
        long timestamp = (this.s0.getTimestamp() / 1000) + t26Var.e;
        if (this.x0) {
            float[] fArr = this.t0;
            int i = t26Var.b;
            int i2 = t26Var.c;
            int i3 = fArr.length != 16 ? 1 : 0;
            int[] iArr = G0;
            for (int i4 = 0; i4 < 8; i4++) {
                i3 |= Math.abs(fArr[iArr[i4]]) > 1.0E-9f ? 1 : 0;
            }
            int i5 = i3 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f ? 1 : 0);
            char c = '\r';
            char c2 = '\f';
            char c3 = 4;
            if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                i = (Math.abs(fArr[4]) <= 1.0E-9f ? 0 : 1) | i5 | (Math.abs(fArr[1]) > 1.0E-9f ? 1 : 0);
                c3 = 5;
                c2 = '\r';
                c = '\f';
            } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
                i = -1;
                c = 65535;
                c2 = 65535;
                c3 = 65535;
            } else {
                i = 1;
                i = i5 | (Math.abs(fArr[0]) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[5]) > 1.0E-9f ? 1 : 0);
            }
            if (i != 0) {
                LinkedHashMap linkedHashMap = d54.a;
                synchronized (d54.class) {
                }
            } else {
                float f = fArr[i];
                float f2 = fArr[c];
                if (Math.abs(f) + 1.0E-9f < 1.0f) {
                    float fCopySign = Math.copySign(A(i, Math.abs(f)), f);
                    float f3 = z7b.f(f, fCopySign, 0.5f, f2);
                    LinkedHashMap linkedHashMap2 = d54.a;
                    synchronized (d54.class) {
                    }
                    fArr[i] = fCopySign;
                    fArr[c] = f3;
                }
                float f4 = fArr[c3];
                float f5 = fArr[c2];
                if (Math.abs(f4) + 1.0E-9f < 1.0f) {
                    float fCopySign2 = Math.copySign(A(i2, Math.abs(f4)), f4);
                    float f6 = z7b.f(f4, fCopySign2, 0.5f, f5);
                    LinkedHashMap linkedHashMap3 = d54.a;
                    synchronized (d54.class) {
                    }
                    fArr[c3] = fCopySign2;
                    fArr[c2] = f6;
                }
            }
        }
        ba5 ba5Var = this.X;
        ba5Var.getClass();
        ((od4) ba5Var).h.q("uTexTransformationMatrix", this.t0);
        gd6 gd6Var = this.X;
        gd6Var.getClass();
        ((qi0) gd6Var).e(this.o, new hd6(this.Y, -1, t26Var.b, t26Var.c), timestamp);
        if (!this.w0) {
            fm9.l((t26) this.u0.remove());
        }
        d54.a();
    }

    public final void C(CountDownLatch countDownLatch) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i = this.z0;
            concurrentLinkedQueue = this.u0;
            if (i <= 0) {
                break;
            }
            this.z0 = i - 1;
            this.s0.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (concurrentLinkedQueue.isEmpty() || (this.F0 != -9223372036854775807L && System.currentTimeMillis() - this.F0 >= H0)) {
            this.F0 = -9223372036854775807L;
            countDownLatch.countDown();
            return;
        }
        if (this.F0 == -9223372036854775807L) {
            this.F0 = System.currentTimeMillis();
        }
        this.v0.schedule(new kl4(this, 22, countDownLatch), 10L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.ed6
    public final void h() {
        ((nx0) this.a).v(new ca5(this, 5));
    }

    @Override // defpackage.v2
    public final void i() {
        this.y0 = 0;
        this.B0 = null;
        this.u0.clear();
        this.C0 = null;
        super.i();
    }

    @Override // defpackage.v2
    public final Surface j() {
        return this.Z;
    }

    @Override // defpackage.v2
    public final int k() {
        return this.u0.size();
    }

    @Override // defpackage.v2
    public final void q(t26 t26Var) {
        this.C0 = t26Var;
        if (!this.w0) {
            this.u0.add(t26Var);
        }
        ((nx0) this.a).v(new ca5(this, 0));
    }

    @Override // defpackage.v2
    public final void release() {
        this.s0.release();
        this.Z.release();
        this.v0.shutdownNow();
    }

    @Override // defpackage.ed6
    public final void s(hd6 hd6Var) {
        ((nx0) this.a).v(new ca5(this, 1));
    }

    @Override // defpackage.v2
    public final void u() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((nx0) this.a).v(new ea5(this, countDownLatch, 0));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            z04.c0("Interrupted when waiting for MediaCodec frames to arrive.");
        }
    }

    @Override // defpackage.v2
    public final void y(od4 od4Var) {
        ((nx0) this.a).v(new i12(this, 1, od4Var));
    }

    @Override // defpackage.v2
    public final void z() {
        ((nx0) this.a).v(new ca5(this, 3));
    }
}
