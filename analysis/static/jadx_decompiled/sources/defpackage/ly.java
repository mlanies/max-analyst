package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ly extends oy {
    public final ArrayList X;
    public final long c;
    public final ArrayList o;

    public ly(int i, long j) {
        super(i, 1);
        this.c = j;
        this.o = new ArrayList();
        this.X = new ArrayList();
    }

    @Override // defpackage.oy
    public final String toString() {
        return oy.e(this.b) + " leaves: " + Arrays.toString(this.o.toArray()) + " containers: " + Arrays.toString(this.X.toArray());
    }

    public final ly v(int i) {
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ly lyVar = (ly) arrayList.get(i2);
            if (lyVar.b == i) {
                return lyVar;
            }
        }
        return null;
    }

    public final ny w(int i) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ny nyVar = (ny) arrayList.get(i2);
            if (nyVar.b == i) {
                return nyVar;
            }
        }
        return null;
    }
}
