package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class eqa implements abe {
    public final List a;
    public final List b;

    public /* synthetic */ eqa(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.abe
    public int g(long j) {
        int i;
        Long lValueOf = Long.valueOf(j);
        int i2 = maf.a;
        List list = this.b;
        int iBinarySearch = Collections.binarySearch(list, lValueOf);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i = iBinarySearch;
        }
        if (i < list.size()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.abe
    public long i(int i) {
        np8.d(i >= 0);
        List list = this.b;
        np8.d(i < list.size());
        return ((Long) list.get(i)).longValue();
    }

    @Override // defpackage.abe
    public List p(long j) {
        int iE = maf.e(Long.valueOf(j), this.b, false);
        return iE == -1 ? Collections.emptyList() : (List) this.a.get(iE);
    }

    @Override // defpackage.abe
    public int u() {
        return this.b.size();
    }
}
