package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class p6g extends v6g {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public v27[] d;
    public v27 e;
    public x6g f;
    public v27 g;

    public p6g(x6g x6gVar, WindowInsets windowInsets) {
        super(x6gVar);
        this.e = null;
        this.c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private v27 r(int i2, boolean z) {
        v27 v27VarA = v27.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                v27VarA = v27.a(v27VarA, s(i3, z));
            }
        }
        return v27VarA;
    }

    private v27 t() {
        x6g x6gVar = this.f;
        return x6gVar != null ? x6gVar.a.h() : v27.e;
    }

    private v27 u(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            w();
        }
        Method method = i;
        if (method != null && j != null && k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    return null;
                }
                Rect rect = (Rect) k.get(l.get(objInvoke));
                if (rect != null) {
                    return v27.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void w() throws ClassNotFoundException, SecurityException {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        h = true;
    }

    @Override // defpackage.v6g
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        v27 v27VarU = u(view);
        if (v27VarU == null) {
            v27VarU = v27.e;
        }
        x(v27VarU);
    }

    @Override // defpackage.v6g
    public v27 f(int i2) {
        return r(i2, false);
    }

    @Override // defpackage.v6g
    public final v27 j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = v27.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.v6g
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.v6g
    @SuppressLint({"WrongConstant"})
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !v(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.v6g
    public void p(v27[] v27VarArr) {
        this.d = v27VarArr;
    }

    @Override // defpackage.v6g
    public void q(x6g x6gVar) {
        this.f = x6gVar;
    }

    public v27 s(int i2, boolean z) {
        v27 v27VarH;
        int i3;
        if (i2 == 1) {
            return z ? v27.b(0, Math.max(t().b, j().b), 0, 0) : v27.b(0, j().b, 0, 0);
        }
        if (i2 == 2) {
            if (z) {
                v27 v27VarT = t();
                v27 v27VarH2 = h();
                return v27.b(Math.max(v27VarT.a, v27VarH2.a), 0, Math.max(v27VarT.c, v27VarH2.c), Math.max(v27VarT.d, v27VarH2.d));
            }
            v27 v27VarJ = j();
            x6g x6gVar = this.f;
            v27VarH = x6gVar != null ? x6gVar.a.h() : null;
            int iMin = v27VarJ.d;
            if (v27VarH != null) {
                iMin = Math.min(iMin, v27VarH.d);
            }
            return v27.b(v27VarJ.a, 0, v27VarJ.c, iMin);
        }
        v27 v27Var = v27.e;
        if (i2 == 8) {
            v27[] v27VarArr = this.d;
            v27VarH = v27VarArr != null ? v27VarArr[3] : null;
            if (v27VarH != null) {
                return v27VarH;
            }
            v27 v27VarJ2 = j();
            v27 v27VarT2 = t();
            int i4 = v27VarJ2.d;
            if (i4 > v27VarT2.d) {
                return v27.b(0, 0, 0, i4);
            }
            v27 v27Var2 = this.g;
            return (v27Var2 == null || v27Var2.equals(v27Var) || (i3 = this.g.d) <= v27VarT2.d) ? v27Var : v27.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return v27Var;
        }
        x6g x6gVar2 = this.f;
        tl4 tl4VarE = x6gVar2 != null ? x6gVar2.a.e() : e();
        if (tl4VarE == null) {
            return v27Var;
        }
        DisplayCutout displayCutout = tl4VarE.a;
        return v27.b(sl4.d(displayCutout), sl4.f(displayCutout), sl4.e(displayCutout), sl4.c(displayCutout));
    }

    public boolean v(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !s(i2, false).equals(v27.e);
    }

    public void x(v27 v27Var) {
        this.g = v27Var;
    }
}
