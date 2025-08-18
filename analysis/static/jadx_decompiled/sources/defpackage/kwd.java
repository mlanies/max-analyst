package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kwd {
    public static final au4 p = new au4(1);
    public static final au4 q = new au4(2);
    public static final au4 r = new au4(3);
    public static final au4 s = new au4(4);
    public static final au4 t = new au4(5);
    public static final au4 u = new au4(6);
    public static final au4 v = new au4(7);
    public static final au4 w = new au4(0);
    public float a;
    public float b;
    public boolean c;
    public final Object d;
    public final ju0 e;
    public boolean f;
    public final float g;
    public final float h;
    public long i;
    public final float j;
    public final ArrayList k;
    public final ArrayList l;
    public lwd m;
    public float n;
    public boolean o;

    public kwd(Object obj, ju0 ju0Var) {
        this(obj, ju0Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
    }

    public static fg d() {
        ThreadLocal threadLocal = fg.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new fg(new ph4(3)));
        }
        return (fg) threadLocal.get();
    }

    public final void a(float f) {
        if (this.f) {
            this.n = f;
            return;
        }
        if (this.m == null) {
            this.m = new lwd(f);
        }
        this.m.i = f;
        g();
    }

    public final void b() {
        if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.f) {
            c(true);
        }
        float f = this.n;
        if (f != Float.MAX_VALUE) {
            lwd lwdVar = this.m;
            if (lwdVar == null) {
                this.m = new lwd(f);
            } else {
                lwdVar.i = f;
            }
            this.n = Float.MAX_VALUE;
        }
    }

    public final void c(boolean z) {
        ArrayList arrayList;
        int i = 0;
        this.f = false;
        fg fgVarD = d();
        fgVarD.a.remove(this);
        ArrayList arrayList2 = fgVarD.b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            fgVarD.f = true;
        }
        this.i = 0L;
        this.c = false;
        while (true) {
            arrayList = this.k;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((kf) arrayList.get(i)).a(this.b, z);
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void e(float f) {
        this.e.G(this.d, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                ((u1f) arrayList.get(i)).getClass();
                throw null;
            }
            i++;
        }
    }

    public final void f() {
        if (this.m.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.o = true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [dg, java.lang.Object] */
    public final void g() {
        lwd lwdVar = this.m;
        if (lwdVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double d = (float) lwdVar.i;
        if (d > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.j * 0.75f);
        lwdVar.d = dAbs;
        lwdVar.e = dAbs * 62.5d;
        if (!d().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.u(this.d);
        }
        float f = this.b;
        if (f > this.g || f < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        fg fgVarD = d();
        ArrayList arrayList = fgVarD.b;
        if (arrayList.size() == 0) {
            ph4 ph4Var = fgVarD.e;
            ph4Var.getClass();
            ((Choreographer) ph4Var.a).postFrameCallback(new eg(0, fgVarD.d));
            if (Build.VERSION.SDK_INT >= 33) {
                fgVarD.g = ValueAnimator.getDurationScale();
                if (fgVarD.h == null) {
                    fgVarD.h = new y7g(fgVarD);
                }
                final y7g y7gVar = fgVarD.h;
                if (((dg) y7gVar.b) == null) {
                    ?? r2 = new ValueAnimator.DurationScaleChangeListener() { // from class: dg
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((fg) y7gVar.c).g = f2;
                        }
                    };
                    y7gVar.b = r2;
                    ValueAnimator.registerDurationScaleChangeListener(r2);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public kwd(Object obj, ju0 ju0Var, float f) {
        this(obj, ju0Var, 0);
        this.m = null;
        this.n = Float.MAX_VALUE;
        this.o = false;
        this.m = new lwd(f);
    }

    public kwd(Object obj, ju0 ju0Var, int i) {
        this.a = 0.0f;
        this.b = Float.MAX_VALUE;
        this.c = false;
        this.f = false;
        this.g = Float.MAX_VALUE;
        this.h = -3.4028235E38f;
        this.i = 0L;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = obj;
        this.e = ju0Var;
        if (ju0Var != t && ju0Var != u && ju0Var != v) {
            if (ju0Var == w) {
                this.j = 0.00390625f;
                return;
            } else if (ju0Var != r && ju0Var != s) {
                this.j = 1.0f;
                return;
            } else {
                this.j = 0.002f;
                return;
            }
        }
        this.j = 0.1f;
    }
}
