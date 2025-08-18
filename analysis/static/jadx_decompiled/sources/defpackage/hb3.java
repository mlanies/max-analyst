package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hb3 extends qy9 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ hb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        switch (this.a) {
            case 0:
                ((pa3) this.b).i(new i0a(f2aVar));
                break;
            case 1:
                ((f38) this.b).a(new i38(f2aVar, 0));
                break;
            case 2:
                ez9 ez9Var = new ez9(f2aVar);
                f2aVar.c(ez9Var);
                try {
                    ((s0a) this.b).e(ez9Var);
                    break;
                } catch (Throwable th) {
                    c37.B(th);
                    if (ez9Var.e(th)) {
                        return;
                    }
                    j47.Z(th);
                    return;
                }
            case 3:
                Object[] objArr = (Object[]) this.b;
                g0a g0aVar = new g0a(f2aVar, objArr);
                f2aVar.c(g0aVar);
                if (!g0aVar.o) {
                    int length = objArr.length;
                    for (int i = 0; i < length && !g0aVar.X; i++) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            g0aVar.a.onError(new NullPointerException(wg0.g(i, "The element at index ", " is null")));
                            break;
                        } else {
                            g0aVar.a.e(obj);
                        }
                    }
                    if (!g0aVar.X) {
                        g0aVar.a.b();
                        break;
                    }
                }
                break;
            case 4:
                try {
                    Iterator it = ((Iterable) this.b).iterator();
                    try {
                        if (it.hasNext()) {
                            j0a j0aVar = new j0a(f2aVar, it);
                            f2aVar.c(j0aVar);
                            if (!j0aVar.o) {
                                while (!j0aVar.c) {
                                    try {
                                        Object next = j0aVar.b.next();
                                        Objects.requireNonNull(next, "The iterator returned a null value");
                                        j0aVar.a.e(next);
                                        if (j0aVar.c) {
                                            break;
                                        } else {
                                            try {
                                                if (!j0aVar.b.hasNext()) {
                                                    if (!j0aVar.c) {
                                                        j0aVar.a.b();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                c37.B(th2);
                                                j0aVar.a.onError(th2);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        c37.B(th3);
                                        j0aVar.a.onError(th3);
                                        return;
                                    }
                                }
                                break;
                            }
                        } else {
                            iz4.a(f2aVar);
                            break;
                        }
                    } catch (Throwable th4) {
                        c37.B(th4);
                        iz4.b(th4, f2aVar);
                        return;
                    }
                } catch (Throwable th5) {
                    c37.B(th5);
                    iz4.b(th5, f2aVar);
                    return;
                }
                break;
            case 5:
                ((wq5) ((ypb) this.b)).d(new k0a(f2aVar));
                break;
            case 6:
                ((iqd) this.b).k(new i38(f2aVar, 1));
                break;
            default:
                if (!tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
                    f2aVar.c(new w6(1, ft.c));
                    f2aVar.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
                    break;
                } else {
                    View view = (View) this.b;
                    imf imfVar = new imf(view, f2aVar);
                    f2aVar.c(imfVar);
                    view.setOnClickListener(imfVar);
                    break;
                }
        }
    }
}
