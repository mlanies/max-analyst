package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class hd5 {
    public static final /* synthetic */ int h = 0;
    public final pk a;
    public final fme b;
    public final ztc c;
    public final ztc d;
    public final eoe e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final hc3 g = new hc3();

    public hd5(pk pkVar, fme fmeVar, ztc ztcVar, ztc ztcVar2, av0 av0Var, eoe eoeVar) {
        this.a = pkVar;
        this.b = fmeVar;
        this.c = ztcVar;
        this.d = ztcVar2;
        this.e = eoeVar;
        av0Var.d(this);
    }

    @uae
    public void onEvent(cu cuVar) {
        xrd xrdVar = (xrd) this.f.get(Long.valueOf(cuVar.a));
        if (xrdVar != null) {
            xrdVar.a(cuVar);
        }
    }

    @uae
    public void onEvent(pu puVar) {
        xrd xrdVar = (xrd) this.f.get(Long.valueOf(puVar.a));
        if (xrdVar != null) {
            xrdVar.a(puVar);
        }
    }

    @uae
    public void onEvent(ju juVar) {
        xrd xrdVar = (xrd) this.f.get(Long.valueOf(juVar.a));
        if (xrdVar != null) {
            xrdVar.a(juVar);
        }
    }

    @uae
    public void onEvent(mu muVar) {
        xrd xrdVar = (xrd) this.f.get(Long.valueOf(muVar.a));
        if (xrdVar != null) {
            xrdVar.a(muVar);
        }
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        xrd xrdVar = (xrd) this.f.get(Long.valueOf(oi0Var.a));
        if (xrdVar != null) {
            xrdVar.onError(new TamErrorException(oi0Var.b));
        }
    }
}
