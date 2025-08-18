package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class hk3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ hk3(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.FALSE);
                break;
            case 1:
                this.b.invoke(Boolean.TRUE);
                break;
            case 2:
                this.b.invoke(Boolean.FALSE);
                break;
            default:
                this.b.invoke(Boolean.TRUE);
                break;
        }
    }
}
