package defpackage;

/* loaded from: classes.dex */
public final class qne {
    public final ukg a = new ukg();

    public final void a(Exception exc) {
        this.a.m(exc);
    }

    public final void b(Object obj) {
        this.a.n(obj);
    }

    public final void c(Exception exc) {
        ukg ukgVar = this.a;
        ukgVar.getClass();
        fp3.o(exc, "Exception must not be null");
        synchronized (ukgVar.a) {
            try {
                if (ukgVar.c) {
                    return;
                }
                ukgVar.c = true;
                ukgVar.f = exc;
                ukgVar.b.z(ukgVar);
            } finally {
            }
        }
    }

    public final void d(Object obj) {
        ukg ukgVar = this.a;
        synchronized (ukgVar.a) {
            try {
                if (ukgVar.c) {
                    return;
                }
                ukgVar.c = true;
                ukgVar.e = obj;
                ukgVar.b.z(ukgVar);
            } finally {
            }
        }
    }
}
