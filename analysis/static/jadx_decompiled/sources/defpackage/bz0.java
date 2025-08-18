package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class bz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ bz0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ufd ufdVar = (ufd) ((cz0) this.b).a;
                je7 je7Var = ufdVar.P0;
                boolean z = !(!je7Var.a() ? false : ((tja) je7Var.getValue()).isChecked());
                ufdVar.setEndView(new ffd(z, true));
                ((wmc) this.c).q(((e01) ((ol7) this.o)).o, z);
                break;
            case 1:
                fb5 fb5Var = (fb5) this.b;
                long j = fb5Var.a;
                if (!fb5Var.Z) {
                    ((m56) this.o).invoke(Long.valueOf(j));
                    break;
                } else {
                    ((m56) this.c).invoke(Long.valueOf(j));
                    break;
                }
            default:
                ela.d((ela) this.b, (m56) this.c, (zka) this.o);
                break;
        }
    }
}
