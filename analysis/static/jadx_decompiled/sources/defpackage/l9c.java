package defpackage;

import java.util.Locale;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public abstract class l9c {
    public static final /* synthetic */ int a = 0;

    public static e9c a(h9c h9cVar, long j) {
        e9c e9cVar = new e9c();
        t9c t9cVar = h9cVar.a;
        e9cVar.b = t9cVar;
        e9cVar.d = h9cVar.b;
        e9cVar.c = j;
        int iOrdinal = t9cVar.ordinal();
        if (iOrdinal == 1) {
            cy4 cy4Var = new cy4();
            cy4Var.a = ((by4) h9cVar).c;
            e9cVar.f = cy4Var;
        } else if (iOrdinal == 2) {
            lh4 lh4Var = new lh4();
            lh4Var.a = ((j3e) h9cVar).c;
            e9cVar.e = lh4Var;
        } else if (iOrdinal == 3) {
            x10 x10Var = ((vc6) h9cVar).c;
            byte[] byteArray = qw8.toByteArray(b.o(x10Var));
            g03 g03Var = new g03(6);
            g03Var.c = byteArray;
            g03Var.b = x10Var.s0;
            e9cVar.g = g03Var;
        } else if (iOrdinal != 4) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException("Unexpected value: " + h9cVar.a);
        }
        return e9cVar;
    }
}
