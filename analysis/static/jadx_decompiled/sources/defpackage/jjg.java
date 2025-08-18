package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class jjg extends pjg {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ qne c;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjg(fkg fkgVar, qne qneVar, String str, qne qneVar2) {
        super(qneVar);
        this.X = fkgVar;
        this.o = str;
        this.c = qneVar2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.os.IInterface, thg] */
    @Override // defpackage.pjg
    public final void a() {
        switch (this.b) {
            case 0:
                qne qneVar = this.c;
                fkg fkgVar = (fkg) this.X;
                String str = (String) this.o;
                try {
                    fkgVar.a.m.o(fkgVar.b, fkg.a(fkgVar, str), new akg(fkgVar, qneVar, str));
                    return;
                } catch (RemoteException e) {
                    o97 o97Var = fkg.e;
                    Object[] objArr = {str};
                    if (Log.isLoggable("PlayCore", 6)) {
                        o97.c(o97Var.b, "requestUpdateInfo(%s)", objArr);
                    } else {
                        o97Var.getClass();
                    }
                    qneVar.c(new RuntimeException(e));
                    return;
                }
            default:
                synchronized (((ykg) this.X).f) {
                    try {
                        ykg ykgVar = (ykg) this.X;
                        qne qneVar2 = this.c;
                        ykgVar.e.add(qneVar2);
                        qneVar2.a.i(new l7b(ykgVar, qneVar2, false, 18));
                        if (((ykg) this.X).k.getAndIncrement() > 0) {
                            ((ykg) this.X).b.b("Already connected to the service.", new Object[0]);
                        }
                        ykg.b((ykg) this.X, (pjg) this.o);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjg(ykg ykgVar, qne qneVar, qne qneVar2, jjg jjgVar) {
        super(qneVar);
        this.X = ykgVar;
        this.c = qneVar2;
        this.o = jjgVar;
    }
}
