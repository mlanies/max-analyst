package defpackage;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final /* synthetic */ class se6 implements l3a, o3a, k3a {
    public final /* synthetic */ we6 a;

    public /* synthetic */ se6(we6 we6Var) {
        this.a = we6Var;
    }

    @Override // defpackage.k3a
    public void d() {
        we6 we6Var = this.a;
        hm9.n(we6Var.e, "startRetriever: canceled");
        we6Var.h = null;
    }

    @Override // defpackage.l3a
    public void l(Task task) {
        we6 we6Var = this.a;
        hm9.n(we6Var.e, "retriever is complete");
        we6Var.h = null;
    }

    @Override // defpackage.o3a
    public void onFailure(Exception exc) {
        we6 we6Var = this.a;
        hm9.r(we6Var.e, new yx3("startRetriever: failed", exc), null, new Object[0]);
        we6Var.h = null;
    }
}
