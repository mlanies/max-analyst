package defpackage;

import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class gpf implements ipf, qj3, fu3 {
    public Object a;

    public /* synthetic */ gpf(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ipf
    public cn9 a(int i) {
        List list = (List) ((SparseArray) this.a).get(i);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException(zr6.h(i, "Cannot find the wrapper for global view type "));
        }
        return (cn9) list.get(0);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        qoa qoaVar = (qoa) this.a;
        double dAbs = Math.abs(dDoubleValue - qoaVar.i);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        dhc dhcVar = qoaVar.a;
        boolean z = dAbs > dhcVar.a;
        boolean z2 = jElapsedRealtime - qoaVar.j > ((long) dhcVar.c);
        m56 m56Var = qoaVar.f;
        if (z || z2) {
            qoaVar.j = jElapsedRealtime;
            m56Var.invoke("submit p2p network status");
            qoaVar.i = dDoubleValue;
            qoaVar.e.invoke(Double.valueOf(dDoubleValue));
            return;
        }
        m56Var.invoke("not valuable network status diff: " + dAbs + ": " + qoaVar.i + " -> " + dDoubleValue);
    }

    @Override // defpackage.ipf
    public hpf d(cn9 cn9Var) {
        return new wva(this, cn9Var, false, 15);
    }

    @Override // defpackage.fu3
    public Object u(Task task) {
        b9b b9bVar = (b9b) this.a;
        if (!task.h() && !((ukg) task).d) {
            Exception excE = task.e();
            if (excE instanceof ApiException) {
                int i = ((ApiException) excE).a.a;
                if (i == 43001 || i == 43002 || i == 43003 || i == 17) {
                    cjg cjgVar = (cjg) b9bVar.c;
                    cjgVar.getClass();
                    qne qneVar = new qne();
                    ((ExecutorService) cjgVar.c).execute(new u8g(cjgVar, qneVar, false, 3));
                    task = qneVar.a;
                } else if (i == 43000) {
                    task = j1e.q(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                } else if (i == 15) {
                    return j1e.q(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }
}
