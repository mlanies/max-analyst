package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class px5 {
    public static final mw7 a = new mw7(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final qpd d;

    static {
        qhc qhcVar = new qhc();
        qhcVar.a = "fonts-androidx";
        qhcVar.b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), qhcVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new qpd(0);
    }

    public static ox5 a(String str, Context context, bg4 bg4Var, int i) {
        mw7 mw7Var = a;
        Typeface typeface = (Typeface) mw7Var.c(str);
        if (typeface != null) {
            return new ox5(typeface);
        }
        try {
            sh0 sh0VarP = z7.p(context, bg4Var);
            int i2 = 1;
            vx5[] vx5VarArr = (vx5[]) sh0VarP.c;
            int i3 = sh0VarP.b;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else if (vx5VarArr != null && vx5VarArr.length != 0) {
                int length = vx5VarArr.length;
                i2 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = vx5VarArr[i4].e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
            }
            if (i2 != 0) {
                return new ox5(i2);
            }
            Typeface typefaceA = a4f.a(context, vx5VarArr, i);
            if (typefaceA == null) {
                return new ox5(-3);
            }
            mw7Var.d(str, typefaceA);
            return new ox5(typefaceA);
        } catch (PackageManager.NameNotFoundException unused) {
            return new ox5(-1);
        }
    }
}
