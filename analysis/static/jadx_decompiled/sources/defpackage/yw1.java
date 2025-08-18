package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface yw1 {
    Set a();

    int b();

    boolean c();

    String d();

    xm7 e();

    default yw1 f() {
        return this;
    }

    int g();

    bue h();

    default px1 i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new sw1() { // from class: xw1
            @Override // defpackage.sw1
            public final List a(List list) {
                String strD = this.b.d();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    yw1 yw1Var = (yw1) it.next();
                    c54.k(yw1Var instanceof yw1);
                    if (yw1Var.d().equals(strD)) {
                        return Collections.singletonList(yw1Var);
                    }
                }
                throw new IllegalStateException(zr6.i("Unable to find camera with id ", strD, " from list of available cameras."));
            }
        });
        linkedHashSet.add(new tf7(g()));
        return new px1(linkedHashSet);
    }

    String j();

    List k(int i);

    int l(int i);

    boolean m();

    void n(ok4 ok4Var, pt1 pt1Var);

    e15 o();

    bj6 p();

    List q(int i);

    xm7 r();

    void s(iv1 iv1Var);
}
