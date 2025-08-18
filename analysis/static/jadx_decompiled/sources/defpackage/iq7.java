package defpackage;

import android.graphics.Point;

/* loaded from: classes2.dex */
public final /* synthetic */ class iq7 implements nq7 {
    public final /* synthetic */ kq7 a;

    public /* synthetic */ iq7(kq7 kq7Var) {
        this.a = kq7Var;
    }

    @Override // defpackage.nq7
    public void a(int i, int i2) {
        zuc zucVar = this.a.t;
        if (zucVar != null) {
            Point pointA = jb9.a(i, i2);
            zucVar.a(pointA.x, pointA.y);
        }
    }
}
