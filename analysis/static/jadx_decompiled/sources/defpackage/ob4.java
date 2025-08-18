package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class ob4 implements lu6 {
    public final lu6 a;
    public final lu6 b;
    public final t2b c;
    public final ye d = new ye(1, this);
    public final Map e;

    public ob4(ye yeVar, we weVar, t2b t2bVar, Map map) {
        this.a = yeVar;
        this.b = weVar;
        this.c = t2bVar;
        this.e = map;
    }

    @Override // defpackage.lu6
    public final l43 a(g05 g05Var, int i, pqb pqbVar, ju6 ju6Var) {
        InputStream inputStreamN;
        lu6 lu6Var;
        ju6Var.getClass();
        g05Var.o0();
        ou6 ou6VarO = g05Var.c;
        if ((ou6VarO == null || ou6VarO == ou6.c) && (inputStreamN = g05Var.n()) != null) {
            je7 je7Var = pu6.d;
            try {
                ou6VarO = i24.o(inputStreamN);
                g05Var.c = ou6VarO;
            } catch (IOException e) {
                nu0.H(e);
                throw null;
            }
        }
        Map map = this.e;
        return (map == null || (lu6Var = (lu6) map.get(ou6VarO)) == null) ? this.d.a(g05Var, i, pqbVar, ju6Var) : lu6Var.a(g05Var, i, pqbVar, ju6Var);
    }

    public final CloseableStaticBitmap b(g05 g05Var, ju6 ju6Var) {
        o43 o43VarA = this.c.a(g05Var, ju6Var.a);
        try {
            o43VarA.getClass();
            hx6 hx6Var = hx6.d;
            g05Var.o0();
            int i = g05Var.o;
            g05Var.o0();
            CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(o43VarA, hx6Var, i, g05Var.X);
            closeableStaticBitmapOf.putExtra(HasExtraData.KEY_IS_ROUNDED, Boolean.FALSE);
            return closeableStaticBitmapOf;
        } finally {
            o43.S(o43VarA);
        }
    }
}
