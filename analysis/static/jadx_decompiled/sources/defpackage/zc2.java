package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class zc2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a66 b;
    public final /* synthetic */ vm8 c;
    public final /* synthetic */ bd2 o;

    public /* synthetic */ zc2(a66 a66Var, vm8 vm8Var, bd2 bd2Var, int i) {
        this.a = i;
        this.b = a66Var;
        this.c = vm8Var;
        this.o = bd2Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c, this.o.a);
                break;
            default:
                this.b.invoke(this.c, this.o.a);
                break;
        }
        return true;
    }
}
