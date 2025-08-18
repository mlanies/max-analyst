package defpackage;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class y30 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ y30(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int i = this.b;
                int iAbs = Math.abs(iIntValue - i) - Math.abs(((Integer) obj2).intValue() - i);
                return (int) (iAbs == 0 ? Math.signum(r3.intValue() - r4.intValue()) : Math.signum(iAbs));
            default:
                int iA = msd.a((Size) obj);
                int i2 = this.b;
                return Math.abs(iA - i2) - Math.abs(msd.a((Size) obj2) - i2);
        }
    }
}
