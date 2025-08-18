package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class xsc implements tff, gx1 {
    public final due X;
    public final due Y;
    public final float[] Z;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final dob c = new dob();
    public final w36 o;
    public final float[] s0;
    public int t0;
    public SurfaceTexture u0;
    public volatile int v0;
    public int w0;
    public byte[] x0;

    public xsc() {
        w36 w36Var = new w36();
        w36Var.b = new float[16];
        w36Var.c = new float[16];
        w36Var.o = new due(0);
        this.o = w36Var;
        this.X = new due(0);
        this.Y = new due(0);
        this.Z = new float[16];
        this.s0 = new float[16];
        this.v0 = 0;
        this.w0 = -1;
    }

    public final SurfaceTexture a() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        wmd.h();
        dob dobVar = this.c;
        dobVar.getClass();
        l0f l0fVar = new l0f();
        dobVar.h = l0fVar;
        dobVar.b = GLES20.glGetUniformLocation(l0fVar.b, "uMvpMatrix");
        dobVar.c = GLES20.glGetUniformLocation(((l0f) dobVar.h).b, "uTexMatrix");
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(((l0f) dobVar.h).b, "aPosition");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        wmd.h();
        dobVar.d = iGlGetAttribLocation;
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(((l0f) dobVar.h).b, "aTexCoords");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        wmd.h();
        dobVar.e = iGlGetAttribLocation2;
        dobVar.f = GLES20.glGetUniformLocation(((l0f) dobVar.h).b, "uTexture");
        wmd.h();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        wmd.h();
        this.t0 = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.t0);
        this.u0 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new wsc(0, this));
        return this.u0;
    }

    @Override // defpackage.gx1
    public final void b(long j, float[] fArr) {
        ((due) this.o.o).a(j, fArr);
    }

    @Override // defpackage.gx1
    public final void c() {
        this.X.b();
        w36 w36Var = this.o;
        ((due) w36Var.o).b();
        w36Var.a = false;
        this.b.set(true);
    }

    @Override // defpackage.tff
    public final void d(long j, long j2, oy5 oy5Var, MediaFormat mediaFormat) {
        int i;
        float[] fArr;
        int i2;
        ArrayList arrayListT;
        int iH;
        this.X.a(j2, Long.valueOf(j));
        byte[] bArr = oy5Var.G0;
        int i3 = oy5Var.H0;
        byte[] bArr2 = this.x0;
        int i4 = this.w0;
        this.x0 = bArr;
        if (i3 == -1) {
            i3 = this.v0;
        }
        this.w0 = i3;
        if (i4 == i3 && Arrays.equals(bArr2, this.x0)) {
            return;
        }
        byte[] bArr3 = this.x0;
        cob cobVar = null;
        if (bArr3 != null) {
            int i5 = this.w0;
            yaf yafVar = new yaf(bArr3);
            try {
                yafVar.I(4);
                iH = yafVar.h();
                yafVar.H(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iH == 1886547818) {
                yafVar.I(8);
                int i6 = yafVar.b;
                int i7 = yafVar.c;
                while (i6 < i7) {
                    int iH2 = yafVar.h() + i6;
                    if (iH2 > i6 && iH2 <= i7) {
                        int iH3 = yafVar.h();
                        if (iH3 != 2037673328 && iH3 != 1836279920) {
                            yafVar.H(iH2);
                            i6 = iH2;
                        }
                        yafVar.G(iH2);
                        arrayListT = hm9.T(yafVar);
                        break;
                    }
                    break;
                }
                arrayListT = null;
            } else {
                arrayListT = hm9.T(yafVar);
            }
            if (arrayListT != null) {
                int size = arrayListT.size();
                if (size == 1) {
                    bob bobVar = (bob) arrayListT.get(0);
                    cobVar = new cob(bobVar, bobVar, i5);
                } else if (size == 2) {
                    cobVar = new cob((bob) arrayListT.get(0), (bob) arrayListT.get(1), i5);
                }
            }
        }
        if (cobVar == null || !dob.b(cobVar)) {
            int i8 = this.w0;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr2 = new float[15984];
            float[] fArr3 = new float[10656];
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 36; i9 < i12; i12 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i9 * f) - f3;
                int i13 = i9 + 1;
                float f5 = (i13 * f) - f3;
                int i14 = 0;
                while (i14 < 73) {
                    float f6 = f5;
                    int i15 = i13;
                    float f7 = f4;
                    int i16 = i10;
                    int i17 = i11;
                    int i18 = 2;
                    int i19 = 0;
                    while (i19 < i18) {
                        float f8 = i14 * f2;
                        float f9 = f2;
                        int i20 = i14;
                        double d = 50.0f;
                        int i21 = i8;
                        double d2 = (3.1415927f + f8) - (radians2 / 2.0f);
                        float f10 = radians;
                        double d3 = i19 == 0 ? f7 : f6;
                        int i22 = i19;
                        float f11 = f;
                        fArr2[i16] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        float[] fArr4 = fArr3;
                        int i23 = i9;
                        fArr2[i16 + 1] = (float) (Math.sin(d3) * d);
                        int i24 = i16 + 3;
                        fArr2[i16 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr4[i17] = f8 / radians2;
                        int i25 = i17 + 2;
                        fArr4[i17 + 1] = ((i23 + i22) * f11) / f10;
                        if (i20 == 0 && i22 == 0) {
                            i2 = i22;
                            i = i20;
                        } else {
                            i = i20;
                            if (i == 72) {
                                i2 = i22;
                                if (i2 != 1) {
                                    fArr = fArr4;
                                }
                            } else {
                                fArr = fArr4;
                                i2 = i22;
                            }
                            i18 = 2;
                            i17 = i25;
                            i16 = i24;
                            int i26 = i2 + 1;
                            i14 = i;
                            fArr3 = fArr;
                            f2 = f9;
                            i8 = i21;
                            radians = f10;
                            i9 = i23;
                            f = f11;
                            i19 = i26;
                        }
                        System.arraycopy(fArr2, i16, fArr2, i24, 3);
                        i16 += 6;
                        fArr = fArr4;
                        i18 = 2;
                        System.arraycopy(fArr, i17, fArr, i25, 2);
                        i17 += 4;
                        int i262 = i2 + 1;
                        i14 = i;
                        fArr3 = fArr;
                        f2 = f9;
                        i8 = i21;
                        radians = f10;
                        i9 = i23;
                        f = f11;
                        i19 = i262;
                    }
                    i14++;
                    i10 = i16;
                    i11 = i17;
                    f5 = f6;
                    i13 = i15;
                    f4 = f7;
                    i8 = i8;
                }
                i9 = i13;
            }
            bob bobVar2 = new bob(new ty(0, 1, fArr2, fArr3));
            cobVar = new cob(bobVar2, bobVar2, i8);
        }
        this.Y.a(j2, cobVar);
    }
}
