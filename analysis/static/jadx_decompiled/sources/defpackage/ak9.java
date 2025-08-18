package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class ak9 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk9 b;

    public /* synthetic */ ak9(bk9 bk9Var, int i) {
        this.a = i;
        this.b = bk9Var;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        b56 b56VarR1;
        switch (this.a) {
            case 0:
                bk9 bk9Var = this.b;
                fef fefVar = (fef) obj;
                ((bq7) bk9Var.c).s(fefVar, bk9Var);
                hkf hkfVarA = bk9Var.t0.a();
                hkfVarA.j = ((ok0) fefVar).a;
                hkfVarA.n = fefVar;
                hkf hkfVar = new hkf(hkfVarA);
                bk9Var.t0 = hkfVar;
                pl9 pl9Var = (pl9) ((kk9) bk9Var.b);
                pl9Var.d(hkfVar);
                pl9Var.b(bk9Var);
                break;
            case 1:
                Throwable th = (Throwable) obj;
                FrgLocalVideo frgLocalVideo = this.b.Z;
                if (frgLocalVideo != null) {
                    frgLocalVideo.Y(th);
                    break;
                }
                break;
            case 2:
                bk9 bk9Var2 = this.b;
                y38 y38Var = bk9Var2.x0;
                if (y38Var != null) {
                    ActLocalMedias actLocalMedias = (ActLocalMedias) y38Var;
                    if (actLocalMedias.f1.Q0.isFocused() && actLocalMedias.g1.b.X) {
                    }
                }
                hkf hkfVarA2 = bk9Var2.t0.a();
                hkfVarA2.a = false;
                hkf hkfVar2 = new hkf(hkfVarA2);
                bk9Var2.t0 = hkfVar2;
                ((pl9) ((kk9) bk9Var2.b)).d(hkfVar2);
                FrgLocalVideo frgLocalVideo2 = bk9Var2.Z;
                if (frgLocalVideo2 != null && (b56VarR1 = frgLocalVideo2.r1()) != null) {
                    b56VarR1.c(false, true, false);
                    break;
                }
                break;
            default:
                bk9 bk9Var3 = this.b;
                hkf hkfVarA3 = bk9Var3.t0.a();
                bq7 bq7Var = (bq7) bk9Var3.c;
                hkfVarA3.k = bq7Var.f();
                hkfVarA3.l = bq7Var.d();
                hkf hkfVar3 = new hkf(hkfVarA3);
                bk9Var3.t0 = hkfVar3;
                ((pl9) ((kk9) bk9Var3.b)).d(hkfVar3);
                break;
        }
    }
}
