package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class zx6 implements l3a, o3a, k3a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay6 b;

    public /* synthetic */ zx6(ay6 ay6Var, int i) {
        this.a = i;
        this.b = ay6Var;
    }

    @Override // defpackage.k3a
    public void d() {
        if (this.b.d != null) {
            buc.y();
        }
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        xx6 xx6VarI;
        ay6 ay6Var = this.b;
        switch (this.a) {
            case 0:
                if (task.h()) {
                    ay6Var.c = (hkc) task.f();
                    break;
                }
                break;
            default:
                if (ay6Var.d != null && (xx6VarI = y8a.a.i()) != null) {
                    List list = xx6.p;
                    xx6VarI.c(1, null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.o3a
    public void onFailure(Exception exc) {
        if (this.b.d != null) {
            buc.y();
        }
    }
}
