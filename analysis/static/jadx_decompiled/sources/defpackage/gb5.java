package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class gb5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hb5 b;
    public final /* synthetic */ fb5 c;

    public /* synthetic */ gb5(hb5 hb5Var, fb5 fb5Var, int i) {
        this.a = i;
        this.b = hb5Var;
        this.c = fb5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m56 m56Var = this.b.F0;
                if (m56Var != null) {
                    m56Var.invoke(Long.valueOf(this.c.a));
                    break;
                }
                break;
            case 1:
                m56 m56Var2 = this.b.G0;
                if (m56Var2 != null) {
                    m56Var2.invoke(Long.valueOf(this.c.a));
                    break;
                }
                break;
            case 2:
                m56 m56Var3 = this.b.F0;
                if (m56Var3 != null) {
                    m56Var3.invoke(Long.valueOf(this.c.a));
                    break;
                }
                break;
            default:
                m56 m56Var4 = this.b.G0;
                if (m56Var4 != null) {
                    m56Var4.invoke(Long.valueOf(this.c.a));
                    break;
                }
                break;
        }
    }
}
