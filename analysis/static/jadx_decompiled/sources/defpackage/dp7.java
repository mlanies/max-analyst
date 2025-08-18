package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public final class dp7 implements lu6 {
    public final Context a;
    public final cx7 b;

    public dp7(Context context, cx7 cx7Var) {
        this.a = context;
        this.b = cx7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lu6
    public final l43 a(g05 g05Var, int i, pqb pqbVar, ju6 ju6Var) {
        Context context = this.a;
        try {
            String str = g05Var.v0;
            if (str == null) {
                throw new IllegalStateException("No source in encoded image".toString());
            }
            Drawable drawableB = kt3.b(context, Integer.parseInt(Uri.parse(str).getPathSegments().get(0)));
            kre kreVar = drawableB instanceof kre ? (kre) drawableB : null;
            pq9 pq9Var = qp4.u0;
            if (kreVar != null) {
                kreVar.onThemeChanged(pq9Var.b(context).i());
            }
            if (drawableB != 0) {
                return new t84(drawableB, (w7c) pq9Var.b(context).t0, this.b);
            }
            return null;
        } catch (Throwable th) {
            ta5.c("DrawableImageDecoder", "Cannot decode drawable", th);
            return null;
        }
    }
}
