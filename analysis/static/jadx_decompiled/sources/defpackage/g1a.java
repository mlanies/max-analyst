package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g1a extends ArrayList implements c1a {
    public volatile int a;

    @Override // defpackage.c1a
    public final void a() {
        add(hv9.a);
        this.a++;
    }

    @Override // defpackage.c1a
    public final void b(Object obj) {
        add(obj);
        this.a++;
    }

    @Override // defpackage.c1a
    public final void c(a1a a1aVar) {
        if (a1aVar.getAndIncrement() != 0) {
            return;
        }
        f2a f2aVar = a1aVar.b;
        int iAddAndGet = 1;
        while (!a1aVar.o) {
            int i = this.a;
            Integer num = (Integer) a1aVar.c;
            int iIntValue = num != null ? num.intValue() : 0;
            while (iIntValue < i) {
                if (hv9.a(f2aVar, get(iIntValue)) || a1aVar.o) {
                    return;
                } else {
                    iIntValue++;
                }
            }
            a1aVar.c = Integer.valueOf(iIntValue);
            iAddAndGet = a1aVar.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // defpackage.c1a
    public final void d(Throwable th) {
        add(new fv9(th));
        this.a++;
    }
}
