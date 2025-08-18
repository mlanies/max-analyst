package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ng5 {
    public final ye4 a = new ye4(3);
    public final ue5 b;
    public final p82 c;
    public final au8 d;
    public final y8f e;
    public final py8 f;
    public final wef g;
    public final pg5 h;
    public final og5 i;
    public final mg5 j;

    public ng5(ue5 ue5Var, wa4 wa4Var, p82 p82Var, au8 au8Var, y8f y8fVar, py8 py8Var, wef wefVar, pg5 pg5Var, og5 og5Var, mg5 mg5Var) {
        this.b = ue5Var;
        this.c = p82Var;
        this.d = au8Var;
        this.e = y8fVar;
        this.f = py8Var;
        this.g = wefVar;
        this.h = pg5Var;
        this.i = og5Var;
        this.j = mg5Var;
    }

    public final nw4 a(va8 va8Var) {
        gx0 gx0Var = gx0.a;
        pg5 pg5Var = this.h;
        List listB = b(pg5Var.a(gx0Var), null, va8Var);
        if (pg5Var.j == null) {
            Context context = ((kk5) pg5Var.a).c;
            pg5Var.j = Arrays.asList(context.getExternalCacheDir(), context.getFilesDir());
        }
        List list = pg5Var.j;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listB.addAll(b((File) it.next(), null, va8Var));
            }
        }
        Collections.sort(listB, this.a);
        return new nw4(listB, this.i, pg5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.io.File r13, defpackage.gx0 r14, defpackage.va8 r15) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng5.b(java.io.File, gx0, va8):java.util.List");
    }
}
