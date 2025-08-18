package defpackage;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class y00 {
    public final hle a;
    public final o45 b;
    public final zi5 c;
    public final i56 d;
    public final f55 e;
    public final hc3 f;

    public y00(zi5 zi5Var, hle hleVar, o45 o45Var) {
        this.a = hleVar;
        this.b = o45Var;
        this.c = zi5Var;
        i56 i56Var = new i56(200, 0);
        this.d = i56Var;
        hleVar.getClass();
        jle jleVar = (jle) hleVar;
        iba ibaVar = (iba) jleVar.a.getValue();
        ExecutorService executorServiceI = ibaVar.i(ibaVar.b().a(5, "preview-disk-cache"), "preview-disk-cache");
        trd trdVar = muc.a;
        this.e = new f55(executorServiceI, true);
        hc3 hc3Var = new hc3();
        this.f = hc3Var;
        a38 a38VarF = new s28(new k28(new x00(this)), new x00(this), 1).h(jleVar.a()).f(jleVar.b());
        g28 g28Var = new g28(new ync(6, i56Var), new x00(this), ft.d);
        a38VarF.a(g28Var);
        hc3Var.a(g28Var);
    }
}
