package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class lb4 extends m06 {
    public final /* synthetic */ int w0;
    public final Map x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb4(int i, Map map) {
        super(10);
        this.w0 = i;
        this.x0 = map;
    }

    @Override // defpackage.m06, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.w0) {
            case 0:
                if (obj == null || !super.containsKey(obj)) {
                }
                break;
            default:
                if (obj == null || !super.containsKey(obj)) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.m06, java.util.Map
    public final Set entrySet() {
        switch (this.w0) {
            case 0:
                return ngg.s(super.entrySet(), new kb4(2));
            default:
                return ngg.s(super.entrySet(), new kb4(1));
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.w0) {
            case 0:
                if (obj == null || !ngg.q(this, obj)) {
                }
                break;
            default:
                if (obj == null || !ngg.q(this, obj)) {
                }
                break;
        }
        return false;
    }

    @Override // defpackage.m06, java.util.Map
    public final Object get(Object obj) {
        switch (this.w0) {
            case 0:
                if (obj != null) {
                    break;
                }
                break;
            default:
                if (obj != null) {
                    break;
                }
                break;
        }
        return (List) super.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.w0) {
        }
        return ngg.v(entrySet());
    }

    @Override // defpackage.m06, java.util.Map
    public final boolean isEmpty() {
        switch (this.w0) {
            case 0:
                if (!super.isEmpty()) {
                    if (super.size() != 1 || !super.containsKey(null)) {
                    }
                }
                break;
            default:
                if (!super.isEmpty()) {
                    if (super.size() != 1 || !super.containsKey(null)) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // defpackage.m06, java.util.Map
    public final Set keySet() {
        switch (this.w0) {
            case 0:
                return ngg.s(super.keySet(), new kb4(0));
            default:
                return ngg.s(super.keySet(), new kb4(3));
        }
    }

    @Override // defpackage.m06, java.util.Map
    public final int size() {
        switch (this.w0) {
            case 0:
                return super.size() - (super.containsKey(null) ? 1 : 0);
            default:
                return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    @Override // defpackage.m06
    public final Map u0() {
        switch (this.w0) {
        }
        return this.x0;
    }

    @Override // defpackage.j47
    public final Object z() {
        switch (this.w0) {
        }
        return this.x0;
    }
}
