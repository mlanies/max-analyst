package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class ugf {
    public final ReentrantLock a = new ReentrantLock();
    public final LinkedHashMap b = new LinkedHashMap();
    public final kld c;
    public final zn5 d;

    public ugf(je7 je7Var) {
        kld kldVarA = lld.a(1, 1, 2);
        this.c = kldVarA;
        this.d = new zn5(new ovc(new j31(kldVarA, new ovc(((wr1) ((kr1) je7Var.getValue())).I, 7), new xi1(3, null, 5), 4), 6), new rgf(2, null), 5);
    }

    public final void a(View view, llf llfVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.b;
        try {
            vl4 vl4Var = null;
            if (view.isAttachedToWindow() && llfVar != null && llfVar.a && view.getMeasuredWidth() != 0 && view.getMeasuredHeight() != 0) {
                vl4Var = new vl4(llfVar.b, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            if (vl4Var == null) {
                boolean zC = c(view);
                hm9.n("CallVideoDisplayLayoutUpdater", hashCode() + " display layout " + view.hashCode() + " is empty, skip. old value from cache was removed = " + zC + ". total = " + linkedHashMap.size());
                return;
            }
            boolean zF = tpa.f(linkedHashMap.get(view), vl4Var);
            kld kldVar = this.c;
            if (zF) {
                hm9.n("CallVideoDisplayLayoutUpdater", hashCode() + " display layout " + view.hashCode() + ", already added with params = " + vl4Var + ", simple update. total = " + linkedHashMap.size());
                kldVar.g(linkedHashMap);
                return;
            }
            ky7 ky7Var = new ky7();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!tpa.f(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ky7Var.putAll(linkedHashMap2);
            ky7Var.put(view, vl4Var);
            ky7 ky7VarB = ky7Var.b();
            linkedHashMap.clear();
            linkedHashMap.putAll(ky7VarB);
            hm9.n("CallVideoDisplayLayoutUpdater", hashCode() + " add display layout " + view.hashCode() + ", params = " + vl4Var + ", total = " + linkedHashMap.size());
            kldVar.g(ky7VarB);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b() {
        hm9.n("CallVideoDisplayLayoutUpdater", hashCode() + " clear cached states");
        this.b.clear();
        this.c.g(oz4.a);
    }

    public final boolean c(View view) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.b;
        try {
            if (!linkedHashMap.containsKey(view)) {
                reentrantLock.unlock();
                return false;
            }
            ky7 ky7Var = new ky7();
            ky7Var.clear();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object value = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (tpa.f(entry.getKey(), view)) {
                    value = entry.getValue();
                }
                if (true ^ tpa.f(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ky7Var.putAll(linkedHashMap2);
            ky7 ky7VarB = ky7Var.b();
            linkedHashMap.clear();
            linkedHashMap.putAll(ky7VarB);
            this.c.g(ky7VarB);
            hm9.n("CallVideoDisplayLayoutUpdater", hashCode() + " remove display layout participantId=" + value + " for " + view.hashCode() + ", total = " + linkedHashMap.size());
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
