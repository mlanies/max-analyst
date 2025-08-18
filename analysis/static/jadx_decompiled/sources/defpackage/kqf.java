package defpackage;

/* loaded from: classes2.dex */
public final class kqf implements zb4 {
    public final /* synthetic */ lqf a;

    public kqf(lqf lqfVar) {
        this.a = lqfVar;
    }

    @Override // defpackage.zb4
    public final void onResume(eh7 eh7Var) {
        hm9.n("lqf", "onResume, owner=" + eh7Var + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l);
    }

    @Override // defpackage.zb4
    public final void onStart(eh7 eh7Var) {
        hm9.n("lqf", "onStart, owner=" + eh7Var + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l);
        if (this.a.k) {
            return;
        }
        this.a.k = true;
        if (this.a.l) {
            this.a.b();
        }
    }

    @Override // defpackage.zb4
    public final void onStop(eh7 eh7Var) {
        hm9.n("lqf", "onStop, owner=" + eh7Var + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l);
        if (this.a.k) {
            this.a.k = false;
            this.a.a();
        }
    }
}
