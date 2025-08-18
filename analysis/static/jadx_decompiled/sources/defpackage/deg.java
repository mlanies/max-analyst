package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class deg extends peg {
    public final qjg b;

    public deg(qjg qjgVar) {
        super(1);
        this.b = qjgVar;
    }

    @Override // defpackage.peg
    public final void a(Status status) {
        try {
            this.b.U(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.peg
    public final void b(RuntimeException runtimeException) {
        try {
            this.b.U(new Status(10, rh4.j(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), null, null));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.peg
    public final void c(kdg kdgVar) throws DeadObjectException {
        try {
            qjg qjgVar = this.b;
            ok okVar = kdgVar.d;
            qjgVar.getClass();
            try {
                qjgVar.T(okVar);
            } catch (DeadObjectException e) {
                qjgVar.U(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                qjgVar.U(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }

    @Override // defpackage.peg
    public final void d(aab aabVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) aabVar.a;
        qjg qjgVar = this.b;
        map.put(qjgVar, boolValueOf);
        qjgVar.O(new fdg(aabVar, qjgVar));
    }
}
