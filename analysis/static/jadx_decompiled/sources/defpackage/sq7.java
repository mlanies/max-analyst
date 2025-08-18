package defpackage;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class sq7 extends w0e {
    public final /* synthetic */ hab Y;
    public final /* synthetic */ eab Z;
    public final /* synthetic */ wv6 s0;
    public final /* synthetic */ CancellationSignal t0;
    public final /* synthetic */ tq7 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq7(tq7 tq7Var, fi0 fi0Var, hab habVar, eab eabVar, hab habVar2, eab eabVar2, wv6 wv6Var, CancellationSignal cancellationSignal) {
        super(fi0Var, habVar, eabVar, "LocalThumbnailBitmapSdk29Producer");
        this.u0 = tq7Var;
        this.Y = habVar2;
        this.Z = eabVar2;
        this.s0 = wv6Var;
        this.t0 = cancellationSignal;
    }

    @Override // defpackage.w0e
    public final void b(Object obj) {
        o43.S((o43) obj);
    }

    @Override // defpackage.w0e
    public final Map c(Object obj) {
        return dx6.a("createdThumbnail", String.valueOf(((o43) obj) != null));
    }

    @Override // defpackage.w0e
    public final Object d() throws IOException {
        String strA;
        Bitmap bitmapLoadThumbnail;
        tq7 tq7Var = this.u0;
        wv6 wv6Var = this.s0;
        jic jicVar = wv6Var.i;
        int i = jicVar != null ? jicVar.a : 2048;
        Uri uri = wv6Var.b;
        Size size = new Size(i, jicVar != null ? jicVar.b : 2048);
        try {
            tq7Var.getClass();
            strA = e9f.a(tq7Var.c, uri);
        } catch (IllegalArgumentException unused) {
            strA = null;
        }
        CancellationSignal cancellationSignal = this.t0;
        if (strA != null) {
            String strA2 = ym8.a(strA);
            bitmapLoadThumbnail = strA2 != null ? eae.o0(strA2, "video/", false) : false ? ThumbnailUtils.createVideoThumbnail(new File(strA), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(strA), size, cancellationSignal);
        } else {
            bitmapLoadThumbnail = null;
        }
        if (bitmapLoadThumbnail == null) {
            bitmapLoadThumbnail = tq7Var.c.loadThumbnail(uri, size, cancellationSignal);
        }
        if (bitmapLoadThumbnail == null) {
            return null;
        }
        CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(bitmapLoadThumbnail, pq9.q(), hx6.d, 0);
        oj0 oj0Var = (oj0) this.Z;
        oj0Var.putExtra(HasExtraData.KEY_IMAGE_FORMAT, "thumbnail");
        closeableStaticBitmapOf.putExtras(oj0Var.Y);
        return o43.o0(closeableStaticBitmapOf);
    }

    @Override // defpackage.w0e
    public final void e() {
        super.e();
        this.t0.cancel();
    }

    @Override // defpackage.w0e
    public final void f(Exception exc) {
        super.f(exc);
        hab habVar = this.Y;
        eab eabVar = this.Z;
        habVar.e(eabVar, "LocalThumbnailBitmapSdk29Producer", false);
        ((oj0) eabVar).h("local", "thumbnail_bitmap");
    }

    @Override // defpackage.w0e
    public final void g(Object obj) {
        o43 o43Var = (o43) obj;
        super.g(o43Var);
        boolean z = o43Var != null;
        hab habVar = this.Y;
        eab eabVar = this.Z;
        habVar.e(eabVar, "LocalThumbnailBitmapSdk29Producer", z);
        ((oj0) eabVar).h("local", "thumbnail_bitmap");
    }
}
