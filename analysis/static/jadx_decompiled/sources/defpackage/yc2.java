package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class yc2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;
    public final /* synthetic */ vm8 c;

    public /* synthetic */ yc2(m56 m56Var, vm8 vm8Var, int i) {
        this.a = i;
        this.b = m56Var;
        this.c = vm8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                break;
            case 1:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c);
                break;
        }
    }
}
