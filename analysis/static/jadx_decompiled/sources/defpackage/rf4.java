package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rf4 implements bgf {
    public static final /* synthetic */ int s = 0;
    public final Context a;
    public final va8 b;
    public final EGLDisplay c;
    public final s27 d;
    public final nx0 e;
    public final agf f;
    public final Executor g;
    public final boolean h;
    public final rk5 i;
    public final ae3 k;
    public jn l;
    public boolean m;
    public final i63 p;
    public volatile t26 q;
    public volatile boolean r;
    public final ArrayList n = new ArrayList();
    public final Object o = new Object();
    public final ArrayList j = new ArrayList();

    static {
        nc8.a("media3.effect");
    }

    public rf4(Context context, va8 va8Var, EGLDisplay eGLDisplay, s27 s27Var, nx0 nx0Var, agf agfVar, Executor executor, rk5 rk5Var, boolean z, i63 i63Var) {
        this.a = context;
        this.b = va8Var;
        this.c = eGLDisplay;
        this.d = s27Var;
        this.e = nx0Var;
        this.f = agfVar;
        this.g = executor;
        this.h = z;
        this.p = i63Var;
        this.i = rk5Var;
        ae3 ae3Var = new ae3(false, 1);
        this.k = ae3Var;
        ae3Var.g();
        rk5Var.A = new of4(this, executor, agfVar, nx0Var);
    }

    public final void a(jn jnVar, boolean z) throws VideoFrameProcessingException {
        i63 i63Var;
        char c;
        SparseArray sparseArray;
        Executor executor;
        int i;
        String strGlGetString;
        od4 od4VarK;
        boolean z2;
        jn jnVar2 = jnVar;
        i63 i63Var2 = ((t26) jnVar2.o).a;
        if (i63.g(i63Var2)) {
            fm9.f(i63Var2.a == 6);
        }
        boolean zG = i63.g(i63Var2);
        i63 i63Var3 = this.p;
        if (zG || i63.g(i63Var3)) {
            try {
                EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
                mr0.f();
                if (r5[0] != 3) {
                    throw new VideoFrameProcessingException("OpenGL ES 3.0 context support is required for HDR input or output.");
                }
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(e);
            }
        }
        fm9.f(i63Var2.e());
        fm9.f(i63Var2.c != 1);
        fm9.f(i63Var3.e());
        int i2 = i63Var3.c;
        fm9.f(i2 != 1);
        if (i63.g(i63Var2) != i63.g(i63Var3)) {
            int i3 = i63Var2.a;
            int i4 = i63Var3.a;
            fm9.f((i3 == 6 && i4 != 6 && i63.g(i63Var2) && (i2 == 10 || i2 == 3)) || (i63Var2.equals(i63.i) && i4 == 6 && i63.g(i63Var3)));
        }
        ArrayList arrayList = this.n;
        Executor executor2 = this.g;
        s27 s27Var = this.d;
        List list = (List) jnVar2.c;
        if (z || !arrayList.equals(list)) {
            ArrayList arrayList2 = this.j;
            if (!arrayList2.isEmpty()) {
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    ((gd6) arrayList2.get(i5)).release();
                }
                arrayList2.clear();
            }
            char c2 = 4;
            ww6 ww6Var = new ww6(4);
            ww6 ww6Var2 = new ww6(4);
            ww6 ww6Var3 = new ww6(4);
            int i6 = 0;
            while (i6 < list.size()) {
                z18 z18Var = (z18) list.get(i6);
                fm9.e("DefaultVideoFrameProcessor only supports GlEffects", z18Var instanceof z18);
                if (z18Var instanceof z18) {
                    ww6Var2.a(z18Var);
                    i63Var = i63Var3;
                    c = c2;
                } else {
                    ffc ffcVarJ = ww6Var2.j();
                    ffc ffcVarJ2 = ww6Var3.j();
                    boolean zG2 = i63.g(i63Var3);
                    boolean zIsEmpty = ffcVarJ.isEmpty();
                    i63Var = i63Var3;
                    Context context = this.a;
                    if (zIsEmpty && ffcVarJ2.isEmpty()) {
                        c = 4;
                    } else {
                        ww6Var.a(od4.h(context, ffcVarJ, ffcVarJ2, zG2));
                        c = 4;
                        ww6Var2 = new ww6(4);
                        ww6Var3 = new ww6(4);
                    }
                    z18 z18Var2 = z18Var;
                    z18Var2.getClass();
                    ww6Var.a(od4.h(context, zw6.n(z18Var2), ffc.X, zG2));
                }
                i6++;
                c2 = c;
                i63Var3 = i63Var;
            }
            ffc ffcVarJ3 = ww6Var2.j();
            ffc ffcVarJ4 = ww6Var3.j();
            rk5 rk5Var = this.i;
            ArrayList arrayList3 = rk5Var.b;
            arrayList3.clear();
            arrayList3.addAll(ffcVarJ3);
            ArrayList arrayList4 = rk5Var.c;
            arrayList4.clear();
            arrayList4.addAll(ffcVarJ4);
            rk5Var.B = true;
            arrayList2.addAll(ww6Var.j());
            s27Var.j = (gd6) mqd.l(arrayList2, rk5Var);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            arrayList5.add(rk5Var);
            int i7 = 0;
            while (i7 < arrayList5.size() - 1) {
                gd6 gd6Var = (gd6) arrayList5.get(i7);
                i7++;
                gd6 gd6Var2 = (gd6) arrayList5.get(i7);
                jo7 jo7Var = new jo7(this.b, gd6Var, gd6Var2, this.e);
                gd6Var.f(jo7Var);
                agf agfVar = this.f;
                Objects.requireNonNull(agfVar);
                gd6Var.d(executor2, new lf4(agfVar, 0));
                gd6Var2.g(jo7Var);
            }
            arrayList.clear();
            arrayList.addAll(list);
        }
        fm9.l(s27Var.j);
        SparseArray sparseArray2 = s27Var.g;
        int i8 = jnVar2.b;
        fm9.j("Input type not registered: " + i8, oaf.l(sparseArray2, i8));
        int i9 = 0;
        while (true) {
            int size = sparseArray2.size();
            t26 t26Var = (t26) jnVar2.o;
            if (i9 >= size) {
                v2 v2Var = s27Var.k;
                v2Var.getClass();
                v2Var.w(t26Var);
                this.k.g();
                executor2.execute(new wt1(this, 26, jnVar));
                return;
            }
            int iKeyAt = sparseArray2.keyAt(i9);
            r27 r27Var = (r27) sparseArray2.get(iKeyAt);
            if (iKeyAt == i8) {
                i63 i63Var4 = r27Var.c;
                v2 v2Var2 = r27Var.a;
                if (i63Var4 == null || !t26Var.a.equals(i63Var4)) {
                    i63 i63Var5 = t26Var.a;
                    int i10 = s27Var.h;
                    sparseArray = sparseArray2;
                    i63 i63Var6 = s27Var.b;
                    Context context2 = s27Var.a;
                    executor = executor2;
                    if (i8 == 1) {
                        ffc ffcVar = od4.v;
                        boolean zG3 = i63.g(i63Var5);
                        cd6 cd6VarJ = od4.j(context2, zG3 ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", zG3 ? "shaders/fragment_shader_transformation_external_yuv_es3.glsl" : "shaders/fragment_shader_transformation_sdr_external_es2.glsl");
                        if (zG3) {
                            if (oaf.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
                                try {
                                    EGLDisplay eGLDisplayA = mr0.A();
                                    EGLContext eGLContextM = mr0.m(EGL14.EGL_NO_CONTEXT, eGLDisplayA, 2, mr0.g);
                                    mr0.o(eGLContextM, eGLDisplayA);
                                    strGlGetString = GLES20.glGetString(7939);
                                    mr0.s(eGLContextM, eGLDisplayA);
                                } catch (GlUtil$GlException unused) {
                                }
                            } else {
                                strGlGetString = GLES20.glGetString(7939);
                            }
                            if (strGlGetString == null || !strGlGetString.contains("GL_EXT_YUV_target")) {
                                break;
                            }
                            cd6VarJ.q("uYuvToRgbColorTransform", i63Var5.b == 1 ? od4.w : od4.x);
                            cd6VarJ.t(i63Var5.c, "uInputColorTransfer");
                            cd6VarJ.t(i63Var6.a != 6 ? 1 : 0, "uApplyHdrToSdrToneMapping");
                        }
                        cd6VarJ.b = s27Var.i;
                        od4VarK = od4.k(cd6VarJ, i63Var5, i63Var6, i10, ffc.X);
                    } else {
                        if (i8 != 2 && i8 != 3) {
                            throw new VideoFrameProcessingException(zr6.h(i8, "Unsupported input type "));
                        }
                        ffc ffcVar2 = od4.v;
                        fm9.k(i63Var5.c != 2 || i8 == 2);
                        boolean zG4 = i63.g(i63Var5);
                        boolean z3 = i8 == 2 && i63Var6.a == 6;
                        cd6 cd6VarJ2 = od4.j(context2, (zG4 || z3) ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", z3 ? "shaders/fragment_shader_transformation_ultra_hdr_es3.glsl" : zG4 ? "shaders/fragment_shader_transformation_hdr_internal_es3.glsl" : "shaders/fragment_shader_transformation_sdr_internal_es2.glsl");
                        if (!z3) {
                            int i11 = i63Var5.c;
                            if (!zG4 && i11 != 2) {
                                if (i11 != 3) {
                                    z2 = false;
                                }
                                fm9.f(z2);
                                cd6VarJ2.t(i11, "uInputColorTransfer");
                            }
                            z2 = true;
                            fm9.f(z2);
                            cd6VarJ2.t(i11, "uInputColorTransfer");
                        }
                        if (zG4) {
                            cd6VarJ2.t(i63Var6.a != 6 ? 1 : 0, "uApplyHdrToSdrToneMapping");
                        }
                        ffc ffcVarN = ffc.X;
                        if (i8 == 2) {
                            ffcVarN = zw6.n(new nd4());
                        }
                        od4VarK = od4.k(cd6VarJ2, i63Var5, i63Var6, i10, ffcVarN);
                    }
                    od4VarK.e = s27Var.f;
                    od4VarK.d = s27Var.e;
                    ba5 ba5Var = r27Var.b;
                    if (ba5Var != null) {
                        ((od4) ba5Var).release();
                    }
                    r27Var.b = od4VarK;
                    v2Var2.y(od4VarK);
                    od4VarK.g(v2Var2);
                    r27Var.c = t26Var.a;
                } else {
                    sparseArray = sparseArray2;
                    executor = executor2;
                }
                ba5 ba5Var2 = r27Var.b;
                ba5Var2.getClass();
                gd6 gd6Var3 = s27Var.j;
                nx0 nx0Var = s27Var.d;
                ar0 ar0Var = new ar0();
                ar0Var.b = new jo7(s27Var.c, (od4) ba5Var2, gd6Var3, nx0Var);
                r27Var.d = ar0Var;
                gd6 gd6Var4 = r27Var.b;
                gd6Var4.getClass();
                ((qi0) gd6Var4).c = ar0Var;
                ar0 ar0Var2 = r27Var.d;
                if (ar0Var2 != null) {
                    ar0Var2.a = true;
                }
                gd6 gd6Var5 = s27Var.j;
                ar0Var2.getClass();
                gd6Var5.g(ar0Var2);
                s27Var.k = v2Var2;
                i = 1;
            } else {
                sparseArray = sparseArray2;
                executor = executor2;
                ar0 ar0Var3 = r27Var.d;
                if (ar0Var3 != null) {
                    ar0Var3.a = false;
                }
                i = 1;
            }
            i9 += i;
            jnVar2 = jnVar;
            sparseArray2 = sparseArray;
            executor2 = executor;
        }
        throw new VideoFrameProcessingException("The EXT_YUV_target extension is required for HDR editing input.");
    }

    public final boolean b() {
        fm9.k(!this.r);
        fm9.m(this.q, "registerInputStream must be called before registering input frames");
        if (!this.k.e()) {
            return false;
        }
        v2 v2Var = this.d.k;
        fm9.l(v2Var);
        v2Var.q(this.q);
        return true;
    }

    public final void c(int i, List list, t26 t26Var) {
        t26 t26Var2;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
        }
        float f = t26Var.d;
        if (f > 1.0f) {
            t26Var2 = new t26(t26Var.a, (int) (t26Var.b * f), t26Var.c, 1.0f, t26Var.e);
        } else if (f < 1.0f) {
            t26Var2 = new t26(t26Var.a, t26Var.b, (int) (t26Var.c / f), 1.0f, t26Var.e);
        } else {
            t26Var2 = t26Var;
        }
        this.q = t26Var2;
        try {
            this.k.a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.g.execute(new wt1(this, 27, e));
        }
        synchronized (this.o) {
            try {
                jn jnVar = new jn(i, list, t26Var);
                if (this.m) {
                    this.l = jnVar;
                    this.k.c();
                    v2 v2Var = this.d.k;
                    fm9.l(v2Var);
                    v2Var.z();
                } else {
                    this.m = true;
                    this.k.c();
                    this.e.v(new mf4(this, jnVar, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        try {
            this.e.t(new nf4(2, this));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    public final void e(jee jeeVar) {
        rk5 rk5Var = this.i;
        rk5Var.getClass();
        try {
            rk5Var.i.o(new i12(rk5Var, 2, jeeVar));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            rk5Var.j.execute(new kl4(rk5Var, 25, e));
        }
    }

    public final void f() {
        d54.a();
        fm9.k(!this.r);
        this.r = true;
        v2 v2Var = this.d.k;
        v2Var.getClass();
        v2Var.z();
    }
}
