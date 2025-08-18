package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class jeg extends odg {
    public final pw6 b;
    public final qne c;
    public final rq9 d;

    public jeg(int i, pw6 pw6Var, qne qneVar, rq9 rq9Var) {
        super(i);
        this.c = qneVar;
        this.b = pw6Var;
        this.d = rq9Var;
        if (i == 2 && pw6Var.a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.peg
    public final void a(Status status) {
        this.d.getClass();
        this.c.c(i24.k(status));
    }

    @Override // defpackage.peg
    public final void b(RuntimeException runtimeException) {
        this.c.c(runtimeException);
    }

    @Override // defpackage.peg
    public final void c(kdg kdgVar) throws DeadObjectException {
        qne qneVar = this.c;
        try {
            this.b.g(kdgVar.d, qneVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(peg.e(e2));
        } catch (RuntimeException e3) {
            qneVar.c(e3);
        }
    }

    @Override // defpackage.peg
    public final void d(aab aabVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) aabVar.b;
        qne qneVar = this.c;
        map.put(qneVar, boolValueOf);
        qneVar.a.i(new wva(aabVar, qneVar, false, 17));
    }

    @Override // defpackage.odg
    public final boolean f(kdg kdgVar) {
        return this.b.a;
    }

    @Override // defpackage.odg
    public final pe5[] g(kdg kdgVar) {
        return (pe5[]) this.b.c;
    }
}
