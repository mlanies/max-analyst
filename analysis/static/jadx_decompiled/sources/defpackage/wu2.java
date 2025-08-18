package defpackage;

import android.view.View;
import java.util.Collections;

/* loaded from: classes.dex */
public final class wu2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xu2 b;

    public /* synthetic */ wu2(View view, xu2 xu2Var, int i) {
        this.a = i;
        this.b = xu2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xu2 xu2Var = this.b;
                ((l67) xu2Var.c.getValue()).a("show", "main", "invite_friends");
                if (xu2Var.X) {
                    xu2Var.a.q0(xu2Var);
                    break;
                }
                break;
            case 1:
                ys2.a.b().b(Collections.singletonList(new dta(1)));
                xu2 xu2Var2 = this.b;
                if (xu2Var2.o) {
                    xu2Var2.a.q0(xu2Var2);
                    break;
                }
                break;
            default:
                xu2 xu2Var3 = this.b;
                if (((Boolean) xu2Var3.b.invoke()).booleanValue()) {
                    ys2.a.b().b(Collections.singletonList(new dta(1)));
                    if (xu2Var3.o) {
                        xu2Var3.a.q0(xu2Var3);
                        break;
                    }
                }
                break;
        }
    }
}
