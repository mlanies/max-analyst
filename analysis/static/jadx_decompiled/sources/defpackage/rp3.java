package defpackage;

import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class rp3 extends pi0 {
    public final /* synthetic */ int b = 1;
    public final AbstractCollection c;

    public rp3(long j, wz wzVar) {
        super(j);
        this.c = wzVar;
    }

    @Override // defpackage.pi0
    public final String toString() {
        switch (this.b) {
            case 0:
                return "ContactNotFoundEvent{contactServerIds=" + ((LinkedHashSet) this.c) + '}';
            default:
                return "SharePreviewEvent{attaches=" + ((wz) this.c) + '}';
        }
    }

    public rp3(List list) {
        this.c = new LinkedHashSet(list);
    }
}
