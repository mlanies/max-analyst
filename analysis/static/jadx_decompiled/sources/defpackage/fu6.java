package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fu6 extends l9f {
    public static final du6 A = new du6();
    public final int p;
    public final AtomicReference q;
    public final int r;
    public int s;
    public Rational t;
    public gvc u;
    public bad v;
    public jc6 w;
    public vje x;
    public cad y;
    public final o9g z;

    public fu6(gu6 gu6Var) {
        super(gu6Var);
        this.q = new AtomicReference(null);
        this.s = -1;
        this.t = null;
        this.z = new o9g(17, this);
        gu6 gu6Var2 = (gu6) this.f;
        aa0 aa0Var = gu6.b;
        if (gu6Var2.o(aa0Var)) {
            this.p = ((Integer) gu6Var2.h(aa0Var)).intValue();
        } else {
            this.p = 1;
        }
        this.r = ((Integer) gu6Var2.f(gu6.t0, 0)).intValue();
        this.u = new gvc((eu6) gu6Var2.f(gu6.v0, null));
    }

    public static boolean I(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void F(boolean z) {
        vje vjeVar;
        kq0.e();
        cad cadVar = this.y;
        if (cadVar != null) {
            cadVar.b();
            this.y = null;
        }
        jc6 jc6Var = this.w;
        if (jc6Var != null) {
            jc6Var.l();
            this.w = null;
        }
        if (z || (vjeVar = this.x) == null) {
            return;
        }
        vjeVar.b();
        this.x = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        if (r8.intValue() == 4101) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bad G(java.lang.String r20, defpackage.gu6 r21, defpackage.vb0 r22) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu6.G(java.lang.String, gu6, vb0):bad");
    }

    public final int H() {
        int iIntValue;
        synchronized (this.q) {
            iIntValue = this.s;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((gu6) this.f).f(gu6.c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void J(Executor executor, ey1 ey1Var) {
        int iRound;
        int i;
        int i2;
        int i3;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ju0.D().execute(new v05((Object) this, executor, (Object) ey1Var, 9));
            return;
        }
        kq0.e();
        if (H() == 3 && this.u.a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        ax1 ax1VarC = c();
        Rect rect = null;
        if (ax1VarC == null) {
            ey1Var.k(new ImageCaptureException("Not bound to a valid Camera [" + this + "]", null));
            return;
        }
        vje vjeVar = this.x;
        Objects.requireNonNull(vjeVar);
        Rect rect2 = this.i;
        vb0 vb0Var = this.g;
        Size size = vb0Var != null ? vb0Var.a : null;
        Objects.requireNonNull(size);
        if (rect2 != null) {
            rect = rect2;
        } else {
            Rational rational = this.t;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                ax1 ax1VarC2 = c();
                Objects.requireNonNull(ax1VarC2);
                int iH = h(ax1VarC2, false);
                Rational rational2 = new Rational(this.t.getDenominator(), this.t.getNumerator());
                if (!e1f.c(iH)) {
                    rational2 = this.t;
                }
                if (rational2 != null && rational2.floatValue() > 0.0f && !rational2.isNaN()) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        int iRound2 = Math.round((f / numerator) * denominator);
                        i3 = (height - iRound2) / 2;
                        i2 = iRound2;
                        iRound = width;
                        i = 0;
                    } else {
                        iRound = Math.round((f2 / denominator) * numerator);
                        i = (width - iRound) / 2;
                        i2 = height;
                        i3 = 0;
                    }
                    rect = new Rect(i, i3, iRound + i, i2 + i3);
                }
                Objects.requireNonNull(rect);
            }
        }
        Matrix matrix = this.j;
        int iH2 = h(ax1VarC, false);
        gu6 gu6Var = (gu6) this.f;
        aa0 aa0Var = gu6.u0;
        if (gu6Var.o(aa0Var)) {
            iIntValue = ((Integer) gu6Var.h(aa0Var)).intValue();
        } else {
            int i4 = this.p;
            if (i4 == 0) {
                iIntValue = 100;
            } else {
                if (i4 != 1 && i4 != 2) {
                    throw new IllegalStateException(wg0.g(i4, "CaptureMode ", " is invalid"));
                }
                iIntValue = 95;
            }
        }
        fc0 fc0Var = new fc0(executor, ey1Var, rect, matrix, iH2, iIntValue, this.p, Collections.unmodifiableList(this.v.e));
        kq0.e();
        vjeVar.a.offer(fc0Var);
        vjeVar.c();
    }

    public final void K() {
        synchronized (this.q) {
            try {
                if (this.q.get() != null) {
                    return;
                }
                d().f(H());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l9f
    public final o9f f(boolean z, r9f r9fVar) {
        A.getClass();
        gu6 gu6Var = du6.a;
        ce3 ce3VarA = r9fVar.a(gu6Var.N(), this.p);
        if (z) {
            ce3VarA = ce3.K(ce3VarA, gu6Var);
        }
        if (ce3VarA == null) {
            return null;
        }
        return new gu6(wma.a(((mt6) l(ce3VarA)).b));
    }

    @Override // defpackage.l9f
    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.l9f
    public final n9f l(ce3 ce3Var) {
        return new mt6(mi9.c(ce3Var), 1);
    }

    @Override // defpackage.l9f
    public final void s() {
        c54.o(c(), "Attached camera cannot be null");
        if (H() == 3) {
            ax1 ax1VarC = c();
            if ((ax1VarC != null ? ax1VarC.p().g() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // defpackage.l9f
    public final void t() {
        K();
        d().g(this.u);
    }

    public final String toString() {
        return "ImageCapture:".concat(g());
    }

    @Override // defpackage.l9f
    public final o9f u(yw1 yw1Var, n9f n9fVar) {
        Object objH;
        Object objH2;
        Object objH3;
        if (yw1Var.p().d(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            ce3 ce3VarF = n9fVar.F();
            aa0 aa0Var = gu6.s0;
            Object objH4 = Boolean.TRUE;
            wma wmaVar = (wma) ce3VarF;
            wmaVar.getClass();
            try {
                objH4 = wmaVar.h(aa0Var);
            } catch (IllegalArgumentException unused) {
            }
            if (!bool.equals(objH4)) {
                ((mi9) n9fVar.F()).j(gu6.s0, Boolean.TRUE);
            }
        }
        ce3 ce3VarF2 = n9fVar.F();
        Boolean bool2 = Boolean.TRUE;
        aa0 aa0Var2 = gu6.s0;
        Object objH5 = Boolean.FALSE;
        wma wmaVar2 = (wma) ce3VarF2;
        wmaVar2.getClass();
        try {
            objH5 = wmaVar2.h(aa0Var2);
        } catch (IllegalArgumentException unused2) {
        }
        boolean zEquals = bool2.equals(objH5);
        Object objH6 = null;
        if (zEquals) {
            if (c() != null) {
                c().h().P();
            }
            try {
                objH3 = wmaVar2.h(gu6.X);
            } catch (IllegalArgumentException unused3) {
                objH3 = null;
            }
            Integer num = (Integer) objH3;
            z = num == null || num.intValue() == 256;
            if (!z) {
                ((mi9) ce3VarF2).j(gu6.s0, Boolean.FALSE);
            }
        }
        ce3 ce3VarF3 = n9fVar.F();
        aa0 aa0Var3 = gu6.X;
        wma wmaVar3 = (wma) ce3VarF3;
        wmaVar3.getClass();
        try {
            objH = wmaVar3.h(aa0Var3);
        } catch (IllegalArgumentException unused4) {
            objH = null;
        }
        Integer num2 = (Integer) objH;
        if (num2 != null) {
            if (c() != null) {
                c().h().P();
            }
            ((mi9) n9fVar.F()).j(tu6.z, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            ce3 ce3VarF4 = n9fVar.F();
            aa0 aa0Var4 = gu6.Y;
            wma wmaVar4 = (wma) ce3VarF4;
            wmaVar4.getClass();
            try {
                objH2 = wmaVar4.h(aa0Var4);
            } catch (IllegalArgumentException unused5) {
                objH2 = null;
            }
            if (Objects.equals(objH2, 1)) {
                ((mi9) n9fVar.F()).j(tu6.z, 4101);
                ((mi9) n9fVar.F()).j(tu6.A, eu4.c);
            } else if (z) {
                ((mi9) n9fVar.F()).j(tu6.z, 35);
            } else {
                ce3 ce3VarF5 = n9fVar.F();
                aa0 aa0Var5 = ev6.I;
                wma wmaVar5 = (wma) ce3VarF5;
                wmaVar5.getClass();
                try {
                    objH6 = wmaVar5.h(aa0Var5);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) objH6;
                if (list == null) {
                    ((mi9) n9fVar.F()).j(tu6.z, 256);
                } else if (I(256, list)) {
                    ((mi9) n9fVar.F()).j(tu6.z, 256);
                } else if (I(35, list)) {
                    ((mi9) n9fVar.F()).j(tu6.z, 35);
                }
            }
        }
        return n9fVar.J();
    }

    @Override // defpackage.l9f
    public final void w() {
        gvc gvcVar = this.u;
        gvcVar.c();
        gvcVar.b();
        vje vjeVar = this.x;
        if (vjeVar != null) {
            vjeVar.b();
        }
    }

    @Override // defpackage.l9f
    public final vb0 x(ce3 ce3Var) {
        this.v.a(ce3Var);
        Object[] objArr = {this.v.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        x3c x3cVarA = this.g.a();
        x3cVarA.X = ce3Var;
        return x3cVarA.c();
    }

    @Override // defpackage.l9f
    public final vb0 y(vb0 vb0Var, vb0 vb0Var2) {
        bad badVarG = G(e(), (gu6) this.f, vb0Var);
        this.v = badVarG;
        Object[] objArr = {badVarG.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        p();
        return vb0Var;
    }

    @Override // defpackage.l9f
    public final void z() {
        gvc gvcVar = this.u;
        gvcVar.c();
        gvcVar.b();
        vje vjeVar = this.x;
        if (vjeVar != null) {
            vjeVar.b();
        }
        F(false);
        d().g(null);
    }
}
