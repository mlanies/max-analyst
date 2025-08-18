package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class x67 {
    public final khe a;

    public x67() {
        this.a = new khe(new m57(4));
    }

    public v67 a(ArrayList arrayList) {
        float f;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((v67) it.next()).c;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            v67 v67Var = (v67) it2.next();
            if (i != 0) {
                f = (v67Var.c != 0 ? v67Var.d / v67Var.c : 0.0f) * (v67Var.c / i);
            } else {
                f = 1.0f;
            }
            v67Var.e = f;
        }
        c63.U(arrayList, (w67) this.a.getValue());
        v67 v67Var2 = (v67) arrayList.get(0);
        v67Var2.c++;
        v67Var2.b++;
        return v67Var2;
    }

    public x67(Context context, String str) {
        this.a = new khe(new v2b(context, 4, str));
    }
}
