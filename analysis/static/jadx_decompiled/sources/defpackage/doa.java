package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;

/* loaded from: classes2.dex */
public final class doa extends nj0 {
    public final /* synthetic */ int c = 1;
    public Object d;

    public doa() {
    }

    @Override // defpackage.q6b
    public final ww0 b() {
        switch (this.c) {
            case 0:
                return new tpd(String.valueOf(((Uri) this.d).hashCode()));
            default:
                if (((tpd) this.d) == null) {
                    this.d = new tpd("RoundAsCirclePostprocessor#AntiAliased");
                }
                return (tpd) this.d;
        }
    }

    @Override // defpackage.nj0
    public final void c(Bitmap bitmap) throws Throwable {
        switch (this.c) {
            case 0:
                Bitmap bitmapO = c37.o((Uri) this.d);
                if (bitmapO != null) {
                    Canvas canvas = new Canvas(bitmap);
                    float width = bitmap.getWidth() / bitmapO.getWidth();
                    canvas.scale(width, width);
                    canvas.drawBitmap(bitmapO, 0.0f, 0.0f, (Paint) null);
                    break;
                }
                break;
            default:
                NativeRoundingFilter.toCircleFast(bitmap, true);
                break;
        }
    }

    public doa(Uri uri) {
        this.d = uri;
    }

    public /* synthetic */ doa(boolean z) {
    }
}
