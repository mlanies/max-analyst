package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hc3 implements zl4, am4 {
    public sv0 a;
    public volatile boolean b;

    public static void e(sv0 sv0Var) {
        if (sv0Var == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : (Object[]) sv0Var.e) {
            if (obj instanceof zl4) {
                try {
                    ((zl4) obj).g();
                } catch (Throwable th) {
                    c37.B(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw q45.f((Throwable) arrayList.get(0));
        }
    }

    @Override // defpackage.am4
    public final boolean a(zl4 zl4Var) {
        Objects.requireNonNull(zl4Var, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        sv0 sv0Var = this.a;
                        if (sv0Var == null) {
                            sv0Var = new sv0();
                            this.a = sv0Var;
                        }
                        sv0Var.a(zl4Var);
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
        zl4Var.g();
        return true;
    }

    @Override // defpackage.am4
    public final boolean c(zl4 zl4Var) {
        Object obj;
        Objects.requireNonNull(zl4Var, "disposable is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                sv0 sv0Var = this.a;
                if (sv0Var != null) {
                    Object[] objArr = (Object[]) sv0Var.e;
                    int i = sv0Var.b;
                    int iHashCode = zl4Var.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(zl4Var)) {
                            sv0Var.d(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj = objArr[i2];
                                if (obj == null) {
                                }
                            } while (!obj.equals(zl4Var));
                            sv0Var.d(i2, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final void d() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                sv0 sv0Var = this.a;
                this.a = null;
                e(sv0Var);
            } catch (Throwable th) {
                throw th;
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
                sv0 sv0Var = this.a;
                this.a = null;
                e(sv0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return this.b;
    }
}
