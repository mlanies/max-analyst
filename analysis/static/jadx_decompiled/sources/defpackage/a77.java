package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.folders.list.FoldersListScreen;

/* loaded from: classes.dex */
public final class a77 extends e77 {
    public final y67 Y;

    public a77(y67 y67Var) {
        super(3, 0);
        this.Y = y67Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e77
    public final void a(RecyclerView recyclerView, dec decVar) {
        super.a(recyclerView, decVar);
        if (decVar instanceof g77) {
            y9f y9fVar = (y9f) ((g77) decVar);
            ((x9f) y9fVar.a).animate().translationZ(0.0f);
            re6 re6Var = y9fVar.F0;
            if (re6Var != null) {
                iw5 iw5VarM0 = ((FoldersListScreen) re6Var.b).m0();
                int iG = y9fVar.g() - 1;
                String str = iw5VarM0.s0;
                if (str == null || str.length() == 0) {
                    return;
                }
                j47.T(iw5VarM0.a, ((w9a) iw5VarM0.c).c().getImmediate(), null, new hw5(iw5VarM0, str, iG, null), 2);
                iw5VarM0.s0 = null;
            }
        }
    }

    @Override // defpackage.e77
    public final boolean i(dec decVar, dec decVar2) {
        this.Y.W(decVar.h(), decVar2.h());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e77
    public final void j(dec decVar, int i) {
        if (i == 0 || !(decVar instanceof g77)) {
            return;
        }
        ((x9f) ((y9f) ((g77) decVar)).a).animate().translationZ(fk4.d().getDisplayMetrics().density * 20.0f);
    }
}
