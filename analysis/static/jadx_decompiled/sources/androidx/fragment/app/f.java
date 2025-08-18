package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public FragmentManagerViewModel d;

    public final void a(a aVar) {
        if (this.a.contains(aVar)) {
            throw new IllegalStateException("Fragment already added: " + aVar);
        }
        synchronized (this.a) {
            this.a.add(aVar);
        }
        aVar.w0 = true;
    }

    public final a b(String str) {
        e eVar = (e) this.b.get(str);
        if (eVar != null) {
            return eVar.c;
        }
        return null;
    }

    public final a c(String str) {
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                a aVarC = eVar.c;
                if (!str.equals(aVarC.Y)) {
                    aVarC = aVarC.H0.c.c(str);
                }
                if (aVarC != null) {
                    return aVarC;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                arrayList.add(eVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(e eVar) {
        a aVar = eVar.c;
        String str = aVar.Y;
        HashMap map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(aVar.Y, eVar);
        if (aVar.P0) {
            if (aVar.O0) {
                this.d.e(aVar);
            } else {
                this.d.g(aVar);
            }
            aVar.P0 = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            aVar.toString();
        }
    }

    public final void h(e eVar) {
        a aVar = eVar.c;
        if (aVar.O0) {
            this.d.g(aVar);
        }
        HashMap map = this.b;
        if (map.get(aVar.Y) == eVar && ((e) map.put(aVar.Y, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            aVar.toString();
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap map = this.c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
