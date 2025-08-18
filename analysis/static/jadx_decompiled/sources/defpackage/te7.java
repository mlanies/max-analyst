package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class te7 implements qw0 {
    public final LinkedHashMap a;

    public te7(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new se7(((Number) entry.getValue()).longValue()));
        }
        this.a = linkedHashMap;
    }

    public static ub8 e(String str) {
        Integer numE0;
        Uri uri = Uri.parse(str);
        ub8.a.getClass();
        String queryParameter = uri.getQueryParameter("MediaItemType");
        return kj6.m((queryParameter == null || (numE0 = dae.e0(queryParameter)) == null) ? -1 : numE0.intValue());
    }

    @Override // defpackage.qw0
    public final void a(gw0 gw0Var, ex0 ex0Var) {
        se7 se7Var = (se7) this.a.get(e(ex0Var.a));
        if (se7Var != null) {
            se7Var.a(gw0Var, ex0Var);
        }
    }

    @Override // defpackage.qw0
    public final void b(gw0 gw0Var, ex0 ex0Var) {
        se7 se7Var = (se7) this.a.get(e(ex0Var.a));
        if (se7Var != null) {
            se7Var.b(gw0Var, ex0Var);
        }
    }

    @Override // defpackage.qw0
    public final void c(gw0 gw0Var, String str, long j, long j2) {
        se7 se7Var = (se7) this.a.get(e(str));
        if (se7Var != null) {
            se7Var.c(gw0Var, str, j, j2);
        }
    }

    @Override // defpackage.qw0
    public final void d(gw0 gw0Var, ex0 ex0Var, vpd vpdVar) {
        a(gw0Var, ex0Var);
        b(gw0Var, vpdVar);
    }
}
