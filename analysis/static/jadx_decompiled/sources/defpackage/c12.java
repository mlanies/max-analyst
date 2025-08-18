package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c12 implements bbe, abe {
    public final /* synthetic */ int a = 1;
    public final List b;

    public c12(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.bbe
    public final int g(long j) {
        switch (this.a) {
            case 0:
                if (j < 0) {
                }
                break;
            default:
                if (j < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // defpackage.bbe
    public final long i(int i) {
        switch (this.a) {
            case 0:
                fm9.f(i == 0);
                break;
            default:
                np8.d(i == 0);
                break;
        }
        return 0L;
    }

    @Override // defpackage.bbe
    public final List p(long j) {
        switch (this.a) {
            case 0:
                if (j < 0) {
                    break;
                } else {
                    break;
                }
            default:
                if (j < 0) {
                    break;
                } else {
                    break;
                }
        }
        return Collections.emptyList();
    }

    @Override // defpackage.bbe
    public final int u() {
        switch (this.a) {
        }
        return 1;
    }

    public c12(List list) {
        this.b = list;
    }
}
