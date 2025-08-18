package defpackage;

import android.util.Range;

/* loaded from: classes.dex */
public final class lc0 {
    public b9b a;
    public Range b;
    public Range c;
    public Integer d;

    public final mc0 a() {
        String strG = this.a == null ? " qualitySelector" : "";
        if (this.b == null) {
            strG = strG.concat(" frameRate");
        }
        if (this.c == null) {
            strG = au1.g(strG, " bitrate");
        }
        if (this.d == null) {
            strG = au1.g(strG, " aspectRatio");
        }
        if (strG.isEmpty()) {
            return new mc0(this.a, this.b, this.c, this.d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strG));
    }

    public final void b(b9b b9bVar) {
        if (b9bVar == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        this.a = b9bVar;
    }
}
