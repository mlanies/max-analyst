package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Property;
import android.util.Size;
import android.view.GestureDetector;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import org.webrtc.EglBase;

/* loaded from: classes.dex */
public class zm4 implements fye {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public zm4(final Context context, s0b s0bVar, rzd rzdVar, u5e u5eVar) {
        this.a = 0;
        this.c = s0bVar;
        this.d = rzdVar;
        this.e = u5eVar;
        jn jnVar = new jn(context);
        this.f = jnVar;
        jn jnVar2 = new jn(context);
        this.g = jnVar2;
        this.h = new GestureDetector(context, new q00(7, this));
        this.i = new es3(8, this);
        this.j = new Rect();
        this.b = tu0.G(92 * fk4.d().getDisplayMetrics().density);
        final int i = 0;
        this.k = tu0.r(3, new k56(this) { // from class: xm4
            public final /* synthetic */ zm4 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.f(context, true);
                    default:
                        return this.b.f(context, false);
                }
            }
        });
        final int i2 = 1;
        this.l = tu0.r(3, new k56(this) { // from class: xm4
            public final /* synthetic */ zm4 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.b.f(context, true);
                    default:
                        return this.b.f(context, false);
                }
            }
        });
        jnVar2.c = new gaa(this);
        jnVar.c = new w4d(13, this);
    }

    public static final void a(zm4 zm4Var, boolean z, int i) {
        TextView textView;
        es3 es3Var = (es3) zm4Var.i;
        yh0 yh0Var = new yh0(3, es3Var);
        FrameLayout frameLayout = (FrameLayout) zm4Var.c;
        frameLayout.removeCallbacks(yh0Var);
        String string = frameLayout.getContext().getString(l8a.c, Integer.valueOf(i));
        if (z) {
            zm4Var.m = c(zm4Var.k(), (Animator) zm4Var.m);
            br7.b(frameLayout, zm4Var.k(), -1);
            View childAt = zm4Var.k().getChildAt(0);
            textView = childAt instanceof TextView ? (TextView) childAt : null;
            if (textView != null) {
                textView.setText(string);
            }
            zm4Var.m = b(zm4Var.k(), (Animator) zm4Var.m);
        } else {
            zm4Var.n = c(zm4Var.m(), (Animator) zm4Var.n);
            br7.b(frameLayout, zm4Var.m(), -1);
            View childAt2 = zm4Var.m().getChildAt(0);
            textView = childAt2 instanceof TextView ? (TextView) childAt2 : null;
            if (textView != null) {
                textView.setText(string);
            }
            zm4Var.n = b(zm4Var.m(), (Animator) zm4Var.n);
        }
        dkf dkfVar = (dkf) ((k56) zm4Var.d).invoke();
        if (dkfVar == null) {
            hm9.n(zm4.class.getName(), "Media viewer. Can't seek by double tap because player is null");
            return;
        }
        long jF0 = dkfVar.F0();
        long j = 10000;
        long j2 = z ? jF0 + j : jF0 - j;
        long jG0 = dkfVar.G0();
        if (j2 > jG0) {
            zm4Var.d();
            j2 = jG0;
        }
        if (j2 < 0) {
            zm4Var.d();
            j2 = 0;
        }
        if (dkfVar.H0() || dkfVar.o.getPlaybackState() == 1) {
            u5e u5eVar = (u5e) zm4Var.e;
            u5eVar.getClass();
            bc7[] bc7VarArr = VideoViewerWidget.u0;
            dmf dmfVarO0 = ((VideoViewerWidget) u5eVar.a).o0();
            if (dmfVarO0 != null) {
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) dmfVarO0;
                g07 g07VarA0 = chatMediaViewerScreen.A0();
                dkf dkfVarB0 = chatMediaViewerScreen.B0();
                gef gefVar = dkfVarB0.Z;
                g07VarA0.c(j2, gefVar != null ? dkfVarB0.o.e0() - gefVar.m() : 0L, chatMediaViewerScreen.B0().G0());
            }
        }
        dkfVar.J0(j2);
        frameLayout.postDelayed(new yh0(4, es3Var), 600L);
    }

    public static Animator b(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() == 0 && animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, viewGroup.getAlpha(), 1.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new ym4(viewGroup, 0));
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    public static Animator c(ViewGroup viewGroup, Animator animator) {
        if (viewGroup.getVisibility() != 0) {
            return animator;
        }
        if (animator != null && animator.isRunning()) {
            return animator;
        }
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, viewGroup.getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.addListener(new ym4(viewGroup, 1));
        objectAnimatorOfFloat.start();
        return objectAnimatorOfFloat;
    }

    public void d() {
        if (k().getVisibility() == 0) {
            this.m = c(k(), (Animator) this.m);
        }
        if (m().getVisibility() == 0) {
            this.n = c(m(), (Animator) this.n);
        }
        ((jn) this.f).b = 0;
        ((jn) this.g).b = 0;
    }

    public void e() {
        int iS = au1.s(this.b);
        if (iS == 0 || iS == 1) {
            u();
            return;
        }
        if (iS == 2 || iS == 3) {
            this.b = 3;
        } else {
            if (iS == 4) {
                return;
            }
            throw new IllegalStateException("State " + h4f.v(this.b) + " is not handled");
        }
    }

    public FrameLayout f(Context context, boolean z) {
        FrameLayout frameLayout = new FrameLayout(context);
        int i = z ? 8388629 : 8388627;
        int i2 = this.b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2, i);
        if (z) {
            layoutParams.rightMargin = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        } else {
            layoutParams.leftMargin = tu0.G(24 * fk4.d().getDisplayMetrics().density);
        }
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        i4f.G.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        int i3 = z ? j8a.a : j8a.b;
        bs6 icon = pq9Var.p(textView).c.getIcon();
        Drawable drawableB = kt3.b(textView.getContext(), i3);
        ngg.G(drawableB, icon.f);
        ArrayList arrayList = qqe.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawableB, (Drawable) null, (Drawable) null);
        frameLayout.addView(textView);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        pq9Var.p(frameLayout).c.b();
        shapeDrawable.setTint(-1728053248);
        frameLayout.setBackground(shapeDrawable);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public void g(eu4 eu4Var, m5d m5dVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f, iArr, 0, iArr, 1)) {
            this.f = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (m5dVar != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            m5dVar.c = str;
        }
        int i = eu4Var.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f, new int[]{12324, i, 12323, i, 12322, i, 12321, eu4Var.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, eu4Var.a() ? 64 : 4, EglBase.EGL_RECORDABLE_ANDROID, eu4Var.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, eu4Var.a() ? 3 : 2, 12344}, 0);
        o76.a("eglCreateContext");
        this.i = eGLConfig;
        this.g = eGLContextEglCreateContext;
        EGL14.eglQueryContext((EGLDisplay) this.f, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    public db0 h(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f;
            EGLConfig eGLConfig = (EGLConfig) this.i;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceH = o76.h(eGLDisplay, eGLConfig, surface, (int[]) this.h);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new db0(eGLSurfaceH, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            e.getMessage();
            return null;
        }
    }

    public void i() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f;
        EGLConfig eGLConfig = (EGLConfig) this.i;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = o76.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        o76.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.j = eGLSurfaceEglCreatePbufferSurface;
    }

    public mpa j(eu4 eu4Var) {
        o76.d((AtomicBoolean) this.c, false);
        try {
            g(eu4Var, null);
            i();
            o((EGLSurface) this.j);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new mpa(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            e.getMessage();
            return new mpa("", "");
        } finally {
            r();
        }
    }

    public ViewGroup k() {
        return (ViewGroup) ((je7) this.k).getValue();
    }

    public db0 l(Surface surface) {
        HashMap map = (HashMap) this.d;
        c54.p("The surface is not registered.", map.containsKey(surface));
        db0 db0Var = (db0) map.get(surface);
        Objects.requireNonNull(db0Var);
        return db0Var;
    }

    public ViewGroup m() {
        return (ViewGroup) ((je7) this.l).getValue();
    }

    public na0 n(eu4 eu4Var, Map map) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        o76.d(atomicBoolean, false);
        m5d m5dVar = new m5d(3);
        m5dVar.b = "0.0";
        m5dVar.c = "0.0";
        m5dVar.o = "";
        m5dVar.X = "";
        try {
            if (eu4Var.a()) {
                mpa mpaVarJ = j(eu4Var);
                String str = (String) mpaVarJ.a;
                str.getClass();
                String str2 = (String) mpaVarJ.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    eu4Var = eu4.d;
                }
                int[] iArr = o76.a;
                if (eu4Var.a == 3 && str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    iArr = o76.b;
                }
                this.h = iArr;
                m5dVar.o = str;
                m5dVar.X = str2;
            }
            g(eu4Var, m5dVar);
            i();
            o((EGLSurface) this.j);
            String strI = o76.i();
            if (strI == null) {
                throw new NullPointerException("Null glVersion");
            }
            m5dVar.b = strI;
            this.l = o76.f(eu4Var, map);
            int iG = o76.g();
            this.b = iG;
            v(iG);
            this.e = Thread.currentThread();
            atomicBoolean.set(true);
            String strG = ((String) m5dVar.b) == null ? " glVersion" : "";
            if (((String) m5dVar.c) == null) {
                strG = strG.concat(" eglVersion");
            }
            if (((String) m5dVar.o) == null) {
                strG = au1.g(strG, " glExtensions");
            }
            if (((String) m5dVar.X) == null) {
                strG = au1.g(strG, " eglExtensions");
            }
            if (strG.isEmpty()) {
                return new na0((String) m5dVar.b, (String) m5dVar.c, (String) m5dVar.o, (String) m5dVar.X);
            }
            throw new IllegalStateException("Missing required properties:".concat(strG));
        } catch (IllegalArgumentException | IllegalStateException e) {
            r();
            throw e;
        }
    }

    public void o(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f).getClass();
        ((EGLContext) this.g).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, (EGLContext) this.g)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void p(Surface surface) {
        o76.d((AtomicBoolean) this.c, true);
        o76.c((Thread) this.e);
        HashMap map = (HashMap) this.d;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, o76.j);
    }

    public void q() {
        if (((AtomicBoolean) this.c).getAndSet(false)) {
            o76.c((Thread) this.e);
            r();
        }
    }

    public void r() {
        Iterator it = ((Map) this.l).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((m76) it.next()).a);
        }
        this.l = Collections.emptyMap();
        this.m = null;
        if (!Objects.equals((EGLDisplay) this.f, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = (HashMap) this.d;
            for (db0 db0Var : map.values()) {
                if (!Objects.equals(db0Var.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f, db0Var.a)) {
                    try {
                        o76.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        e.toString();
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.j, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f, (EGLSurface) this.j);
                this.j = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f, (EGLContext) this.g);
                this.g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f);
            this.f = EGL14.EGL_NO_DISPLAY;
        }
        this.i = null;
        this.b = -1;
        this.n = l76.a;
        this.k = null;
        this.e = null;
    }

    public void s(Surface surface, boolean z) {
        if (((Surface) this.k) == surface) {
            this.k = null;
            o((EGLSurface) this.j);
        }
        HashMap map = (HashMap) this.d;
        db0 db0Var = z ? (db0) map.remove(surface) : (db0) map.put(surface, o76.j);
        if (db0Var == null || db0Var == o76.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f, db0Var.a);
        } catch (RuntimeException e) {
            e.getMessage();
        }
    }

    public void t(long j, float[] fArr, Surface surface) {
        o76.d((AtomicBoolean) this.c, true);
        o76.c((Thread) this.e);
        db0 db0VarL = l(surface);
        if (db0VarL == o76.j) {
            db0VarL = h(surface);
            if (db0VarL == null) {
                return;
            } else {
                ((HashMap) this.d).put(surface, db0VarL);
            }
        }
        Surface surface2 = (Surface) this.k;
        EGLSurface eGLSurface = db0VarL.a;
        if (surface != surface2) {
            o(eGLSurface);
            this.k = surface;
            int i = db0VarL.b;
            int i2 = db0VarL.c;
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glScissor(0, 0, i, i2);
        }
        m76 m76Var = (m76) this.m;
        m76Var.getClass();
        if (m76Var instanceof n76) {
            GLES20.glUniformMatrix4fv(((n76) m76Var).f, 1, false, fArr, 0);
            o76.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        o76.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        s(surface, false);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((see) this.h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public void u() {
        int iS = au1.s(this.b);
        if (iS == 0) {
            this.b = 5;
            return;
        }
        if (iS != 1 && iS != 2 && iS != 3) {
            if (iS == 4) {
                return;
            }
            throw new IllegalStateException("State " + h4f.v(this.b) + " is not handled");
        }
        this.b = 5;
        ((lq1) this.n).b((d15) this.f);
        this.h = null;
        d15 d15Var = (d15) this.f;
        if (d15Var == null) {
            ((lq1) this.l).b(null);
            return;
        }
        Objects.toString(d15Var);
        d15 d15Var2 = (d15) this.f;
        d15Var2.getClass();
        d15Var2.h.execute(new r05(d15Var2, 4));
        ((d15) this.f).i.d(new ule(11, this), (Executor) this.d);
        this.f = null;
    }

    public void v(int i) {
        m76 m76Var = (m76) ((Map) this.l).get((l76) this.n);
        if (m76Var == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + ((l76) this.n));
        }
        if (((m76) this.m) != m76Var) {
            this.m = m76Var;
            m76Var.b();
            Objects.toString((l76) this.n);
            Objects.toString((m76) this.m);
        }
        GLES20.glActiveTexture(33984);
        o76.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        o76.b("glBindTexture");
    }

    public zm4() {
        this.a = 1;
        this.c = new AtomicBoolean(false);
        this.d = new HashMap();
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.h = o76.a;
        this.j = EGL14.EGL_NO_SURFACE;
        this.l = Collections.emptyMap();
        this.m = null;
        this.n = l76.a;
        this.b = -1;
    }

    public zm4(av1 av1Var, q6d q6dVar, Executor executor) {
        this.a = 2;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.b = 1;
        this.k = new dw6(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.l = null;
        this.m = new dw6(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.n = null;
        this.c = executor;
        this.d = q6dVar;
        this.e = av1Var;
    }
}
