package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class nbf {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final kbf g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final us o;

    public nbf() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new us();
        this.g = new kbf();
        this.a = new Path();
        this.b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.kbf r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbf.a(kbf, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public nbf(nbf nbfVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        us usVar = new us(0);
        this.o = usVar;
        this.g = new kbf(nbfVar.g, usVar);
        this.a = new Path(nbfVar.a);
        this.b = new Path(nbfVar.b);
        this.h = nbfVar.h;
        this.i = nbfVar.i;
        this.j = nbfVar.j;
        this.k = nbfVar.k;
        this.l = nbfVar.l;
        this.m = nbfVar.m;
        String str = nbfVar.m;
        if (str != null) {
            usVar.put(str, this);
        }
        this.n = nbfVar.n;
    }
}
