package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ps3 extends pi0 {
    public final List b;

    public ps3(long j) {
        this.b = Collections.singletonList(Long.valueOf(j));
    }

    @Override // defpackage.pi0
    public final String toString() {
        return "ContactsUpdateEvent{idList=" + this.b + '}';
    }

    public ps3(Collection collection) {
        this.b = new ArrayList(collection);
    }

    public ps3(long j, Collection collection) {
        super(j);
        this.b = new ArrayList(collection);
    }
}
