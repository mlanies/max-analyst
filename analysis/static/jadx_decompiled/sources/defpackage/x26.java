package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class x26 extends nj0 {
    public final gef c;
    public final long d;
    public final String e = x26.class.getName();

    public x26(gef gefVar, long j) {
        this.c = gefVar;
        this.d = j;
    }

    @Override // defpackage.nj0, defpackage.q6b
    public final o43 a(Bitmap bitmap, s2b s2bVar) {
        gef gefVar = this.c;
        uy uyVarB = gefVar.b();
        if (uyVarB == null) {
            hm9.m0(this.e, "No video collage", new Object[0]);
            s2bVar.getClass();
            return s2bVar.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), null);
        }
        int iC = (int) gefVar.c();
        int i = uyVarB.X;
        int width = bitmap.getWidth();
        int i2 = uyVarB.o;
        int i3 = width / i2;
        int i4 = ((int) this.d) / (iC / i);
        int i5 = i - 1;
        int iMin = (Math.min(i4, i5) % i3) * i2;
        int iMin2 = Math.min(i4, i5) / i3;
        int i6 = uyVarB.c;
        return s2bVar.b(bitmap, iMin, iMin2 * i6, uyVarB.o, i6, null);
    }

    @Override // defpackage.q6b
    public final ww0 b() {
        StringBuilder sbK = au1.k(this.c.e(), "videoId=", ", millis=");
        sbK.append(this.d);
        return new tpd(sbK.toString());
    }

    @Override // defpackage.nj0, defpackage.q6b
    public final String getName() {
        return x26.class.getSimpleName();
    }
}
