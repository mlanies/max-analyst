package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class wef {
    public final af8 a;
    public final yef b;
    public final zi5 c;
    public final ad d;
    public final fuc e;
    public final ztc f;
    public final euc g;
    public final msf h = new msf();
    public final HashMap i = new HashMap();

    public wef(af8 af8Var, yef yefVar, zi5 zi5Var, ad adVar, fuc fucVar, ztc ztcVar, euc eucVar) {
        this.a = af8Var;
        this.b = yefVar;
        this.c = zi5Var;
        this.d = adVar;
        this.e = fucVar;
        this.f = ztcVar;
        this.g = eucVar;
    }

    public final synchronized void a(lef lefVar) {
        this.i.remove(lefVar);
        nd7.U(new qa3(this.b.a(), 2, new sef(lefVar, 2)).l(), ft.e, new sef(lefVar, 0), new e5(21, lefVar));
    }
}
