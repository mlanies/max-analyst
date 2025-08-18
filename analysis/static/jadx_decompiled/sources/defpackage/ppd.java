package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class ppd extends hl7 {
    public ppd(Executor executor) {
        super(new qz7(executor, 4, new y34(9)));
        super.A(true);
    }

    public final ol7 G(int i) {
        if (i < 0 || i >= this.o.f.size()) {
            return null;
        }
        return (ol7) C(i);
    }

    @Override // defpackage.hdc
    /* renamed from: H */
    public void r(hqd hqdVar, int i) {
        hqdVar.A((ol7) C(i));
    }

    @Override // defpackage.hdc
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void y(hqd hqdVar) {
        hqdVar.D();
    }

    @Override // defpackage.hdc
    public long k(int i) {
        return ((ol7) C(i)).getItemId();
    }

    @Override // defpackage.hdc
    public int l(int i) {
        return ((ol7) C(i)).getI0();
    }
}
