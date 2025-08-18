package defpackage;

import android.location.Location;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final /* synthetic */ class ke6 implements l3a, o3a {
    public final /* synthetic */ re6 a;

    public /* synthetic */ ke6(re6 re6Var) {
        this.a = re6Var;
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        boolean zH = task.h();
        re6 re6Var = this.a;
        if (!zH || task.f() == null) {
            ((lr7) re6Var.b).U0();
            return;
        }
        Location location = (Location) task.f();
        ((lr7) re6Var.b).p1(new er7(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getBearing(), location.getSpeed()));
    }

    @Override // defpackage.o3a
    public void onFailure(Exception exc) {
        ((lr7) this.a.b).U0();
    }
}
