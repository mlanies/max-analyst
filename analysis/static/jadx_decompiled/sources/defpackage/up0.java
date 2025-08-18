package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class up0 extends nj0 {
    public final Context c;
    public final int d = 3;
    public final tpd e = new tpd(String.format(null, "IntrinsicBlur;%d", Arrays.copyOf(new Object[]{24}, 1)));

    public up0(Context context) {
        this.c = context;
    }

    @Override // defpackage.q6b
    public final ww0 b() {
        return this.e;
    }

    @Override // defpackage.nj0
    public final void c(Bitmap bitmap) {
        if (!bitmap.isMutable()) {
            throw new IllegalArgumentException();
        }
        if (!(((float) bitmap.getHeight()) <= 2048.0f)) {
            throw new IllegalArgumentException();
        }
        if (!(((float) bitmap.getWidth()) <= 2048.0f)) {
            throw new IllegalArgumentException();
        }
        int i = this.d;
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        try {
            j1e.p(bitmap, i);
        } catch (OutOfMemoryError e) {
            String str = String.format(null, "OOM: %d iterations on %dx%d with %d radius", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), 24}, 4));
            if (ta5.a.i(6)) {
                ta5.a.e("IterativeBoxBlurFilter", str);
            }
            throw e;
        }
    }

    @Override // defpackage.nj0
    public final void d(Bitmap bitmap, Bitmap bitmap2) throws Throwable {
        RenderScript renderScript = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(this.c);
            if (renderScriptCreate == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            try {
                ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap2);
                if (allocationCreateFromBitmap == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                if (allocationCreateFromBitmap2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scriptIntrinsicBlurCreate.setRadius(24);
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                allocationCreateFromBitmap2.copyTo(bitmap);
                scriptIntrinsicBlurCreate.destroy();
                allocationCreateFromBitmap.destroy();
                allocationCreateFromBitmap2.destroy();
                renderScriptCreate.destroy();
            } catch (Throwable th) {
                th = th;
                renderScript = renderScriptCreate;
                if (renderScript != null) {
                    renderScript.destroy();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
