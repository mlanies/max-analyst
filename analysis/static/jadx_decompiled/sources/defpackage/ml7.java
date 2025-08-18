package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ml7 implements zl4, am4 {
    public LinkedList a;
    public volatile boolean b;

    @Override // defpackage.am4
    public final boolean a(zl4 zl4Var) {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        LinkedList linkedList = this.a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.a = linkedList;
                        }
                        linkedList.add(zl4Var);
                        return true;
                    }
                } finally {
                }
            }
        }
        zl4Var.g();
        return false;
    }

    @Override // defpackage.am4
    public final boolean b(zl4 zl4Var) {
        if (!c(zl4Var)) {
            return false;
        }
        ((dtc) zl4Var).g();
        return true;
    }

    @Override // defpackage.am4
    public final boolean c(zl4 zl4Var) {
        Objects.requireNonNull(zl4Var, "Disposable item is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                LinkedList linkedList = this.a;
                if (linkedList != null && linkedList.remove(zl4Var)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                LinkedList linkedList = this.a;
                ArrayList arrayList = null;
                this.a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((zl4) it.next()).g();
                    } catch (Throwable th) {
                        c37.B(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw q45.f((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.b;
    }
}
