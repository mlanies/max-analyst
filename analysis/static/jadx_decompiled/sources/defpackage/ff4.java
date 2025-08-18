package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* loaded from: classes.dex */
public final /* synthetic */ class ff4 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf4 b;

    public /* synthetic */ ff4(kf4 kf4Var, int i) {
        this.a = i;
        this.b = kf4Var;
    }

    @Override // defpackage.xff
    public final void run() throws GlUtil$GlException {
        switch (this.a) {
            case 0:
                kf4 kf4Var = this.b;
                kf4Var.getClass();
                EGLDisplay eGLDisplayA = mr0.A();
                kf4Var.m = eGLDisplayA;
                int[] iArr = mr0.g;
                va8 va8Var = kf4Var.c;
                kf4Var.n = va8Var.u(va8Var.r(eGLDisplayA, 2, iArr), kf4Var.m);
                return;
            case 1:
                kf4 kf4Var2 = this.b;
                va8 va8Var2 = kf4Var2.c;
                try {
                    try {
                        try {
                            bkb bkbVar = kf4Var2.e;
                            bkbVar.getClass();
                            try {
                                cd6 cd6Var = (cd6) bkbVar.c;
                                if (cd6Var != null) {
                                    GLES20.glDeleteProgram(cd6Var.a);
                                    mr0.f();
                                }
                            } catch (GlUtil$GlException e) {
                                z04.v("Error releasing GL Program", e);
                            }
                            kf4Var2.i.d();
                            EGLDisplay eGLDisplay = kf4Var2.m;
                            EGLSurface eGLSurface = kf4Var2.n;
                            if (eGLDisplay != null && eGLSurface != null) {
                                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                                mr0.e("Error destroying surface");
                            }
                            EGLDisplay eGLDisplay2 = kf4Var2.m;
                            eGLDisplay2.getClass();
                            va8Var2.C(eGLDisplay2);
                            return;
                        } catch (GlUtil$GlException e2) {
                            z04.v("Error releasing GL resources", e2);
                            EGLDisplay eGLDisplay3 = kf4Var2.m;
                            eGLDisplay3.getClass();
                            va8Var2.C(eGLDisplay3);
                            return;
                        }
                    } catch (GlUtil$GlException e3) {
                        z04.v("Error releasing GL objects", e3);
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        EGLDisplay eGLDisplay4 = kf4Var2.m;
                        eGLDisplay4.getClass();
                        va8Var2.C(eGLDisplay4);
                    } catch (GlUtil$GlException e4) {
                        z04.v("Error releasing GL objects", e4);
                    }
                    throw th;
                }
            default:
                this.b.b();
                return;
        }
    }
}
