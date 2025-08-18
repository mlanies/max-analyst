package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class ev5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;
    public final /* synthetic */ w9f c;

    public /* synthetic */ ev5(m56 m56Var, w9f w9fVar, int i) {
        this.a = i;
        this.b = m56Var;
        this.c = w9fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c);
                break;
        }
    }
}
