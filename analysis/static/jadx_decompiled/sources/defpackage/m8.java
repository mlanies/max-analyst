package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.rlottie.RLottieFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class m8 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m8(int i, int i2, Object obj) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return ((RecyclerView) this.c).getRecycledViewPool().getRecycledView(this.b);
            case 1:
                String str = (String) this.c;
                int i = this.b;
                return RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url(str, true, i, i, true), false, true, true, false, 18, null));
            case 2:
                gy4 gy4Var = (gy4) this.c;
                return j47.T((sx3) gy4Var.f.getValue(), null, null, new fy4(this.b, gy4Var, null), 3);
            default:
                ((Integer) obj).getClass();
                az4 az4Var = (az4) this.c;
                int i2 = 0;
                for (Object obj2 : ((xy4) az4Var.u0.a.getValue()).b) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        y53.R();
                        throw null;
                    }
                    ol7 ol7Var = (ol7) obj2;
                    if (ol7Var instanceof d02) {
                        int i4 = ((d02) ol7Var).a;
                        int i5 = this.b;
                        if (i4 == i5) {
                            az4Var.Y.m(null, new yy4(i5, i2, 0, 4));
                        }
                    }
                    i2 = i3;
                }
                return e5f.a;
        }
    }
}
