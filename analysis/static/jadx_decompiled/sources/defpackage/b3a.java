package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class b3a extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3a(i3a i3aVar, int i) {
        super(1);
        this.a = i;
        this.b = i3aVar;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.a) {
            case 0:
                i3a i3aVar = this.b;
                hs hsVar = i3aVar.b;
                ListIterator listIterator = hsVar.listIterator(hsVar.getSize());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((a3a) objPrevious).a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                a3a a3aVar = (a3a) objPrevious;
                if (i3aVar.c != null) {
                    i3aVar.c();
                }
                i3aVar.c = a3aVar;
                if (a3aVar != null) {
                    a3aVar.d();
                }
                break;
            default:
                ge0 ge0Var = (ge0) obj;
                i3a i3aVar2 = this.b;
                a3a a3aVar2 = i3aVar2.c;
                if (a3aVar2 == null) {
                    hs hsVar2 = i3aVar2.b;
                    ListIterator listIterator2 = hsVar2.listIterator(hsVar2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((a3a) objPrevious2).a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    a3aVar2 = (a3a) objPrevious2;
                }
                if (a3aVar2 != null) {
                    a3aVar2.c(ge0Var);
                }
                break;
        }
        return e5f.a;
    }
}
