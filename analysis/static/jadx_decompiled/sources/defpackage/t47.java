package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class t47 {
    public final s47 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public t47(s47 s47Var, int[] iArr, String[] strArr) {
        this.a = s47Var;
        this.b = iArr;
        this.c = strArr;
        this.d = (strArr.length == 0) ^ true ? Collections.singleton(strArr[0]) : wz4.a;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final void a(Set set) {
        int[] iArr = this.b;
        int length = iArr.length;
        Set setA = wz4.a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                wbd wbdVar = new wbd();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        wbdVar.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                setA = z7.a(wbdVar);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                setA = this.d;
            }
        }
        if (!setA.isEmpty()) {
            this.a.a(setA);
        }
    }
}
