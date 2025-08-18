package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nsd {
    public final ArrayList a = new ArrayList();

    public final void a(nb7... nb7VarArr) {
        ArrayList arrayList = new ArrayList();
        for (nb7 nb7Var : nb7VarArr) {
            String canonicalName = ((f23) nb7Var).a().getCanonicalName();
            if (canonicalName != null) {
                arrayList.add(canonicalName);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a.add(x53.e0(ys.m0((String[]) Arrays.copyOf(strArr, strArr.length))));
    }
}
