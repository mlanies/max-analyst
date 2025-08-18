package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class cd6 implements ry9, f2a {
    public Object X;
    public Object Y;
    public int a;
    public boolean b;
    public Object c;
    public Object o;

    public cd6(Class cls, int i) {
        this.a = i;
        this.o = cls;
        this.X = new Rect();
        this.c = new ArrayList();
        this.Y = new WeakReference(null);
    }

    public static final void a(vpf vpfVar, View view, ViewTreeObserver viewTreeObserver) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(vpfVar);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(vpfVar);
        }
    }

    public static void d(int i, int i2, String str) throws GlUtil$GlException {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        mr0.g(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        mr0.f();
    }

    @Override // defpackage.f2a
    public void b() {
        boolean z = this.b;
        ry1 ry1Var = (ry1) this.c;
        if (z) {
            if (ry1Var.isActive()) {
                ry1Var.resumeWith(this.X);
                return;
            }
            return;
        }
        int i = this.a;
        if (i == 2) {
            ry1Var.resumeWith(this.Y);
        } else if (ry1Var.isActive()) {
            ry1Var.resumeWith(new njc(new NoSuchElementException("No value received via onNext for ".concat(ey8.s(i)))));
        }
    }

    @Override // defpackage.f2a
    public void c(zl4 zl4Var) {
        this.o = zl4Var;
        ((ry1) this.c).d(new c01(10, zl4Var));
    }

    @Override // defpackage.f2a
    public void e(Object obj) {
        int i = this.a;
        int iS = au1.s(i);
        ry1 ry1Var = (ry1) this.c;
        if (iS == 0 || iS == 1) {
            if (this.b) {
                return;
            }
            this.b = true;
            ry1Var.resumeWith(obj);
            zl4 zl4Var = (zl4) this.o;
            (zl4Var != null ? zl4Var : null).g();
            return;
        }
        if (iS != 2 && iS != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (i != 4 || !this.b) {
            this.X = obj;
            this.b = true;
        } else {
            if (ry1Var.isActive()) {
                ry1Var.resumeWith(new njc(new IllegalArgumentException("More than one onNext value for ".concat(ey8.s(i)))));
            }
            zl4 zl4Var2 = (zl4) this.o;
            (zl4Var2 != null ? zl4Var2 : null).g();
        }
    }

    @Override // defpackage.ry9
    public void f(Executor executor, py9 py9Var) {
        u0e u0eVar;
        synchronized (this.o) {
            m(py9Var);
            u0eVar = new u0e((AtomicReference) this.X, executor, py9Var);
            ((HashMap) this.c).put(py9Var, u0eVar);
            ((CopyOnWriteArraySet) this.Y).add(u0eVar);
        }
        u0eVar.a(0);
    }

    public k56 g(uu3 uu3Var) {
        View view;
        View view2 = uu3Var.getView();
        uu3 targetController = uu3Var.getTargetController();
        View view3 = targetController != null ? targetController.getView() : null;
        if (view2 != null) {
            view = view2;
        } else {
            if (view3 == null) {
                return new fh5(10);
            }
            view = view3;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        vpf vpfVar = new vpf(this, view3, view);
        viewTreeObserver.addOnPreDrawListener(vpfVar);
        uu3Var.addLifecycleListener(new upf(this, viewTreeObserver, vpfVar, view));
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new tpf(view, viewTreeObserver, vpfVar, view, 0));
        } else if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new tpf(view, viewTreeObserver, vpfVar, view, 1));
        } else {
            a(vpfVar, view, viewTreeObserver);
        }
        return new kpf(vpfVar, view, viewTreeObserver);
    }

    public void h() throws GlUtil$GlException {
        for (ad6 ad6Var : (ad6[]) this.o) {
            FloatBuffer floatBuffer = ad6Var.b;
            fm9.i(floatBuffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(ad6Var.a, ad6Var.c, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(ad6Var.a);
            mr0.f();
        }
        for (bd6 bd6Var : (bd6[]) this.X) {
            boolean z = this.b;
            int[] iArr = bd6Var.d;
            int i = bd6Var.a;
            int i2 = bd6Var.b;
            if (i2 != 5124) {
                float[] fArr = bd6Var.c;
                if (i2 == 5126) {
                    GLES20.glUniform1fv(i, 1, fArr, 0);
                    mr0.f();
                } else if (i2 == 35678 || i2 == 35815 || i2 == 36198) {
                    if (bd6Var.e == 0) {
                        throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                    }
                    GLES20.glActiveTexture(bd6Var.f + 33984);
                    mr0.f();
                    mr0.d(i2 == 35678 ? 3553 : 36197, bd6Var.e, (i2 != 35678 || z) ? 9728 : 9729);
                    GLES20.glUniform1i(i, bd6Var.f);
                    mr0.f();
                } else {
                    switch (i2) {
                        case 35664:
                            GLES20.glUniform2fv(i, 1, fArr, 0);
                            mr0.f();
                            break;
                        case 35665:
                            GLES20.glUniform3fv(i, 1, fArr, 0);
                            mr0.f();
                            break;
                        case 35666:
                            GLES20.glUniform4fv(i, 1, fArr, 0);
                            mr0.f();
                            break;
                        case 35667:
                            GLES20.glUniform2iv(i, 1, iArr, 0);
                            mr0.f();
                            break;
                        case 35668:
                            GLES20.glUniform3iv(i, 1, iArr, 0);
                            mr0.f();
                            break;
                        case 35669:
                            GLES20.glUniform4iv(i, 1, iArr, 0);
                            mr0.f();
                            break;
                        default:
                            switch (i2) {
                                case 35675:
                                    GLES20.glUniformMatrix3fv(i, 1, false, fArr, 0);
                                    mr0.f();
                                    break;
                                case 35676:
                                    GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
                                    mr0.f();
                                    break;
                                default:
                                    throw new IllegalStateException(zr6.h(i2, "Unexpected uniform type: "));
                            }
                    }
                }
            } else {
                GLES20.glUniform1iv(i, 1, iArr, 0);
                mr0.f();
            }
        }
    }

    public int i() {
        int i;
        synchronized (this.o) {
            i = this.a;
            this.a = i + 1;
        }
        return i;
    }

    @Override // defpackage.ry9
    public bm7 j() {
        Object obj = ((AtomicReference) this.X).get();
        return obj instanceof tb0 ? new dw6(1, ((tb0) obj).a) : kq0.r(obj);
    }

    public void k() {
        ArrayList arrayList;
        synchronized (this.o) {
            try {
                this.b = true;
                arrayList = new ArrayList(((us) this.X).values());
                ((us) this.X).clear();
                if (((Runnable) this.c) != null) {
                    Handler handler = (Handler) this.Y;
                    handler.getClass();
                    handler.post((Runnable) this.c);
                    this.c = null;
                    this.Y = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k6d) it.next()).n();
        }
    }

    @Override // defpackage.ry9
    public void l(py9 py9Var) {
        synchronized (this.o) {
            m(py9Var);
        }
    }

    public void m(py9 py9Var) {
        u0e u0eVar = (u0e) ((HashMap) this.c).remove(py9Var);
        if (u0eVar != null) {
            u0eVar.c.set(false);
            ((CopyOnWriteArraySet) this.Y).remove(u0eVar);
        }
    }

    public void n() {
        synchronized (this.o) {
            try {
                Iterator it = new HashSet(((HashMap) this.c).keySet()).iterator();
                while (it.hasNext()) {
                    m((py9) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(float[] fArr) {
        ad6 ad6Var = (ad6) ((HashMap) this.c).get("aFramePosition");
        ad6Var.getClass();
        ad6Var.b = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        ad6Var.c = 4;
    }

    @Override // defpackage.f2a
    public void onError(Throwable th) {
        ((ry1) this.c).resumeWith(new njc(th));
    }

    public void p(String str, float f) {
        bd6 bd6Var = (bd6) ((HashMap) this.Y).get(str);
        bd6Var.getClass();
        bd6Var.c[0] = f;
    }

    public void q(String str, float[] fArr) {
        bd6 bd6Var = (bd6) ((HashMap) this.Y).get(str);
        bd6Var.getClass();
        System.arraycopy(fArr, 0, bd6Var.c, 0, fArr.length);
    }

    public void r(float[] fArr) {
        bd6 bd6Var = (bd6) ((HashMap) this.Y).get("uRgbMatrix");
        if (bd6Var == null) {
            return;
        }
        System.arraycopy(fArr, 0, bd6Var.c, 0, fArr.length);
    }

    public void s(int i, Object obj) {
        synchronized (this.o) {
            try {
                k6d k6dVar = (k6d) ((us) this.X).remove(Integer.valueOf(i));
                if (k6dVar != null) {
                    if (k6dVar.t0.getClass() == obj.getClass()) {
                        k6dVar.l(obj);
                    } else {
                        z04.c0("Type mismatch, expected " + k6dVar.t0.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((Runnable) this.c) != null && ((us) this.X).isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(int i, String str) {
        bd6 bd6Var = (bd6) ((HashMap) this.Y).get(str);
        bd6Var.getClass();
        bd6Var.d[0] = i;
    }

    public void u(int i, int i2, String str) {
        bd6 bd6Var = (bd6) ((HashMap) this.Y).get(str);
        bd6Var.getClass();
        bd6Var.e = i;
        bd6Var.f = i2;
    }

    public void v(Object obj) {
        Iterator it;
        int i;
        synchronized (this.o) {
            try {
                if (Objects.equals(((AtomicReference) this.X).getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.a + 1;
                this.a = i2;
                if (this.b) {
                    return;
                }
                this.b = true;
                Iterator it2 = ((CopyOnWriteArraySet) this.Y).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((u0e) it2.next()).a(i2);
                    } else {
                        synchronized (this.o) {
                            try {
                                if (this.a == i2) {
                                    this.b = false;
                                    return;
                                } else {
                                    it = ((CopyOnWriteArraySet) this.Y).iterator();
                                    i = this.a;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }

    public void w() throws GlUtil$GlException {
        GLES20.glUseProgram(this.a);
        mr0.f();
    }

    public cd6() {
        this.o = new Object();
        this.X = new us();
    }

    public cd6(Context context, String str, String str2) throws IOException, GlUtil$GlException {
        byte[] bArr;
        byte[] bArr2;
        String strQ = oaf.Q(context, str);
        String strQ2 = oaf.Q(context, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.a = iGlCreateProgram;
        mr0.f();
        d(iGlCreateProgram, 35633, strQ);
        d(iGlCreateProgram, 35632, strQ2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        mr0.g("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.c = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.o = new ad6[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.a;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            byte[] bArr3 = new byte[i5];
            GLES20.glGetActiveAttrib(i4, i3, i5, new int[i2], 0, new int[i2], 0, new int[i2], 0, bArr3, 0);
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    bArr2 = bArr3;
                    i6 = i5;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i6] == 0) {
                        break;
                    }
                    i6++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i6);
            ad6 ad6Var = new ad6(str3, GLES20.glGetAttribLocation(i4, str3));
            ((ad6[]) this.o)[i3] = ad6Var;
            ((HashMap) this.c).put(str3, ad6Var);
            i3++;
            i2 = 1;
        }
        this.Y = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.X = new bd6[iArr4[0]];
        for (int i7 = 0; i7 < iArr4[i]; i7++) {
            int i8 = this.a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i8, 35719, iArr5, i);
            int[] iArr6 = new int[1];
            int i9 = iArr5[i];
            byte[] bArr4 = new byte[i9];
            GLES20.glGetActiveUniform(i8, i7, i9, new int[1], 0, new int[1], 0, iArr6, 0, bArr4, 0);
            int i10 = 0;
            while (true) {
                if (i10 >= i9) {
                    bArr = bArr4;
                    i10 = i9;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i10] == 0) {
                        break;
                    }
                    i10++;
                    bArr4 = bArr;
                }
            }
            i = 0;
            String str4 = new String(bArr, 0, i10);
            bd6 bd6Var = new bd6(str4, GLES20.glGetUniformLocation(i8, str4), iArr6[0]);
            ((bd6[]) this.X)[i7] = bd6Var;
            ((HashMap) this.Y).put(str4, bd6Var);
        }
        mr0.f();
    }

    public cd6(Object obj) {
        this.o = new Object();
        this.a = 0;
        this.b = false;
        this.c = new HashMap();
        this.Y = new CopyOnWriteArraySet();
        this.X = new AtomicReference(obj);
    }
}
