package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes2.dex */
public final class d47 extends pk0 {
    public final ch3 a;
    public final fme b;
    public final hle c;
    public final av0 d;
    public final pk e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public volatile long j;
    public final rx k = new rx();
    public final AtomicBoolean l = new AtomicBoolean(false);

    public d47(ch3 ch3Var, fme fmeVar, hle hleVar, av0 av0Var, pk pkVar, long j, long j2, long j3, String str) {
        this.a = ch3Var;
        this.b = fmeVar;
        this.c = hleVar;
        this.d = av0Var;
        this.e = pkVar;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = str;
    }

    @Override // defpackage.pk0
    public final iqd a() {
        rx rxVar = this.k;
        Object obj = rxVar.a.get();
        Object obj2 = rx.X;
        if (obj == obj2 && rxVar.c != null) {
            rx rxVar2 = this.k;
            return iqd.g(rxVar2.a.get() == obj2 ? rxVar2.c : null);
        }
        rx rxVar3 = this.k;
        re6 re6Var = new re6(17, this);
        rxVar3.getClass();
        oz9 oz9Var = new oz9(rxVar3, new sy4(16, re6Var), new ey1(16, re6Var), new v66(re6Var));
        fme fmeVar = this.b;
        fmeVar.getClass();
        q1a q1aVar = new q1a(0, new e0a(oz9Var, new dme(fmeVar, 1, 2), 6));
        if (this.l.get()) {
            return q1aVar;
        }
        if (!this.a.e()) {
            return iqd.f(new FetcherException(2, "No internet connection"));
        }
        this.d.d(this);
        this.l.compareAndSet(false, true);
        this.j = ((k4a) this.e).L(false, this.f, this.g, this.h, 0L, "", false, true, this.i);
        return q1aVar;
    }

    @uae
    public final void onEvent(akf akfVar) {
        if (akfVar.a != this.j) {
            return;
        }
        rx rxVar = this.k;
        if (rxVar.a.get() == rx.X && rxVar.b == null) {
            return;
        }
        ((jle) this.c).a().b(new vs5(akfVar, 8, this));
    }

    @uae
    public final void onEvent(oi0 oi0Var) {
        if (oi0Var.a != this.j) {
            return;
        }
        rx rxVar = this.k;
        if (rxVar.a.get() == rx.X && rxVar.b == null) {
            return;
        }
        ((jle) this.c).a().b(new vs5(oi0Var, 7, this));
    }
}
