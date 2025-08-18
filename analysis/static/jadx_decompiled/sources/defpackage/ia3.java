package defpackage;

import android.view.View;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;

/* loaded from: classes.dex */
public final class ia3 extends su3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ia3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void u(uu3 uu3Var) {
    }

    @Override // defpackage.su3
    public void d(uu3 uu3Var) {
        switch (this.a) {
            case 2:
                ((gv3) this.b).a.d(eg7.ON_CREATE);
                break;
        }
    }

    @Override // defpackage.su3
    public void g(uu3 uu3Var) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_RESUME);
                break;
            case 2:
                ((gv3) this.b).a.d(eg7.ON_RESUME);
                break;
            case 4:
                xx6 xx6Var = (xx6) bx7.a.getAccessor().e();
                if (xx6Var != null) {
                    xx6Var.e(Integer.valueOf(((wuc) this.b).a));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.su3
    public void h(uu3 uu3Var) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_CREATE);
                break;
        }
    }

    @Override // defpackage.su3
    public void j(uu3 uu3Var, View view) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_START);
                break;
            case 2:
                gv3 gv3Var = (gv3) this.b;
                s5c.Z(view, gv3Var);
                if (!nd7.B(uu3Var)) {
                    gv3Var.a.d(eg7.ON_CREATE);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.su3
    public void k(uu3 uu3Var) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ComplaintBottomSheet.X;
                ((ComplaintBottomSheet) obj).getClass();
                na3.c.P1().d();
                break;
            case 3:
                int i = FileDownloadWarningBottomSheet.b;
                ((FileDownloadWarningBottomSheet) obj).getClass();
                hh5.c.P1().d();
                break;
            case 5:
                ((znc) obj).d.remove(uu3Var);
                break;
        }
    }

    @Override // defpackage.su3
    public void l(uu3 uu3Var) {
        switch (this.a) {
            case 2:
                gv3 gv3Var = (gv3) this.b;
                if (gv3Var.a.d.a(fg7.c)) {
                    gv3Var.a.d(eg7.ON_DESTROY);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.su3
    public void n(uu3 uu3Var, View view) {
        switch (this.a) {
            case 2:
                ((gv3) this.b).a.d(eg7.ON_START);
                break;
        }
    }

    @Override // defpackage.su3
    public void p(uu3 uu3Var) {
        int i = this.a;
    }

    @Override // defpackage.su3
    public void q(uu3 uu3Var) {
        switch (this.a) {
            case 2:
                gv3 gv3Var = (gv3) this.b;
                if (gv3Var.a.d == fg7.a) {
                    gv3Var.a = new gh7(gv3Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.su3
    public void r(uu3 uu3Var) {
        switch (this.a) {
            case 1:
                gh7 gh7Var = ((bx1) this.b).b;
                if (gh7Var.d != fg7.b) {
                    gh7Var.d(eg7.ON_DESTROY);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.su3
    public void s(uu3 uu3Var, View view) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_STOP);
                break;
            case 2:
                ((gv3) this.b).a.d(eg7.ON_STOP);
                break;
        }
    }

    @Override // defpackage.su3
    public void t(uu3 uu3Var) {
        switch (this.a) {
            case 1:
                ((bx1) this.b).b.d(eg7.ON_PAUSE);
                break;
            case 2:
                ((gv3) this.b).a.d(eg7.ON_PAUSE);
                break;
        }
    }
}
