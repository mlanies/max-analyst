package defpackage;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class fwe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ fwe(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iwe iweVar = this.b.a1;
                br8 br8Var = iweVar == null ? null : iweVar.b;
                if (br8Var != null) {
                    br8Var.collapseActionView();
                    break;
                }
                break;
            default:
                this.b.n();
                break;
        }
    }
}
