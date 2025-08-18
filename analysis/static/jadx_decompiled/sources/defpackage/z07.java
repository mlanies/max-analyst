package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class z07 implements ic7 {
    public static final /* synthetic */ int c = 0;
    public final List a;
    public final String b;

    static {
        new z07(new y07());
    }

    public z07(y07 y07Var) {
        this.a = y07Var.a;
        this.b = y07Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(ic7 ic7Var) {
        if (ic7Var == null) {
            return false;
        }
        z07 z07Var = (z07) ic7Var;
        if (!oag.d(z07Var.b, this.b)) {
            return false;
        }
        List list = this.a;
        int size = list.size();
        List list2 = z07Var.a;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            lv0 lv0Var = (lv0) list.get(i);
            if (lv0Var.size() != ((lv0) list2.get(i)).size()) {
                return false;
            }
            for (int i2 = 0; i2 < lv0Var.size(); i2++) {
                if (!((fv0) lv0Var.get(i2)).equals(((lv0) list2.get(i)).get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }
}
