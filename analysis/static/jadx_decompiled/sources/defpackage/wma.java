package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class wma implements ce3 {
    public static final ye4 b;
    public static final wma c;
    public final TreeMap a;

    static {
        ye4 ye4Var = new ye4(12);
        b = ye4Var;
        c = new wma(new TreeMap(ye4Var));
    }

    public wma(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static wma a(ce3 ce3Var) {
        if (wma.class.equals(ce3Var.getClass())) {
            return (wma) ce3Var;
        }
        TreeMap treeMap = new TreeMap(b);
        for (aa0 aa0Var : ce3Var.g()) {
            Set<be3> setI = ce3Var.i(aa0Var);
            ArrayMap arrayMap = new ArrayMap();
            for (be3 be3Var : setI) {
                arrayMap.put(be3Var, ce3Var.l(aa0Var, be3Var));
            }
            treeMap.put(aa0Var, arrayMap);
        }
        return new wma(treeMap);
    }

    @Override // defpackage.ce3
    public final void e(f9 f9Var) {
        for (Map.Entry entry : this.a.tailMap(new aa0(Void.class, null, "camera2.captureRequest.option.")).entrySet()) {
            if (!((aa0) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            aa0 aa0Var = (aa0) entry.getKey();
            mi9 mi9Var = (mi9) ((wd6) f9Var.b).b;
            ce3 ce3Var = (ce3) f9Var.c;
            mi9Var.d(aa0Var, ce3Var.q(aa0Var), ce3Var.h(aa0Var));
        }
    }

    @Override // defpackage.ce3
    public final Object f(aa0 aa0Var, Object obj) {
        try {
            return h(aa0Var);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // defpackage.ce3
    public final Set g() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // defpackage.ce3
    public final Object h(aa0 aa0Var) {
        Map map = (Map) this.a.get(aa0Var);
        if (map != null) {
            return map.get((be3) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aa0Var);
    }

    @Override // defpackage.ce3
    public final Set i(aa0 aa0Var) {
        Map map = (Map) this.a.get(aa0Var);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.ce3
    public final Object l(aa0 aa0Var, be3 be3Var) {
        Map map = (Map) this.a.get(aa0Var);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aa0Var);
        }
        if (map.containsKey(be3Var)) {
            return map.get(be3Var);
        }
        throw new IllegalArgumentException("Option does not exist: " + aa0Var + " with priority=" + be3Var);
    }

    @Override // defpackage.ce3
    public final boolean o(aa0 aa0Var) {
        return this.a.containsKey(aa0Var);
    }

    @Override // defpackage.ce3
    public final be3 q(aa0 aa0Var) {
        Map map = (Map) this.a.get(aa0Var);
        if (map != null) {
            return (be3) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aa0Var);
    }
}
