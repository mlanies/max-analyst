package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class hba {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final /* synthetic */ iba d;

    public hba(iba ibaVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = ibaVar;
                fh8 fh8Var = ibaVar.a;
                this.b = fh8Var.o;
                this.c = fh8Var.c;
                break;
            default:
                this.d = ibaVar;
                fh8 fh8Var2 = ibaVar.a;
                this.b = fh8Var2.o;
                this.c = fh8Var2.c;
                break;
        }
    }

    public final long a() {
        switch (this.a) {
        }
        return this.b;
    }

    public final long b() {
        switch (this.a) {
        }
        return this.c;
    }

    public final void c(ArrayList arrayList) {
        switch (this.a) {
            case 0:
                ((m56) this.d.a.X).invoke(arrayList);
                break;
            default:
                ((m56) this.d.a.X).invoke(arrayList);
                break;
        }
    }

    public final void d(Collection collection) {
        switch (this.a) {
            case 0:
                ((m56) this.d.a.Y).invoke(collection);
                break;
            default:
                ((m56) this.d.a.Y).invoke(collection);
                break;
        }
    }
}
