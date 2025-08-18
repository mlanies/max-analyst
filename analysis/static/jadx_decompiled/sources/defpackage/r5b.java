package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class r5b {
    public static final int a = exb.pooling_container_listener_holder_tag;
    public static final int b = exb.is_pooling_container_tag;

    public static final void a(View view) {
        f6d f6dVarU = m6d.u((a66) lz7.m(view).b);
        while (f6dVarU.hasNext()) {
            View view2 = (View) f6dVarU.next();
            int i = a;
            s5b s5bVar = (s5b) view2.getTag(i);
            if (s5bVar == null) {
                s5bVar = new s5b();
                view2.setTag(i, s5bVar);
            }
            ArrayList arrayList = s5bVar.a;
            int iL = y53.L(arrayList);
            if (-1 < iL) {
                au1.r(arrayList.get(iL));
                throw null;
            }
        }
    }
}
