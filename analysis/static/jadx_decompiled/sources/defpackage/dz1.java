package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class dz1 extends View implements rbe {
    public final ArrayList a;
    public List b;
    public int c;
    public float o;
    public gz1 s0;
    public float t0;

    public dz1(Context context) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.emptyList();
        this.c = 0;
        this.o = 0.0533f;
        this.s0 = gz1.g;
        this.t0 = 0.08f;
    }

    @Override // defpackage.rbe
    public final void a(List list, gz1 gz1Var, float f, int i, float f2) {
        this.b = list;
        this.s0 = gz1Var;
        this.o = f;
        this.c = i;
        this.t0 = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new lbe(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ab  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r39) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz1.dispatchDraw(android.graphics.Canvas):void");
    }
}
