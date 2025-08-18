package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes.dex */
public abstract class c9g {
    public static final ColorDrawable a = new ColorDrawable(0);

    public static Drawable a(Drawable drawable, wnc wncVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = bitmapDrawable.getPaint();
            wncVar.getClass();
            onc oncVar = new onc(resources, bitmap, paint);
            b(oncVar, wncVar);
            return oncVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            unc uncVar = new unc((NinePatchDrawable) drawable);
            b(uncVar, wncVar);
            return uncVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            ta5.m("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        qnc qncVar = new qnc(((ColorDrawable) drawable).getColor());
        b(qncVar, wncVar);
        return qncVar;
    }

    public static void b(nnc nncVar, wnc wncVar) {
        nncVar.b(wncVar.b);
        nncVar.m(wncVar.c);
        nncVar.a(wncVar.f, wncVar.e);
        nncVar.i(wncVar.g);
        nncVar.k();
        nncVar.e(wncVar.h);
        nncVar.g();
    }

    public static Drawable c(Drawable drawable, wnc wncVar, Resources resources) {
        try {
            f46.I();
            if (drawable != null && wncVar != null && wncVar.a == 2) {
                if (!(drawable instanceof g06)) {
                    return a(drawable, wncVar, resources);
                }
                dq4 dq4Var = (g06) drawable;
                while (true) {
                    Object objJ = dq4Var.j();
                    if (objJ == dq4Var || !(objJ instanceof dq4)) {
                        break;
                    }
                    dq4Var = (dq4) objJ;
                }
                dq4Var.f(a(dq4Var.f(a), wncVar, resources));
                return drawable;
            }
            return drawable;
        } finally {
            f46.I();
        }
    }

    public static Drawable d(Drawable drawable, wnc wncVar) {
        try {
            f46.I();
            if (drawable != null && wncVar != null && wncVar.a == 1) {
                snc sncVar = new snc(drawable);
                b(sncVar, wncVar);
                sncVar.z0 = wncVar.d;
                sncVar.invalidateSelf();
                return sncVar;
            }
            return drawable;
        } finally {
            f46.I();
        }
    }

    public static Drawable e(Drawable drawable, rsc rscVar) {
        f46.I();
        if (drawable == null || rscVar == null) {
            f46.I();
            return drawable;
        }
        psc pscVar = new psc(drawable, rscVar);
        f46.I();
        return pscVar;
    }
}
