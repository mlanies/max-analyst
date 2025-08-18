package defpackage;

import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class s33 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s33(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((t33) this.b).m((String) obj, (String) obj2);
                break;
            default:
                Long l = (Long) obj;
                uj3 uj3Var = (uj3) obj2;
                el3 el3Var = (el3) this.b;
                if (uj3Var == null) {
                    el3Var.getClass();
                    break;
                } else {
                    glc glcVar = ((k24) ((c34) el3Var.f.get())).d;
                    l.getClass();
                    glcVar.h().c(uj3Var.a.c, ((d56) ((khe) glcVar.o).getValue()).a);
                    break;
                }
        }
    }
}
