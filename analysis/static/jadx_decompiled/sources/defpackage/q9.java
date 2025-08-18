package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class q9 extends rg4 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q9(fi0 fi0Var, int i) {
        super(fi0Var);
        this.c = i;
    }

    @Override // defpackage.fi0
    public final void h(int i, Object obj) throws IOException {
        switch (this.c) {
            case 0:
                g05 g05Var = (g05) obj;
                fi0 fi0Var = this.b;
                if (g05Var == null) {
                    fi0Var.g(i, null);
                    return;
                }
                if (!g05.U(g05Var)) {
                    g05Var.n0();
                }
                fi0Var.g(i, g05Var);
                return;
            case 1:
                o43 o43Var = (o43) obj;
                if (fi0.b(i)) {
                    return;
                }
                this.b.g(i, o43Var);
                return;
            case 2:
                g05 g05Var2 = (g05) obj;
                o43 o43VarO = null;
                try {
                    if (g05.m0(g05Var2) && g05Var2 != null) {
                        o43VarO = o43.o(g05Var2.a);
                    }
                    this.b.g(i, o43VarO);
                    return;
                } finally {
                    o43.S(o43VarO);
                }
            default:
                if (fi0.a(i)) {
                    this.b.g(i, null);
                    return;
                }
                return;
        }
    }
}
