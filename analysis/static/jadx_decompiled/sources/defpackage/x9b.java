package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x9b {
    public final int a;
    public final Rect b;
    public final int c;
    public final int d;
    public final Matrix e;
    public final yhc f;
    public final String g;
    public final bm7 i;
    public int j = -1;
    public final ArrayList h = new ArrayList();

    public x9b(iz1 iz1Var, Rect rect, int i, int i2, Matrix matrix, yhc yhcVar, oq1 oq1Var, int i3) {
        this.a = i3;
        this.d = i2;
        this.c = i;
        this.b = rect;
        this.e = matrix;
        this.f = yhcVar;
        this.g = String.valueOf(iz1Var.hashCode());
        List<tz1> list = iz1Var.a;
        Objects.requireNonNull(list);
        for (tz1 tz1Var : list) {
            ArrayList arrayList = this.h;
            tz1Var.getClass();
            arrayList.add(0);
        }
        this.i = oq1Var;
    }
}
