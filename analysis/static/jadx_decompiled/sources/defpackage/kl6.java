package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class kl6 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ kl6(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(fm9.p(((vk6) obj).getC(), this.b));
            default:
                hx8 hx8Var = (hx8) obj;
                List list = this.b;
                boolean z = true;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            hx8 hx8Var2 = (hx8) it.next();
                            if (tpa.f(hx8Var2.a.b, hx8Var.a.b) && hx8Var2.b >= hx8Var.b) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
