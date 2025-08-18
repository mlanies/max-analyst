package defpackage;

import java.util.Comparator;
import one.me.devmenu.DevMenuScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ii4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ a66 b;

    public /* synthetic */ ii4(a66 a66Var, int i) {
        this.a = i;
        this.b = a66Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        a66 a66Var = this.b;
        switch (this.a) {
            case 0:
                int i = DevMenuScreen.u0;
                break;
        }
        return ((Number) a66Var.invoke(obj, obj2)).intValue();
    }
}
