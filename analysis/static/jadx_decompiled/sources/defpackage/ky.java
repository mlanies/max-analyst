package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ky extends oy {
    public final ArrayList X;
    public final long c;
    public final ArrayList o;

    public ky(int i, long j) {
        super(i, 0);
        this.c = j;
        this.o = new ArrayList();
        this.X = new ArrayList();
    }

    @Override // defpackage.oy
    public final String toString() {
        String strD = oy.d(this.b);
        String string = Arrays.toString(this.o.toArray());
        String string2 = Arrays.toString(this.X.toArray());
        StringBuilder sb = new StringBuilder(rh4.e(rh4.e(rh4.e(22, strD), string), string2));
        sb.append(strD);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }

    public final ky v(int i) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ky kyVar = (ky) arrayList.get(i2);
            if (kyVar.b == i) {
                return kyVar;
            }
        }
        return null;
    }

    public final my w(int i) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            my myVar = (my) arrayList.get(i2);
            if (myVar.b == i) {
                return myVar;
            }
        }
        return null;
    }
}
