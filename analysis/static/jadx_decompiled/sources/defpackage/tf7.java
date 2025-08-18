package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class tf7 implements sw1 {
    public final int b;

    public tf7(int i) {
        this.b = i;
    }

    @Override // defpackage.sw1
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yw1 yw1Var = (yw1) it.next();
            c54.j("The camera info doesn't contain internal implementation.", yw1Var instanceof yw1);
            if (yw1Var.g() == this.b) {
                arrayList.add(yw1Var);
            }
        }
        return arrayList;
    }
}
