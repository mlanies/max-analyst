package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class vp3 extends pi0 {
    public final List b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    public vp3(long j, List list, List list2, int i) {
        ?? EmptyList;
        super(j);
        if (list == null || list.isEmpty()) {
            EmptyList = Collections.emptyList();
        } else {
            boolean z = list2 != null && list2.size() == list.size();
            EmptyList = new ArrayList(list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                if (z) {
                    Long l = (Long) list2.get(i2);
                    EmptyList.add(new AbstractMap.SimpleEntry(Collections.singletonList(str), Long.valueOf(l != null ? l.longValue() : 0L)));
                } else {
                    EmptyList.add(new AbstractMap.SimpleEntry(Collections.singletonList(str), 0L));
                }
            }
        }
        this.b = EmptyList;
        this.c = i;
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactPhotosEvent{avatarUrlsAndIds=");
        sb.append(this.b);
        sb.append(", total=");
        return au1.h(sb, this.c, '}');
    }
}
