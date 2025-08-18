package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class a17 extends bz {
    public final String X;
    public final jc7 o;

    public a17(jc7 jc7Var, String str, boolean z, boolean z2) {
        super(b10.INLINE_KEYBOARD, z, z2);
        this.o = jc7Var;
        this.X = str;
    }

    @Override // defpackage.bz
    public final HashMap a() {
        HashMap mapA = super.a();
        ArrayList arrayList = new ArrayList();
        for (List<gv0> list : (List) this.o.a) {
            ArrayList arrayList2 = new ArrayList();
            arrayList.add(arrayList2);
            for (gv0 gv0Var : list) {
                gv0Var.getClass();
                HashMap map = new HashMap();
                String str = gv0Var.o;
                if (str != null) {
                    map.put("url", str);
                }
                map.put("type", gv0Var.a.a);
                map.put("text", gv0Var.b);
                map.put("intent", gv0Var.c.a);
                map.put(ApiProtocol.PARAM_PAYLOAD, gv0Var.X);
                map.put("isQuick", Boolean.valueOf(gv0Var.Y));
                map.put("contactId", Long.valueOf(gv0Var.Z));
                arrayList2.add(map);
            }
        }
        mapA.put("buttons", arrayList);
        return mapA;
    }
}
