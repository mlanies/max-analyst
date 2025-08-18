package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class tde {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ ude E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public k7 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public tde(ude udeVar, Menu menu) {
        this.E = udeVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.y;
        ude udeVar = this.E;
        if (str != null) {
            if (udeVar.c.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (udeVar.d == null) {
                udeVar.d = ude.a(udeVar.c);
            }
            Object obj = udeVar.d;
            String str2 = this.y;
            sde sdeVar = new sde();
            sdeVar.b = obj;
            Class<?> cls = obj.getClass();
            try {
                sdeVar.c = cls.getMethod(str2, sde.d);
                menuItem.setOnMenuItemClickListener(sdeVar);
            } catch (Exception e) {
                StringBuilder sbM = au1.m("Couldn't resolve menu item onClick handler ", str2, " in class ");
                sbM.append(cls.getName());
                InflateException inflateException = new InflateException(sbM.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof br8) {
                br8 br8Var = (br8) menuItem;
                br8Var.I0 = (br8Var.I0 & (-5)) | 4;
            } else if (menuItem instanceof fr8) {
                fr8 fr8Var = (fr8) menuItem;
                try {
                    Method method = fr8Var.X;
                    vde vdeVar = fr8Var.o;
                    if (method == null) {
                        fr8Var.X = vdeVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    fr8Var.X.invoke(vdeVar, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
        String str3 = this.x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, ude.e, udeVar.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        k7 k7Var = this.z;
        if (k7Var != null && (menuItem instanceof vde)) {
            ((vde) menuItem).a(k7Var);
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof vde;
        if (z2) {
            ((vde) menuItem).setContentDescription(charSequence);
        } else {
            zq8.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((vde) menuItem).setTooltipText(charSequence2);
        } else {
            zq8.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((vde) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            zq8.g(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((vde) menuItem).setNumericShortcut(c2, i4);
        } else {
            zq8.k(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((vde) menuItem).setIconTintMode(mode);
            } else {
                zq8.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((vde) menuItem).setIconTintList(colorStateList);
            } else {
                zq8.i(menuItem, colorStateList);
            }
        }
    }
}
