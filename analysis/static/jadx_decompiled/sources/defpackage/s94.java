package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* loaded from: classes.dex */
public final class s94 implements cq4 {
    public final Resources a;
    public final cq4 b;
    public final cq4 c = null;

    public s94(Resources resources, j84 j84Var) {
        this.a = resources;
        this.b = j84Var;
    }

    @Override // defpackage.cq4
    public final Drawable a(l43 l43Var) {
        try {
            f46.I();
            if (l43Var instanceof CloseableStaticBitmap) {
                CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) l43Var;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, closeableStaticBitmap.getUnderlyingBitmap());
                if ((closeableStaticBitmap.getRotationAngle() == 0 || closeableStaticBitmap.getRotationAngle() == -1) && (closeableStaticBitmap.getExifOrientation() == 1 || closeableStaticBitmap.getExifOrientation() == 0)) {
                    return bitmapDrawable;
                }
                return new ena(bitmapDrawable, closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
            }
            cq4 cq4Var = this.b;
            if (cq4Var != null && cq4Var.b(l43Var)) {
                return cq4Var.a(l43Var);
            }
            cq4 cq4Var2 = this.c;
            if (cq4Var2 != null && cq4Var2.b(l43Var)) {
                return cq4Var2.a(l43Var);
            }
            f46.I();
            return null;
        } finally {
            f46.I();
        }
    }

    @Override // defpackage.cq4
    public final boolean b(l43 l43Var) {
        return true;
    }
}
