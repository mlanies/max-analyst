package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class ieg extends odg {
    public final qne b;
    public final /* synthetic */ int c;
    public final Object d;

    public ieg(int i, qne qneVar) {
        super(i);
        this.b = qneVar;
    }

    private final /* bridge */ /* synthetic */ void i(aab aabVar, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(aab aabVar, boolean z) {
    }

    @Override // defpackage.peg
    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    @Override // defpackage.peg
    public final void b(RuntimeException runtimeException) {
        this.b.c(runtimeException);
    }

    @Override // defpackage.peg
    public final void c(kdg kdgVar) throws DeadObjectException {
        try {
            h(kdgVar);
        } catch (DeadObjectException e) {
            a(peg.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(peg.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    @Override // defpackage.peg
    public final /* bridge */ /* synthetic */ void d(aab aabVar, boolean z) {
        int i = this.c;
    }

    @Override // defpackage.odg
    public final boolean f(kdg kdgVar) {
        switch (this.c) {
            case 0:
                ((vdg) this.d).a.getClass();
                break;
            default:
                vdg vdgVar = (vdg) kdgVar.h.get((hm7) this.d);
                if (vdgVar != null) {
                    vdgVar.a.getClass();
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.odg
    public final pe5[] g(kdg kdgVar) {
        switch (this.c) {
            case 0:
                ((vdg) this.d).a.getClass();
                break;
            default:
                vdg vdgVar = (vdg) kdgVar.h.get((hm7) this.d);
                if (vdgVar != null) {
                    vdgVar.a.getClass();
                    break;
                }
                break;
        }
        return null;
    }

    public final void h(kdg kdgVar) {
        switch (this.c) {
            case 0:
                bdb bdbVar = ((vdg) this.d).a;
                ((ofc) ((pkg) bdbVar.c).a).accept(kdgVar.d, this.b);
                hm7 hm7Var = (hm7) ((rw4) ((vdg) this.d).a.b).c;
                if (hm7Var != null) {
                    kdgVar.h.put(hm7Var, (vdg) this.d);
                    break;
                }
                break;
            default:
                vdg vdgVar = (vdg) kdgVar.h.remove((hm7) this.d);
                qne qneVar = this.b;
                if (vdgVar == null) {
                    qneVar.d(Boolean.FALSE);
                    break;
                } else {
                    ((ofc) ((pkg) vdgVar.b.a).c).accept(kdgVar.d, qneVar);
                    rw4 rw4Var = (rw4) vdgVar.a.b;
                    rw4Var.b = null;
                    rw4Var.c = null;
                    break;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ieg(hm7 hm7Var, qne qneVar) {
        this(4, qneVar);
        this.c = 1;
        this.d = hm7Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ieg(vdg vdgVar, qne qneVar) {
        this(3, qneVar);
        this.c = 0;
        this.d = vdgVar;
    }
}
