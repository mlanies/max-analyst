package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nu4 implements tj3 {
    public final /* synthetic */ int a;
    public Object b;

    @Override // defpackage.tj3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((tj3) this.b).accept(obj);
                return;
            case 1:
                ox5 ox5Var = (ox5) obj;
                if (ox5Var == null) {
                    ox5Var = new ox5(-3);
                }
                ((y7g) this.b).C(ox5Var);
                return;
            default:
                ox5 ox5Var2 = (ox5) obj;
                synchronized (px5.c) {
                    try {
                        qpd qpdVar = px5.d;
                        ArrayList arrayList = (ArrayList) qpdVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        qpdVar.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((tj3) arrayList.get(i)).accept(ox5Var2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ nu4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
