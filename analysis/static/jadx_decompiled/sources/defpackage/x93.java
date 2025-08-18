package defpackage;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class x93 implements Comparator {
    public final boolean a;

    public x93(boolean z) {
        this.a = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int iSignum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.a ? iSignum * (-1) : iSignum;
    }
}
