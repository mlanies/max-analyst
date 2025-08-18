package defpackage;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final /* synthetic */ class ne6 implements l3a, o3a {
    public final /* synthetic */ pr7 a;

    @Override // defpackage.l3a
    public void l(Task task) {
        boolean zH = task.h();
        pr7 pr7Var = this.a;
        if (zH) {
            pr7Var.f();
        } else {
            pr7Var.g(null);
        }
    }

    @Override // defpackage.o3a
    public void onFailure(Exception exc) {
        this.a.g(exc);
    }
}
