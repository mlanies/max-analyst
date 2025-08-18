package defpackage;

import android.graphics.Bitmap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class w26 extends nj0 {
    public final fef c;
    public final long d;

    public w26(fef fefVar, long j) {
        this.c = fefVar;
        this.d = j;
    }

    @Override // defpackage.nj0, defpackage.q6b
    public final o43 a(Bitmap bitmap, s2b s2bVar) {
        ok0 ok0Var = (ok0) this.c;
        uy uyVar = ok0Var.f;
        if (uyVar == null) {
            hm9.p("w26", "No video collage", null);
            s2bVar.getClass();
            return s2bVar.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), null);
        }
        int i = (int) ok0Var.a;
        int i2 = uyVar.X;
        int width = bitmap.getWidth();
        int i3 = uyVar.o;
        int i4 = width / i3;
        int i5 = ((int) this.d) / (i / i2);
        int i6 = i2 - 1;
        int iMin = (Math.min(i5, i6) % i4) * i3;
        int iMin2 = Math.min(i5, i6) / i4;
        int i7 = uyVar.c;
        return s2bVar.b(bitmap, iMin, iMin2 * i7, uyVar.o, i7, null);
    }

    @Override // defpackage.q6b
    public final ww0 b() {
        Locale locale = Locale.ENGLISH;
        StringBuilder sbK = au1.k(((ok0) this.c).e, "videoId=", ", millis=");
        sbK.append(this.d);
        return new tpd(sbK.toString());
    }

    @Override // defpackage.nj0, defpackage.q6b
    public final String getName() {
        return w26.class.getSimpleName();
    }
}
