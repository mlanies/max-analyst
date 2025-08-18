package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class q28 extends qy9 {
    public final /* synthetic */ int a;
    public final b66 b;
    public final Object c;

    public /* synthetic */ q28(Object obj, b66 b66Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = b66Var;
    }

    @Override // defpackage.qy9
    public final void q(f2a f2aVar) {
        iqd iqdVar;
        switch (this.a) {
            case 0:
                p28 p28Var = new p28(f2aVar, this.b, 0);
                f2aVar.c(p28Var);
                ((f38) this.c).a(p28Var);
                break;
            case 1:
                r1a r1aVar = (r1a) this.c;
                boolean z = r1aVar instanceof kde;
                b66 b66Var = this.b;
                if (!z) {
                    r1aVar.a(new dz9(f2aVar, b66Var));
                    break;
                } else {
                    try {
                        Object obj = ((kde) r1aVar).get();
                        if (obj != null) {
                            Object objMo131apply = b66Var.mo131apply(obj);
                            Objects.requireNonNull(objMo131apply, "The mapper returned a null SingleSource");
                            iqdVar = (iqd) objMo131apply;
                        } else {
                            iqdVar = null;
                        }
                        if (iqdVar != null) {
                            iqdVar.k(new i38(f2aVar, 1));
                            break;
                        } else {
                            iz4.a(f2aVar);
                            break;
                        }
                    } catch (Throwable th) {
                        c37.B(th);
                        iz4.b(th, f2aVar);
                        return;
                    }
                }
            case 2:
                try {
                    Object objMo131apply2 = this.b.mo131apply(this.c);
                    Objects.requireNonNull(objMo131apply2, "The mapper returned a null ObservableSource");
                    r1a r1aVar2 = (r1a) objMo131apply2;
                    if (!(r1aVar2 instanceof kde)) {
                        r1aVar2.a(f2aVar);
                        break;
                    } else {
                        try {
                            Object obj2 = ((kde) r1aVar2).get();
                            if (obj2 != null) {
                                p1a p1aVar = new p1a(f2aVar, obj2);
                                f2aVar.c(p1aVar);
                                p1aVar.run();
                                break;
                            } else {
                                iz4.a(f2aVar);
                                break;
                            }
                        } catch (Throwable th2) {
                            c37.B(th2);
                            iz4.b(th2, f2aVar);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    c37.B(th3);
                    iz4.b(th3, f2aVar);
                    return;
                }
            default:
                p28 p28Var2 = new p28(f2aVar, this.b, 1);
                f2aVar.c(p28Var2);
                ((iqd) this.c).k(p28Var2);
                break;
        }
    }
}
