package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class od4 extends qi0 implements ba5, sgc {
    public static final ffc v;
    public static final float[] w;
    public static final float[] x;
    public final cd6 h;
    public final zw6 i;
    public final zw6 j;
    public final boolean k;
    public final float[][] l;
    public final float[][] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public ffc q;
    public Gainmap r;
    public int s;
    public boolean t;
    public boolean u;

    static {
        ls5 ls5Var = zw6.b;
        Object[] objArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}};
        c54.n(4, objArr);
        v = zw6.h(4, objArr);
        w = new float[]{1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
        x = new float[]{1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};
    }

    public od4(cd6 cd6Var, zw6 zw6Var, zw6 zw6Var2, int i, boolean z) {
        super(z);
        this.h = cd6Var;
        this.i = zw6Var;
        this.j = zw6Var2;
        this.k = z;
        int[] iArr = {zw6Var.size(), 16};
        Class cls = Float.TYPE;
        this.l = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        this.m = (float[][]) Array.newInstance((Class<?>) cls, zw6Var2.size(), 16);
        this.n = mr0.l();
        this.o = mr0.l();
        this.p = new float[16];
        this.q = v;
        this.s = -1;
    }

    public static od4 h(Context context, ffc ffcVar, ffc ffcVar2, boolean z) {
        return new od4(j(context, "shaders/vertex_shader_transformation_es2.glsl", ffcVar2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl"), zw6.j(ffcVar), zw6.j(ffcVar2), 1, z);
    }

    public static od4 i(Context context, ffc ffcVar, List list, i63 i63Var, int i) {
        boolean zG = i63.g(i63Var);
        boolean z = i == 2;
        cd6 cd6VarJ = j(context, zG ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", zG ? "shaders/fragment_shader_oetf_es3.glsl" : z ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i2 = i63Var.c;
        if (zG) {
            fm9.f(i2 == 7 || i2 == 6);
            cd6VarJ.t(i2, "uOutputColorTransfer");
        } else if (z) {
            fm9.f(i2 == 3 || i2 == 10);
            cd6VarJ.t(i2, "uOutputColorTransfer");
        }
        return new od4(cd6VarJ, zw6.j(ffcVar), zw6.j(list), i63Var.c, zG);
    }

    public static cd6 j(Context context, String str, String str2) {
        try {
            cd6 cd6Var = new cd6(context, str, str2);
            cd6Var.q("uTexTransformationMatrix", mr0.l());
            return cd6Var;
        } catch (GlUtil$GlException | IOException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    public static od4 k(cd6 cd6Var, i63 i63Var, i63 i63Var2, int i, ffc ffcVar) {
        boolean zG = i63.g(i63Var);
        int i2 = i63Var.a;
        boolean z = (i2 == 1 || i2 == 2) && i63Var2.a == 6;
        int i3 = i63Var2.c;
        if (zG) {
            if (i3 == 3) {
                i3 = 10;
            }
            fm9.f(i3 == 1 || i3 == 10 || i3 == 6 || i3 == 7);
            cd6Var.t(i3, "uOutputColorTransfer");
        } else if (z) {
            fm9.f(i3 == 1 || i3 == 6 || i3 == 7);
            cd6Var.t(i3, "uOutputColorTransfer");
        } else {
            cd6Var.t(i, "uSdrWorkingColorSpace");
            fm9.f(i3 == 3 || i3 == 1);
            cd6Var.t(i3, "uOutputColorTransfer");
        }
        return new od4(cd6Var, ffcVar, ffc.X, i63Var2.c, zG || z);
    }

    public static boolean n(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                fm9.j("A 4x4 transformation matrix must have 16 elements", fArr4.length == 16);
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.qi0
    public final void c(int i, long j) throws VideoFrameProcessingException {
        boolean z;
        cd6 cd6Var = this.h;
        zw6 zw6Var = this.j;
        int[] iArr = {zw6Var.size(), 16};
        int i2 = 0;
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        if (zw6Var.size() > 0) {
            au1.r(zw6Var.get(0));
            throw null;
        }
        boolean zN = n(this.m, fArr);
        float[] fArr2 = this.o;
        if (zN) {
            mr0.U(fArr2);
            if (zw6Var.size() > 0) {
                au1.r(zw6Var.get(0));
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        zw6 zw6Var2 = this.i;
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, zw6Var2.size(), 16);
        for (int i3 = 0; i3 < zw6Var2.size(); i3++) {
            fArr3[i3] = ((z18) zw6Var2.get(i3)).b(j);
        }
        float[][] fArr4 = this.l;
        boolean zN2 = n(fArr4, fArr3);
        float[] fArr5 = this.n;
        if (zN2) {
            mr0.U(fArr5);
            this.q = v;
            int length = fArr4.length;
            int i4 = 0;
            while (true) {
                float[] fArr6 = this.p;
                if (i4 >= length) {
                    int i5 = i2;
                    Matrix.invertM(fArr6, i5, fArr5, i5);
                    this.q = c37.E(fArr6, this.q);
                    break;
                }
                float[] fArr7 = fArr4[i4];
                Matrix.multiplyMM(fArr6, 0, fArr7, 0, this.n, 0);
                System.arraycopy(fArr6, i2, fArr5, i2, fArr6.length);
                ffc ffcVarE = c37.E(fArr7, this.q);
                fm9.e("A polygon must have at least 3 vertices.", ffcVarE.size() >= 3);
                ww6 ww6Var = new ww6();
                ww6Var.f(ffcVarE);
                float[][] fArr8 = c37.d;
                int i6 = 0;
                while (i6 < 6) {
                    float[] fArr9 = fArr8[i6];
                    ffc ffcVarJ = ww6Var.j();
                    ww6 ww6Var2 = new ww6();
                    for (int i7 = 0; i7 < ffcVarJ.size(); i7++) {
                        float[] fArr10 = (float[]) ffcVarJ.get(i7);
                        float[] fArr11 = (float[]) ffcVarJ.get(((ffcVarJ.size() + i7) - 1) % ffcVarJ.size());
                        if (c37.s(fArr10, fArr9)) {
                            if (!c37.s(fArr11, fArr9)) {
                                float[] fArrF = c37.f(fArr9, fArr9, fArr11, fArr10);
                                if (!Arrays.equals(fArr10, fArrF)) {
                                    ww6Var2.d(fArrF);
                                }
                            }
                            ww6Var2.d(fArr10);
                        } else if (c37.s(fArr11, fArr9)) {
                            float[] fArrF2 = c37.f(fArr9, fArr9, fArr11, fArr10);
                            if (!Arrays.equals(fArr11, fArrF2)) {
                                ww6Var2.d(fArrF2);
                            }
                        }
                    }
                    i6++;
                    ww6Var = ww6Var2;
                }
                ffc ffcVarJ2 = ww6Var.j();
                this.q = ffcVarJ2;
                if (ffcVarJ2.size() < 3) {
                    break;
                }
                i4++;
                i2 = 0;
            }
            i2 = 1;
        }
        boolean z2 = z || i2 != 0;
        if (this.q.size() < 3) {
            return;
        }
        if (this.t && !z2 && this.u) {
            return;
        }
        try {
            cd6Var.w();
            m();
            cd6Var.u(i, 0, "uTexSampler");
            cd6Var.q("uTransformationMatrix", fArr5);
            cd6Var.r(fArr2);
            cd6Var.o(mr0.q(this.q));
            cd6Var.h();
            GLES20.glDrawArrays(6, 0, this.q.size());
            mr0.f();
            this.u = true;
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    public final void l(Gainmap gainmap) throws GlUtil$GlException {
        if (this.k) {
            Gainmap gainmap2 = this.r;
            if (gainmap2 != null && gainmap2.getGamma() == gainmap.getGamma() && gainmap2.getRatioMax() == gainmap.getRatioMax() && gainmap2.getRatioMin() == gainmap.getRatioMin() && gainmap2.getEpsilonHdr() == gainmap.getEpsilonHdr() && gainmap2.getEpsilonSdr() == gainmap.getEpsilonSdr() && gainmap2.getDisplayRatioForFullHdr() == gainmap.getDisplayRatioForFullHdr() && gainmap2.getMinDisplayRatioForHdrTransition() == gainmap.getMinDisplayRatioForHdrTransition() && gainmap2.getGainmapContents() == gainmap.getGainmapContents() && gainmap2.getGainmapContents().getGenerationId() == gainmap.getGainmapContents().getGenerationId()) {
                return;
            }
            this.u = false;
            this.r = gainmap;
            int i = this.s;
            if (i != -1) {
                Bitmap gainmapContents = gainmap.getGainmapContents();
                mr0.b(gainmapContents.getWidth(), gainmapContents.getHeight());
                mr0.d(3553, i, 9729);
                GLUtils.texImage2D(3553, 0, gainmapContents, 0);
                mr0.f();
                return;
            }
            Bitmap gainmapContents2 = gainmap.getGainmapContents();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            mr0.f();
            int i2 = iArr[0];
            mr0.b(gainmapContents2.getWidth(), gainmapContents2.getHeight());
            mr0.d(3553, i2, 9729);
            GLUtils.texImage2D(3553, 0, gainmapContents2, 0);
            mr0.f();
            this.s = i2;
        }
    }

    public final void m() throws GlUtil$GlException {
        if (this.r == null) {
            return;
        }
        if (oaf.a < 34) {
            throw new IllegalStateException("Gainmaps not supported under API 34.");
        }
        int i = this.s;
        cd6 cd6Var = this.h;
        cd6Var.u(i, 1, "uGainmapTexSampler");
        Gainmap gainmap = this.r;
        int i2 = gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
        float[] gamma = gainmap.getGamma();
        int i3 = (gamma[0] == 1.0f && gamma[1] == 1.0f && gamma[2] == 1.0f) ? 1 : 0;
        int i4 = (ema.c(gamma) && ema.c(gainmap.getRatioMax()) && ema.c(gainmap.getRatioMin())) ? 1 : 0;
        cd6Var.t(i2, "uGainmapIsAlpha");
        cd6Var.t(i3, "uNoGamma");
        cd6Var.t(i4, "uSingleChannel");
        float[] ratioMin = gainmap.getRatioMin();
        cd6Var.q("uLogRatioMin", new float[]{(float) Math.log(ratioMin[0]), (float) Math.log(ratioMin[1]), (float) Math.log(ratioMin[2])});
        float[] ratioMax = gainmap.getRatioMax();
        cd6Var.q("uLogRatioMax", new float[]{(float) Math.log(ratioMax[0]), (float) Math.log(ratioMax[1]), (float) Math.log(ratioMax[2])});
        cd6Var.q("uEpsilonSdr", gainmap.getEpsilonSdr());
        cd6Var.q("uEpsilonHdr", gainmap.getEpsilonHdr());
        cd6Var.q("uGainmapGamma", gamma);
        cd6Var.p("uDisplayRatioHdr", gainmap.getDisplayRatioForFullHdr());
        cd6Var.p("uDisplayRatioSdr", gainmap.getMinDisplayRatioForHdrTransition());
        mr0.f();
    }

    @Override // defpackage.gd6
    public final void release() {
        try {
            this.a.d();
            try {
                GLES20.glDeleteProgram(this.h.a);
                mr0.f();
                int i = this.s;
                if (i != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    mr0.f();
                }
            } catch (GlUtil$GlException e) {
                throw new VideoFrameProcessingException(e);
            }
        } catch (GlUtil$GlException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
