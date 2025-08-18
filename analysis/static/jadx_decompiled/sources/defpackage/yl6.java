package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yl6 extends a3d {
    public yl6(tb8 tb8Var, mw0 mw0Var, Executor executor) {
        super(tb8Var, new cn6(), mw0Var, executor);
    }

    public static void i(qm6 qm6Var, lm6 lm6Var, HashSet hashSet, ArrayList arrayList) {
        long j = qm6Var.h + lm6Var.X;
        String str = qm6Var.a;
        String str2 = lm6Var.Z;
        if (str2 != null) {
            Uri uriS = mr0.S(str, str2);
            if (hashSet.add(uriS)) {
                arrayList.add(new y2d(j, a3d.d(uriS)));
            }
        }
        arrayList.add(new y2d(j, new a34(mr0.S(str, lm6Var.a), lm6Var.t0, lm6Var.u0)));
    }

    @Override // defpackage.a3d
    public final ArrayList e(ow0 ow0Var, ok5 ok5Var, boolean z) throws IOException {
        an6 an6Var = (an6) ok5Var;
        ArrayList arrayList = new ArrayList();
        if (an6Var instanceof ym6) {
            List list = ((ym6) an6Var).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(a3d.d((Uri) list.get(i)));
            }
        } else {
            arrayList.add(a3d.d(Uri.parse(an6Var.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a34 a34Var = (a34) it.next();
            arrayList2.add(new y2d(0L, a34Var));
            try {
                qm6 qm6Var = (qm6) ((ok5) c(new w2d(this, ow0Var, a34Var), z));
                zw6 zw6Var = qm6Var.r;
                lm6 lm6Var = null;
                for (int i2 = 0; i2 < zw6Var.size(); i2++) {
                    lm6 lm6Var2 = (lm6) zw6Var.get(i2);
                    lm6 lm6Var3 = lm6Var2.b;
                    if (lm6Var3 != null && lm6Var3 != lm6Var) {
                        i(qm6Var, lm6Var3, hashSet, arrayList2);
                        lm6Var = lm6Var3;
                    }
                    i(qm6Var, lm6Var2, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }
}
