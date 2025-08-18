package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ch8 {
    public final ug8 a;
    public final ArrayList b = new ArrayList();
    public final ey1 c;
    public vg8 d;

    public ch8(ug8 ug8Var) {
        this.a = ug8Var;
        this.c = ug8Var.b;
    }

    public final dh8 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((dh8) arrayList.get(i)).b.equals(str)) {
                return (dh8) arrayList.get(i);
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.c.b).getPackageName() + " }";
    }
}
