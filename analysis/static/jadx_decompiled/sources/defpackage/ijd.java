package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ijd extends ojd {
    public final /* synthetic */ List c;
    public final /* synthetic */ Matrix d;

    public ijd(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.ojd
    public final void a(Matrix matrix, ejd ejdVar, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ojd) it.next()).a(this.d, ejdVar, i, canvas);
        }
    }
}
