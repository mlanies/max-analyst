package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class zk4 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl4 b;

    public /* synthetic */ zk4(cl4 cl4Var, int i) {
        this.a = i;
        this.b = cl4Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new bl4(this.b);
            case 1:
                cl4 cl4Var = this.b;
                return cl4Var.a.h(cl4Var.f);
            case 2:
                cl4 cl4Var2 = this.b;
                return cl4Var2.a.h(cl4Var2.g);
            default:
                cl4 cl4Var3 = this.b;
                Map map = cl4Var3.h;
                if (map == null) {
                    return oz4.a;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), cl4Var3.a.h((uk4) entry.getValue()));
                }
                return linkedHashMap;
        }
    }

    public /* synthetic */ zk4(cl4 cl4Var, bl4 bl4Var) {
        this.a = 3;
        this.b = cl4Var;
    }
}
